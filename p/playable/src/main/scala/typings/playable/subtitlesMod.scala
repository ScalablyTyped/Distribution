package typings.playable

import typings.playable.anon.EventEmitterRootContainer
import typings.playable.subtitlesTypesMod.ISubtitles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtitlesMod {
  
  @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Subtitles {
    def this(hasRootContainerEngineEventEmitter: EventEmitterRootContainer) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof SubtitlesView` */
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", "default.View")
    @js.native
    open class View ()
      extends typings.playable.subtitlesViewMod.default
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Subtitles
    extends StObject
       with ISubtitles {
    
    /* private */ var _activeSubtitleIndex: Any = js.native
    
    /* private */ var _addSubtitle: Any = js.native
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _clearActiveSubtitle: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _setActiveSubtitle: Any = js.native
    
    /* private */ var _showSubtitles: Any = js.native
    
    /* private */ var _trackList: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /* private */ var _video: Any = js.native
    
    def getElement(): HTMLElement = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.subtitlesViewMod.default = js.native
  }
  object Subtitles {
    
    /* was `typeof SubtitlesView` */
    type View = typings.playable.subtitlesViewMod.default
  }
}
