package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaStyleProps extends js.Object {
  /**
    * Custom class name.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.native
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @defaultvalue PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.native
  var showSecondaryText: js.UndefOr[Boolean] = js.native
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}

object IPersonaStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPersonaStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaStyleProps]
  }
  @scala.inline
  implicit class IPersonaStylePropsOps[Self <: IPersonaStyleProps] (val x: Self) extends AnyVal {
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
    def setCoinSize(value: Double): Self = this.set("coinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoinSize: Self = this.set("coinSize", js.undefined)
    @scala.inline
    def setPresence(value: PersonaPresence): Self = this.set("presence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresence: Self = this.set("presence", js.undefined)
    @scala.inline
    def setShowSecondaryText(value: Boolean): Self = this.set("showSecondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSecondaryText: Self = this.set("showSecondaryText", js.undefined)
    @scala.inline
    def setSize(value: PersonaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

