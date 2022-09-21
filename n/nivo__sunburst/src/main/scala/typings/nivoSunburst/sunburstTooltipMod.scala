package typings.nivoSunburst

import typings.nivoSunburst.typesMod.ComputedDatum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sunburstTooltipMod {
  
  @JSImport("@nivo/sunburst/dist/types/SunburstTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SunburstTooltip[RawDatum](hasIdFormattedValueColor: ComputedDatum[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SunburstTooltip")(hasIdFormattedValueColor.asInstanceOf[js.Any]).asInstanceOf[Element]
}
