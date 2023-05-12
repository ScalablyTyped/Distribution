package typings.playcanvas

import typings.playcanvas.anon.Colors
import typings.playcanvas.anon.Texture
import typings.playcanvas.buildPlaycanvasExtrasDotmjsMiniStatsGraphMod.Graph
import typings.playcanvas.buildPlaycanvasExtrasDotmjsMiniStatsRender2dMod.Render2d
import typings.playcanvas.buildPlaycanvasExtrasDotmjsMiniStatsWordAtlasMod.WordAtlas
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsMiniStatsMiniStatsMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/mini-stats/mini-stats", "MiniStats")
  @js.native
  open class MiniStats protected () extends StObject {
    def this(app: Any, options: Any) = this()
    
    var _activeSizeIndex: Any = js.native
    
    def _contextLostHandler(event: Any): Unit = js.native
    
    var _enabled: Boolean = js.native
    
    def activeSizeIndex: Any = js.native
    def activeSizeIndex_=(arg: Any): Unit = js.native
    
    var clr: js.Array[Double] = js.native
    
    var device: Any = js.native
    
    var div: HTMLDivElement = js.native
    
    def enabled: Boolean = js.native
    def enabled_=(arg: Boolean): Unit = js.native
    
    var graphs: js.Array[Graph] = js.native
    
    var gspacing: Double = js.native
    
    var height: Double = js.native
    
    def initGraphs(app: Any, device: Any, options: Any): js.Array[Graph] = js.native
    
    def initWordAtlas(device: Any, words: Any, maxWidth: Any, numGraphs: Any): Texture = js.native
    
    def opacity: Double = js.native
    def opacity_=(arg: Double): Unit = js.native
    
    def overallHeight: Double = js.native
    
    def render(): Unit = js.native
    
    var render2d: Render2d = js.native
    
    def resize(width: Any, height: Any, showGraphs: Any): Unit = js.native
    
    var sizes: Any = js.native
    
    var texture: Any = js.native
    
    def updateDiv(): Unit = js.native
    
    var width: Double = js.native
    
    var wordAtlas: WordAtlas = js.native
  }
  /* static members */
  object MiniStats {
    
    @JSImport("playcanvas/build/playcanvas-extras.mjs/mini-stats/mini-stats", "MiniStats")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): Colors = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[Colors]
  }
}
