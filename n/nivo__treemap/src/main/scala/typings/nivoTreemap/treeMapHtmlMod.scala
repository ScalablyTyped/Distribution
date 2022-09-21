package typings.nivoTreemap

import typings.nivoTreemap.typesMod.TreeMapHtmlProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMapHtmlMod {
  
  @JSImport("@nivo/treemap/dist/types/TreeMapHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeMapHtml[Datum /* <: js.Object */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: TreeMapHtmlProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMapHtml")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
