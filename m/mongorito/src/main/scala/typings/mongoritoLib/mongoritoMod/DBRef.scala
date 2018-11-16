package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "DBRef")
@js.native
class DBRef protected ()
  extends mongodbLib.mongodbMod.DBRef {
  /**
       * @param namespace The collection name.
       * @param oid The reference ObjectID.
       * @param db Optional db name, if omitted the reference is local to the current db
       */
  def this(namespace: java.lang.String, oid: bsonLib.bsonMod.ObjectID) = this()
  /**
       * @param namespace The collection name.
       * @param oid The reference ObjectID.
       * @param db Optional db name, if omitted the reference is local to the current db
       */
  def this(namespace: java.lang.String, oid: bsonLib.bsonMod.ObjectID, db: java.lang.String) = this()
}

