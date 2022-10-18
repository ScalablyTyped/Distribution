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
  
  inline def computeContinuousColorsLegend(
    hasScaleTicksLengthThicknessDirectionTickPositionTickSizeTickSpacingTickOverlapTickFormatTitleTitleAlignTitleOffset: ContinuousColorsLegendProps
  ): ColorStops = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorsLegend")(hasScaleTicksLengthThicknessDirectionTickPositionTickSizeTickSpacingTickOverlapTickFormatTitleTitleAlignTitleOffset.asInstanceOf[js.Any]).asInstanceOf[ColorStops]
  
  inline def computeDimensions(hasDirectionItemsSpacing_paddingItemCountItemWidthItemHeight: PickBoxLegendSvgPropsdire): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDimensions")(hasDirectionItemsSpacing_paddingItemCountItemWidthItemHeight.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def computeItemLayout(hasDirectionJustifySymbolSizeSymbolSpacingWidthHeight: directionLegendItemDirect): LabelAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("computeItemLayout")(hasDirectionJustifySymbolSizeSymbolSpacingWidthHeight.asInstanceOf[js.Any]).asInstanceOf[LabelAlignment]
  
  inline def computePositionFromAnchor(hasAnchorTranslateXTranslateYContainerWidthContainerHeightWidthHeight: anchorLegendAnchorRecordt): X = ^.asInstanceOf[js.Dynamic].applyDynamic("computePositionFromAnchor")(hasAnchorTranslateXTranslateYContainerWidthContainerHeightWidthHeight.asInstanceOf[js.Any]).asInstanceOf[X]
}
