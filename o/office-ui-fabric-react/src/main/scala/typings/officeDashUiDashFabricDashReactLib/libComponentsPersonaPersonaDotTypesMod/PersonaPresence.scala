package typings
package officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonaPresence extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaPresence")
@js.native
object PersonaPresence extends js.Object {
  @js.native
  sealed trait away
    extends officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  
  @js.native
  sealed trait blocked
    extends officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  
  @js.native
  sealed trait busy
    extends officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  
  @js.native
  sealed trait dnd
    extends officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  
  @js.native
  sealed trait none
    extends officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  
  @js.native
  sealed trait offline
    extends officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  
  @js.native
  sealed trait online
    extends officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence
  
  /* 3 */ val away: away with scala.Double = js.native
  /* 5 */ val blocked: blocked with scala.Double = js.native
  /* 6 */ val busy: busy with scala.Double = js.native
  /* 4 */ val dnd: dnd with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val offline: offline with scala.Double = js.native
  /* 2 */ val online: online with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaPresence with scala.Double
  ] = js.native
}

