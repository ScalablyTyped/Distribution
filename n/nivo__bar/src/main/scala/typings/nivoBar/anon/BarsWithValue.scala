package typings.nivoBar.anon

import typings.d3Scale.mod.NumberValue
import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarLegendProps
import typings.nivoBar.distTypesTypesMod.ComputedBarDatum
import typings.nivoBar.distTypesTypesMod.ComputedBarDatumWithValue
import typings.nivoBar.distTypesTypesMod.ComputedDatum
import typings.nivoBar.distTypesTypesMod.LegendData
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScale
import typings.nivoScales.distTypesTypesMod.ScaleBand
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.nivoScales.distTypesTypesMod.ScaleLog
import typings.nivoScales.distTypesTypesMod.ScalePoint
import typings.nivoScales.distTypesTypesMod.ScaleSymlog
import typings.nivoScales.distTypesTypesMod.ScaleTime
import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarsWithValue[RawDatum /* <: BarDatum */] extends StObject {
  
  var bars: js.Array[ComputedBarDatum[RawDatum]] = js.native
  
  var barsWithValue: js.Array[AbsX[RawDatum]] = js.native
  
  def formatValue(value: Double): String = js.native
  
  var getBorderColor: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any]) = js.native
  
  var getColor: OrdinalColorScale[ComputedDatum[RawDatum]] = js.native
  
  def getIndex(datum: RawDatum): String = js.native
  
  def getLabel(datum: ComputedDatum[RawDatum]): String = js.native
  
  var getLabelColor: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any]) = js.native
  
  def getTooltipLabel(datum: ComputedDatum[RawDatum]): String = js.native
  
  var hiddenIds: js.Array[String | Double] = js.native
  
  var legendsWithData: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]] = js.native
  
  def shouldRenderBarLabel(param0: Height): Boolean = js.native
  
  def toggleSerie(id: String): Unit = js.native
  def toggleSerie(id: Double): Unit = js.native
  
  var xScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue] = js.native
  
  var yScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue] = js.native
}
