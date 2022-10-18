package typings.mongodb.mod

import typings.bson.mod.Document
import typings.bson.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "DBRef")
@js.native
open class DBRef protected ()
  extends typings.bson.mod.DBRef {
  /**
    * @param collection - the collection name.
    * @param oid - the reference ObjectId.
    * @param db - optional db name, if omitted the reference is local to the current db.
    */
  def this(collection: String, oid: ObjectId) = this()
  def this(collection: String, oid: ObjectId, db: String) = this()
  def this(collection: String, oid: ObjectId, db: String, fields: Document) = this()
  def this(collection: String, oid: ObjectId, db: Unit, fields: Document) = this()
}
