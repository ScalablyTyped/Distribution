package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.Game
import typings.std.GLenum
import typings.std.HTMLImageElement
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  object Snapshot {
    
    type SnapshotCallback = js.Function1[/* snapshot */ Color | HTMLImageElement, Unit]
    
    trait SnapshotState extends StObject {
      
      /**
        * The height of the frame buffer, if a frame buffer grab.
        */
      var bufferHeight: js.UndefOr[Double] = js.undefined
      
      /**
        * The width of the frame buffer, if a frame buffer grab.
        */
      var bufferWidth: js.UndefOr[Double] = js.undefined
      
      /**
        * The function to call after the snapshot is taken.
        */
      def callback(snapshot: Color): Unit
      def callback(snapshot: HTMLImageElement): Unit
      /**
        * The function to call after the snapshot is taken.
        */
      @JSName("callback")
      var callback_Original: SnapshotCallback
      
      /**
        * The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`.
        */
      var encoderOptions: js.UndefOr[Double] = js.undefined
      
      /**
        * Is this a snapshot to get a single pixel, or an area?
        */
      var getPixel: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The height of the snapshot.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * Is this snapshot grabbing from a frame buffer or a canvas?
        */
      var isFramebuffer: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The format of the image to create, usually `image/png` or `image/jpeg`.
        */
      var `type`: js.UndefOr[String] = js.undefined
      
      /**
        * The width of the snapshot.
        */
      var width: js.UndefOr[Double] = js.undefined
      
      /**
        * The x coordinate to start the snapshot from.
        */
      var x: js.UndefOr[Double] = js.undefined
      
      /**
        * The y coordinate to start the snapshot from.
        */
      var y: js.UndefOr[Double] = js.undefined
    }
    object SnapshotState {
      
      inline def apply(callback: /* snapshot */ Color | HTMLImageElement => Unit): SnapshotState = {
        val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
        __obj.asInstanceOf[SnapshotState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SnapshotState] (val x: Self) extends AnyVal {
        
        inline def setBufferHeight(value: Double): Self = StObject.set(x, "bufferHeight", value.asInstanceOf[js.Any])
        
        inline def setBufferHeightUndefined: Self = StObject.set(x, "bufferHeight", js.undefined)
        
        inline def setBufferWidth(value: Double): Self = StObject.set(x, "bufferWidth", value.asInstanceOf[js.Any])
        
        inline def setBufferWidthUndefined: Self = StObject.set(x, "bufferWidth", js.undefined)
        
        inline def setCallback(value: /* snapshot */ Color | HTMLImageElement => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        inline def setEncoderOptions(value: Double): Self = StObject.set(x, "encoderOptions", value.asInstanceOf[js.Any])
        
        inline def setEncoderOptionsUndefined: Self = StObject.set(x, "encoderOptions", js.undefined)
        
        inline def setGetPixel(value: Boolean): Self = StObject.set(x, "getPixel", value.asInstanceOf[js.Any])
        
        inline def setGetPixelUndefined: Self = StObject.set(x, "getPixel", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setIsFramebuffer(value: Boolean): Self = StObject.set(x, "isFramebuffer", value.asInstanceOf[js.Any])
        
        inline def setIsFramebufferUndefined: Self = StObject.set(x, "isFramebuffer", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
  }
  
  object WebGL {
    
    trait RenderTargetConfig extends StObject {
      
      /**
        * Controls if this Render Target is automatically cleared (via `gl.COLOR_BUFFER_BIT`) during the bind.
        */
      var autoClear: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The height of the Render Target. This is optional. If not given, it will be set to the same as the `width` value.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * The minFilter mode of the texture. 0 is `LINEAR`, 1 is `NEAREST`.
        */
      var minFilter: js.UndefOr[Double] = js.undefined
      
      /**
        * A value between 0 and 1. Controls the size of this Render Target in relation to the Renderer. A value of 1 matches it. 0.5 makes the Render Target half the size of the renderer, etc.
        */
      var scale: js.UndefOr[Double] = js.undefined
      
      /**
        * The width of the Render Target. This is optional. If given it overrides the `scale` property.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object RenderTargetConfig {
      
      inline def apply(): RenderTargetConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RenderTargetConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RenderTargetConfig] (val x: Self) extends AnyVal {
        
        inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
        
        inline def setAutoClearUndefined: Self = StObject.set(x, "autoClear", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setMinFilter(value: Double): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
        
        inline def setMinFilterUndefined: Self = StObject.set(x, "minFilter", js.undefined)
        
        inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait WebGLConst extends StObject {
      
      /**
        * The data type of the attribute, i.e. `gl.BYTE`, `gl.SHORT`, `gl.UNSIGNED_BYTE`, `gl.FLOAT`, etc.
        */
      var `enum`: GLenum
      
      /**
        * The size, in bytes, of the data type.
        */
      var size: Double
    }
    object WebGLConst {
      
      inline def apply(`enum`: GLenum, size: Double): WebGLConst = {
        val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
        __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebGLConst]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLConst] (val x: Self) extends AnyVal {
        
        inline def setEnum(value: GLenum): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      }
    }
    
    trait WebGLPipelineAttribute extends StObject {
      
      /**
        * You should set this to `false` by default. The pipeline will enable it on boot.
        */
      var enabled: Boolean
      
      /**
        * You should set this to `-1` by default. The pipeline will set it on boot.
        */
      var location: Double
      
      /**
        * The name of the attribute as defined in the vertex shader.
        */
      var name: String
      
      /**
        * Should the attribute data be normalized?
        */
      var normalized: Boolean
      
      /**
        * The offset, in bytes, of this attribute data in the vertex array. Equivalent to `offsetof(vertex, attrib)` in C.
        */
      var offset: Double
      
      /**
        * The number of components in the attribute, i.e. 1 for a float, 2 for a vec2, 3 for a vec3, etc.
        */
      var size: Double
      
      /**
        * The data type of the attribute. Either `gl.BYTE`, `gl.SHORT`, `gl.UNSIGNED_BYTE`, `gl.UNSIGNED_SHORT` or `gl.FLOAT`.
        */
      var `type`: GLenum
    }
    object WebGLPipelineAttribute {
      
      inline def apply(
        enabled: Boolean,
        location: Double,
        name: String,
        normalized: Boolean,
        offset: Double,
        size: Double,
        `type`: GLenum
      ): WebGLPipelineAttribute = {
        val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebGLPipelineAttribute]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLPipelineAttribute] (val x: Self) extends AnyVal {
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setType(value: GLenum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait WebGLPipelineAttributeConfig extends StObject {
      
      /**
        * The name of the attribute as defined in the vertex shader.
        */
      var name: String
      
      /**
        * Should the attribute data be normalized?
        */
      var normalized: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The number of components in the attribute, i.e. 1 for a float, 2 for a vec2, 3 for a vec3, etc.
        */
      var size: Double
      
      /**
        * The data type of the attribute, one of the `WEBGL_CONST` values, i.e. `WEBGL_CONST.FLOAT`, `WEBGL_CONST.UNSIGNED_BYTE`, etc.
        */
      var `type`: WebGLConst
    }
    object WebGLPipelineAttributeConfig {
      
      inline def apply(name: String, size: Double, `type`: WebGLConst): WebGLPipelineAttributeConfig = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebGLPipelineAttributeConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLPipelineAttributeConfig] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
        
        inline def setNormalizedUndefined: Self = StObject.set(x, "normalized", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setType(value: WebGLConst): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait WebGLPipelineBatchEntry extends StObject {
      
      /**
        * The total number of vertices in this batch entry.
        */
      var count: Double
      
      /**
        * The maximum number of texture units in this batch entry.
        */
      var maxUnit: Double
      
      /**
        * The vertext count this batch entry starts from.
        */
      var start: Double
      
      /**
        * An array of WebGLTexture references used in this batch entry.
        */
      var texture: js.Array[WebGLTexture]
      
      /**
        * The current texture unit of the batch entry.
        */
      var unit: Double
    }
    object WebGLPipelineBatchEntry {
      
      inline def apply(count: Double, maxUnit: Double, start: Double, texture: js.Array[WebGLTexture], unit: Double): WebGLPipelineBatchEntry = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], maxUnit = maxUnit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebGLPipelineBatchEntry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLPipelineBatchEntry] (val x: Self) extends AnyVal {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setMaxUnit(value: Double): Self = StObject.set(x, "maxUnit", value.asInstanceOf[js.Any])
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setTexture(value: js.Array[WebGLTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
        
        inline def setTextureVarargs(value: WebGLTexture*): Self = StObject.set(x, "texture", js.Array(value*))
        
        inline def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      }
    }
    
    trait WebGLPipelineConfig extends StObject {
      
      /**
        * An array of shader attribute data. All shaders bound to this pipeline must use the same attributes.
        */
      var attributes: js.UndefOr[js.Array[WebGLPipelineAttributeConfig]] = js.undefined
      
      /**
        * The number of quads to hold in the batch. Defaults to `RenderConfig.batchSize`. This amount * 6 gives the vertex capacity.
        */
      var batchSize: js.UndefOr[Double] = js.undefined
      
      /**
        * Force the shader to use just a single sampler2d? Set for anything that extends the Single Pipeline.
        */
      var forceZero: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The source code, as a string, for the fragment shader. Can include `%count%` and `%forloop%` declarations for multi-texture support. If you need to assign multiple shaders, see the `shaders` property.
        */
      var fragShader: js.UndefOr[String] = js.undefined
      
      /**
        * The Phaser.Game instance that owns this pipeline.
        */
      var game: Game
      
      /**
        * The name of the pipeline.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Create Render Targets for this pipeline. Can be a number, which determines the quantity, a boolean (sets quantity to 1), or an array of Render Target configuration objects.
        */
      var renderTarget: js.UndefOr[Boolean | Double | js.Array[RenderTargetConfig]] = js.undefined
      
      /**
        * An array of shaders, all of which are created for this one pipeline. Uses the `vertShader`, `fragShader`, `attributes` and `uniforms` properties of this object as defaults.
        */
      var shaders: js.UndefOr[js.Array[WebGLPipelineShaderConfig]] = js.undefined
      
      /**
        * How the primitives are rendered. The default value is GL_TRIANGLES. Here is the full list of rendering primitives: (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
        */
      var topology: js.UndefOr[GLenum] = js.undefined
      
      /**
        * The source code, as a string, for the vertex shader. If you need to assign multiple shaders, see the `shaders` property.
        */
      var vertShader: js.UndefOr[String] = js.undefined
      
      /**
        * The size, in bytes, of a single entry in the vertex buffer. Defaults to Float32Array.BYTES_PER_ELEMENT * 6 + Uint8Array.BYTES_PER_ELEMENT * 4.
        */
      var vertexSize: js.UndefOr[Double] = js.undefined
      
      /**
        * An optional Array or Typed Array of pre-calculated vertices data that is copied into the vertex data.
        */
      var vertices: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.undefined
    }
    object WebGLPipelineConfig {
      
      inline def apply(game: Game): WebGLPipelineConfig = {
        val __obj = js.Dynamic.literal(game = game.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebGLPipelineConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLPipelineConfig] (val x: Self) extends AnyVal {
        
        inline def setAttributes(value: js.Array[WebGLPipelineAttributeConfig]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
        
        inline def setAttributesVarargs(value: WebGLPipelineAttributeConfig*): Self = StObject.set(x, "attributes", js.Array(value*))
        
        inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
        
        inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
        
        inline def setForceZero(value: Boolean): Self = StObject.set(x, "forceZero", value.asInstanceOf[js.Any])
        
        inline def setForceZeroUndefined: Self = StObject.set(x, "forceZero", js.undefined)
        
        inline def setFragShader(value: String): Self = StObject.set(x, "fragShader", value.asInstanceOf[js.Any])
        
        inline def setFragShaderUndefined: Self = StObject.set(x, "fragShader", js.undefined)
        
        inline def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRenderTarget(value: Boolean | Double | js.Array[RenderTargetConfig]): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
        
        inline def setRenderTargetUndefined: Self = StObject.set(x, "renderTarget", js.undefined)
        
        inline def setRenderTargetVarargs(value: RenderTargetConfig*): Self = StObject.set(x, "renderTarget", js.Array(value*))
        
        inline def setShaders(value: js.Array[WebGLPipelineShaderConfig]): Self = StObject.set(x, "shaders", value.asInstanceOf[js.Any])
        
        inline def setShadersUndefined: Self = StObject.set(x, "shaders", js.undefined)
        
        inline def setShadersVarargs(value: WebGLPipelineShaderConfig*): Self = StObject.set(x, "shaders", js.Array(value*))
        
        inline def setTopology(value: GLenum): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
        
        inline def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
        
        inline def setVertShader(value: String): Self = StObject.set(x, "vertShader", value.asInstanceOf[js.Any])
        
        inline def setVertShaderUndefined: Self = StObject.set(x, "vertShader", js.undefined)
        
        inline def setVertexSize(value: Double): Self = StObject.set(x, "vertexSize", value.asInstanceOf[js.Any])
        
        inline def setVertexSizeUndefined: Self = StObject.set(x, "vertexSize", js.undefined)
        
        inline def setVertices(value: js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
        
        inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
        
        inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
      }
    }
    
    trait WebGLPipelineShaderConfig extends StObject {
      
      /**
        * An array of shader attribute data. All shaders bound to this pipeline must use the same attributes.
        */
      var attributes: js.UndefOr[js.Array[WebGLPipelineAttributeConfig]] = js.undefined
      
      /**
        * The source code, as a string, for the fragment shader. Can include `%count%` and `%forloop%` declarations for multi-texture support. If not given, uses the `Phaser.Types.Renderer.WebGL.WebGLPipelineConfig.fragShader` property instead.
        */
      var fragShader: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the shader. Doesn't have to be unique, but makes shader look-up easier if it is.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The source code, as a string, for the vertex shader. If not given, uses the `Phaser.Types.Renderer.WebGL.WebGLPipelineConfig.vertShader` property instead.
        */
      var vertShader: js.UndefOr[String] = js.undefined
    }
    object WebGLPipelineShaderConfig {
      
      inline def apply(): WebGLPipelineShaderConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WebGLPipelineShaderConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLPipelineShaderConfig] (val x: Self) extends AnyVal {
        
        inline def setAttributes(value: js.Array[WebGLPipelineAttributeConfig]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
        
        inline def setAttributesVarargs(value: WebGLPipelineAttributeConfig*): Self = StObject.set(x, "attributes", js.Array(value*))
        
        inline def setFragShader(value: String): Self = StObject.set(x, "fragShader", value.asInstanceOf[js.Any])
        
        inline def setFragShaderUndefined: Self = StObject.set(x, "fragShader", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setVertShader(value: String): Self = StObject.set(x, "vertShader", value.asInstanceOf[js.Any])
        
        inline def setVertShaderUndefined: Self = StObject.set(x, "vertShader", js.undefined)
      }
    }
    
    trait WebGLPipelineUniformsConfig extends StObject {
      
      /**
        * The location of the uniform.
        */
      var location: Double
      
      /**
        * The name of the uniform as defined in the shader.
        */
      var name: String
      
      /**
        * The first cached value of the uniform.
        */
      var value1: js.UndefOr[Double] = js.undefined
      
      /**
        * The first cached value of the uniform.
        */
      var value2: js.UndefOr[Double] = js.undefined
      
      /**
        * The first cached value of the uniform.
        */
      var value3: js.UndefOr[Double] = js.undefined
      
      /**
        * The first cached value of the uniform.
        */
      var value4: js.UndefOr[Double] = js.undefined
    }
    object WebGLPipelineUniformsConfig {
      
      inline def apply(location: Double, name: String): WebGLPipelineUniformsConfig = {
        val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebGLPipelineUniformsConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLPipelineUniformsConfig] (val x: Self) extends AnyVal {
        
        inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setValue1(value: Double): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
        
        inline def setValue1Undefined: Self = StObject.set(x, "value1", js.undefined)
        
        inline def setValue2(value: Double): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
        
        inline def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
        
        inline def setValue3(value: Double): Self = StObject.set(x, "value3", value.asInstanceOf[js.Any])
        
        inline def setValue3Undefined: Self = StObject.set(x, "value3", js.undefined)
        
        inline def setValue4(value: Double): Self = StObject.set(x, "value4", value.asInstanceOf[js.Any])
        
        inline def setValue4Undefined: Self = StObject.set(x, "value4", js.undefined)
      }
    }
    
    trait WebGLTextureCompression extends StObject {
      
      /**
        * Indicates if ASTC compression is supported (mostly iOS).
        */
      var ASTC: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if ATC compression is supported.
        */
      var ATC: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if BPTC compression is supported.
        */
      var BPTC: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if ETC compression is supported (mostly Android).
        */
      var ETC: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if ETC1 compression is supported (mostly Android).
        */
      var ETC1: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates the browser supports true color images (all browsers).
        */
      var IMG: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if PVRTC compression is supported (mostly iOS).
        */
      var PVRTC: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if RGTC compression is supported (mostly iOS).
        */
      var RGTC: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if S3TC compression is supported on current device (mostly Windows).
        */
      var S3TC: js.UndefOr[js.Object] = js.undefined
      
      /**
        * Indicates if S3TCRGB compression is supported on current device (mostly Windows).
        */
      var S3TCRGB: js.UndefOr[js.Object] = js.undefined
    }
    object WebGLTextureCompression {
      
      inline def apply(): WebGLTextureCompression = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WebGLTextureCompression]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGLTextureCompression] (val x: Self) extends AnyVal {
        
        inline def setASTC(value: js.Object): Self = StObject.set(x, "ASTC", value.asInstanceOf[js.Any])
        
        inline def setASTCUndefined: Self = StObject.set(x, "ASTC", js.undefined)
        
        inline def setATC(value: js.Object): Self = StObject.set(x, "ATC", value.asInstanceOf[js.Any])
        
        inline def setATCUndefined: Self = StObject.set(x, "ATC", js.undefined)
        
        inline def setBPTC(value: js.Object): Self = StObject.set(x, "BPTC", value.asInstanceOf[js.Any])
        
        inline def setBPTCUndefined: Self = StObject.set(x, "BPTC", js.undefined)
        
        inline def setETC(value: js.Object): Self = StObject.set(x, "ETC", value.asInstanceOf[js.Any])
        
        inline def setETC1(value: js.Object): Self = StObject.set(x, "ETC1", value.asInstanceOf[js.Any])
        
        inline def setETC1Undefined: Self = StObject.set(x, "ETC1", js.undefined)
        
        inline def setETCUndefined: Self = StObject.set(x, "ETC", js.undefined)
        
        inline def setIMG(value: js.Object): Self = StObject.set(x, "IMG", value.asInstanceOf[js.Any])
        
        inline def setIMGUndefined: Self = StObject.set(x, "IMG", js.undefined)
        
        inline def setPVRTC(value: js.Object): Self = StObject.set(x, "PVRTC", value.asInstanceOf[js.Any])
        
        inline def setPVRTCUndefined: Self = StObject.set(x, "PVRTC", js.undefined)
        
        inline def setRGTC(value: js.Object): Self = StObject.set(x, "RGTC", value.asInstanceOf[js.Any])
        
        inline def setRGTCUndefined: Self = StObject.set(x, "RGTC", js.undefined)
        
        inline def setS3TC(value: js.Object): Self = StObject.set(x, "S3TC", value.asInstanceOf[js.Any])
        
        inline def setS3TCRGB(value: js.Object): Self = StObject.set(x, "S3TCRGB", value.asInstanceOf[js.Any])
        
        inline def setS3TCRGBUndefined: Self = StObject.set(x, "S3TCRGB", js.undefined)
        
        inline def setS3TCUndefined: Self = StObject.set(x, "S3TC", js.undefined)
      }
    }
  }
}
