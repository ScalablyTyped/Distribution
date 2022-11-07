package typings.pixiPrepare

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.mod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/prepare", "BasePrepare")
  @js.native
  open class BasePrepare protected ()
    extends typings.pixiPrepare.libBasePrepareMod.BasePrepare {
    /**
      * @param {PIXI.IRenderer} renderer - A reference to the current renderer
      */
    def this(renderer: IRenderer[ICanvas]) = this()
  }
  
  @JSImport("@pixi/prepare", "CountLimiter")
  @js.native
  open class CountLimiter protected ()
    extends typings.pixiPrepare.libCountLimiterMod.CountLimiter {
    /**
      * @param maxItemsPerFrame - The maximum number of items that can be prepared each frame.
      */
    def this(maxItemsPerFrame: Double) = this()
  }
  
  @JSImport("@pixi/prepare", "Prepare")
  @js.native
  open class Prepare protected ()
    extends typings.pixiPrepare.libPrepareMod.Prepare {
    /**
      * @param {PIXI.Renderer} renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
  }
  /* static members */
  object Prepare {
    
    /** @ignore */
    @JSImport("@pixi/prepare", "Prepare.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  @JSImport("@pixi/prepare", "TimeLimiter")
  @js.native
  open class TimeLimiter protected ()
    extends typings.pixiPrepare.libTimeLimiterMod.TimeLimiter {
    /** @param maxMilliseconds - The maximum milliseconds that can be spent preparing items each frame. */
    def this(maxMilliseconds: Double) = this()
  }
}
