package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.helperMod.UniformValue
import typings.ol.pluggableMapMod.FrameState
import typings.ol.webglLayerMod.PostProcessesOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointsLayerMod {
  
  @JSImport("ol/renderer/webgl/PointsLayer", JSImport.Default)
  @js.native
  class default protected () extends WebGLPointsLayerRenderer {
    def this(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], options: Options) = this()
  }
  
  @js.native
  trait CustomAttribute extends StObject {
    
    def callback(p0: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], p1: StringDictionary[js.Any]): Double = js.native
    
    var name: String = js.native
  }
  object CustomAttribute {
    
    @scala.inline
    def apply(
      callback: (typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], StringDictionary[js.Any]) => Double,
      name: String
    ): CustomAttribute = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttribute]
    }
    
    @scala.inline
    implicit class CustomAttributeMutableBuilder[Self <: CustomAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(
        value: (typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], StringDictionary[js.Any]) => Double
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeatureCacheItem extends StObject {
    
    var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    
    var geometry: typings.ol.geometryMod.default = js.native
    
    var properties: StringDictionary[js.Any] = js.native
  }
  object FeatureCacheItem {
    
    @scala.inline
    def apply(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      geometry: typings.ol.geometryMod.default,
      properties: StringDictionary[js.Any]
    ): FeatureCacheItem = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureCacheItem]
    }
    
    @scala.inline
    implicit class FeatureCacheItemMutableBuilder[Self <: FeatureCacheItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: typings.ol.geometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var attributes: js.UndefOr[js.Array[CustomAttribute]] = js.native
    
    var fragmentShader: String = js.native
    
    var hitFragmentShader: js.UndefOr[String] = js.native
    
    var hitVertexShader: js.UndefOr[String] = js.native
    
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.native
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
    
    var vertexShader: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(fragmentShader: String, vertexShader: String): Options = {
      val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitFragmentShader(value: String): Self = StObject.set(x, "hitFragmentShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitFragmentShaderUndefined: Self = StObject.set(x, "hitFragmentShader", js.undefined)
      
      @scala.inline
      def setHitVertexShader(value: String): Self = StObject.set(x, "hitVertexShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitVertexShaderUndefined: Self = StObject.set(x, "hitVertexShader", js.undefined)
      
      @scala.inline
      def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      @scala.inline
      def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value :_*))
      
      @scala.inline
      def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      @scala.inline
      def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGLPointsLayerRenderer
    extends typings.ol.webglLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    
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
