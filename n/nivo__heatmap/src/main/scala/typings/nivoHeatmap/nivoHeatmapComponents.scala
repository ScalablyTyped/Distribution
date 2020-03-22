package typings.nivoHeatmap

import typings.nivoCore.mod.Dimensions
import typings.nivoHeatmap.mod.HeatMapCanvasProps
import typings.nivoHeatmap.mod.HeatMapSvgProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoHeatmapComponents extends nivoHeatmapProps {
  @scala.inline
  def HeatMap: ComponentType[HeatMapSvgProps with Dimensions] = js.constructorOf[typings.nivoHeatmap.mod.HeatMap].asInstanceOf[typings.react.mod.ComponentType[typings.nivoHeatmap.mod.HeatMapSvgProps with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def HeatMapCanvas: ComponentType[HeatMapCanvasProps with Dimensions] = js.constructorOf[typings.nivoHeatmap.mod.HeatMapCanvas].asInstanceOf[typings.react.mod.ComponentType[typings.nivoHeatmap.mod.HeatMapCanvasProps with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def ResponsiveHeatMap: ComponentType[ResponsiveHeatMapProps] = js.constructorOf[typings.nivoHeatmap.mod.ResponsiveHeatMap].asInstanceOf[typings.react.mod.ComponentType[ResponsiveHeatMapProps]]
  @scala.inline
  def ResponsiveHeatMapCanvas: ComponentType[ResponsiveHeatMapCanvasProps] = js.constructorOf[typings.nivoHeatmap.mod.ResponsiveHeatMapCanvas].asInstanceOf[typings.react.mod.ComponentType[ResponsiveHeatMapCanvasProps]]
}

