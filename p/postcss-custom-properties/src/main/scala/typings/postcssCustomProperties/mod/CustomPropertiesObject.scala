package typings.postcssCustomProperties.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertiesObject extends js.Object {
  var `custom-properties`: js.UndefOr[StringDictionary[String]] = js.native
  var customProperties: js.UndefOr[StringDictionary[String]] = js.native
}

object CustomPropertiesObject {
  @scala.inline
  def apply(): CustomPropertiesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertiesObject]
  }
  @scala.inline
  implicit class CustomPropertiesObjectOps[Self <: CustomPropertiesObject] (val x: Self) extends AnyVal {
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
    def `setCustom-properties`(value: StringDictionary[String]): Self = this.set("custom-properties", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCustom-properties`: Self = this.set("custom-properties", js.undefined)
    @scala.inline
    def setCustomProperties(value: StringDictionary[String]): Self = this.set("customProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomProperties: Self = this.set("customProperties", js.undefined)
  }
  
}

