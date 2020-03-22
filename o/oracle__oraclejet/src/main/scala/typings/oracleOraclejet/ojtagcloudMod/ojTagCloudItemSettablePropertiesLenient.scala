package typings.oracleOraclejet.ojtagcloudMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtagcloud.ojTagCloudItemSettableProperties> */
trait ojTagCloudItemSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ojTagCloudItemSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    categories: js.Array[String] = null,
    color: String = null,
    label: String = null,
    shortDesc: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    url: String = null,
    value: Int | Double = null
  ): ojTagCloudItemSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTagCloudItemSettablePropertiesLenient]
  }
}

