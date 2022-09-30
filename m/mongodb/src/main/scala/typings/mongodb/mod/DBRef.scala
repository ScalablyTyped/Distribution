package typings.mongodb.mod

import typings.bson.mod.Document
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
  def this(collection: String, oid: typings.bson.mod.ObjectId) = this()
  def this(collection: String, oid: typings.bson.mod.ObjectId, db: String) = this()
  def this(collection: String, oid: typings.bson.mod.ObjectId, db: String, fields: Document) = this()
  def this(collection: String, oid: typings.bson.mod.ObjectId, db: Unit, fields: Document) = this()
}
