package typings.officeUiFabricReact.documentCardActivityTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardActivityStyleProps extends js.Object {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Indicates if multiple people are being shown.
    */
  var multiplePeople: js.UndefOr[Boolean] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object IDocumentCardActivityStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDocumentCardActivityStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityStyleProps]
  }
  @scala.inline
  implicit class IDocumentCardActivityStylePropsOps[Self <: IDocumentCardActivityStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setMultiplePeople(value: Boolean): Self = this.set("multiplePeople", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplePeople: Self = this.set("multiplePeople", js.undefined)
  }
  
}

