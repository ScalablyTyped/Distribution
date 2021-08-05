package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaStyleProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personaStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/Persona.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IPersonaStyleProps): IPersonaStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPersonaStyles]
}
