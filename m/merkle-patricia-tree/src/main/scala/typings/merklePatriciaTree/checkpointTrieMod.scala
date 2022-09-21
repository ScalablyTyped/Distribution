package typings.merklePatriciaTree

import typings.merklePatriciaTree.baseTrieMod.Trie
import typings.merklePatriciaTree.checkpointDbMod.CheckpointDB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkpointTrieMod {
  
  @JSImport("merkle-patricia-tree/dist/checkpointTrie", "CheckpointTrie")
  @js.native
  open class CheckpointTrie protected () extends Trie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
    
    /**
      * Creates a checkpoint that can later be reverted to or committed.
      * After this is called, all changes can be reverted until `commit` is called.
      */
    def checkpoint(): Unit = js.native
    
    /**
      * Commits a checkpoint to disk, if current checkpoint is not nested.
      * If nested, only sets the parent checkpoint as current checkpoint.
      * @throws If not during a checkpoint phase
      */
    def commit(): js.Promise[Unit] = js.native
    
    def copy(includeCheckpoints: Boolean): CheckpointTrie = js.native
    
    @JSName("db")
    var db_CheckpointTrie: CheckpointDB = js.native
    
    /**
      * Reverts the trie to the state it was at when `checkpoint` was first called.
      * If during a nested checkpoint, sets root to most recent checkpoint, and sets
      * parent checkpoint as current.
      */
    def revert(): js.Promise[Unit] = js.native
  }
}
