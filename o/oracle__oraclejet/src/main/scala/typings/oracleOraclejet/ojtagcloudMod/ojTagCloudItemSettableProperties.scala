package typings.oracleOraclejet.ojtagcloudMod

import typings.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTagCloudItemSettableProperties extends JetSettableProperties {
  var categories: js.Array[String] = js.native
  var color: js.UndefOr[String] = js.native
  var label: String = js.native
  var shortDesc: String = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var url: String = js.native
  var value: Double | Null = js.native
}

object ojTagCloudItemSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String],
    label: String,
    shortDesc: String,
    svgClassName: String,
    svgStyle: js.Object,
    url: String
  ): ojTagCloudItemSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTagCloudItemSettableProperties]
  }
  @scala.inline
  implicit class ojTagCloudItemSettablePropertiesOps[Self <: ojTagCloudItemSettableProperties] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

