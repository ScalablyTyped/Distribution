package typings.officeUiFabricReact.personaTypesMod

import typings.officeUiFabricReact.anon.Available
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'presence' | 'isOutOfOffice' | 'size' | 'presenceColors'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'className'> */
@js.native
trait IPersonaPresenceStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var isOutOfOffice: js.UndefOr[Boolean] = js.native
  var presence: js.UndefOr[PersonaPresence] = js.native
  var presenceColors: js.UndefOr[Available] = js.native
  var size: js.UndefOr[PersonaSize] = js.native
  var theme: ITheme = js.native
}

object IPersonaPresenceStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPersonaPresenceStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPresenceStyleProps]
  }
  @scala.inline
  implicit class IPersonaPresenceStylePropsOps[Self <: IPersonaPresenceStyleProps] (val x: Self) extends AnyVal {
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
    def setIsOutOfOffice(value: Boolean): Self = this.set("isOutOfOffice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOutOfOffice: Self = this.set("isOutOfOffice", js.undefined)
    @scala.inline
    def setPresence(value: PersonaPresence): Self = this.set("presence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresence: Self = this.set("presence", js.undefined)
    @scala.inline
    def setPresenceColors(value: Available): Self = this.set("presenceColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresenceColors: Self = this.set("presenceColors", js.undefined)
    @scala.inline
    def setSize(value: PersonaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

