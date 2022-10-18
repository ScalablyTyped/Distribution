package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.HeatMapCanvasProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapCanvasMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapCanvas[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps: HeatMapCanvasProps[Datum, ExtraProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapCanvas")(hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
