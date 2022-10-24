package typings.nivoBar

import typings.nivoBar.anon.Bars
import typings.nivoBar.anon.FormatValue
import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarSvgProps
import typings.nivoBar.nivoBarStrings.data
import typings.nivoBar.nivoBarStrings.height
import typings.nivoBar.nivoBarStrings.indexScale
import typings.nivoBar.nivoBarStrings.innerPadding
import typings.nivoBar.nivoBarStrings.keys
import typings.nivoBar.nivoBarStrings.layout
import typings.nivoBar.nivoBarStrings.maxValue
import typings.nivoBar.nivoBarStrings.minValue
import typings.nivoBar.nivoBarStrings.padding
import typings.nivoBar.nivoBarStrings.reverse
import typings.nivoBar.nivoBarStrings.valueScale
import typings.nivoBar.nivoBarStrings.width
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeStackedMod {
  
  @JSImport("@nivo/bar/dist/types/compute/stacked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateStackedBars[RawDatum /* <: BarDatum */](
    param0: (Pick[
      Required[BarSvgProps[RawDatum]], 
      keys | maxValue | minValue | innerPadding | padding | valueScale | indexScale | layout | reverse | height | width | data
    ]) & FormatValue[RawDatum]
  ): Bars[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStackedBars")(param0.asInstanceOf[js.Any]).asInstanceOf[Bars[RawDatum]]
}
