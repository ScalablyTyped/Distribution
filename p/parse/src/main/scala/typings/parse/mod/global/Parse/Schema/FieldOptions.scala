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

trait FieldOptions[T /* <: String | Double | Boolean | Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] extends js.Object {
  var defaultValue: js.UndefOr[T] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object FieldOptions {
  @scala.inline
  def apply[/* <: java.lang.String | scala.Double | scala.Boolean | typings.std.Date | typings.parse.mod.global.Parse.File | typings.parse.mod.global.Parse.GeoPoint | typings.parse.mod.global.Parse.Polygon | js.Array[_] | js.Object | typings.parse.mod.global.Parse.Pointer | (typings.parse.mod.global.Parse.Relation[
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes], 
  typings.parse.mod.global.Parse.Object[typings.parse.mod.global.Parse.Attributes]]) */ T](defaultValue: T = null, required: js.UndefOr[Boolean] = js.undefined): FieldOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptions[T]]
  }
}

