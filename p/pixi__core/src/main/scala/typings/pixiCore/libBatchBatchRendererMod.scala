package typings.pixiCore

import org.scalablytyped.runtime.Instantiable1
import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiCore.anon.Fragment
import typings.pixiCore.libBatchBatchDrawCallMod.BatchDrawCall
import typings.pixiCore.libBatchBatchGeometryMod.BatchGeometry
import typings.pixiCore.libBatchBatchShaderGeneratorMod.BatchShaderGenerator
import typings.pixiCore.libBatchBatchTextureArrayMod.BatchTextureArray
import typings.pixiCore.libBatchObjectRendererMod.ObjectRenderer
import typings.pixiCore.libGeometryViewableBufferMod.ViewableBuffer
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libShaderShaderMod.Shader
import typings.pixiCore.libStateStateMod.State
import typings.pixiCore.libTexturesBaseTextureMod.BaseTexture
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.libTexturesTextureMod.Texture
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBatchBatchRendererMod {
  
  @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer")
  @js.native
  open class BatchRenderer protected () extends ObjectRenderer {
    /**
      * This will hook onto the renderer's `contextChange`
      * and `prerender` signals.
      * @param {PIXI.Renderer} renderer - The renderer this works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * @see PIXI.BatchRenderer#maxTextures
      * @deprecated since 7.1.0
      * @readonly
      */
    def MAX_TEXTURES: Double = js.native
    
    /**
      * Pool of `ViewableBuffer` objects that are sorted in
      * order of increasing size. The flush method uses
      * the buffer with the least size above the amount
      * it requires. These are used for passing attributes.
      *
      * The first buffer has a size of 8; each subsequent
      * buffer has double capacity of its previous.
      * @member {PIXI.ViewableBuffer[]}
      * @see PIXI.BatchRenderer#getAttributeBuffer
      */
    /* protected */ var _aBuffers: js.Array[ViewableBuffer] = js.native
    
    /* protected */ var _aIndex: Double = js.native
    
    /* protected */ var _attributeBuffer: ViewableBuffer = js.native
    
    /** Number of elements that are buffered and are waiting to be flushed. */
    /* protected */ var _bufferSize: Double = js.native
    
    /**
      * Buffer of objects that are yet to be rendered.
      * @member {PIXI.DisplayObject[]}
      */
    /* protected */ var _bufferedElements: js.Array[IBatchableElement] = js.native
    
    /**
      * Data for texture batch builder, helps to save a bit of CPU on a pass.
      * @member {PIXI.BaseTexture[]}
      */
    /* protected */ var _bufferedTextures: js.Array[BaseTexture[Resource, IAutoDetectOptions]] = js.native
    
    /* protected */ var _dcIndex: Double = js.native
    
    /**
      * A flush may occur multiple times in a single
      * frame. On iOS devices or when
      * `BatchRenderer.canUploadSameBuffer` is false, the
      * batch renderer does not upload data to the same
      * `WebGLBuffer` for performance reasons.
      *
      * This is the index into `packedGeometries` that points to
      * geometry holding the most recent buffers.
      */
    /* protected */ var _flushId: Double = js.native
    
    /**
      * Pool of `Uint16Array` objects that are sorted in
      * order of increasing size. The flush method uses
      * the buffer with the least size above the amount
      * it requires. These are used for passing indices.
      *
      * The first buffer has a size of 12; each subsequent
      * buffer has double capacity of its previous.
      * @member {Uint16Array[]}
      * @see PIXI.BatchRenderer#getIndexBuffer
      */
    /* protected */ var _iBuffers: js.Array[js.typedarray.Uint16Array] = js.native
    
    /* protected */ var _iIndex: Double = js.native
    
    /* protected */ var _indexBuffer: js.typedarray.Uint16Array = js.native
    
    /** Total count of all indices used by the currently buffered objects. */
    /* protected */ var _indexCount: Double = js.native
    
    /**
      * Pool of `this.geometryClass` geometry objects
      * that store buffers. They are used to pass data
      * to the shader on each draw call.
      *
      * These are never re-allocated again, unless a
      * context change occurs; however, the pool may
      * be expanded if required.
      * @member {PIXI.Geometry[]}
      * @see PIXI.BatchRenderer.contextChange
      */
    /* private */ var _packedGeometries: Any = js.native
    
    /**
      * Size of `this._packedGeometries`. It can be expanded
      * if more than `this._packedGeometryPoolSize` flushes
      * occur in a single frame.
      */
    /* private */ var _packedGeometryPoolSize: Any = js.native
    
    /**
      * This shader is generated by `this.shaderGenerator`.
      *
      * It is generated specifically to handle the required
      * number of textures being batched together.
      */
    /* protected */ var _shader: Shader = js.native
    
    /* protected */ var _tempBoundTextures: js.Array[BaseTexture[Resource, IAutoDetectOptions]] = js.native
    
    /** Total count of all vertices used by the currently buffered objects. */
    /* protected */ var _vertexCount: Double = js.native
    
    /**
      * Bind textures for current rendering
      * @param texArray
      */
    def bindAndClearTexArray(texArray: BatchTextureArray): Unit = js.native
    
    /**
      * Populating drawcalls for rendering
      * @param texArray
      * @param start
      * @param finish
      */
    def buildDrawCalls(texArray: BatchTextureArray, start: Double, finish: Double): Unit = js.native
    
    def buildTexturesAndDrawCalls(): Unit = js.native
    
    /**
      * Handles the `contextChange` signal.
      *
      * It calculates `this.maxTextures` and allocating the packed-geometry object pool.
      */
    def contextChange(): Unit = js.native
    
    /** Destroys this `BatchRenderer`. It cannot be used again. */
    @JSName("destroy")
    def destroy_MBatchRenderer(): Unit = js.native
    
    def drawBatches(): Unit = js.native
    
    /**
      * The class that represents the geometry of objects
      * that are going to be batched with this.
      * @member {object}
      * @default PIXI.BatchGeometry
      */
    /* protected */ var geometryClass: Instantiable1[/* _static */ js.UndefOr[Boolean], BatchGeometry] = js.native
    
    /**
      * Fetches an attribute buffer from `this._aBuffers` that can hold atleast `size` floats.
      * @param size - minimum capacity required
      * @returns - buffer than can hold atleast `size` floats
      */
    def getAttributeBuffer(size: Double): ViewableBuffer = js.native
    
    /**
      * Fetches an index buffer from `this._iBuffers` that can
      * have at least `size` capacity.
      * @param size - minimum required capacity
      * @returns - buffer that can fit `size` indices.
      */
    def getIndexBuffer(size: Double): js.typedarray.Uint16Array = js.native
    
    /** Makes sure that static and dynamic flush pooled objects have correct dimensions. */
    def initFlushBuffers(): Unit = js.native
    
    /**
      * Maximum number of textures that can be uploaded to
      * the GPU under the current context. It is initialized
      * properly in `this.contextChange`.
      * @see PIXI.BatchRenderer#contextChange
      * @readonly
      */
    var maxTextures: Double = js.native
    
    /** Handles the `prerender` signal. It ensures that flushes start from the first geometry object again. */
    def onPrerender(): Unit = js.native
    
    /**
      * Takes the four batching parameters of `element`, interleaves
      * and pushes them into the batching attribute/index buffers given.
      *
      * It uses these properties: `vertexData` `uvs`, `textureId` and
      * `indicies`. It also uses the "tint" of the base-texture, if
      * present.
      * @param {PIXI.DisplayObject} element - element being rendered
      * @param attributeBuffer - attribute buffer.
      * @param indexBuffer - index buffer
      * @param aIndex - number of floats already in the attribute buffer
      * @param iIndex - number of indices already in `indexBuffer`
      */
    def packInterleavedGeometry(
      element: IBatchableElement,
      attributeBuffer: ViewableBuffer,
      indexBuffer: js.typedarray.Uint16Array,
      aIndex: Double,
      iIndex: Double
    ): Unit = js.native
    
    /**
      * Buffers the "batchable" object. It need not be rendered immediately.
      * @param {PIXI.DisplayObject} element - the element to render when
      *    using this renderer
      */
    def render(element: IBatchableElement): Unit = js.native
    
    /**
      * Set the shader generator.
      * @param {object} [options]
      * @param {string} [options.vertex=PIXI.BatchRenderer.defaultVertexSrc] - Vertex shader source
      * @param {string} [options.fragment=PIXI.BatchRenderer.defaultFragmentTemplate] - Fragment shader template
      */
    def setShaderGenerator(): Unit = js.native
    def setShaderGenerator(param0: Fragment): Unit = js.native
    
    /**
      * This is used to generate a shader that can
      * color each vertex based on a `aTextureId`
      * attribute that points to an texture in `uSampler`.
      *
      * This enables the objects with different textures
      * to be drawn in the same draw call.
      *
      * You can customize your shader by creating your
      * custom shader generator.
      */
    /* protected */ var shaderGenerator: BatchShaderGenerator = js.native
    
    /**
      * The number of bufferable objects before a flush
      * occurs automatically.
      * @default PIXI.BatchRenderer.defaultBatchSize * 4
      */
    var size: Double = js.native
    
    /** The WebGL state in which this renderer will work. */
    val state: State = js.native
    
    def updateGeometry(): Unit = js.native
    
    /**
      * Size of data being buffered per vertex in the
      * attribute buffers (in floats). By default, the
      * batch-renderer plugin uses 6:
      *
      * | aVertexPosition | 2 |
      * |-----------------|---|
      * | aTextureCoords  | 2 |
      * | aColor          | 1 |
      * | aTextureId      | 1 |
      * @default 6
      */
    /* protected */ var vertexSize: Double = js.native
  }
  /* static members */
  object BatchRenderer {
    
    @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @ignore */
    @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer._canUploadSameBuffer")
    @js.native
    def _canUploadSameBuffer: Any = js.native
    inline def _canUploadSameBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_canUploadSameBuffer")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer._defaultMaxTextures")
    @js.native
    def _defaultMaxTextures: Any = js.native
    inline def _defaultMaxTextures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultMaxTextures")(x.asInstanceOf[js.Any])
    
    /**
      * Pool of `BatchDrawCall` objects that `flush` used
      * to create "batches" of the objects being rendered.
      *
      * These are never re-allocated again.
      * Shared between all batch renderers because it can be only one "flush" working at the moment.
      * @member {PIXI.BatchDrawCall[]}
      */
    @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer._drawCallPool")
    @js.native
    def _drawCallPool: js.Array[BatchDrawCall] = js.native
    inline def _drawCallPool_=(x: js.Array[BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_drawCallPool")(x.asInstanceOf[js.Any])
    
    /**
      * Pool of `BatchDrawCall` objects that `flush` used
      * to create "batches" of the objects being rendered.
      *
      * These are never re-allocated again.
      * Shared between all batch renderers because it can be only one "flush" working at the moment.
      * @member {PIXI.BatchTextureArray[]}
      */
    @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer._textureArrayPool")
    @js.native
    def _textureArrayPool: js.Array[BatchTextureArray] = js.native
    inline def _textureArrayPool_=(x: js.Array[BatchTextureArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureArrayPool")(x.asInstanceOf[js.Any])
    
    /**
      * The default sprite batch size.
      *
      * The default aims to balance desktop and mobile devices.
      * @static
      */
    @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer.defaultBatchSize")
    @js.native
    def defaultBatchSize: Double = js.native
    inline def defaultBatchSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultBatchSize")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/core/lib/batch/BatchRenderer", "BatchRenderer.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait IBatchableElement extends StObject {
    
    var _texture: Texture[Resource]
    
    var _tintRGB: Double
    
    var blendMode: BLEND_MODES
    
    var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.Array[Double]
    
    var uvs: js.typedarray.Float32Array
    
    var vertexData: js.typedarray.Float32Array
    
    var worldAlpha: Double
  }
  object IBatchableElement {
    
    inline def apply(
      _texture: Texture[Resource],
      _tintRGB: Double,
      blendMode: BLEND_MODES,
      indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.Array[Double],
      uvs: js.typedarray.Float32Array,
      vertexData: js.typedarray.Float32Array,
      worldAlpha: Double
    ): IBatchableElement = {
      val __obj = js.Dynamic.literal(_texture = _texture.asInstanceOf[js.Any], _tintRGB = _tintRGB.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], worldAlpha = worldAlpha.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBatchableElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBatchableElement] (val x: Self) extends AnyVal {
      
      inline def setBlendMode(value: BLEND_MODES): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setUvs(value: js.typedarray.Float32Array): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
      
      inline def setVertexData(value: js.typedarray.Float32Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
      
      inline def setWorldAlpha(value: Double): Self = StObject.set(x, "worldAlpha", value.asInstanceOf[js.Any])
      
      inline def set_texture(value: Texture[Resource]): Self = StObject.set(x, "_texture", value.asInstanceOf[js.Any])
      
      inline def set_tintRGB(value: Double): Self = StObject.set(x, "_tintRGB", value.asInstanceOf[js.Any])
    }
  }
}
