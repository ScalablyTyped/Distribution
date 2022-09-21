package typings.merklePatriciaTree

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.merklePatriciaTree.dbMod.DB
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkpointDbMod {
  
  @JSImport("merkle-patricia-tree/dist/checkpointDb", "CheckpointDB")
  @js.native
  /**
    * Initialize a DB instance. If `leveldb` is not provided, DB
    * defaults to an [in-memory store](https://github.com/Level/memdown).
    * @param leveldb - An abstract-leveldown compliant store
    */
  open class CheckpointDB () extends DB {
    def this(leveldb: LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]]) = this()
    
    /**
      * Adds a new checkpoint to the stack
      * @param root
      */
    def checkpoint(root: Buffer): Unit = js.native
    
    var checkpoints: js.Array[Checkpoint] = js.native
    
    /**
      * Commits the latest checkpoint
      */
    def commit(): js.Promise[Unit] = js.native
    
    /**
      * Is the DB during a checkpoint phase?
      */
    def isCheckpoint: Boolean = js.native
    
    /**
      * Reverts the latest checkpoint
      */
    def revert(): js.Promise[Buffer] = js.native
  }
  
  trait Checkpoint extends StObject {
    
    var keyValueMap: Map[String, Buffer | Null]
    
    var root: Buffer
  }
  object Checkpoint {
    
    inline def apply(keyValueMap: Map[String, Buffer | Null], root: Buffer): Checkpoint = {
      val __obj = js.Dynamic.literal(keyValueMap = keyValueMap.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Checkpoint]
    }
    
    extension [Self <: Checkpoint](x: Self) {
      
      inline def setKeyValueMap(value: Map[String, Buffer | Null]): Self = StObject.set(x, "keyValueMap", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Buffer): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
