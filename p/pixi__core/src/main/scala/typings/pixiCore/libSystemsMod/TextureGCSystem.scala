package typings.pixiCore.libSystemsMod

import typings.pixiConstants.mod.GC_MODES
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "TextureGCSystem")
@js.native
open class TextureGCSystem protected ()
  extends typings.pixiCore.libTexturesTextureGCSystemMod.TextureGCSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
}
/* static members */
object TextureGCSystem {
  
  @JSImport("@pixi/core/lib/systems", "TextureGCSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default frames between two garbage collections.
    * @static
    * @default 600
    * @see PIXI.TextureGCSystem#checkCountMax
    */
  @JSImport("@pixi/core/lib/systems", "TextureGCSystem.defaultCheckCountMax")
  @js.native
  def defaultCheckCountMax: Double = js.native
  inline def defaultCheckCountMax_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckCountMax")(x.asInstanceOf[js.Any])
  
  /**
    * Default maximum idle frames before a texture is destroyed by garbage collection.
    * @static
    * @default 3600
    * @see PIXI.TextureGCSystem#maxIdle
    */
  @JSImport("@pixi/core/lib/systems", "TextureGCSystem.defaultMaxIdle")
  @js.native
  def defaultMaxIdle: Double = js.native
  inline def defaultMaxIdle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxIdle")(x.asInstanceOf[js.Any])
  
  /**
    * Default garbage collection mode.
    * @static
    * @type {PIXI.GC_MODES}
    * @default PIXI.GC_MODES.AUTO
    * @see PIXI.TextureGCSystem#mode
    */
  @JSImport("@pixi/core/lib/systems", "TextureGCSystem.defaultMode")
  @js.native
  def defaultMode: GC_MODES = js.native
  inline def defaultMode_=(x: GC_MODES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMode")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "TextureGCSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
