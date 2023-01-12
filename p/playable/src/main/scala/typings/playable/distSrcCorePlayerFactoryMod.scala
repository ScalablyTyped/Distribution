package typings.playable

import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import typings.playable.distSrcCoreDefaultModulesMod.IPlayer
import typings.playable.distSrcCoreDependencyContainerCreateContainerMod.Container
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCorePlayerFactoryMod {
  
  @JSImport("playable/dist/src/core/player-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearAdditionalModules(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAdditionalModules")().asInstanceOf[Unit]
  
  inline def clearPlaybackAdapters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPlaybackAdapters")().asInstanceOf[Unit]
  
  @JSImport("playable/dist/src/core/player-factory", "container")
  @js.native
  val container: Container = js.native
  
  inline def create(): IPlayerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IPlayerInstance]
  inline def create(params: Unit, themeConfig: IThemeConfig): IPlayerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any], themeConfig.asInstanceOf[js.Any])).asInstanceOf[IPlayerInstance]
  inline def create(params: IPlayerConfig): IPlayerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[IPlayerInstance]
  inline def create(params: IPlayerConfig, themeConfig: IThemeConfig): IPlayerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any], themeConfig.asInstanceOf[js.Any])).asInstanceOf[IPlayerInstance]
  
  inline def registerModule(id: String, module: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerModule")(id.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerPlaybackAdapter(adapter: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlaybackAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IPlayerInstance
    extends StObject
       with IPlayer {
    
    def destroy(): Unit
  }
  object IPlayerInstance {
    
    inline def apply(destroy: () => Unit): IPlayerInstance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[IPlayerInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlayerInstance] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
