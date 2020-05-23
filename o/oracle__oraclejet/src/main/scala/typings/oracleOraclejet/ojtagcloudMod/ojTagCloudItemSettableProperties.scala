package typings.oracleOraclejet.ojtagcloudMod

import typings.oracleOraclejet.mod.JetSettableProperties
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
    value: Double = null.asInstanceOf[Double]
  ): ojTagCloudItemSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTagCloudItemSettableProperties]
  }
}

