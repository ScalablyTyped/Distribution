package typings.nivoSunburst

import typings.nivoSunburst.nivoSunburstStrings.data
import typings.nivoSunburst.nivoSunburstStrings.height
import typings.nivoSunburst.nivoSunburstStrings.width
import typings.nivoSunburst.typesMod.SunburstSvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sunburstMod {
  
  @JSImport("@nivo/sunburst/dist/types/Sunburst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Sunburst[RawDatum](
    hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: (Partial[Omit[SunburstSvgProps[RawDatum], data | height | width]]) & (Pick[SunburstSvgProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Sunburst")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
