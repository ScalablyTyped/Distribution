package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.pluggableMapMod.FrameState
import typings.ol.rendererWebglLayerMod.PostProcessesOptions
import typings.ol.webglHelperMod.UniformValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererWebglPointsLayerMod {
  
  @JSImport("ol/renderer/webgl/PointsLayer", JSImport.Default)
  @js.native
  open class default protected () extends WebGLPointsLayerRenderer {
    def this(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], options: Options) = this()
  }
  
  trait CustomAttribute extends StObject {
    
    def callback(p0: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], p1: StringDictionary[Any]): Double
    
    var name: String
  }
  object CustomAttribute {
    
    inline def apply(
      callback: (typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], StringDictionary[Any]) => Double,
      name: String
    ): CustomAttribute = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttribute]
    }
    
    extension [Self <: CustomAttribute](x: Self) {
      
      inline def setCallback(
        value: (typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], StringDictionary[Any]) => Double
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureCacheItem extends StObject {
    
    var feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
    
    var geometry: typings.ol.geomGeometryMod.default
    
    var properties: StringDictionary[Any]
  }
  object FeatureCacheItem {
    
    inline def apply(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      geometry: typings.ol.geomGeometryMod.default,
      properties: StringDictionary[Any]
    ): FeatureCacheItem = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureCacheItem]
    }
    
    extension [Self <: FeatureCacheItem](x: Self) {
      
      inline def setFeature(value: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: typings.ol.geomGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var attributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fragmentShader: String
    
    var hitFragmentShader: js.UndefOr[String] = js.undefined
    
    var hitVertexShader: js.UndefOr[String] = js.undefined
    
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
    var vertexShader: String
  }
  object Options {
    
    inline def apply(fragmentShader: String, vertexShader: String): Options = {
      val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setHitFragmentShader(value: String): Self = StObject.set(x, "hitFragmentShader", value.asInstanceOf[js.Any])
      
      inline def setHitFragmentShaderUndefined: Self = StObject.set(x, "hitFragmentShader", js.undefined)
      
      inline def setHitVertexShader(value: String): Self = StObject.set(x, "hitVertexShader", value.asInstanceOf[js.Any])
      
      inline def setHitVertexShaderUndefined: Self = StObject.set(x, "hitVertexShader", js.undefined)
      
      inline def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      inline def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      inline def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGLPointsLayerRenderer
    extends typings.ol.rendererWebglLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    
    /**
      * Render the layer.
      */
    def renderFrame(frameState: FrameState): HTMLElement = js.native
    
    /**
      * Render the hit detection data to the corresponding render target
      */
    def renderHitDetection(frameState: FrameState): Unit = js.native
  }
}
