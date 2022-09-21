package typings.nivoPie

import typings.nivoPie.nivoPieStrings.height
import typings.nivoPie.nivoPieStrings.width
import typings.nivoPie.typesMod.PieCanvasProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsivePieCanvasMod {
  
  @JSImport("@nivo/pie/dist/types/ResponsivePieCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsivePieCanvas[RawDatum](props: Omit[PieCanvasProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsivePieCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
