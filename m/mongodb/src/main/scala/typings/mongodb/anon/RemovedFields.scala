package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.FieldUpdates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovedFields[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var removedFields: js.Array[/* keyof TSchema */ String] = js.native
  /**
    * This is an object with all changed fields; if they are nested,
    * the keys will be paths, e.g. 'question.answer.0.text': 'new text'
    */
  var updatedFields: FieldUpdates[TSchema] = js.native
}

object RemovedFields {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema](removedFields: js.Array[/* keyof TSchema */ String], updatedFields: FieldUpdates[TSchema]): RemovedFields[TSchema] = {
    val __obj = js.Dynamic.literal(removedFields = removedFields.asInstanceOf[js.Any], updatedFields = updatedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedFields[TSchema]]
  }
  @scala.inline
  implicit class RemovedFieldsOps[Self <: RemovedFields[_], /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema] (val x: Self with RemovedFields[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRemovedFieldsVarargs(value: (/* keyof TSchema */ String)*): Self = this.set("removedFields", js.Array(value :_*))
    @scala.inline
    def setRemovedFields(value: js.Array[/* keyof TSchema */ String]): Self = this.set("removedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedFields(value: FieldUpdates[TSchema]): Self = this.set("updatedFields", value.asInstanceOf[js.Any])
  }
  
}

