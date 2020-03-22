package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'primaryText' | 'text' | 'initialsColor'> */
trait PickIPersonaPropsprimaryT extends js.Object {
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.undefined
  var primaryText: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PickIPersonaPropsprimaryT {
  @scala.inline
  def apply(
    initialsColor: PersonaInitialsColor | String = null,
    primaryText: String = null,
    text: String = null
  ): PickIPersonaPropsprimaryT = {
    val __obj = js.Dynamic.literal()
    if (initialsColor != null) __obj.updateDynamic("initialsColor")(initialsColor.asInstanceOf[js.Any])
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIPersonaPropsprimaryT]
  }
}

