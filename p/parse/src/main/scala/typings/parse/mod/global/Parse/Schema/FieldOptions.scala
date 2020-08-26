package typings.parse.mod.global.Parse.Schema

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.File
import typings.parse.mod.global.Parse.GeoPoint
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.Pointer
import typings.parse.mod.global.Parse.Polygon
import typings.parse.mod.global.Parse.Relation
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOptions[T /* <: String | Double | Boolean | Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] extends js.Object {
  var defaultValue: js.UndefOr[T] = js.native
  var required: js.UndefOr[Boolean] = js.native
}

object FieldOptions {
  @scala.inline
  def apply[/* <: java.lang.String | scala.Double | scala.Boolean | typings.std.Date | typings.parse.mod.global.Parse.File | typings.parse.mod.global.Parse.GeoPoint | typings.parse.mod.global.Parse.Polygon | js.Array[_] | js.Object | typings.parse.mod.global.Parse.Pointer | (typings.parse.mod.global.Parse.Relation[
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes], 
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes]]) */ T](): FieldOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldOptions[T]]
  }
  @scala.inline
  implicit class FieldOptionsOps[Self <: FieldOptions[_], /* <: java.lang.String | scala.Double | scala.Boolean | typings.std.Date | typings.parse.mod.global.Parse.File | typings.parse.mod.global.Parse.GeoPoint | typings.parse.mod.global.Parse.Polygon | js.Array[_] | js.Object | typings.parse.mod.global.Parse.Pointer | (typings.parse.mod.global.Parse.Relation[
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes], 
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes]]) */ T] (val x: Self with FieldOptions[T]) extends AnyVal {
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
    def setDefaultValue(value: T): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

