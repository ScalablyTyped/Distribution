package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.FieldUpdates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovedFields[TSchema /* <: StringDictionary[js.Any] */] extends StObject {
  
  var removedFields: js.Array[/* keyof TSchema */ String]
  
  /**
    * This is an object with all changed fields; if they are nested,
    * the keys will be paths, e.g. 'question.answer.0.text': 'new text'
    */
  var updatedFields: FieldUpdates[TSchema]
}
object RemovedFields {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](removedFields: js.Array[/* keyof TSchema */ String], updatedFields: FieldUpdates[TSchema]): RemovedFields[TSchema] = {
    val __obj = js.Dynamic.literal(removedFields = removedFields.asInstanceOf[js.Any], updatedFields = updatedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedFields[TSchema]]
  }
  
  @scala.inline
  implicit class RemovedFieldsMutableBuilder[Self <: RemovedFields[?], TSchema /* <: StringDictionary[js.Any] */] (val x: Self & RemovedFields[TSchema]) extends AnyVal {
    
    @scala.inline
    def setRemovedFields(value: js.Array[/* keyof TSchema */ String]): Self = StObject.set(x, "removedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedFieldsVarargs(value: (/* keyof TSchema */ String)*): Self = StObject.set(x, "removedFields", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedFields(value: FieldUpdates[TSchema]): Self = StObject.set(x, "updatedFields", value.asInstanceOf[js.Any])
  }
}
