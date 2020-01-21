package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/PersonaPresence", JSImport.Namespace)
@js.native
object libPersonaPresenceMod extends js.Object {
  @js.native
  class PersonaPresenceBase protected ()
    extends typings.officeUiFabricReact.personaPresenceMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
  
  val PersonaPresence: StatelessComponent[IPersonaPresenceProps] = js.native
}

