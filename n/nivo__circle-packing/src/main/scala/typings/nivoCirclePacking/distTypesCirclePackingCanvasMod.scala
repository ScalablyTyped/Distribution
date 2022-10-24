package typings.nivoCirclePacking

import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingCanvasProps
import typings.nivoCirclePacking.nivoCirclePackingStrings.data
import typings.nivoCirclePacking.nivoCirclePackingStrings.height
import typings.nivoCirclePacking.nivoCirclePackingStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCirclePackingCanvasMod {
  
  @JSImport("@nivo/circle-packing/dist/types/CirclePackingCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CirclePackingCanvas[RawDatum](
    param0: (Partial[Omit[CirclePackingCanvasProps[RawDatum], data | height | width]]) & (Pick[CirclePackingCanvasProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePackingCanvas")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
