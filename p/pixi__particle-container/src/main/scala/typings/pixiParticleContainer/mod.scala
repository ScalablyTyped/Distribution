package typings.pixiParticleContainer

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiConstants.mod.TYPES
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.Buffer
import typings.pixiCore.mod.Geometry
import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.ObjectRenderer
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.State
import typings.pixiDisplay.mod.Container
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Matrix
import typings.pixiSprite.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/particle-container", "ParticleContainer")
  @js.native
  /**
    * @param maxSize - The maximum number of particles that can be rendered by the container.
    *  Affects size of allocated buffers.
    * @param properties - The properties of children that should be uploaded to the gpu and applied.
    * @param {boolean} [properties.vertices=false] - When true, vertices be uploaded and applied.
    *                  if sprite's ` scale/anchor/trim/frame/orig` is dynamic, please set `true`.
    * @param {boolean} [properties.position=true] - When true, position be uploaded and applied.
    * @param {boolean} [properties.rotation=false] - When true, rotation be uploaded and applied.
    * @param {boolean} [properties.uvs=false] - When true, uvs be uploaded and applied.
    * @param {boolean} [properties.tint=false] - When true, alpha and tint be uploaded and applied.
    * @param {number} [batchSize=16384] - Number of particles per batch. If less than maxSize, it uses maxSize instead.
    * @param {boolean} [autoResize=false] - If true, container allocates more batches in case
    *  there are more than `maxSize` particles.
    */
  open class ParticleContainer () extends Container[Sprite] {
    def this(maxSize: Double) = this()
    def this(maxSize: Double, properties: IParticleProperties) = this()
    def this(maxSize: Unit, properties: IParticleProperties) = this()
    def this(maxSize: Double, properties: Unit, batchSize: Double) = this()
    def this(maxSize: Double, properties: IParticleProperties, batchSize: Double) = this()
    def this(maxSize: Unit, properties: Unit, batchSize: Double) = this()
    def this(maxSize: Unit, properties: IParticleProperties, batchSize: Double) = this()
    def this(maxSize: Double, properties: Unit, batchSize: Double, autoResize: Boolean) = this()
    def this(maxSize: Double, properties: Unit, batchSize: Unit, autoResize: Boolean) = this()
    def this(maxSize: Double, properties: IParticleProperties, batchSize: Double, autoResize: Boolean) = this()
    def this(maxSize: Double, properties: IParticleProperties, batchSize: Unit, autoResize: Boolean) = this()
    def this(maxSize: Unit, properties: Unit, batchSize: Double, autoResize: Boolean) = this()
    def this(maxSize: Unit, properties: Unit, batchSize: Unit, autoResize: Boolean) = this()
    def this(maxSize: Unit, properties: IParticleProperties, batchSize: Double, autoResize: Boolean) = this()
    def this(maxSize: Unit, properties: IParticleProperties, batchSize: Unit, autoResize: Boolean) = this()
    
    /** @private */
    var _batchSize: Double = js.native
    
    /**
      * For every batch, stores _updateID corresponding to the last change in that batch.
      * @private
      */
    var _bufferUpdateIDs: js.Array[Double] = js.native
    
    /** @private */
    var _buffers: js.Array[ParticleBuffer] = js.native
    
    /** @private */
    var _maxSize: Double = js.native
    
    /**
      * Set properties to be dynamic (true) / static (false).
      * @private
      */
    var _properties: js.Array[Boolean] = js.native
    
    /**
      * The tint applied to the container.
      * This is a hex value. A value of 0xFFFFFF will remove any tint effect.
      * @default 0xFFFFFF
      */
    /* private */ var _tint: Any = js.native
    
    /**
      * When child inserted, removed or changes position this number goes up.
      * @private
      */
    var _updateID: Double = js.native
    
    /**
      * If true, container allocates more batches in case there are more than `maxSize` particles.
      * @default false
      */
    var autoResize: Boolean = js.native
    
    /**
      * The texture used to render the children.
      * @readonly
      */
    var baseTexture: BaseTexture[Resource, IAutoDetectOptions] = js.native
    
    /**
      * The blend mode to be applied to the sprite. Apply a value of `PIXI.BLEND_MODES.NORMAL`
      * to reset the blend mode.
      * @default PIXI.BLEND_MODES.NORMAL
      */
    var blendMode: BLEND_MODES = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
      * Advantages can include sharper image quality (like text) and faster rendering on canvas.
      * The main disadvantage is movement of objects may appear less smooth.
      * Default to true here as performance is usually the priority for particles.
      * @default true
      */
    var roundPixels: Boolean = js.native
    
    /**
      * Sets the private properties array to dynamic / static based on the passed properties object
      * @param properties - The properties to be uploaded
      */
    def setProperties(properties: IParticleProperties): Unit = js.native
    
    /**
      * The tint applied to the container. This is a hex value.
      * A value of 0xFFFFFF will remove any tint effect.
      * IMPORTANT: This is a WebGL only feature and will be ignored by the canvas renderer.
      * @default 0xFFFFFF
      */
    def tint: Double = js.native
    
    var tintRgb: js.typedarray.Float32Array = js.native
    
    def tint_=(value: Double): Unit = js.native
  }
  
  @JSImport("@pixi/particle-container", "ParticleRenderer")
  @js.native
  open class ParticleRenderer protected () extends ObjectRenderer {
    /**
      * @param renderer - The renderer this sprite batch works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * Creates one more particle buffer, because container has autoResize feature.
      * @param container - The container to render using this ParticleRenderer
      * @returns - The generated buffer
      */
    /* private */ var _generateOneMoreBuffer: Any = js.native
    
    /**
      * Creates one particle buffer for each child in the container we want to render and updates internal properties.
      * @param container - The container to render using this ParticleRenderer
      * @returns - The buffers
      */
    /* private */ var generateBuffers: Any = js.native
    
    var properties: js.Array[IParticleRendererProperty] = js.native
    
    /**
      * Renders the particle container object.
      * @param container - The container to render using this ParticleRenderer.
      */
    def render(container: ParticleContainer): Unit = js.native
    
    /** The default shader that is used if a sprite doesn't have a more specific one. */
    var shader: Shader = js.native
    
    /** The WebGL state in which this renderer will work. */
    val state: State = js.native
    
    var tempMatrix: Matrix = js.native
    
    /**
      * Uploads the position.
      * @param children - the array of sprites to render
      * @param startIndex - the index to start from in the children array
      * @param amount - the amount of children that will have their positions uploaded
      * @param array - The vertices to upload.
      * @param stride - Stride to use for iteration.
      * @param offset - Offset to start at.
      */
    def uploadPosition(
      children: js.Array[Sprite],
      startIndex: Double,
      amount: Double,
      array: js.Array[Double],
      stride: Double,
      offset: Double
    ): Unit = js.native
    
    /**
      * Uploads the rotation.
      * @param children - the array of sprites to render
      * @param startIndex - the index to start from in the children array
      * @param amount - the amount of children that will have their rotation uploaded
      * @param array - The vertices to upload.
      * @param stride - Stride to use for iteration.
      * @param offset - Offset to start at.
      */
    def uploadRotation(
      children: js.Array[Sprite],
      startIndex: Double,
      amount: Double,
      array: js.Array[Double],
      stride: Double,
      offset: Double
    ): Unit = js.native
    
    /**
      * Uploads the tint.
      * @param children - the array of sprites to render
      * @param startIndex - the index to start from in the children array
      * @param amount - the amount of children that will have their rotation uploaded
      * @param array - The vertices to upload.
      * @param stride - Stride to use for iteration.
      * @param offset - Offset to start at.
      */
    def uploadTint(
      children: js.Array[Sprite],
      startIndex: Double,
      amount: Double,
      array: js.Array[Double],
      stride: Double,
      offset: Double
    ): Unit = js.native
    
    /**
      * Uploads the UVs.
      * @param children - the array of sprites to render
      * @param startIndex - the index to start from in the children array
      * @param amount - the amount of children that will have their rotation uploaded
      * @param array - The vertices to upload.
      * @param stride - Stride to use for iteration.
      * @param offset - Offset to start at.
      */
    def uploadUvs(
      children: js.Array[Sprite],
      startIndex: Double,
      amount: Double,
      array: js.Array[Double],
      stride: Double,
      offset: Double
    ): Unit = js.native
    
    /**
      * Uploads the vertices.
      * @param children - the array of sprites to render
      * @param startIndex - the index to start from in the children array
      * @param amount - the amount of children that will have their vertices uploaded
      * @param array - The vertices to upload.
      * @param stride - Stride to use for iteration.
      * @param offset - Offset to start at.
      */
    def uploadVertices(
      children: js.Array[Sprite],
      startIndex: Double,
      amount: Double,
      array: js.Array[Double],
      stride: Double,
      offset: Double
    ): Unit = js.native
  }
  /* static members */
  object ParticleRenderer {
    
    /** @ignore */
    @JSImport("@pixi/particle-container", "ParticleRenderer.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait IParticleProperties extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[Boolean] = js.undefined
    
    var tint: js.UndefOr[Boolean] = js.undefined
    
    var uvs: js.UndefOr[Boolean] = js.undefined
    
    var vertices: js.UndefOr[Boolean] = js.undefined
  }
  object IParticleProperties {
    
    inline def apply(): IParticleProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParticleProperties]
    }
    
    extension [Self <: IParticleProperties](x: Self) {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRotation(value: Boolean): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTint(value: Boolean): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
      
      inline def setUvs(value: Boolean): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
      
      inline def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
      
      inline def setVertices(value: Boolean): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    }
  }
  
  trait IParticleRendererProperty extends StObject {
    
    var attributeName: String
    
    var offset: Double
    
    var size: Double
    
    var `type`: js.UndefOr[TYPES] = js.undefined
    
    def uploadFunction(params: Any*): Any
  }
  object IParticleRendererProperty {
    
    inline def apply(attributeName: String, offset: Double, size: Double, uploadFunction: /* repeated */ Any => Any): IParticleRendererProperty = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadFunction = js.Any.fromFunction1(uploadFunction))
      __obj.asInstanceOf[IParticleRendererProperty]
    }
    
    extension [Self <: IParticleRendererProperty](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUploadFunction(value: /* repeated */ Any => Any): Self = StObject.set(x, "uploadFunction", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The particle buffer manages the static and dynamic buffers for a particle container.
    * @private
    * @memberof PIXI
    */
  trait ParticleBuffer extends StObject {
    
    var _updateID: Double
    
    /** Destroys the ParticleBuffer. */
    def destroy(): Unit
    
    var dynamicBuffer: Buffer
    
    var dynamicData: js.typedarray.Float32Array
    
    var dynamicDataUint32: js.typedarray.Uint32Array
    
    /** A list of the properties that are dynamic. */
    /* private */ var dynamicProperties: Any
    
    var dynamicStride: Double
    
    var geometry: Geometry
    
    /** Holds the indices of the geometry (quads) to draw. */
    var indexBuffer: Buffer
    
    /** Sets up the renderer context and necessary buffers. */
    /* private */ var initBuffers: Any
    
    /** The number of particles the buffer can hold. */
    /* private */ var size: Any
    
    var staticBuffer: Buffer
    
    var staticData: js.typedarray.Float32Array
    
    var staticDataUint32: js.typedarray.Uint32Array
    
    /** A list of the properties that are static. */
    /* private */ var staticProperties: Any
    
    var staticStride: Double
    
    /**
      * Uploads the dynamic properties.
      * @param children - The children to upload.
      * @param startIndex - The index to start at.
      * @param amount - The number to upload.
      */
    def uploadDynamic(children: js.Array[Sprite], startIndex: Double, amount: Double): Unit
    
    /**
      * Uploads the static properties.
      * @param children - The children to upload.
      * @param startIndex - The index to start at.
      * @param amount - The number to upload.
      */
    def uploadStatic(children: js.Array[Sprite], startIndex: Double, amount: Double): Unit
  }
  object ParticleBuffer {
    
    inline def apply(
      _updateID: Double,
      destroy: () => Unit,
      dynamicBuffer: Buffer,
      dynamicData: js.typedarray.Float32Array,
      dynamicDataUint32: js.typedarray.Uint32Array,
      dynamicProperties: Any,
      dynamicStride: Double,
      geometry: Geometry,
      indexBuffer: Buffer,
      initBuffers: Any,
      size: Any,
      staticBuffer: Buffer,
      staticData: js.typedarray.Float32Array,
      staticDataUint32: js.typedarray.Uint32Array,
      staticProperties: Any,
      staticStride: Double,
      uploadDynamic: (js.Array[Sprite], Double, Double) => Unit,
      uploadStatic: (js.Array[Sprite], Double, Double) => Unit
    ): ParticleBuffer = {
      val __obj = js.Dynamic.literal(_updateID = _updateID.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), dynamicBuffer = dynamicBuffer.asInstanceOf[js.Any], dynamicData = dynamicData.asInstanceOf[js.Any], dynamicDataUint32 = dynamicDataUint32.asInstanceOf[js.Any], dynamicProperties = dynamicProperties.asInstanceOf[js.Any], dynamicStride = dynamicStride.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], indexBuffer = indexBuffer.asInstanceOf[js.Any], initBuffers = initBuffers.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], staticBuffer = staticBuffer.asInstanceOf[js.Any], staticData = staticData.asInstanceOf[js.Any], staticDataUint32 = staticDataUint32.asInstanceOf[js.Any], staticProperties = staticProperties.asInstanceOf[js.Any], staticStride = staticStride.asInstanceOf[js.Any], uploadDynamic = js.Any.fromFunction3(uploadDynamic), uploadStatic = js.Any.fromFunction3(uploadStatic))
      __obj.asInstanceOf[ParticleBuffer]
    }
    
    extension [Self <: ParticleBuffer](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDynamicBuffer(value: Buffer): Self = StObject.set(x, "dynamicBuffer", value.asInstanceOf[js.Any])
      
      inline def setDynamicData(value: js.typedarray.Float32Array): Self = StObject.set(x, "dynamicData", value.asInstanceOf[js.Any])
      
      inline def setDynamicDataUint32(value: js.typedarray.Uint32Array): Self = StObject.set(x, "dynamicDataUint32", value.asInstanceOf[js.Any])
      
      inline def setDynamicProperties(value: Any): Self = StObject.set(x, "dynamicProperties", value.asInstanceOf[js.Any])
      
      inline def setDynamicStride(value: Double): Self = StObject.set(x, "dynamicStride", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setIndexBuffer(value: Buffer): Self = StObject.set(x, "indexBuffer", value.asInstanceOf[js.Any])
      
      inline def setInitBuffers(value: Any): Self = StObject.set(x, "initBuffers", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStaticBuffer(value: Buffer): Self = StObject.set(x, "staticBuffer", value.asInstanceOf[js.Any])
      
      inline def setStaticData(value: js.typedarray.Float32Array): Self = StObject.set(x, "staticData", value.asInstanceOf[js.Any])
      
      inline def setStaticDataUint32(value: js.typedarray.Uint32Array): Self = StObject.set(x, "staticDataUint32", value.asInstanceOf[js.Any])
      
      inline def setStaticProperties(value: Any): Self = StObject.set(x, "staticProperties", value.asInstanceOf[js.Any])
      
      inline def setStaticStride(value: Double): Self = StObject.set(x, "staticStride", value.asInstanceOf[js.Any])
      
      inline def setUploadDynamic(value: (js.Array[Sprite], Double, Double) => Unit): Self = StObject.set(x, "uploadDynamic", js.Any.fromFunction3(value))
      
      inline def setUploadStatic(value: (js.Array[Sprite], Double, Double) => Unit): Self = StObject.set(x, "uploadStatic", js.Any.fromFunction3(value))
      
      inline def set_updateID(value: Double): Self = StObject.set(x, "_updateID", value.asInstanceOf[js.Any])
    }
  }
}
