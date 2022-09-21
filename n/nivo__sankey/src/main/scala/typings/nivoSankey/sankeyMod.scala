package typings.nivoSankey

import typings.nivoSankey.typesMod.DefaultLink
import typings.nivoSankey.typesMod.DefaultNode
import typings.nivoSankey.typesMod.SankeySvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyMod {
  
  @JSImport("@nivo/sankey/dist/types/Sankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Sankey[N /* <: DefaultNode */, L /* <: DefaultLink */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: SankeySvgProps[N, L]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Sankey")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
