package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoWriteConcernError")
@js.native
open class MongoWriteConcernError protected () extends MongoServerError {
  def this(message: ErrorDescription) = this()
  def this(message: ErrorDescription, result: Document) = this()
  
  @JSName("name")
  def name_MMongoWriteConcernError: String = js.native
  
  /** The result document (provided if ok: 1) */
  var result: js.UndefOr[Document] = js.native
}
