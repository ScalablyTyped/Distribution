package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyleProps
import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyles
import typings.officeUiFabricReact.layerTypesMod.ILayerStyleProps
import typings.officeUiFabricReact.layerTypesMod.ILayerStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipLayerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipLayer.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLayerStyles(props: ILayerStyleProps): ILayerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ILayerStyles]
  
  inline def getStyles(props: IKeytipLayerStyleProps): IKeytipLayerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IKeytipLayerStyles]
}
