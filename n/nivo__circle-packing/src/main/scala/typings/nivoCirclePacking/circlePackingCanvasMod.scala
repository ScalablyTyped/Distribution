package typings.nivoCirclePacking

import typings.nivoCirclePacking.nivoCirclePackingStrings.data
import typings.nivoCirclePacking.nivoCirclePackingStrings.height
import typings.nivoCirclePacking.nivoCirclePackingStrings.width
import typings.nivoCirclePacking.typesMod.CirclePackingCanvasProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circlePackingCanvasMod {
  
  @JSImport("@nivo/circle-packing/dist/types/CirclePackingCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CirclePackingCanvas[RawDatum](
    hasIsInteractiveThemeOtherProps: (Partial[Omit[CirclePackingCanvasProps[RawDatum], data | height | width]]) & (Pick[CirclePackingCanvasProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePackingCanvas")(hasIsInteractiveThemeOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
