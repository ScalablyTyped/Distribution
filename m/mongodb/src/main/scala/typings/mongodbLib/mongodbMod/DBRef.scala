package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "DBRef")
@js.native
class DBRef protected ()
  extends bsonLib.bsonMod.DBRef {
  /**
    * @param namespace The collection name.
    * @param oid The reference ObjectId.
    * @param db Optional db name, if omitted the reference is local to the current db
    */
  def this(namespace: java.lang.String, oid: bsonLib.bsonMod.ObjectId) = this()
  def this(namespace: java.lang.String, oid: bsonLib.bsonMod.ObjectId, db: java.lang.String) = this()
}

