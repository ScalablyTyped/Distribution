package typings.pixiExtract

import typings.pixiCore.mod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/extract", "Extract")
  @js.native
  open class Extract protected ()
    extends typings.pixiExtract.libExtractMod.Extract {
    /**
      * @param renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
  }
  /* static members */
  object Extract {
    
    @JSImport("@pixi/extract", "Extract")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/extract", "Extract._flipY")
    @js.native
    def _flipY: Any = js.native
    inline def _flipY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_flipY")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/extract", "Extract._unpremultiplyAlpha")
    @js.native
    def _unpremultiplyAlpha: Any = js.native
    inline def _unpremultiplyAlpha_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_unpremultiplyAlpha")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/extract", "Extract.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
