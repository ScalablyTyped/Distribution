package typings
package openlayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object openlayersLibStrings {
  @js.native
  sealed trait Circle
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait GeometryCollection
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait KVP
    extends openlayersLib.openlayersMod.sourceNs.WMTSRequestEncoding
  
  @js.native
  sealed trait LineString
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait LinearRing
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait MultiLineString
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait MultiPoint
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait MultiPolygon
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait Point
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait Polygon
    extends openlayersLib.openlayersMod.geomNs.GeometryType
  
  @js.native
  sealed trait REST
    extends openlayersLib.openlayersMod.sourceNs.WMTSRequestEncoding
  
  @js.native
  sealed trait XY
    extends openlayersLib.openlayersMod.geomNs.GeometryLayout
  
  @js.native
  sealed trait XYM
    extends openlayersLib.openlayersMod.geomNs.GeometryLayout
  
  @js.native
  sealed trait XYZ
    extends openlayersLib.openlayersMod.geomNs.GeometryLayout
  
  @js.native
  sealed trait XYZM
    extends openlayersLib.openlayersMod.geomNs.GeometryLayout
  
  @js.native
  sealed trait barometric
    extends openlayersLib.openlayersMod.formatNs.IGCZ
  
  @js.native
  sealed trait `bottom-center`
    extends openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait `bottom-left`
    extends openlayersLib.openlayersMod.styleNs.IconOrigin
       with openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait `bottom-right`
    extends openlayersLib.openlayersMod.styleNs.IconOrigin
       with openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait canvas
    extends openlayersLib.openlayersMod.RendererType
  
  @js.native
  sealed trait carmentaserver
    extends openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType
  
  @js.native
  sealed trait `center-center`
    extends openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait `center-left`
    extends openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait `center-right`
    extends openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait degrees
    extends openlayersLib.openlayersMod.controlNs.ScaleLineNs.Units
       with openlayersLib.openlayersMod.projNs.Units
  
  @js.native
  sealed trait dom
    extends openlayersLib.openlayersMod.RendererType
  
  @js.native
  sealed trait error
    extends openlayersLib.openlayersMod.sourceNs.State
  
  @js.native
  sealed trait fraction
    extends openlayersLib.openlayersMod.styleNs.IconAnchorUnits
  
  @js.native
  sealed trait ft
    extends openlayersLib.openlayersMod.projNs.Units
  
  @js.native
  sealed trait geoserver
    extends openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType
  
  @js.native
  sealed trait gps
    extends openlayersLib.openlayersMod.formatNs.IGCZ
  
  @js.native
  sealed trait hybrid
    extends openlayersLib.openlayersMod.layerNs.VectorTileRenderType
  
  @js.native
  sealed trait image
    extends openlayersLib.openlayersMod.RasterOperationType
       with openlayersLib.openlayersMod.olxNs.layerNs.VectorRenderType
       with openlayersLib.openlayersMod.layerNs.VectorTileRenderType
  
  @js.native
  sealed trait imperial
    extends openlayersLib.openlayersMod.controlNs.ScaleLineNs.Units
  
  @js.native
  sealed trait line
    extends openlayersLib.openlayersMod.olxNs.styleNs.TextPlacement
  
  @js.native
  sealed trait loading
    extends openlayersLib.openlayersMod.sourceNs.State
  
  @js.native
  sealed trait m
    extends openlayersLib.openlayersMod.projNs.Units
  
  @js.native
  sealed trait mapserver
    extends openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType
  
  @js.native
  sealed trait metric
    extends openlayersLib.openlayersMod.controlNs.ScaleLineNs.Units
  
  @js.native
  sealed trait nautical
    extends openlayersLib.openlayersMod.controlNs.ScaleLineNs.Units
  
  @js.native
  sealed trait none
    extends openlayersLib.openlayersMod.formatNs.IGCZ
  
  @js.native
  sealed trait pixel
    extends openlayersLib.openlayersMod.RasterOperationType
  
  @js.native
  sealed trait pixels
    extends openlayersLib.openlayersMod.styleNs.IconAnchorUnits
       with openlayersLib.openlayersMod.projNs.Units
  
  @js.native
  sealed trait point
    extends openlayersLib.openlayersMod.olxNs.styleNs.TextPlacement
  
  @js.native
  sealed trait qgis
    extends openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType
  
  @js.native
  sealed trait ready
    extends openlayersLib.openlayersMod.sourceNs.State
  
  @js.native
  sealed trait `tile-pixels`
    extends openlayersLib.openlayersMod.projNs.Units
  
  @js.native
  sealed trait `top-center`
    extends openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait `top-left`
    extends openlayersLib.openlayersMod.styleNs.IconOrigin
       with openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait `top-right`
    extends openlayersLib.openlayersMod.styleNs.IconOrigin
       with openlayersLib.openlayersMod.OverlayPositioning
  
  @js.native
  sealed trait undefined
    extends openlayersLib.openlayersMod.sourceNs.State
  
  @js.native
  sealed trait us
    extends openlayersLib.openlayersMod.controlNs.ScaleLineNs.Units
  
  @js.native
  sealed trait `us-ft`
    extends openlayersLib.openlayersMod.projNs.Units
  
  @js.native
  sealed trait vector
    extends openlayersLib.openlayersMod.olxNs.layerNs.VectorRenderType
       with openlayersLib.openlayersMod.layerNs.VectorTileRenderType
  
  @js.native
  sealed trait webgl
    extends openlayersLib.openlayersMod.RendererType
  
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

