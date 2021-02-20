package typings.playable

import typings.playable.anon.EngineIPlaybackEngine
import typings.playable.previewServiceTypesMod.IFramesData
import typings.playable.previewServiceTypesMod.INormalizedFramesQuality
import typings.playable.previewServiceTypesMod.IPreviewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewServiceMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", JSImport.Default)
  @js.native
  class default protected () extends PreviewService {
    def this(hasEngine: EngineIPlaybackEngine) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PreviewService extends IPreviewService {
    
    var _engine: js.Any = js.native
    
    var _framesMap: js.Any = js.native
  }
  object PreviewService {
    
    @scala.inline
    def apply(
      _engine: js.Any,
      _framesMap: js.Any,
      destroy: () => Unit,
      getAt: Double => js.Array[INormalizedFramesQuality],
      setFramesMap: IFramesData => Unit
    ): PreviewService = {
      val __obj = js.Dynamic.literal(_engine = _engine.asInstanceOf[js.Any], _framesMap = _framesMap.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getAt = js.Any.fromFunction1(getAt), setFramesMap = js.Any.fromFunction1(setFramesMap))
      __obj.asInstanceOf[PreviewService]
    }
    
    @scala.inline
    implicit class PreviewServiceMutableBuilder[Self <: PreviewService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_framesMap(value: js.Any): Self = StObject.set(x, "_framesMap", value.asInstanceOf[js.Any])
    }
  }
}
