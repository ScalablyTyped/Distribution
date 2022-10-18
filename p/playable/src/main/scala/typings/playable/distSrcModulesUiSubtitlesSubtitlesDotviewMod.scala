package typings.playable

import typings.playable.distSrcModulesUiSubtitlesTypesMod.ISubtitlesViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiSubtitlesSubtitlesDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/subtitles/subtitles.view", JSImport.Default)
  @js.native
  open class default () extends SubtitlesView
  
  @js.native
  trait SubtitlesView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[ISubtitlesViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$subtitles")
    var _$subtitles: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    def clearSubtitles(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def moveSubtitlesDown(): Unit = js.native
    
    def moveSubtitlesUp(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showSubtitles(subtitles: js.Array[String]): Unit = js.native
  }
}
