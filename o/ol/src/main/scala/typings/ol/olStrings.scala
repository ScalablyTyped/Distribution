package typings.ol

import typings.ol.consoleMod.Level
import typings.ol.controlScaleLineMod.Units
import typings.ol.extentMod.Corner
import typings.ol.formatIgcMod.IGCZ
import typings.ol.geolocationMod._GeolocationObjectEventTypes
import typings.ol.geomGeometryMod.GeometryLayout
import typings.ol.geomGeometryMod.Type
import typings.ol.interactionDrawMod.Mode
import typings.ol.interactionLinkMod.Params
import typings.ol.layerBaseMod._BaseLayerObjectEventTypes
import typings.ol.layerGroupMod.EventType
import typings.ol.layerLayerMod.LayerEventType
import typings.ol.layerVectorTileMod.VectorTileRenderType
import typings.ol.mapBrowserEventTypeMod.Types
import typings.ol.mapMod._MapObjectEventTypes
import typings.ol.observableMod.EventTypes
import typings.ol.overlayMod.Positioning
import typings.ol.overlayMod._OverlayObjectEventTypes
import typings.ol.renderCanvasMod.BuilderType
import typings.ol.renderEventTypeMod.LayerRenderEventTypes
import typings.ol.renderEventTypeMod.MapRenderEventTypes
import typings.ol.rendererWebglShadersMod.DefaultAttributes
import typings.ol.sourceImageMod.ImageSourceEventTypes
import typings.ol.sourceOgcTileUtilMod.CornerOfOrigin
import typings.ol.sourceOgcTileUtilMod.TileType
import typings.ol.sourceRasterMod.RasterOperationType
import typings.ol.sourceRasterMod.RasterSourceEventTypes
import typings.ol.sourceSourceMod.State
import typings.ol.sourceTileEventTypeMod.TileSourceEventTypes
import typings.ol.sourceVectorEventTypeMod.VectorSourceEventTypes
import typings.ol.sourceWmsMod.ServerType
import typings.ol.sourceWmtsMod.RequestEncoding
import typings.ol.sourceZoomifyMod.TierSizeCalculation
import typings.ol.styleIconMod.IconAnchorUnits
import typings.ol.styleIconMod.IconOrigin
import typings.ol.styleTextMod.TextJustify
import typings.ol.styleTextMod.TextPlacement
import typings.ol.viewMod._ViewObjectEventTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olStrings {
  
  @js.native
  sealed trait Circle
    extends StObject
       with BuilderType
       with Mode
       with Type
  inline def Circle: Circle = "Circle".asInstanceOf[Circle]
  
  @js.native
  sealed trait Default
    extends StObject
       with BuilderType
  inline def Default: Default = "Default".asInstanceOf[Default]
  
  @js.native
  sealed trait GeometryCollection
    extends StObject
       with Type
  inline def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait Image
    extends StObject
       with BuilderType
  inline def Image: Image = "Image".asInstanceOf[Image]
  
  @js.native
  sealed trait KVP
    extends StObject
       with RequestEncoding
  inline def KVP: KVP = "KVP".asInstanceOf[KVP]
  
  @js.native
  sealed trait LineString
    extends StObject
       with BuilderType
       with Mode
       with Type
  inline def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait LinearRing
    extends StObject
       with Type
  inline def LinearRing: LinearRing = "LinearRing".asInstanceOf[LinearRing]
  
  @js.native
  sealed trait MultiLineString
    extends StObject
       with Type
  inline def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint
    extends StObject
       with Type
  inline def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon
    extends StObject
       with Type
  inline def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point
    extends StObject
       with Mode
       with Type
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon
    extends StObject
       with BuilderType
       with Mode
       with Type
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait REST
    extends StObject
       with RequestEncoding
  inline def REST: REST = "REST".asInstanceOf[REST]
  
  @js.native
  sealed trait Text
    extends StObject
       with BuilderType
  inline def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait XY
    extends StObject
       with GeometryLayout
  inline def XY: XY = "XY".asInstanceOf[XY]
  
  @js.native
  sealed trait XYM
    extends StObject
       with GeometryLayout
  inline def XYM: XYM = "XYM".asInstanceOf[XYM]
  
  @js.native
  sealed trait XYZ
    extends StObject
       with GeometryLayout
  inline def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  
  @js.native
  sealed trait XYZM
    extends StObject
       with GeometryLayout
  inline def XYZM: XYZM = "XYZM".asInstanceOf[XYZM]
  
  @js.native
  sealed trait absolute extends StObject
  inline def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait add extends StObject
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait addfeature
    extends StObject
       with VectorSourceEventTypes
  inline def addfeature: addfeature = "addfeature".asInstanceOf[addfeature]
  
  @js.native
  sealed trait addfeatures extends StObject
  inline def addfeatures: addfeatures = "addfeatures".asInstanceOf[addfeatures]
  
  @js.native
  sealed trait addlayer
    extends StObject
       with EventType
  inline def addlayer: addlayer = "addlayer".asInstanceOf[addlayer]
  
  @js.native
  sealed trait afteroperations
    extends StObject
       with RasterSourceEventTypes
  inline def afteroperations: afteroperations = "afteroperations".asInstanceOf[afteroperations]
  
  @js.native
  sealed trait arraybuffer
    extends StObject
       with typings.ol.formatFeatureMod.Type
  inline def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait barometric
    extends StObject
       with IGCZ
  inline def barometric: barometric = "barometric".asInstanceOf[barometric]
  
  @js.native
  sealed trait beforeoperations
    extends StObject
       with RasterSourceEventTypes
  inline def beforeoperations: beforeoperations = "beforeoperations".asInstanceOf[beforeoperations]
  
  @js.native
  sealed trait `bottom-center`
    extends StObject
       with Positioning
  inline def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  
  @js.native
  sealed trait `bottom-left`
    extends StObject
       with Corner
       with IconOrigin
       with Positioning
  inline def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right`
    extends StObject
       with Corner
       with IconOrigin
       with Positioning
  inline def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait bottomLeft
    extends StObject
       with CornerOfOrigin
  inline def bottomLeft: bottomLeft = "bottomLeft".asInstanceOf[bottomLeft]
  
  @js.native
  sealed trait boxcancel extends StObject
  inline def boxcancel: boxcancel = "boxcancel".asInstanceOf[boxcancel]
  
  @js.native
  sealed trait boxdrag extends StObject
  inline def boxdrag: boxdrag = "boxdrag".asInstanceOf[boxdrag]
  
  @js.native
  sealed trait boxend extends StObject
  inline def boxend: boxend = "boxend".asInstanceOf[boxend]
  
  @js.native
  sealed trait boxstart extends StObject
  inline def boxstart: boxstart = "boxstart".asInstanceOf[boxstart]
  
  @js.native
  sealed trait carmentaserver
    extends StObject
       with ServerType
  inline def carmentaserver: carmentaserver = "carmentaserver".asInstanceOf[carmentaserver]
  
  @js.native
  sealed trait center
    extends StObject
       with TextJustify
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `center-center`
    extends StObject
       with Positioning
  inline def `center-center`: `center-center` = "center-center".asInstanceOf[`center-center`]
  
  @js.native
  sealed trait `center-left`
    extends StObject
       with Positioning
  inline def `center-left`: `center-left` = "center-left".asInstanceOf[`center-left`]
  
  @js.native
  sealed trait `center-right`
    extends StObject
       with Positioning
  inline def `center-right`: `center-right` = "center-right".asInstanceOf[`center-right`]
  
  @js.native
  sealed trait change
    extends StObject
       with EventTypes
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait changeColonaccuracy
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColonaccuracy: changeColonaccuracy = "change:accuracy".asInstanceOf[changeColonaccuracy]
  
  @js.native
  sealed trait changeColonaccuracyGeometry
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColonaccuracyGeometry: changeColonaccuracyGeometry = "change:accuracyGeometry".asInstanceOf[changeColonaccuracyGeometry]
  
  @js.native
  sealed trait changeColonactive extends StObject
  inline def changeColonactive: changeColonactive = "change:active".asInstanceOf[changeColonactive]
  
  @js.native
  sealed trait changeColonaltitude
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColonaltitude: changeColonaltitude = "change:altitude".asInstanceOf[changeColonaltitude]
  
  @js.native
  sealed trait changeColonaltitudeAccuracy
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColonaltitudeAccuracy: changeColonaltitudeAccuracy = "change:altitudeAccuracy".asInstanceOf[changeColonaltitudeAccuracy]
  
  @js.native
  sealed trait changeColoncenter
    extends StObject
       with _ViewObjectEventTypes
  inline def changeColoncenter: changeColoncenter = "change:center".asInstanceOf[changeColoncenter]
  
  @js.native
  sealed trait changeColoncoordinateFormat extends StObject
  inline def changeColoncoordinateFormat: changeColoncoordinateFormat = "change:coordinateFormat".asInstanceOf[changeColoncoordinateFormat]
  
  @js.native
  sealed trait changeColonelement
    extends StObject
       with _OverlayObjectEventTypes
  inline def changeColonelement: changeColonelement = "change:element".asInstanceOf[changeColonelement]
  
  @js.native
  sealed trait changeColonextent
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonextent: changeColonextent = "change:extent".asInstanceOf[changeColonextent]
  
  @js.native
  sealed trait changeColongeometry extends StObject
  inline def changeColongeometry: changeColongeometry = "change:geometry".asInstanceOf[changeColongeometry]
  
  @js.native
  sealed trait changeColonheading
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColonheading: changeColonheading = "change:heading".asInstanceOf[changeColonheading]
  
  @js.native
  sealed trait changeColonlayergroup
    extends StObject
       with _MapObjectEventTypes
  inline def changeColonlayergroup: changeColonlayergroup = "change:layergroup".asInstanceOf[changeColonlayergroup]
  
  @js.native
  sealed trait changeColonlayers extends StObject
  inline def changeColonlayers: changeColonlayers = "change:layers".asInstanceOf[changeColonlayers]
  
  @js.native
  sealed trait changeColonlength extends StObject
  inline def changeColonlength: changeColonlength = "change:length".asInstanceOf[changeColonlength]
  
  @js.native
  sealed trait changeColonmap
    extends StObject
       with _OverlayObjectEventTypes
  inline def changeColonmap: changeColonmap = "change:map".asInstanceOf[changeColonmap]
  
  @js.native
  sealed trait changeColonmaxResolution
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonmaxResolution: changeColonmaxResolution = "change:maxResolution".asInstanceOf[changeColonmaxResolution]
  
  @js.native
  sealed trait changeColonmaxZoom
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonmaxZoom: changeColonmaxZoom = "change:maxZoom".asInstanceOf[changeColonmaxZoom]
  
  @js.native
  sealed trait changeColonminResolution
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonminResolution: changeColonminResolution = "change:minResolution".asInstanceOf[changeColonminResolution]
  
  @js.native
  sealed trait changeColonminZoom
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonminZoom: changeColonminZoom = "change:minZoom".asInstanceOf[changeColonminZoom]
  
  @js.native
  sealed trait changeColonoffset
    extends StObject
       with _OverlayObjectEventTypes
  inline def changeColonoffset: changeColonoffset = "change:offset".asInstanceOf[changeColonoffset]
  
  @js.native
  sealed trait changeColonopacity
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonopacity: changeColonopacity = "change:opacity".asInstanceOf[changeColonopacity]
  
  @js.native
  sealed trait changeColonposition
    extends StObject
       with _GeolocationObjectEventTypes
       with _OverlayObjectEventTypes
  inline def changeColonposition: changeColonposition = "change:position".asInstanceOf[changeColonposition]
  
  @js.native
  sealed trait changeColonpositioning
    extends StObject
       with _OverlayObjectEventTypes
  inline def changeColonpositioning: changeColonpositioning = "change:positioning".asInstanceOf[changeColonpositioning]
  
  @js.native
  sealed trait changeColonpreload extends StObject
  inline def changeColonpreload: changeColonpreload = "change:preload".asInstanceOf[changeColonpreload]
  
  @js.native
  sealed trait changeColonprojection
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColonprojection: changeColonprojection = "change:projection".asInstanceOf[changeColonprojection]
  
  @js.native
  sealed trait changeColonresolution
    extends StObject
       with _ViewObjectEventTypes
  inline def changeColonresolution: changeColonresolution = "change:resolution".asInstanceOf[changeColonresolution]
  
  @js.native
  sealed trait changeColonrotation
    extends StObject
       with _ViewObjectEventTypes
  inline def changeColonrotation: changeColonrotation = "change:rotation".asInstanceOf[changeColonrotation]
  
  @js.native
  sealed trait changeColonsize
    extends StObject
       with _MapObjectEventTypes
  inline def changeColonsize: changeColonsize = "change:size".asInstanceOf[changeColonsize]
  
  @js.native
  sealed trait changeColonsource
    extends StObject
       with LayerEventType
  inline def changeColonsource: changeColonsource = "change:source".asInstanceOf[changeColonsource]
  
  @js.native
  sealed trait changeColonspeed
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColonspeed: changeColonspeed = "change:speed".asInstanceOf[changeColonspeed]
  
  @js.native
  sealed trait changeColontarget
    extends StObject
       with _MapObjectEventTypes
  inline def changeColontarget: changeColontarget = "change:target".asInstanceOf[changeColontarget]
  
  @js.native
  sealed trait changeColontracking
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColontracking: changeColontracking = "change:tracking".asInstanceOf[changeColontracking]
  
  @js.native
  sealed trait changeColontrackingOptions
    extends StObject
       with _GeolocationObjectEventTypes
  inline def changeColontrackingOptions: changeColontrackingOptions = "change:trackingOptions".asInstanceOf[changeColontrackingOptions]
  
  @js.native
  sealed trait changeColonunits extends StObject
  inline def changeColonunits: changeColonunits = "change:units".asInstanceOf[changeColonunits]
  
  @js.native
  sealed trait changeColonuseInterimTilesOnError extends StObject
  inline def changeColonuseInterimTilesOnError: changeColonuseInterimTilesOnError = "change:useInterimTilesOnError".asInstanceOf[changeColonuseInterimTilesOnError]
  
  @js.native
  sealed trait changeColonview
    extends StObject
       with _MapObjectEventTypes
  inline def changeColonview: changeColonview = "change:view".asInstanceOf[changeColonview]
  
  @js.native
  sealed trait changeColonvisible
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonvisible: changeColonvisible = "change:visible".asInstanceOf[changeColonvisible]
  
  @js.native
  sealed trait changeColonzIndex
    extends StObject
       with _BaseLayerObjectEventTypes
  inline def changeColonzIndex: changeColonzIndex = "change:zIndex".asInstanceOf[changeColonzIndex]
  
  @js.native
  sealed trait changefeature
    extends StObject
       with VectorSourceEventTypes
  inline def changefeature: changefeature = "changefeature".asInstanceOf[changefeature]
  
  @js.native
  sealed trait clear
    extends StObject
       with VectorSourceEventTypes
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait click
    extends StObject
       with Types
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait color
    extends StObject
       with DefaultAttributes
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait dblclick
    extends StObject
       with Types
  inline def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  
  @js.native
  sealed trait declutter extends StObject
  inline def declutter: declutter = "declutter".asInstanceOf[declutter]
  
  @js.native
  sealed trait default_
    extends StObject
       with TierSizeCalculation
  inline def default_ : default_ = "default".asInstanceOf[default_]
  
  @js.native
  sealed trait degrees
    extends StObject
       with Units
       with typings.ol.projUnitsMod.Units
  inline def degrees: degrees = "degrees".asInstanceOf[degrees]
  
  @js.native
  sealed trait drawabort extends StObject
  inline def drawabort: drawabort = "drawabort".asInstanceOf[drawabort]
  
  @js.native
  sealed trait drawend extends StObject
  inline def drawend: drawend = "drawend".asInstanceOf[drawend]
  
  @js.native
  sealed trait drawstart extends StObject
  inline def drawstart: drawstart = "drawstart".asInstanceOf[drawstart]
  
  @js.native
  sealed trait enterfullscreen extends StObject
  inline def enterfullscreen: enterfullscreen = "enterfullscreen".asInstanceOf[enterfullscreen]
  
  @js.native
  sealed trait error
    extends StObject
       with EventTypes
       with Level
       with State
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait extentchanged extends StObject
  inline def extentchanged: extentchanged = "extentchanged".asInstanceOf[extentchanged]
  
  @js.native
  sealed trait featuresloadend
    extends StObject
       with VectorSourceEventTypes
  inline def featuresloadend: featuresloadend = "featuresloadend".asInstanceOf[featuresloadend]
  
  @js.native
  sealed trait featuresloaderror
    extends StObject
       with VectorSourceEventTypes
  inline def featuresloaderror: featuresloaderror = "featuresloaderror".asInstanceOf[featuresloaderror]
  
  @js.native
  sealed trait featuresloadstart
    extends StObject
       with VectorSourceEventTypes
  inline def featuresloadstart: featuresloadstart = "featuresloadstart".asInstanceOf[featuresloadstart]
  
  @js.native
  sealed trait float extends StObject
  inline def float: float = "float".asInstanceOf[float]
  
  @js.native
  sealed trait fraction
    extends StObject
       with IconAnchorUnits
  inline def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait ft
    extends StObject
       with typings.ol.projUnitsMod.Units
  inline def ft: ft = "ft".asInstanceOf[ft]
  
  @js.native
  sealed trait geoserver
    extends StObject
       with ServerType
  inline def geoserver: geoserver = "geoserver".asInstanceOf[geoserver]
  
  @js.native
  sealed trait gps
    extends StObject
       with IGCZ
  inline def gps: gps = "gps".asInstanceOf[gps]
  
  @js.native
  sealed trait hybrid
    extends StObject
       with VectorTileRenderType
  inline def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  
  @js.native
  sealed trait image_
    extends StObject
       with RasterOperationType
  inline def image_ : image_ = "image".asInstanceOf[image_]
  
  @js.native
  sealed trait imageloadend
    extends StObject
       with ImageSourceEventTypes
       with RasterSourceEventTypes
  inline def imageloadend: imageloadend = "imageloadend".asInstanceOf[imageloadend]
  
  @js.native
  sealed trait imageloaderror
    extends StObject
       with ImageSourceEventTypes
       with RasterSourceEventTypes
  inline def imageloaderror: imageloaderror = "imageloaderror".asInstanceOf[imageloaderror]
  
  @js.native
  sealed trait imageloadstart
    extends StObject
       with ImageSourceEventTypes
       with RasterSourceEventTypes
  inline def imageloadstart: imageloadstart = "imageloadstart".asInstanceOf[imageloadstart]
  
  @js.native
  sealed trait imperial
    extends StObject
       with Units
  inline def imperial: imperial = "imperial".asInstanceOf[imperial]
  
  @js.native
  sealed trait info
    extends StObject
       with Level
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait json
    extends StObject
       with typings.ol.formatFeatureMod.Type
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait l
    extends StObject
       with Params
  inline def l: l = "l".asInstanceOf[l]
  
  @js.native
  sealed trait leavefullscreen extends StObject
  inline def leavefullscreen: leavefullscreen = "leavefullscreen".asInstanceOf[leavefullscreen]
  
  @js.native
  sealed trait left
    extends StObject
       with TextJustify
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait line
    extends StObject
       with TextPlacement
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait loadend
    extends StObject
       with typings.ol.mapEventTypeMod.Types
  inline def loadend: loadend = "loadend".asInstanceOf[loadend]
  
  @js.native
  sealed trait loading
    extends StObject
       with State
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait loadstart
    extends StObject
       with typings.ol.mapEventTypeMod.Types
  inline def loadstart: loadstart = "loadstart".asInstanceOf[loadstart]
  
  @js.native
  sealed trait m
    extends StObject
       with typings.ol.projUnitsMod.Units
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait map
    extends StObject
       with TileType
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait mapserver
    extends StObject
       with ServerType
  inline def mapserver: mapserver = "mapserver".asInstanceOf[mapserver]
  
  @js.native
  sealed trait metric
    extends StObject
       with Units
  inline def metric: metric = "metric".asInstanceOf[metric]
  
  @js.native
  sealed trait modifyend extends StObject
  inline def modifyend: modifyend = "modifyend".asInstanceOf[modifyend]
  
  @js.native
  sealed trait modifystart extends StObject
  inline def modifystart: modifystart = "modifystart".asInstanceOf[modifystart]
  
  @js.native
  sealed trait moveend
    extends StObject
       with typings.ol.mapEventTypeMod.Types
  inline def moveend: moveend = "moveend".asInstanceOf[moveend]
  
  @js.native
  sealed trait movestart
    extends StObject
       with typings.ol.mapEventTypeMod.Types
  inline def movestart: movestart = "movestart".asInstanceOf[movestart]
  
  @js.native
  sealed trait nautical
    extends StObject
       with Units
  inline def nautical: nautical = "nautical".asInstanceOf[nautical]
  
  @js.native
  sealed trait none
    extends StObject
       with IGCZ
       with Level
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait obstacle extends StObject
  inline def obstacle: obstacle = "obstacle".asInstanceOf[obstacle]
  
  @js.native
  sealed trait opacity
    extends StObject
       with DefaultAttributes
  inline def opacity: opacity = "opacity".asInstanceOf[opacity]
  
  @js.native
  sealed trait pixel
    extends StObject
       with RasterOperationType
  inline def pixel: pixel = "pixel".asInstanceOf[pixel]
  
  @js.native
  sealed trait pixels
    extends StObject
       with IconAnchorUnits
       with typings.ol.projUnitsMod.Units
  inline def pixels: pixels = "pixels".asInstanceOf[pixels]
  
  @js.native
  sealed trait point_
    extends StObject
       with TextPlacement
  inline def point_ : point_ = "point".asInstanceOf[point_]
  
  @js.native
  sealed trait pointerdrag
    extends StObject
       with Types
  inline def pointerdrag: pointerdrag = "pointerdrag".asInstanceOf[pointerdrag]
  
  @js.native
  sealed trait pointermove
    extends StObject
       with Types
  inline def pointermove: pointermove = "pointermove".asInstanceOf[pointermove]
  
  @js.native
  sealed trait postcompose
    extends StObject
       with MapRenderEventTypes
  inline def postcompose: postcompose = "postcompose".asInstanceOf[postcompose]
  
  @js.native
  sealed trait postrender
    extends StObject
       with LayerRenderEventTypes
       with MapRenderEventTypes
       with typings.ol.mapEventTypeMod.Types
  inline def postrender: postrender = "postrender".asInstanceOf[postrender]
  
  @js.native
  sealed trait precompose
    extends StObject
       with MapRenderEventTypes
  inline def precompose: precompose = "precompose".asInstanceOf[precompose]
  
  @js.native
  sealed trait prerender
    extends StObject
       with LayerRenderEventTypes
  inline def prerender: prerender = "prerender".asInstanceOf[prerender]
  
  @js.native
  sealed trait propertychange extends StObject
  inline def propertychange: propertychange = "propertychange".asInstanceOf[propertychange]
  
  @js.native
  sealed trait qgis
    extends StObject
       with ServerType
  inline def qgis: qgis = "qgis".asInstanceOf[qgis]
  
  @js.native
  sealed trait r
    extends StObject
       with Params
  inline def r: r = "r".asInstanceOf[r]
  
  @js.native
  sealed trait radians
    extends StObject
       with typings.ol.projUnitsMod.Units
  inline def radians: radians = "radians".asInstanceOf[radians]
  
  @js.native
  sealed trait ready
    extends StObject
       with State
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait relative extends StObject
  inline def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait removefeature
    extends StObject
       with VectorSourceEventTypes
  inline def removefeature: removefeature = "removefeature".asInstanceOf[removefeature]
  
  @js.native
  sealed trait removelayer
    extends StObject
       with EventType
  inline def removelayer: removelayer = "removelayer".asInstanceOf[removelayer]
  
  @js.native
  sealed trait rendercomplete
    extends StObject
       with MapRenderEventTypes
  inline def rendercomplete: rendercomplete = "rendercomplete".asInstanceOf[rendercomplete]
  
  @js.native
  sealed trait right
    extends StObject
       with TextJustify
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait singleclick
    extends StObject
       with Types
  inline def singleclick: singleclick = "singleclick".asInstanceOf[singleclick]
  
  @js.native
  sealed trait sourceready
    extends StObject
       with LayerEventType
  inline def sourceready: sourceready = "sourceready".asInstanceOf[sourceready]
  
  @js.native
  sealed trait text_
    extends StObject
       with typings.ol.formatFeatureMod.Type
  inline def text_ : text_ = "text".asInstanceOf[text_]
  
  @js.native
  sealed trait `tile-pixels`
    extends StObject
       with typings.ol.projUnitsMod.Units
  inline def `tile-pixels`: `tile-pixels` = "tile-pixels".asInstanceOf[`tile-pixels`]
  
  @js.native
  sealed trait tileloadend
    extends StObject
       with TileSourceEventTypes
  inline def tileloadend: tileloadend = "tileloadend".asInstanceOf[tileloadend]
  
  @js.native
  sealed trait tileloaderror
    extends StObject
       with TileSourceEventTypes
  inline def tileloaderror: tileloaderror = "tileloaderror".asInstanceOf[tileloaderror]
  
  @js.native
  sealed trait tileloadstart
    extends StObject
       with TileSourceEventTypes
  inline def tileloadstart: tileloadstart = "tileloadstart".asInstanceOf[tileloadstart]
  
  @js.native
  sealed trait `top-center`
    extends StObject
       with Positioning
  inline def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @js.native
  sealed trait `top-left`
    extends StObject
       with Corner
       with IconOrigin
       with Positioning
  inline def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right`
    extends StObject
       with Corner
       with IconOrigin
       with Positioning
  inline def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait topLeft
    extends StObject
       with CornerOfOrigin
  inline def topLeft: topLeft = "topLeft".asInstanceOf[topLeft]
  
  @js.native
  sealed trait trackpad
    extends StObject
       with typings.ol.interactionMouseWheelZoomMod.Mode
  inline def trackpad: trackpad = "trackpad".asInstanceOf[trackpad]
  
  @js.native
  sealed trait translateend extends StObject
  inline def translateend: translateend = "translateend".asInstanceOf[translateend]
  
  @js.native
  sealed trait translatestart extends StObject
  inline def translatestart: translatestart = "translatestart".asInstanceOf[translatestart]
  
  @js.native
  sealed trait translating extends StObject
  inline def translating: translating = "translating".asInstanceOf[translating]
  
  @js.native
  sealed trait truncated
    extends StObject
       with TierSizeCalculation
  inline def truncated: truncated = "truncated".asInstanceOf[truncated]
  
  @js.native
  sealed trait u_paletteTextures extends StObject
  inline def u_paletteTextures: u_paletteTextures = "u_paletteTextures".asInstanceOf[u_paletteTextures]
  
  @js.native
  sealed trait undefined
    extends StObject
       with State
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait us
    extends StObject
       with Units
  inline def us: us = "us".asInstanceOf[us]
  
  @js.native
  sealed trait `us-ft`
    extends StObject
       with typings.ol.projUnitsMod.Units
  inline def `us-ft`: `us-ft` = "us-ft".asInstanceOf[`us-ft`]
  
  @js.native
  sealed trait vec2 extends StObject
  inline def vec2: vec2 = "vec2".asInstanceOf[vec2]
  
  @js.native
  sealed trait vec3 extends StObject
  inline def vec3: vec3 = "vec3".asInstanceOf[vec3]
  
  @js.native
  sealed trait vec4 extends StObject
  inline def vec4: vec4 = "vec4".asInstanceOf[vec4]
  
  @js.native
  sealed trait vector
    extends StObject
       with TileType
       with VectorTileRenderType
  inline def vector: vector = "vector".asInstanceOf[vector]
  
  @js.native
  sealed trait warn
    extends StObject
       with Level
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait wheel
    extends StObject
       with typings.ol.interactionMouseWheelZoomMod.Mode
  inline def wheel: wheel = "wheel".asInstanceOf[wheel]
  
  @js.native
  sealed trait width
    extends StObject
       with DefaultAttributes
  inline def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait x
    extends StObject
       with Params
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait xml
    extends StObject
       with typings.ol.formatFeatureMod.Type
  inline def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait y
    extends StObject
       with Params
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait z
    extends StObject
       with Params
  inline def z: z = "z".asInstanceOf[z]
}
