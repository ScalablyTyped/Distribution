package typings.pixiCore

import typings.pixiCore.libTexturesResourcesBaseImageResourceMod.BaseImageResource
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesCanvasResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/CanvasResource", "CanvasResource")
  @js.native
  open class CanvasResource protected () extends BaseImageResource {
    /**
      * @param source - Canvas element to use
      */
    def this(source: ICanvas) = this()
  }
  /* static members */
  object CanvasResource {
    
    @JSImport("@pixi/core/lib/textures/resources/CanvasResource", "CanvasResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if source is HTMLCanvasElement or OffscreenCanvas
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
