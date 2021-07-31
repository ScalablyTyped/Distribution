package typings.merklePatriciaTree

import typings.merklePatriciaTree.baseTrieMod.Trie
import typings.merklePatriciaTree.dbMod.DB
import typings.merklePatriciaTree.scratchMod.ScratchDB
import typings.merklePatriciaTree.scratchReadStreamMod.ScratchReadStream
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkpointTrieMod {
  
  @JSImport("merkle-patricia-tree/dist/checkpointTrie", "CheckpointTrie")
  @js.native
  class CheckpointTrie protected () extends Trie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
    
    var _checkpoints: js.Array[Buffer] = js.native
    
    /**
      * Returns a `ScratchReadStream` based on the state updates
      * since checkpoint.
      * @private
      */
    def _createScratchReadStream(): ScratchReadStream = js.native
    def _createScratchReadStream(scratchDb: ScratchDB): ScratchReadStream = js.native
    
    /**
      * Enter into checkpoint mode.
      * @private
      */
    def _enterCpMode(): Unit = js.native
    
    /**
      * Exit from checkpoint mode.
      * @private
      */
    def _exitCpMode(commitState: Boolean): js.Promise[Unit] = js.native
    
    var _mainDB: DB = js.native
    
    var _scratch: ScratchDB | Null = js.native
    
    /**
      * Creates a checkpoint that can later be reverted to or committed.
      * After this is called, no changes to the trie will be permanently saved until `commit` is called.
      * To override the checkpointing mechanism use `_maindb.put` to write directly write to db.
      */
    def checkpoint(): Unit = js.native
    
    /**
      * Commits a checkpoint to disk, if current checkpoint is not nested.
      * If nested, only sets the parent checkpoint as current checkpoint.
      * @throws If not during a checkpoint phase
      */
    def commit(): js.Promise[Unit] = js.native
    
    def copy(includeCheckpoints: Boolean): CheckpointTrie = js.native
    
    /**
      * Is the trie during a checkpoint phase?
      */
    def isCheckpoint: Boolean = js.native
    
    /**
      * Reverts the trie to the state it was at when `checkpoint` was first called.
      * If during a nested checkpoint, sets root to most recent checkpoint, and sets
      * parent checkpoint as current.
      */
    def revert(): js.Promise[Unit] = js.native
  }
}
