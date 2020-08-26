package typings.officeUiFabricReact.documentCardTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardStyleProps extends js.Object {
  /**
    * True when the card has a click action.
    */
  var actionable: js.UndefOr[Boolean] = js.native
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Compact variant of the card.
    */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object IDocumentCardStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDocumentCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardStyleProps]
  }
  @scala.inline
  implicit class IDocumentCardStylePropsOps[Self <: IDocumentCardStyleProps] (val x: Self) extends AnyVal {
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
    def setActionable(value: Boolean): Self = this.set("actionable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionable: Self = this.set("actionable", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
  }
  
}

