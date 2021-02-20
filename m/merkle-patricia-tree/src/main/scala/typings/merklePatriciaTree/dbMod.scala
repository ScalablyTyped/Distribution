package typings.merklePatriciaTree

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.merklePatriciaTree.merklePatriciaTreeStrings.del
import typings.merklePatriciaTree.merklePatriciaTreeStrings.put
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbMod {
  
  @JSImport("merkle-patricia-tree/dist/db", "DB")
  @js.native
  /**
    * Initialize a DB instance. If `leveldb` is not provided, DB
    * defaults to an [in-memory store](https://github.com/Level/memdown).
    * @param {Object} [leveldb] - An abstract-leveldown compliant store
    */
  class DB () extends StObject {
    def this(leveldb: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]) = this()
    
    var _leveldb: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]] = js.native
    
    /**
      * Performs a batch operation on db.
      * @param {Array} opStack A stack of levelup operations
      * @returns {Promise}
      */
    def batch(opStack: js.Array[BatchDBOp]): js.Promise[Unit] = js.native
    
    /**
      * Returns a copy of the DB instance, with a reference
      * to the **same** underlying leveldb instance.
      */
    def copy(): DB = js.native
    
    /**
      * Removes a raw value in the underlying leveldb.
      * @param {Buffer} key
      * @returns {Promise}
      */
    def del(key: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Retrieves a raw value from leveldb.
      * @param {Buffer} key
      * @returns A Promise that resolves to `Buffer` if a value is found or `null` if no value is found.
      */
    def get(key: Buffer): js.Promise[Buffer | Null] = js.native
    
    /**
      * Writes a value directly to leveldb.
      * @param {Buffer} key The key as a `Buffer`
      * @param {Buffer} value The value to be stored
      * @returns {Promise}
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
    @scala.inline
    def keyEncoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(x.asInstanceOf[js.Any])
    
    @JSImport("merkle-patricia-tree/dist/db", "ENCODING_OPTS.valueEncoding")
    @js.native
    def valueEncoding: String = js.native
    @scala.inline
    def valueEncoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueEncoding")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.merklePatriciaTree.dbMod.PutBatch
    - typings.merklePatriciaTree.dbMod.DelBatch
  */
  trait BatchDBOp extends StObject
  object BatchDBOp {
    
    @scala.inline
    def DelBatch(key: Buffer, `type`: del): typings.merklePatriciaTree.dbMod.DelBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.merklePatriciaTree.dbMod.DelBatch]
    }
    
    @scala.inline
    def PutBatch(key: Buffer, `type`: put, value: Buffer): typings.merklePatriciaTree.dbMod.PutBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.merklePatriciaTree.dbMod.PutBatch]
    }
  }
  
  @js.native
  trait DelBatch extends BatchDBOp {
    
    var key: Buffer = js.native
    
    var `type`: del = js.native
  }
  object DelBatch {
    
    @scala.inline
    def apply(key: Buffer, `type`: del): DelBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelBatch]
    }
    
    @scala.inline
    implicit class DelBatchMutableBuilder[Self <: DelBatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: del): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PutBatch extends BatchDBOp {
    
    var key: Buffer = js.native
    
    var `type`: put = js.native
    
    var value: Buffer = js.native
  }
  object PutBatch {
    
    @scala.inline
    def apply(key: Buffer, `type`: put, value: Buffer): PutBatch = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBatch]
    }
    
    @scala.inline
    implicit class PutBatchMutableBuilder[Self <: PutBatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: put): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
