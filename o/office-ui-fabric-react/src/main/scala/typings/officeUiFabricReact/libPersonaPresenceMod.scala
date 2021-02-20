package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonaPresenceMod {
  
  @JSImport("office-ui-fabric-react/lib/PersonaPresence", "PersonaPresence")
  @js.native
  val PersonaPresence: FunctionComponent[IPersonaPresenceProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/PersonaPresence", "PersonaPresenceBase")
  @js.native
  class PersonaPresenceBase protected ()
    extends typings.officeUiFabricReact.personaPresenceMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
}
