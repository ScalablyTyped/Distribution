package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinStyleProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personaCoinStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IPersonaCoinStyleProps): IPersonaCoinStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPersonaCoinStyles]
}
