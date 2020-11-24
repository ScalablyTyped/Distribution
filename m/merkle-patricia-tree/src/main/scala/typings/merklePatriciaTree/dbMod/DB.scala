package typings.merklePatriciaTree.dbMod

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/db", "DB")
@js.native
/**
  * Initialize a DB instance. If `leveldb` is not provided, DB
  * defaults to an [in-memory store](https://github.com/Level/memdown).
  * @param {Object} [leveldb] - An abstract-leveldown compliant store
  */
class DB () extends js.Object {
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
