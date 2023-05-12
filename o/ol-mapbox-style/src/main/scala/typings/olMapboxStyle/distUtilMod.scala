package typings.olMapboxStyle

import typings.olMapboxStyle.anon.A
import typings.olMapboxStyle.anon.Height
import typings.olMapboxStyle.anon.Request
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("ol-mapbox-style/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMapboxLayer(mapOrGroup: LayerGroup | Map, mapboxLayer: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMapboxLayer")(mapOrGroup.asInstanceOf[js.Any], mapboxLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addMapboxLayer(mapOrGroup: LayerGroup | Map, mapboxLayer: Any, beforeLayerId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMapboxLayer")(mapOrGroup.asInstanceOf[js.Any], mapboxLayer.asInstanceOf[js.Any], beforeLayerId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearFunctionCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearFunctionCache")().asInstanceOf[Unit]
  
  inline def createCanvas(width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  @JSImport("ol-mapbox-style/dist/util", "defaultResolutions")
  @js.native
  val defaultResolutions: js.Array[Double] = js.native
  
  inline def deg2rad(degrees: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg2rad")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def drawIconHalo(spriteImage: HTMLImageElement, spriteImageData: Height, haloWidth: Double, haloColor: A): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("drawIconHalo")(spriteImage.asInstanceOf[js.Any], spriteImageData.asInstanceOf[js.Any], haloWidth.asInstanceOf[js.Any], haloColor.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def fetchResource(resourceType: ResourceType, url: String): js.Promise[Any | Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchResource")(resourceType.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any | Response]]
  inline def fetchResource(resourceType: ResourceType, url: String, options: Unit, metadata: Request): js.Promise[Any | Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchResource")(resourceType.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any | Response]]
  inline def fetchResource(resourceType: ResourceType, url: String, options: typings.olMapboxStyle.distApplyMod.Options): js.Promise[Any | Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchResource")(resourceType.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any | Response]]
  inline def fetchResource(
    resourceType: ResourceType,
    url: String,
    options: typings.olMapboxStyle.distApplyMod.Options,
    metadata: Request
  ): js.Promise[Any | Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchResource")(resourceType.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any | Response]]
  
  inline def getFeatureState(
    mapOrLayer: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ Any) | Map | VectorTileLayer,
    feature: FeatureIdentifier
  ): Any | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFeatureState")(mapOrLayer.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Any | Null]
  
  inline def getFilterCache(glStyle: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterCache")(glStyle.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFunctionCache(glStyle: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionCache")(glStyle.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getGlStyle(glStyleOrUrl: Any, options: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlStyle")(glStyleOrUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def getLayer(map: LayerGroup | Map, layerId: String): Layer = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayer")(map.asInstanceOf[js.Any], layerId.asInstanceOf[js.Any])).asInstanceOf[Layer]
  
  inline def getLayers(map: LayerGroup | Map, sourceId: String): js.Array[Layer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayers")(map.asInstanceOf[js.Any], sourceId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Layer]]
  
  inline def getMapboxLayer(mapOrGroup: LayerGroup | Map, layerId: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMapboxLayer")(mapOrGroup.asInstanceOf[js.Any], layerId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSource(map: LayerGroup | Map, sourceId: String): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("getSource")(map.asInstanceOf[js.Any], sourceId.asInstanceOf[js.Any])).asInstanceOf[Source]
  
  inline def getStyleFunctionKey(glStyle: Any, olLayer: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFunctionKey")(glStyle.asInstanceOf[js.Any], olLayer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStyleId(glStyle: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleId")(glStyle.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getTileJson(glSource: Any, styleUrl: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTileJson")(glSource.asInstanceOf[js.Any], styleUrl.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getTileJson(glSource: Any, styleUrl: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTileJson")(glSource.asInstanceOf[js.Any], styleUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getZoomForResolution(resolution: Any, resolutions: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getZoomForResolution")(resolution.asInstanceOf[js.Any], resolutions.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def removeMapboxLayer(mapOrGroup: LayerGroup | Map, mapboxLayerIdOrLayer: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMapboxLayer")(mapOrGroup.asInstanceOf[js.Any], mapboxLayerIdOrLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeMapboxLayer(mapOrGroup: LayerGroup | Map, mapboxLayerIdOrLayer: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMapboxLayer")(mapOrGroup.asInstanceOf[js.Any], mapboxLayerIdOrLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setFeatureState(
    mapOrLayer: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ Any) | Map | VectorTileLayer,
    feature: FeatureIdentifier
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFeatureState")(mapOrLayer.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setFeatureState(
    mapOrLayer: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ Any) | Map | VectorTileLayer,
    feature: FeatureIdentifier,
    state: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFeatureState")(mapOrLayer.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateMapboxLayer(mapOrGroup: LayerGroup | Map, mapboxLayer: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMapboxLayer")(mapOrGroup.asInstanceOf[js.Any], mapboxLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FeatureIdentifier extends StObject {
    
    /**
      * The feature id.
      */
    var id: String | Double
    
    /**
      * The source id.
      */
    var source: String
  }
  object FeatureIdentifier {
    
    inline def apply(id: String | Double, source: String): FeatureIdentifier = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeatureIdentifier] (val x: Self) extends AnyVal {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Layer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_layer.Layer */ Any
  
  type LayerGroup = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_layer.Group */ Any
  
  type Map = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ol.Map */ Any
  
  type Options = typings.olMapboxStyle.distApplyMod.Options
  
  type ResourceType = typings.olMapboxStyle.distApplyMod.ResourceType
  
  type Source = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_source.Source */ Any
  
  type VectorLayer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ Any
  
  type VectorTileLayer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_layer.VectorTile */ Any
}
