package typings.officeUiFabricReact

import typings.officeUiFabricReact.facepileTypesMod.IFacepileStyleProps
import typings.officeUiFabricReact.facepileTypesMod.IFacepileStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facepileStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def styles(props: IFacepileStyleProps): IFacepileStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("styles")(props.asInstanceOf[js.Any]).asInstanceOf[IFacepileStyles]
}
