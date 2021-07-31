package typings.playable

import typings.playable.configMod.IPlayerConfig
import typings.playable.createContainerMod.Container
import typings.playable.defaultModulesMod.IPlayer
import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerFactoryMod {
  
  @JSImport("playable/dist/src/core/player-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearAdditionalModules(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAdditionalModules")().asInstanceOf[Unit]
  
  @scala.inline
  def clearPlaybackAdapters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPlaybackAdapters")().asInstanceOf[Unit]
  
  @JSImport("playable/dist/src/core/player-factory", "container")
  @js.native
  val container: Container = js.native
  
  @scala.inline
  def create(): IPlayerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IPlayerInstance]
  @scala.inline
  def create(params: Unit, themeConfig: IThemeConfig): IPlayerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any], themeConfig.asInstanceOf[js.Any])).asInstanceOf[IPlayerInstance]
  @scala.inline
  def create(params: IPlayerConfig): IPlayerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[IPlayerInstance]
  @scala.inline
  def create(params: IPlayerConfig, themeConfig: IThemeConfig): IPlayerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any], themeConfig.asInstanceOf[js.Any])).asInstanceOf[IPlayerInstance]
  
  @scala.inline
  def registerModule(id: String, module: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerModule")(id.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerPlaybackAdapter(adapter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlaybackAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IPlayerInstance
    extends StObject
       with IPlayer {
    
    def destroy(): Unit
  }
  object IPlayerInstance {
    
    @scala.inline
    def apply(destroy: () => Unit): IPlayerInstance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[IPlayerInstance]
    }
    
    @scala.inline
    implicit class IPlayerInstanceMutableBuilder[Self <: IPlayerInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
