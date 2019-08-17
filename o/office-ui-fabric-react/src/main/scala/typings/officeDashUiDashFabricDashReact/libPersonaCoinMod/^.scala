package typings.officeDashUiDashFabricDashReact.libPersonaCoinMod

import typings.officeDashUiDashFabricDashReact.Anon_IsAvailable
import typings.officeDashUiDashFabricDashReact.Anon_IsSize10
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaCoinProps
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.initialsColor
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.primaryText
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.text
import typings.react.reactMod.StatelessComponent
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/PersonaCoin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Persona: StatelessComponent[IPersonaProps] = js.native
  val PersonaCoin: StatelessComponent[IPersonaCoinProps] = js.native
  def getPersonaInitialsColor(props: Pick[IPersonaProps, primaryText | text | initialsColor]): String = js.native
  def presenceBoolean(
    presence: typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  ): Anon_IsAvailable = js.native
  def sizeBoolean(size: typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaSize): Anon_IsSize10 = js.native
}

