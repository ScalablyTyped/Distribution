package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.initialsColor
import typings.officeUiFabricReact.officeUiFabricReactStrings.primaryText
import typings.officeUiFabricReact.officeUiFabricReactStrings.text
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaInitialsColor", JSImport.Namespace)
@js.native
object personaInitialsColorMod extends js.Object {
  def getPersonaInitialsColor(props: Pick[IPersonaProps, primaryText | text | initialsColor]): String = js.native
  def initialsColorPropToColorCode(props: IPersonaProps): String = js.native
}

