package typings.nivoHeatmap

import typings.nivoHeatmap.typesMod.HeatMapDatum
import typings.nivoHeatmap.typesMod.HeatMapSvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatMapMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: HeatMapSvgProps[Datum, ExtraProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMap")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
