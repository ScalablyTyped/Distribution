package typings.pixiCore.mod

import typings.pixiConstants.mod.GC_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "TextureGCSystem")
@js.native
open class TextureGCSystem protected ()
  extends StObject
     with ISystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
  
  /**
    * Check count
    * @readonly
    */
  var checkCount: Double = js.native
  
  /**
    * Maximum number of item to check
    * @see PIXI.settings.GC_MAX_CHECK_COUNT
    */
  var checkCountMax: Double = js.native
  
  /**
    * Count
    * @readonly
    */
  var count: Double = js.native
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Maximum idle time, in seconds
    * @see PIXI.settings.GC_MAX_IDLE
    */
  var maxIdle: Double = js.native
  
  /**
    * Current garbage collection mode
    * @see PIXI.settings.GC_MODE
    */
  var mode: GC_MODES = js.native
  
  /**
    * Checks to see when the last time a texture was used
    * if the texture has not been used for a specified amount of time it will be removed from the GPU
    */
  /* protected */ def postrender(): Unit = js.native
  
  /* private */ var renderer: Any = js.native
  
  /**
    * Checks to see when the last time a texture was used
    * if the texture has not been used for a specified amount of time it will be removed from the GPU
    */
  def run(): Unit = js.native
  
  /**
    * Removes all the textures within the specified displayObject and its children from the GPU
    * @param {PIXI.DisplayObject} displayObject - the displayObject to remove the textures from.
    */
  def unload(displayObject: IUnloadableTexture): Unit = js.native
}
