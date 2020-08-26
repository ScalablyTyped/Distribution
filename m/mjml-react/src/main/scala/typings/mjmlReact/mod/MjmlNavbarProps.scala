package typings.mjmlReact.mod

import typings.csstype.mod.Property.Color
import typings.mjmlReact.mjmlReactStrings.hamburger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlNavbarProps extends js.Object {
  var align: js.UndefOr[String] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var hamburger: js.UndefOr[typings.mjmlReact.mjmlReactStrings.hamburger] = js.native
  var icoAlign: js.UndefOr[String] = js.native
  var icoClose: js.UndefOr[String] = js.native
  var icoColor: js.UndefOr[Color] = js.native
  var icoFontSize: js.UndefOr[String] = js.native
  var icoLineHeight: js.UndefOr[String] = js.native
  var icoOpen: js.UndefOr[String] = js.native
  var icoPadding: js.UndefOr[String] = js.native
  var icoPaddingBottom: js.UndefOr[String] = js.native
  var icoPaddingLeft: js.UndefOr[String] = js.native
  var icoPaddingRight: js.UndefOr[String] = js.native
  var icoPaddingTop: js.UndefOr[String] = js.native
  var icoTextDecoration: js.UndefOr[String] = js.native
  var icoTextTransform: js.UndefOr[String] = js.native
}

object MjmlNavbarProps {
  @scala.inline
  def apply(): MjmlNavbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlNavbarProps]
  }
  @scala.inline
  implicit class MjmlNavbarPropsOps[Self <: MjmlNavbarProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setHamburger(value: hamburger): Self = this.set("hamburger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHamburger: Self = this.set("hamburger", js.undefined)
    @scala.inline
    def setIcoAlign(value: String): Self = this.set("icoAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoAlign: Self = this.set("icoAlign", js.undefined)
    @scala.inline
    def setIcoClose(value: String): Self = this.set("icoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoClose: Self = this.set("icoClose", js.undefined)
    @scala.inline
    def setIcoColor(value: Color): Self = this.set("icoColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoColor: Self = this.set("icoColor", js.undefined)
    @scala.inline
    def setIcoFontSize(value: String): Self = this.set("icoFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoFontSize: Self = this.set("icoFontSize", js.undefined)
    @scala.inline
    def setIcoLineHeight(value: String): Self = this.set("icoLineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoLineHeight: Self = this.set("icoLineHeight", js.undefined)
    @scala.inline
    def setIcoOpen(value: String): Self = this.set("icoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoOpen: Self = this.set("icoOpen", js.undefined)
    @scala.inline
    def setIcoPadding(value: String): Self = this.set("icoPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoPadding: Self = this.set("icoPadding", js.undefined)
    @scala.inline
    def setIcoPaddingBottom(value: String): Self = this.set("icoPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoPaddingBottom: Self = this.set("icoPaddingBottom", js.undefined)
    @scala.inline
    def setIcoPaddingLeft(value: String): Self = this.set("icoPaddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoPaddingLeft: Self = this.set("icoPaddingLeft", js.undefined)
    @scala.inline
    def setIcoPaddingRight(value: String): Self = this.set("icoPaddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoPaddingRight: Self = this.set("icoPaddingRight", js.undefined)
    @scala.inline
    def setIcoPaddingTop(value: String): Self = this.set("icoPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoPaddingTop: Self = this.set("icoPaddingTop", js.undefined)
    @scala.inline
    def setIcoTextDecoration(value: String): Self = this.set("icoTextDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoTextDecoration: Self = this.set("icoTextDecoration", js.undefined)
    @scala.inline
    def setIcoTextTransform(value: String): Self = this.set("icoTextTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcoTextTransform: Self = this.set("icoTextTransform", js.undefined)
  }
  
}

