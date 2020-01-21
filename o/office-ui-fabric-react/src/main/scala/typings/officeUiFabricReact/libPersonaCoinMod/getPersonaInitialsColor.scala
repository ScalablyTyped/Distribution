package typings.officeUiFabricReact.libPersonaCoinMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.initialsColor
import typings.officeUiFabricReact.officeUiFabricReactStrings.primaryText
import typings.officeUiFabricReact.officeUiFabricReactStrings.text
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/PersonaCoin", "getPersonaInitialsColor")
@js.native
object getPersonaInitialsColor extends js.Object {
  def apply(props: Pick[IPersonaProps, primaryText | text | initialsColor]): String = js.native
}

