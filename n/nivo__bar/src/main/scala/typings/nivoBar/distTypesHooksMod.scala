package typings.nivoBar

import typings.nivoBar.anon.BarsWithValue
import typings.nivoBar.anon.BorderColor
import typings.nivoBar.distTypesTypesMod.BarDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/bar/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBar[RawDatum /* <: BarDatum */](
    hasIndexByKeysLabelTooltipLabelValueFormatColorsColorByBorderColorLabelTextColorGroupModeLayoutReverseDataMinValueMaxValueMarginWidthHeightPaddingInnerPaddingValueScaleIndexScaleInitialHiddenIdsEnableLabelLabelSkipWidthLabelSkipHeightLegendsLegendLabel: BorderColor[RawDatum]
  ): BarsWithValue[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBar")(hasIndexByKeysLabelTooltipLabelValueFormatColorsColorByBorderColorLabelTextColorGroupModeLayoutReverseDataMinValueMaxValueMarginWidthHeightPaddingInnerPaddingValueScaleIndexScaleInitialHiddenIdsEnableLabelLabelSkipWidthLabelSkipHeightLegendsLegendLabel.asInstanceOf[js.Any]).asInstanceOf[BarsWithValue[RawDatum]]
}
