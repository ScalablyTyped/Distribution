package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerTypesMod.ILayerStyleProps
import typings.officeUiFabricReact.layerTypesMod.ILayerStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ILayerStyleProps): ILayerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ILayerStyles]
}
