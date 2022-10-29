package typings.pixiParticleContainer

import typings.pixiCore.mod.Buffer
import typings.pixiCore.mod.Geometry
import typings.pixiParticleContainer.libParticleRendererMod.IParticleRendererProperty
import typings.pixiSprite.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParticleBufferMod {
  
  @JSImport("@pixi/particle-container/lib/ParticleBuffer", "ParticleBuffer")
  @js.native
  open class ParticleBuffer protected () extends StObject {
    /**
      * @param {object} properties - The properties to upload.
      * @param {boolean[]} dynamicPropertyFlags - Flags for which properties are dynamic.
      * @param {number} size - The size of the batch.
      */
    def this(
      properties: js.Array[IParticleRendererProperty],
      dynamicPropertyFlags: js.Array[Boolean],
      size: Double
    ) = this()
    
    var _updateID: Double = js.native
    
    /** Destroys the ParticleBuffer. */
    def destroy(): Unit = js.native
    
    var dynamicBuffer: Buffer = js.native
    
    var dynamicData: js.typedarray.Float32Array = js.native
    
    var dynamicDataUint32: js.typedarray.Uint32Array = js.native
    
    /** A list of the properties that are dynamic. */
    /* private */ var dynamicProperties: Any = js.native
    
    var dynamicStride: Double = js.native
    
    var geometry: Geometry = js.native
    
    /** Holds the indices of the geometry (quads) to draw. */
    var indexBuffer: Buffer = js.native
    
    /** Sets up the renderer context and necessary buffers. */
    /* private */ var initBuffers: Any = js.native
    
    /** The number of particles the buffer can hold. */
    /* private */ var size: Any = js.native
    
    var staticBuffer: Buffer = js.native
    
    var staticData: js.typedarray.Float32Array = js.native
    
    var staticDataUint32: js.typedarray.Uint32Array = js.native
    
    /** A list of the properties that are static. */
    /* private */ var staticProperties: Any = js.native
    
    var staticStride: Double = js.native
    
    /**
      * Uploads the dynamic properties.
      * @param children - The children to upload.
      * @param startIndex - The index to start at.
      * @param amount - The number to upload.
      */
    def uploadDynamic(children: js.Array[Sprite], startIndex: Double, amount: Double): Unit = js.native
    
    /**
      * Uploads the static properties.
      * @param children - The children to upload.
      * @param startIndex - The index to start at.
      * @param amount - The number to upload.
      */
    def uploadStatic(children: js.Array[Sprite], startIndex: Double, amount: Double): Unit = js.native
  }
}
