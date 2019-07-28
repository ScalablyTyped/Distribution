package typings.atOracleOraclejet.ojtagcloudMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTagCloudItemSettableProperties extends JetSettableProperties {
  var categories: js.Array[String]
  var color: js.UndefOr[String] = js.undefined
  var label: String
  var shortDesc: String
  var svgClassName: String
  var svgStyle: js.Object
  var url: String
  var value: Double | Null
}

object ojTagCloudItemSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String],
    label: String,
    shortDesc: String,
    svgClassName: String,
    svgStyle: js.Object,
    url: String,
    color: String = null,
    value: Int | Double = null
  ): ojTagCloudItemSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories, label = label, shortDesc = shortDesc, svgClassName = svgClassName, svgStyle = svgStyle, url = url)
    if (color != null) __obj.updateDynamic("color")(color)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTagCloudItemSettableProperties]
  }
}

