package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaPresenceStyleProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaPresenceStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personaPresenceStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaPresence/PersonaPresence.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IPersonaPresenceStyleProps): IPersonaPresenceStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPersonaPresenceStyles]
}
