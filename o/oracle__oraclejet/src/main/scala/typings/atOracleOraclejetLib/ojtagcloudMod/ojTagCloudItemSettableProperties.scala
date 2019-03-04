package typings
package atOracleOraclejetLib.ojtagcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTagCloudItemSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var categories: js.Array[java.lang.String]
  var color: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var shortDesc: java.lang.String
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var url: java.lang.String
  var value: scala.Double | scala.Null
}

object ojTagCloudItemSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    label: java.lang.String,
    shortDesc: java.lang.String,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    url: java.lang.String,
    color: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): ojTagCloudItemSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories, label = label, shortDesc = shortDesc, svgClassName = svgClassName, svgStyle = svgStyle, url = url)
    if (color != null) __obj.updateDynamic("color")(color)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTagCloudItemSettableProperties]
  }
}

