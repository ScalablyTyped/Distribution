package typings.nivoBar

import typings.nivoBar.anon.Bars
import typings.nivoBar.anon.Direction
import typings.nivoBar.anon.FormatValue
import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarSvgProps
import typings.nivoBar.distTypesTypesMod.BarsWithHidden
import typings.nivoBar.distTypesTypesMod.LegendData
import typings.nivoBar.distTypesTypesMod.LegendLabelDatum
import typings.nivoBar.nivoBarStrings.data
import typings.nivoBar.nivoBarStrings.groupMode
import typings.nivoBar.nivoBarStrings.grouped
import typings.nivoBar.nivoBarStrings.height
import typings.nivoBar.nivoBarStrings.horizontal
import typings.nivoBar.nivoBarStrings.indexScale
import typings.nivoBar.nivoBarStrings.innerPadding
import typings.nivoBar.nivoBarStrings.keys
import typings.nivoBar.nivoBarStrings.layout
import typings.nivoBar.nivoBarStrings.maxValue
import typings.nivoBar.nivoBarStrings.minValue
import typings.nivoBar.nivoBarStrings.padding
import typings.nivoBar.nivoBarStrings.reverse
import typings.nivoBar.nivoBarStrings.stacked
import typings.nivoBar.nivoBarStrings.valueScale
import typings.nivoBar.nivoBarStrings.vertical
import typings.nivoBar.nivoBarStrings.width
import typings.nivoLegends.distTypesTypesMod.LegendDirection
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/bar/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateGroupedBars[RawDatum /* <: BarDatum */](
    param0: (Pick[
      Required[BarSvgProps[RawDatum]], 
      keys | maxValue | minValue | innerPadding | padding | valueScale | indexScale | layout | reverse | height | width | data
    ]) & FormatValue[RawDatum]
  ): Bars[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGroupedBars")(param0.asInstanceOf[js.Any]).asInstanceOf[Bars[RawDatum]]
  
  inline def generateStackedBars[RawDatum /* <: BarDatum */](
    param0: (Pick[
      Required[BarSvgProps[RawDatum]], 
      keys | maxValue | minValue | innerPadding | padding | valueScale | indexScale | layout | reverse | height | width | data
    ]) & FormatValue[RawDatum]
  ): Bars[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStackedBars")(param0.asInstanceOf[js.Any]).asInstanceOf[Bars[RawDatum]]
  
  inline def getLegendData[RawDatum /* <: BarDatum */](
    param0: (Pick[Required[BarSvgProps[RawDatum]], groupMode | layout | reverse]) & Direction[RawDatum]
  ): js.Array[LegendData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegendData")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[LegendData]]
  
  inline def getLegendDataForIndexes[RawDatum /* <: BarDatum */](
    bars: BarsWithHidden[RawDatum],
    layout: horizontal | vertical,
    getLegendLabel: js.Function1[/* datum */ LegendLabelDatum[RawDatum], String]
  ): js.Array[LegendData] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendDataForIndexes")(bars.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], getLegendLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[LegendData]]
  
  inline def getLegendDataForKeys[RawDatum /* <: BarDatum */](
    bars: BarsWithHidden[RawDatum],
    layout: horizontal | vertical,
    direction: LegendDirection,
    groupMode: grouped | stacked,
    reverse: Boolean,
    getLegendLabel: js.Function1[/* datum */ LegendLabelDatum[RawDatum], String]
  ): js.Array[LegendData] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendDataForKeys")(bars.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], groupMode.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], getLegendLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[LegendData]]
}
