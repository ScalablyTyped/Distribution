package typings.pixiParticleContainer

import typings.pixiConstants.mod.TYPES
import typings.pixiCore.mod.Matrix
import typings.pixiCore.mod.ObjectRenderer
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.State
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiParticleContainer.libParticleContainerMod.ParticleContainer
import typings.pixiSprite.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParticleRendererMod {
  
  @JSImport("@pixi/particle-container/lib/ParticleRenderer", "ParticleRenderer")
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
    
    /** Destroys the ParticleRenderer. */
    @JSName("destroy")
    def destroy_MParticleRenderer(): Unit = js.native
    
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
    @JSImport("@pixi/particle-container/lib/ParticleRenderer", "ParticleRenderer.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParticleRendererProperty] (val x: Self) extends AnyVal {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUploadFunction(value: /* repeated */ Any => Any): Self = StObject.set(x, "uploadFunction", js.Any.fromFunction1(value))
    }
  }
}
