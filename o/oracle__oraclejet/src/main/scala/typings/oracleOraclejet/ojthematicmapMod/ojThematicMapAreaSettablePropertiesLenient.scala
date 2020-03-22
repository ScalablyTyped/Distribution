package typings.oracleOraclejet.ojthematicmapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapAreaSettableProperties> */
trait ojThematicMapAreaSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var selectable: js.UndefOr[auto | off] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object ojThematicMapAreaSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    categories: js.Array[String] = null,
    color: String = null,
    label: String = null,
    labelStyle: js.Object = null,
    location: String = null,
    opacity: Int | Double = null,
    selectable: auto | off = null,
    shortDesc: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): ojThematicMapAreaSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapAreaSettablePropertiesLenient]
  }
}

