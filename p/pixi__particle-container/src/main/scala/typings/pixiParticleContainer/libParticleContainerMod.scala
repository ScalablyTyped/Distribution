package typings.pixiParticleContainer

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiDisplay.mod.Container
import typings.pixiParticleContainer.libParticleBufferMod.ParticleBuffer
import typings.pixiSprite.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParticleContainerMod {
  
  @JSImport("@pixi/particle-container/lib/ParticleContainer", "ParticleContainer")
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParticleProperties] (val x: Self) extends AnyVal {
      
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
}
