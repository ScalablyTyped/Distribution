package typings.merklePatriciaTree

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.merklePatriciaTree.merklePatriciaTreeStrings.del
import typings.merklePatriciaTree.merklePatriciaTreeStrings.put
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbMod {
  
  @JSImport("merkle-patricia-tree/dist/db", "DB")
  @js.native
  /**
    * Initialize a DB instance. If `leveldb` is not provided, DB
    * defaults to an [in-memory store](https://github.com/Level/memdown).
    * @param leveldb - An abstract-leveldown compliant store
    */
  open class DB () extends StObject {
    def this(leveldb: LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]]) = this()
    
    var _leveldb: LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]] = js.native
    
    /**
      * Performs a batch operation on db.
      * @param opStack A stack of levelup operations
      */
    def batch(opStack: js.Array[BatchDBOp]): js.Promise[Unit] = js.native
    
    /**
      * Returns a copy of the DB instance, with a reference
      * to the **same** underlying leveldb instance.
      */
    def copy(): DB = js.native
    
    /**
      * Removes a raw value in the underlying leveldb.
      * @param keys
      */
    def del(key: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Retrieves a raw value from leveldb.
      * @param key
      * @returns A Promise that resolves to `Buffer` if a value is found or `null` if no value is found.
      */
    def get(key: Buffer): js.Promise[Buffer | Null] = js.native
    
    /**
      * Writes a value directly to leveldb.
      * @param key The key as a `Buffer`
      * @param value The value to be stored
      */
    def put(key: Buffer, `val`: Buffer): js.Promise[Unit] = js.native
  }
  
  object ENCODING_OPTS {
    
    @JSImport("merkle-patricia-tree/dist/db", "ENCODING_OPTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("merkle-patricia-tree/dist/db", "ENCODING_OPTS.keyEncoding")
    @js.native
    def keyEncoding: String = js.native
    inline def keyEncoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(x.asInstanceOf[js.Any])
    
    @JSImport("merkle-patricia-tree/dist/db", "ENCODING_OPTS.valueEncoding")
    @js.native
    def valueEncoding: String = js.native
    inline def valueEncoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueEncoding")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.merklePatriciaTree.dbMod.PutBatch
    - typings.merklePatriciaTree.dbMod.DelBatch
  */
  trait BatchDBOp extends StObject
  object BatchDBOp {
    
    inline def DelBatch(key: Buffer): typings.merklePatriciaTree.dbMod.DelBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("del")
      __obj.asInstanceOf[typings.merklePatriciaTree.dbMod.DelBatch]
    }
    
    inline def PutBatch(key: Buffer, value: Buffer): typings.merklePatriciaTree.dbMod.PutBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("put")
      __obj.asInstanceOf[typings.merklePatriciaTree.dbMod.PutBatch]
    }
  }
  
  trait DelBatch
    extends StObject
       with BatchDBOp {
    
    var key: Buffer
    
    var `type`: del
  }
  object DelBatch {
    
    inline def apply(key: Buffer): DelBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("del")
      __obj.asInstanceOf[DelBatch]
    }
    
    extension [Self <: DelBatch](x: Self) {
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setType(value: del): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PutBatch
    extends StObject
       with BatchDBOp {
    
    var key: Buffer
    
    var `type`: put
    
    var value: Buffer
  }
  object PutBatch {
    
    inline def apply(key: Buffer, value: Buffer): PutBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("put")
      __obj.asInstanceOf[PutBatch]
    }
    
    extension [Self <: PutBatch](x: Self) {
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setType(value: put): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
