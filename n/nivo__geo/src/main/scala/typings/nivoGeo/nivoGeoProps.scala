package typings.nivoGeo

import typings.nivoGeo.mod.ChoroplethCommonProps
import typings.nivoGeo.mod.GeoMapCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait nivoGeoProps {
  @scala.inline
  def ChoroplethProps: ChoroplethPropsDimensions.type = typings.nivoGeo.ChoroplethPropsDimensions
  type ChoroplethProps = ChoroplethPropsDimensions
  @scala.inline
  def ChoroplethCanvasProps: ChoroplethCanvasPropsDimensions.type = typings.nivoGeo.ChoroplethCanvasPropsDimensions
  type ChoroplethCanvasProps = ChoroplethCanvasPropsDimensions
  @scala.inline
  def GeoMapProps: GeoMapPropsDimensions.type = typings.nivoGeo.GeoMapPropsDimensions
  type GeoMapProps = GeoMapPropsDimensions
  @scala.inline
  def GeoMapCanvasProps: GeoMapCanvasPropsDimensions.type = typings.nivoGeo.GeoMapCanvasPropsDimensions
  type GeoMapCanvasProps = GeoMapCanvasPropsDimensions
  @scala.inline
  def ResponsiveChoroplethProps: ChoroplethCommonProps.type = typings.nivoGeo.mod.ChoroplethCommonProps
  type ResponsiveChoroplethProps = typings.nivoGeo.mod.ChoroplethProps
  @scala.inline
  def ResponsiveChoroplethCanvasProps: typings.nivoGeo.mod.ChoroplethCanvasProps.type = typings.nivoGeo.mod.ChoroplethCanvasProps
  type ResponsiveChoroplethCanvasProps = typings.nivoGeo.mod.ChoroplethCanvasProps
  @scala.inline
  def ResponsiveGeoMapProps: GeoMapCommonProps.type = typings.nivoGeo.mod.GeoMapCommonProps
  type ResponsiveGeoMapProps = typings.nivoGeo.mod.GeoMapProps
  @scala.inline
  def ResponsiveGeoMapCanvasProps: typings.nivoGeo.mod.GeoMapCanvasProps.type = typings.nivoGeo.mod.GeoMapCanvasProps
  type ResponsiveGeoMapCanvasProps = typings.nivoGeo.mod.GeoMapCanvasProps
}

