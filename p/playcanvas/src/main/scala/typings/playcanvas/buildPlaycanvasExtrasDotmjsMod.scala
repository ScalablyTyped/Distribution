package typings.playcanvas

import typings.playcanvas.anon.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs", "GltfExporter")
  @js.native
  open class GltfExporter ()
    extends typings.playcanvas.buildPlaycanvasExtrasDotmjsExportersGltfExporterMod.GltfExporter
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs", "MiniStats")
  @js.native
  open class MiniStats protected ()
    extends typings.playcanvas.buildPlaycanvasExtrasDotmjsMiniStatsMiniStatsMod.MiniStats {
    def this(app: Any, options: Any) = this()
  }
  /* static members */
  object MiniStats {
    
    @JSImport("playcanvas/build/playcanvas-extras.mjs", "MiniStats")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): Colors = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[Colors]
  }
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs", "UsdzExporter")
  @js.native
  open class UsdzExporter ()
    extends typings.playcanvas.buildPlaycanvasExtrasDotmjsExportersUsdzExporterMod.UsdzExporter
}
