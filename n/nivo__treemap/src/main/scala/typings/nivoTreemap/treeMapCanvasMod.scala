package typings.nivoTreemap

import typings.nivoTreemap.typesMod.TreeMapCanvasProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMapCanvasMod {
  
  @JSImport("@nivo/treemap/dist/types/TreeMapCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeMapCanvas[Datum /* <: js.Object */](hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps: TreeMapCanvasProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMapCanvas")(hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
