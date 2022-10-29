package typings.pixiCore

import typings.pixiCore.libBatchBatchTextureArrayMod.BatchTextureArray
import typings.pixiCore.libBatchObjectRendererMod.ObjectRenderer
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiCore.libTexturesBaseTextureMod.BaseTexture
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBatchBatchSystemMod {
  
  @JSImport("@pixi/core/lib/batch/BatchSystem", "BatchSystem")
  @js.native
  open class BatchSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * Assigns batch locations to textures in array based on boundTextures state.
      * All textures in texArray should have `_batchEnabled = _batchId`,
      * and their count should be less than `maxTextures`.
      * @param texArray - textures to bound
      * @param boundTextures - current state of bound textures
      * @param batchId - marker for _batchEnabled param of textures in texArray
      * @param maxTextures - number of texture locations to manipulate
      */
    def boundArray(
      texArray: BatchTextureArray,
      boundTextures: js.Array[BaseTexture[Resource, IAutoDetectOptions]],
      batchId: Double,
      maxTextures: Double
    ): Unit = js.native
    
    /**
      * Handy function for batch renderers: copies bound textures in first maxTextures locations to array
      * sets actual _batchLocation for them
      * @param arr - arr copy destination
      * @param maxTextures - number of copied elements
      */
    def copyBoundTextures(arr: js.Array[BaseTexture[Resource, IAutoDetectOptions]], maxTextures: Double): Unit = js.native
    
    /** The currently active ObjectRenderer. */
    var currentRenderer: ObjectRenderer = js.native
    
    /**
      * @ignore
      */
    @JSName("destroy")
    def destroy_MBatchSystem(): Unit = js.native
    
    /** An empty renderer. */
    val emptyRenderer: ObjectRenderer = js.native
    
    /**
      * This should be called if you wish to do some custom rendering
      * It will basically render anything that may be batched up such as sprites
      */
    def flush(): Unit = js.native
    
    /* private */ var renderer: Any = js.native
    
    /** Reset the system to an empty renderer */
    def reset(): Unit = js.native
    
    /**
      * Changes the current renderer to the one given in parameter
      * @param objectRenderer - The object renderer to use.
      */
    def setObjectRenderer(objectRenderer: ObjectRenderer): Unit = js.native
  }
  /* static members */
  object BatchSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/batch/BatchSystem", "BatchSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
