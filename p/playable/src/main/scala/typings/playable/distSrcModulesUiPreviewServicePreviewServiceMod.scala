package typings.playable

import typings.playable.anon.EngineIPlaybackEngine
import typings.playable.distSrcModulesUiPreviewServiceTypesMod.IFramesData
import typings.playable.distSrcModulesUiPreviewServiceTypesMod.INormalizedFramesQuality
import typings.playable.distSrcModulesUiPreviewServiceTypesMod.IPreviewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewServicePreviewServiceMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PreviewService {
    def this(hasEngine: EngineIPlaybackEngine) = this()
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _framesMap: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getAt(second: Double): js.Array[INormalizedFramesQuality] = js.native
    
    /* CompleteClass */
    override def setFramesMap(map: IFramesData): Unit = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/preview-service/preview-service", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait PreviewService
    extends StObject
       with IPreviewService {
    
    /* private */ var _engine: Any
    
    /* private */ var _framesMap: Any
  }
  object PreviewService {
    
    inline def apply(
      _engine: Any,
      _framesMap: Any,
      destroy: () => Unit,
      getAt: Double => js.Array[INormalizedFramesQuality],
      setFramesMap: IFramesData => Unit
    ): PreviewService = {
      val __obj = js.Dynamic.literal(_engine = _engine.asInstanceOf[js.Any], _framesMap = _framesMap.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getAt = js.Any.fromFunction1(getAt), setFramesMap = js.Any.fromFunction1(setFramesMap))
      __obj.asInstanceOf[PreviewService]
    }
    
    extension [Self <: PreviewService](x: Self) {
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_framesMap(value: Any): Self = StObject.set(x, "_framesMap", value.asInstanceOf[js.Any])
    }
  }
}
