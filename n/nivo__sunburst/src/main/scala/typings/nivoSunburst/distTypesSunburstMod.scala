package typings.nivoSunburst

import typings.nivoSunburst.distTypesTypesMod.SunburstSvgProps
import typings.nivoSunburst.nivoSunburstStrings.data
import typings.nivoSunburst.nivoSunburstStrings.height
import typings.nivoSunburst.nivoSunburstStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSunburstMod {
  
  @JSImport("@nivo/sunburst/dist/types/Sunburst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Sunburst[RawDatum](
    param0: (Partial[Omit[SunburstSvgProps[RawDatum], data | height | width]]) & (Pick[SunburstSvgProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Sunburst")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
