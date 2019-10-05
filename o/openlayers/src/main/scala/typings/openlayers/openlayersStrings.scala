package typings.openlayers

import typings.openlayers.openlayersMod.OverlayPositioning
import typings.openlayers.openlayersMod.RasterOperationType
import typings.openlayers.openlayersMod.RendererType
import typings.openlayers.openlayersMod.format.IGCZ
import typings.openlayers.openlayersMod.geom.GeometryLayout
import typings.openlayers.openlayersMod.geom.GeometryType
import typings.openlayers.openlayersMod.layer.VectorTileRenderType
import typings.openlayers.openlayersMod.olx.layer.VectorRenderType
import typings.openlayers.openlayersMod.olx.style.TextPlacement
import typings.openlayers.openlayersMod.proj.Units
import typings.openlayers.openlayersMod.source.State
import typings.openlayers.openlayersMod.source.WMTSRequestEncoding
import typings.openlayers.openlayersMod.source.wms.ServerType
import typings.openlayers.openlayersMod.style.IconAnchorUnits
import typings.openlayers.openlayersMod.style.IconOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object openlayersStrings {
  @js.native
  sealed trait Circle extends GeometryType
  
  @js.native
  sealed trait GeometryCollection extends GeometryType
  
  @js.native
  sealed trait KVP extends WMTSRequestEncoding
  
  @js.native
  sealed trait LineString extends GeometryType
  
  @js.native
  sealed trait LinearRing extends GeometryType
  
  @js.native
  sealed trait MultiLineString extends GeometryType
  
  @js.native
  sealed trait MultiPoint extends GeometryType
  
  @js.native
  sealed trait MultiPolygon extends GeometryType
  
  @js.native
  sealed trait Point extends GeometryType
  
  @js.native
  sealed trait Polygon extends GeometryType
  
  @js.native
  sealed trait REST extends WMTSRequestEncoding
  
  @js.native
  sealed trait XY extends GeometryLayout
  
  @js.native
  sealed trait XYM extends GeometryLayout
  
  @js.native
  sealed trait XYZ extends GeometryLayout
  
  @js.native
  sealed trait XYZM extends GeometryLayout
  
  @js.native
  sealed trait barometric extends IGCZ
  
  @js.native
  sealed trait `bottom-center` extends OverlayPositioning
  
  @js.native
  sealed trait `bottom-left`
    extends IconOrigin
       with OverlayPositioning
  
  @js.native
  sealed trait `bottom-right`
    extends IconOrigin
       with OverlayPositioning
  
  @js.native
  sealed trait canvas extends RendererType
  
  @js.native
  sealed trait carmentaserver extends ServerType
  
  @js.native
  sealed trait `center-center` extends OverlayPositioning
  
  @js.native
  sealed trait `center-left` extends OverlayPositioning
  
  @js.native
  sealed trait `center-right` extends OverlayPositioning
  
  @js.native
  sealed trait degrees
    extends Units
       with typings.openlayers.openlayersMod.control.ScaleLine.Units
  
  @js.native
  sealed trait dom extends RendererType
  
  @js.native
  sealed trait error extends State
  
  @js.native
  sealed trait fraction extends IconAnchorUnits
  
  @js.native
  sealed trait ft extends Units
  
  @js.native
  sealed trait geoserver extends ServerType
  
  @js.native
  sealed trait gps extends IGCZ
  
  @js.native
  sealed trait hybrid extends VectorTileRenderType
  
  @js.native
  sealed trait image
    extends RasterOperationType
       with VectorRenderType
       with VectorTileRenderType
  
  @js.native
  sealed trait imperial
    extends typings.openlayers.openlayersMod.control.ScaleLine.Units
  
  @js.native
  sealed trait line extends TextPlacement
  
  @js.native
  sealed trait loading extends State
  
  @js.native
  sealed trait m extends Units
  
  @js.native
  sealed trait mapserver extends ServerType
  
  @js.native
  sealed trait metric
    extends typings.openlayers.openlayersMod.control.ScaleLine.Units
  
  @js.native
  sealed trait nautical
    extends typings.openlayers.openlayersMod.control.ScaleLine.Units
  
  @js.native
  sealed trait none extends IGCZ
  
  @js.native
  sealed trait pixel extends RasterOperationType
  
  @js.native
  sealed trait pixels
    extends IconAnchorUnits
       with Units
  
  @js.native
  sealed trait point extends TextPlacement
  
  @js.native
  sealed trait qgis extends ServerType
  
  @js.native
  sealed trait ready extends State
  
  @js.native
  sealed trait `tile-pixels` extends Units
  
  @js.native
  sealed trait `top-center` extends OverlayPositioning
  
  @js.native
  sealed trait `top-left`
    extends IconOrigin
       with OverlayPositioning
  
  @js.native
  sealed trait `top-right`
    extends IconOrigin
       with OverlayPositioning
  
  @js.native
  sealed trait undefined extends State
  
  @js.native
  sealed trait us
    extends typings.openlayers.openlayersMod.control.ScaleLine.Units
  
  @js.native
  sealed trait `us-ft` extends Units
  
  @js.native
  sealed trait vector
    extends VectorRenderType
       with VectorTileRenderType
  
  @js.native
  sealed trait webgl extends RendererType
  
  @scala.inline
  def Circle: Circle = "Circle".asInstanceOf[Circle]
  @scala.inline
  def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  @scala.inline
  def KVP: KVP = "KVP".asInstanceOf[KVP]
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  @scala.inline
  def LinearRing: LinearRing = "LinearRing".asInstanceOf[LinearRing]
  @scala.inline
  def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  @scala.inline
  def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  @scala.inline
  def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  @scala.inline
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  @scala.inline
  def REST: REST = "REST".asInstanceOf[REST]
  @scala.inline
  def XY: XY = "XY".asInstanceOf[XY]
  @scala.inline
  def XYM: XYM = "XYM".asInstanceOf[XYM]
  @scala.inline
  def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  @scala.inline
  def XYZM: XYZM = "XYZM".asInstanceOf[XYZM]
  @scala.inline
  def barometric: barometric = "barometric".asInstanceOf[barometric]
  @scala.inline
  def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  @scala.inline
  def canvas: canvas = "canvas".asInstanceOf[canvas]
  @scala.inline
  def carmentaserver: carmentaserver = "carmentaserver".asInstanceOf[carmentaserver]
  @scala.inline
  def `center-center`: `center-center` = "center-center".asInstanceOf[`center-center`]
  @scala.inline
  def `center-left`: `center-left` = "center-left".asInstanceOf[`center-left`]
  @scala.inline
  def `center-right`: `center-right` = "center-right".asInstanceOf[`center-right`]
  @scala.inline
  def degrees: degrees = "degrees".asInstanceOf[degrees]
  @scala.inline
  def dom: dom = "dom".asInstanceOf[dom]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fraction: fraction = "fraction".asInstanceOf[fraction]
  @scala.inline
  def ft: ft = "ft".asInstanceOf[ft]
  @scala.inline
  def geoserver: geoserver = "geoserver".asInstanceOf[geoserver]
  @scala.inline
  def gps: gps = "gps".asInstanceOf[gps]
  @scala.inline
  def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def imperial: imperial = "imperial".asInstanceOf[imperial]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  @scala.inline
  def mapserver: mapserver = "mapserver".asInstanceOf[mapserver]
  @scala.inline
  def metric: metric = "metric".asInstanceOf[metric]
  @scala.inline
  def nautical: nautical = "nautical".asInstanceOf[nautical]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def pixel: pixel = "pixel".asInstanceOf[pixel]
  @scala.inline
  def pixels: pixels = "pixels".asInstanceOf[pixels]
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  @scala.inline
  def qgis: qgis = "qgis".asInstanceOf[qgis]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def `tile-pixels`: `tile-pixels` = "tile-pixels".asInstanceOf[`tile-pixels`]
  @scala.inline
  def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  @scala.inline
  def us: us = "us".asInstanceOf[us]
  @scala.inline
  def `us-ft`: `us-ft` = "us-ft".asInstanceOf[`us-ft`]
  @scala.inline
  def vector: vector = "vector".asInstanceOf[vector]
  @scala.inline
  def webgl: webgl = "webgl".asInstanceOf[webgl]
}

