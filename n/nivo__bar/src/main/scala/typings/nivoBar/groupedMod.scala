package typings.nivoBar

import typings.nivoBar.anon.Bars
import typings.nivoBar.anon.FormatValue
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
import typings.nivoBar.typesMod.BarDatum
import typings.nivoBar.typesMod.BarSvgProps
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedMod {
  
  @JSImport("@nivo/bar/dist/types/compute/grouped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateGroupedBars[RawDatum /* <: BarDatum */](
    hasLayoutMinValueMaxValueReverseWidthHeightPaddingInnerPaddingValueScaleIndexScaleConfigHiddenIdsProps: (Pick[
      Required[BarSvgProps[RawDatum]], 
      keys | maxValue | minValue | innerPadding | padding | valueScale | indexScale | layout | reverse | height | width | data
    ]) & FormatValue[RawDatum]
  ): Bars[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGroupedBars")(hasLayoutMinValueMaxValueReverseWidthHeightPaddingInnerPaddingValueScaleIndexScaleConfigHiddenIdsProps.asInstanceOf[js.Any]).asInstanceOf[Bars[RawDatum]]
}
