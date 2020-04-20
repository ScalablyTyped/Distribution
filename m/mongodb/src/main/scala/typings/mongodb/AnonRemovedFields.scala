package typings.mongodb

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.FieldUpdates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemovedFields[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var removedFields: js.Array[/* keyof TSchema */ String]
  /**
    * This is an object with all changed fields; if they are nested,
    * the keys will be paths, e.g. 'question.answer.0.text': 'new text'
    */
  var updatedFields: FieldUpdates[TSchema]
}

object AnonRemovedFields {
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](removedFields: js.Array[/* keyof TSchema */ String], updatedFields: FieldUpdates[TSchema]): AnonRemovedFields[TSchema] = {
    val __obj = js.Dynamic.literal(removedFields = removedFields.asInstanceOf[js.Any], updatedFields = updatedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemovedFields[TSchema]]
  }
}

