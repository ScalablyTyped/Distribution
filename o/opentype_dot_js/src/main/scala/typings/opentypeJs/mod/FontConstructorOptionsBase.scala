package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontConstructorOptionsBase extends js.Object {
  var ascender: Double = js.native
  var descender: Double = js.native
  var familyName: String = js.native
  var styleName: String = js.native
  var unitsPerEm: Double = js.native
}

object FontConstructorOptionsBase {
  @scala.inline
  def apply(ascender: Double, descender: Double, familyName: String, styleName: String, unitsPerEm: Double): FontConstructorOptionsBase = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptionsBase]
  }
  @scala.inline
  implicit class FontConstructorOptionsBaseOps[Self <: FontConstructorOptionsBase] (val x: Self) extends AnyVal {
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
    def setAscender(value: Double): Self = this.set("ascender", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescender(value: Double): Self = this.set("descender", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleName(value: String): Self = this.set("styleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitsPerEm(value: Double): Self = this.set("unitsPerEm", value.asInstanceOf[js.Any])
  }
  
}

