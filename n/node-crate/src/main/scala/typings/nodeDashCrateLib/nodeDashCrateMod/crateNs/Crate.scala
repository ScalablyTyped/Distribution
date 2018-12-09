package typings
package nodeDashCrateLib.nodeDashCrateMod.crateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crate extends js.Object {
  /**
           * Connect to a single crate instance with host and port
           */
  def connect(host: java.lang.String): scala.Unit = js.native
  /**
           * Connect to a single crate instance with host and port
           */
  def connect(host: java.lang.String, port: scala.Double): scala.Unit = js.native
  /**
           * Creates a table with the given schema.
           */
  def create(schema: js.Object): js.Promise[DBResultObject] = js.native
  /**
           * Creates a BLOB table
           */
  def createBlobTable(tableName: java.lang.String, replicas: scala.Double, shards: scala.Double): js.Promise[DBResultObject] = js.native
  /**
           * Creates a table if it doesn't already exist.
           */
  def createIfNotExists(schema: js.Object): js.Promise[DBResultObject] = js.native
  /**
           * Deletes one or more rows in a table.
           */
  def delete(tableName: java.lang.String, where: java.lang.String): js.Promise[DBResultObject] = js.native
  /**
           * Drops a table.
           */
  def drop(tableName: java.lang.String): js.Promise[DBResultObject] = js.native
  /**
           * Executes a parameterized sql statement.
           */
  def execute(sql: java.lang.String): js.Promise[DBResultObject] = js.native
  /**
           * Executes a parameterized sql statement.
           */
  def execute(sql: java.lang.String, args: js.Array[java.lang.String | scala.Double | stdLib.Date]): js.Promise[DBResultObject] = js.native
  /**
           * Retrieves a BLOB with the given hash key
           */
  def getBlob(tableName: java.lang.String, hashKey: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
           * Inserts a row in table.
           */
  def insert(tableName: java.lang.String, data: js.Object): js.Promise[DBResultObject] = js.native
  /**
           * Inserts a BLOB
           */
  def insertBlob(tableName: java.lang.String, buffer: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
           * Inserts a BLOB from the filesystem
           */
  def insertBlobFile(tableName: java.lang.String, filename: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
           * Updates one or more rows in table.
           */
  def update(tableName: java.lang.String, data: js.Object, where: java.lang.String): js.Promise[DBResultObject] = js.native
}

