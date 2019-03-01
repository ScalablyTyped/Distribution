package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a structural type in the client type system. Leaf properties should use ValueType. */
trait StructuralTypeDescriptor extends js.Object {
  var dataBars: js.UndefOr[js.Object] = js.undefined
  var expression: js.UndefOr[DefaultValueTypeDescriptor] = js.undefined
  var fill: js.UndefOr[FillTypeDescriptor] = js.undefined
  var fillRule: js.UndefOr[js.Object] = js.undefined
  var filter: js.UndefOr[FilterTypeDescriptor] = js.undefined
  var geoJson: js.UndefOr[js.Object] = js.undefined
  var image: js.UndefOr[js.Object] = js.undefined
  var paragraphs: js.UndefOr[js.Object] = js.undefined
  var queryTransform: js.UndefOr[js.Object] = js.undefined
}

object StructuralTypeDescriptor {
  @scala.inline
  def apply(
    dataBars: js.Object = null,
    expression: DefaultValueTypeDescriptor = null,
    fill: FillTypeDescriptor = null,
    fillRule: js.Object = null,
    filter: FilterTypeDescriptor = null,
    geoJson: js.Object = null,
    image: js.Object = null,
    paragraphs: js.Object = null,
    queryTransform: js.Object = null
  ): StructuralTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (dataBars != null) __obj.updateDynamic("dataBars")(dataBars)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (geoJson != null) __obj.updateDynamic("geoJson")(geoJson)
    if (image != null) __obj.updateDynamic("image")(image)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (queryTransform != null) __obj.updateDynamic("queryTransform")(queryTransform)
    __obj.asInstanceOf[StructuralTypeDescriptor]
  }
}

