package typings.nodeCrate.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crate extends js.Object {
  /**
    * Connect to a single crate instance with host and port
    */
  def connect(host: String): Unit = js.native
  def connect(host: String, port: Double): Unit = js.native
  /**
    * Creates a table with the given schema.
    */
  def create(schema: js.Object): js.Promise[DBResultObject] = js.native
  /**
    * Creates a BLOB table
    */
  def createBlobTable(tableName: String, replicas: Double, shards: Double): js.Promise[DBResultObject] = js.native
  /**
    * Creates a table if it doesn't already exist.
    */
  def createIfNotExists(schema: js.Object): js.Promise[DBResultObject] = js.native
  /**
    * Deletes one or more rows in a table.
    */
  def delete(tableName: String, where: String): js.Promise[DBResultObject] = js.native
  /**
    * Drops a table.
    */
  def drop(tableName: String): js.Promise[DBResultObject] = js.native
  /**
    * Executes a parameterized sql statement.
    */
  def execute(sql: String): js.Promise[DBResultObject] = js.native
  def execute(sql: String, args: js.Array[String | Double | Date]): js.Promise[DBResultObject] = js.native
  /**
    * Retrieves a BLOB with the given hash key
    */
  def getBlob(tableName: String, hashKey: String): js.Promise[String] = js.native
  /**
    * Inserts a row in table.
    */
  def insert(tableName: String, data: js.Object): js.Promise[DBResultObject] = js.native
  /**
    * Inserts a BLOB
    */
  def insertBlob(tableName: String, buffer: String): js.Promise[String] = js.native
  /**
    * Inserts a BLOB from the filesystem
    */
  def insertBlobFile(tableName: String, filename: String): js.Promise[String] = js.native
  /**
    * Updates one or more rows in table.
    */
  def update(tableName: String, data: js.Object, where: String): js.Promise[DBResultObject] = js.native
}

