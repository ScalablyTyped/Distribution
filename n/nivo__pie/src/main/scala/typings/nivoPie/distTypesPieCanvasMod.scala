package typings.nivoPie

import typings.nivoPie.distTypesTypesMod.PieCanvasProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPieCanvasMod {
  
  @JSImport("@nivo/pie/dist/types/PieCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PieCanvas[RawDatum](hasIsInteractiveThemeRenderWrapperOtherProps: PieCanvasProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PieCanvas")(hasIsInteractiveThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
