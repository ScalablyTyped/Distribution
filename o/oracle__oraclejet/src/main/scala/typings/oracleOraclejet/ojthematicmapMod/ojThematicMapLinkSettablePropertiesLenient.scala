package typings.oracleOraclejet.ojthematicmapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonLocation
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapLinkSettableProperties> */
trait ojThematicMapLinkSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var endLocation: js.UndefOr[AnonLocation] = js.undefined
  var selectable: js.UndefOr[auto | off] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var startLocation: js.UndefOr[AnonLocation] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ojThematicMapLinkSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    categories: js.Array[String] = null,
    color: String = null,
    endLocation: AnonLocation = null,
    selectable: auto | off = null,
    shortDesc: String = null,
    startLocation: AnonLocation = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    width: Int | Double = null
  ): ojThematicMapLinkSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endLocation != null) __obj.updateDynamic("endLocation")(endLocation.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (startLocation != null) __obj.updateDynamic("startLocation")(startLocation.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapLinkSettablePropertiesLenient]
  }
}

