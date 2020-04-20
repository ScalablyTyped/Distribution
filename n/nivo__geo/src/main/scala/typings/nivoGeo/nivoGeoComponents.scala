package typings.nivoGeo

import typings.nivoCore.mod.Dimensions
import typings.nivoGeo.mod.ChoroplethCanvasProps
import typings.nivoGeo.mod.ChoroplethProps
import typings.nivoGeo.mod.GeoMapCanvasProps
import typings.nivoGeo.mod.GeoMapProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoGeoComponents extends nivoGeoProps {
  @scala.inline
  def Choropleth: ComponentType[ChoroplethProps with Dimensions] = js.constructorOf[typings.nivoGeo.mod.Choropleth].asInstanceOf[ComponentType[ChoroplethProps with Dimensions]]
  @scala.inline
  def ChoroplethCanvas: ComponentType[ChoroplethCanvasProps with Dimensions] = js.constructorOf[typings.nivoGeo.mod.ChoroplethCanvas].asInstanceOf[ComponentType[ChoroplethCanvasProps with Dimensions]]
  @scala.inline
  def GeoMap: ComponentType[GeoMapProps with Dimensions] = js.constructorOf[typings.nivoGeo.mod.GeoMap].asInstanceOf[ComponentType[GeoMapProps with Dimensions]]
  @scala.inline
  def GeoMapCanvas: ComponentType[GeoMapCanvasProps with Dimensions] = js.constructorOf[typings.nivoGeo.mod.GeoMapCanvas].asInstanceOf[ComponentType[GeoMapCanvasProps with Dimensions]]
  @scala.inline
  def ResponsiveChoropleth: ComponentType[ResponsiveChoroplethProps] = js.constructorOf[typings.nivoGeo.mod.ResponsiveChoropleth].asInstanceOf[ComponentType[ResponsiveChoroplethProps]]
  @scala.inline
  def ResponsiveChoroplethCanvas: ComponentType[ResponsiveChoroplethCanvasProps] = js.constructorOf[typings.nivoGeo.mod.ResponsiveChoroplethCanvas].asInstanceOf[ComponentType[ResponsiveChoroplethCanvasProps]]
  @scala.inline
  def ResponsiveGeoMap: ComponentType[ResponsiveGeoMapProps] = js.constructorOf[typings.nivoGeo.mod.ResponsiveGeoMap].asInstanceOf[ComponentType[ResponsiveGeoMapProps]]
  @scala.inline
  def ResponsiveGeoMapCanvas: ComponentType[ResponsiveGeoMapCanvasProps] = js.constructorOf[typings.nivoGeo.mod.ResponsiveGeoMapCanvas].asInstanceOf[ComponentType[ResponsiveGeoMapCanvasProps]]
}

