package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "DBRef")
@js.native
class DBRef protected ()
  extends typings.bson.mod.DBRef {
  /**
    * @param namespace The collection name.
    * @param oid The reference ObjectId.
    * @param db Optional db name, if omitted the reference is local to the current db
    */
  def this(namespace: String, oid: typings.bson.mod.ObjectId) = this()
  def this(namespace: String, oid: typings.bson.mod.ObjectId, db: String) = this()
}
