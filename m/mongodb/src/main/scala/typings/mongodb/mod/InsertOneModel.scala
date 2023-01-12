package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertOneModel[TSchema /* <: Document */] extends StObject {
  
  /** The document to insert. */
  var document: OptionalId[TSchema]
}
object InsertOneModel {
  
  inline def apply[TSchema /* <: Document */](document: OptionalId[TSchema]): InsertOneModel[TSchema] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneModel[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertOneModel[?], TSchema /* <: Document */] (val x: Self & InsertOneModel[TSchema]) extends AnyVal {
    
    inline def setDocument(value: OptionalId[TSchema]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
