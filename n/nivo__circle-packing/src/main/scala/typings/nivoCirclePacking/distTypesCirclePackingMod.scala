package typings.nivoCirclePacking

import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingSvgProps
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

object distTypesCirclePackingMod {
  
  @JSImport("@nivo/circle-packing/dist/types/CirclePacking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CirclePacking[RawDatum](
    param0: (Partial[Omit[CirclePackingSvgProps[RawDatum], data | height | width]]) & (Pick[CirclePackingSvgProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePacking")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
