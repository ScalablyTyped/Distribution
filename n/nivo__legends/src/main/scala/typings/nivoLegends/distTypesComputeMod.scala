package typings.nivoLegends

import typings.nivoLegends.anon.ColorStops
import typings.nivoLegends.anon.Height
import typings.nivoLegends.anon.LabelAlignment
import typings.nivoLegends.anon.PickBoxLegendSvgPropsdire
import typings.nivoLegends.anon.X
import typings.nivoLegends.anon.anchorLegendAnchorRecordt
import typings.nivoLegends.anon.directionLegendItemDirect
import typings.nivoLegends.distTypesTypesMod.ContinuousColorsLegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/legends/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeContinuousColorsLegend(param0: ContinuousColorsLegendProps): ColorStops = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorsLegend")(param0.asInstanceOf[js.Any]).asInstanceOf[ColorStops]
  
  inline def computeDimensions(param0: PickBoxLegendSvgPropsdire): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDimensions")(param0.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def computeItemLayout(param0: directionLegendItemDirect): LabelAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("computeItemLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[LabelAlignment]
  
  inline def computePositionFromAnchor(param0: anchorLegendAnchorRecordt): X = ^.asInstanceOf[js.Dynamic].applyDynamic("computePositionFromAnchor")(param0.asInstanceOf[js.Any]).asInstanceOf[X]
}
