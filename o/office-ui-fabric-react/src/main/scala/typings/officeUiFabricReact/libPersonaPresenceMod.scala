package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/PersonaPresence", JSImport.Namespace)
@js.native
object libPersonaPresenceMod extends js.Object {
  
  val PersonaPresence: FunctionComponent[IPersonaPresenceProps] = js.native
  
  @js.native
  class PersonaPresenceBase protected ()
    extends typings.officeUiFabricReact.personaPresenceMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
}
