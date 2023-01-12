package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import typings.playable.distSrcCoreDependencyContainerCreateContainerMod.Container
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCorePlayerFacadeMod {
  
  @JSImport("playable/dist/src/core/player-facade", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Player {
    def this(params: IPlayerConfig, scope: Container) = this()
    def this(params: IPlayerConfig, scope: Container, defaultModulesNames: js.Array[String]) = this()
    def this(
      params: IPlayerConfig,
      scope: Container,
      defaultModulesNames: js.Array[String],
      additionalModuleNames: js.Array[String]
    ) = this()
    def this(
      params: IPlayerConfig,
      scope: Container,
      defaultModulesNames: Unit,
      additionalModuleNames: js.Array[String]
    ) = this()
    def this(
      params: IPlayerConfig,
      scope: Container,
      defaultModulesNames: js.Array[String],
      additionalModuleNames: js.Array[String],
      themeConfig: IThemeConfig
    ) = this()
    def this(
      params: IPlayerConfig,
      scope: Container,
      defaultModulesNames: js.Array[String],
      additionalModuleNames: Unit,
      themeConfig: IThemeConfig
    ) = this()
    def this(
      params: IPlayerConfig,
      scope: Container,
      defaultModulesNames: Unit,
      additionalModuleNames: js.Array[String],
      themeConfig: IThemeConfig
    ) = this()
    def this(
      params: IPlayerConfig,
      scope: Container,
      defaultModulesNames: Unit,
      additionalModuleNames: Unit,
      themeConfig: IThemeConfig
    ) = this()
    
    /* private */ /* CompleteClass */
    var _addPlayerAPIFromModule: Any = js.native
    
    /* protected */ /* CompleteClass */
    var _additionalModules: StringDictionary[Any] = js.native
    
    /* private */ /* CompleteClass */
    var _clearPlayerAPIForModule: Any = js.native
    
    /* protected */ /* CompleteClass */
    var _config: IPlayerConfig = js.native
    
    /* protected */ /* CompleteClass */
    var _defaultModules: StringDictionary[Any] = js.native
    
    /* private */ /* CompleteClass */
    var _destroyed: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getPlayerAPIMethodDescriptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getWrappedCallToModuleFunction: Any = js.native
    
    /* private */ /* CompleteClass */
    var _resolveAdditionalModules: Any = js.native
    
    /* private */ /* CompleteClass */
    var _resolveDefaultModules: Any = js.native
    
    /* protected */ /* CompleteClass */
    var _scope: Container = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  trait Player extends StObject {
    
    /* private */ var _addPlayerAPIFromModule: Any
    
    /* protected */ var _additionalModules: StringDictionary[Any]
    
    /* private */ var _clearPlayerAPIForModule: Any
    
    /* protected */ var _config: IPlayerConfig
    
    /* protected */ var _defaultModules: StringDictionary[Any]
    
    /* private */ var _destroyed: Any
    
    /* private */ var _getPlayerAPIMethodDescriptor: Any
    
    /* private */ var _getWrappedCallToModuleFunction: Any
    
    /* private */ var _resolveAdditionalModules: Any
    
    /* private */ var _resolveDefaultModules: Any
    
    /* protected */ var _scope: Container
    
    def destroy(): Unit
  }
  object Player {
    
    inline def apply(
      _addPlayerAPIFromModule: Any,
      _additionalModules: StringDictionary[Any],
      _clearPlayerAPIForModule: Any,
      _config: IPlayerConfig,
      _defaultModules: StringDictionary[Any],
      _destroyed: Any,
      _getPlayerAPIMethodDescriptor: Any,
      _getWrappedCallToModuleFunction: Any,
      _resolveAdditionalModules: Any,
      _resolveDefaultModules: Any,
      _scope: Container,
      destroy: () => Unit
    ): Player = {
      val __obj = js.Dynamic.literal(_addPlayerAPIFromModule = _addPlayerAPIFromModule.asInstanceOf[js.Any], _additionalModules = _additionalModules.asInstanceOf[js.Any], _clearPlayerAPIForModule = _clearPlayerAPIForModule.asInstanceOf[js.Any], _config = _config.asInstanceOf[js.Any], _defaultModules = _defaultModules.asInstanceOf[js.Any], _destroyed = _destroyed.asInstanceOf[js.Any], _getPlayerAPIMethodDescriptor = _getPlayerAPIMethodDescriptor.asInstanceOf[js.Any], _getWrappedCallToModuleFunction = _getWrappedCallToModuleFunction.asInstanceOf[js.Any], _resolveAdditionalModules = _resolveAdditionalModules.asInstanceOf[js.Any], _resolveDefaultModules = _resolveDefaultModules.asInstanceOf[js.Any], _scope = _scope.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[Player]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def set_addPlayerAPIFromModule(value: Any): Self = StObject.set(x, "_addPlayerAPIFromModule", value.asInstanceOf[js.Any])
      
      inline def set_additionalModules(value: StringDictionary[Any]): Self = StObject.set(x, "_additionalModules", value.asInstanceOf[js.Any])
      
      inline def set_clearPlayerAPIForModule(value: Any): Self = StObject.set(x, "_clearPlayerAPIForModule", value.asInstanceOf[js.Any])
      
      inline def set_config(value: IPlayerConfig): Self = StObject.set(x, "_config", value.asInstanceOf[js.Any])
      
      inline def set_defaultModules(value: StringDictionary[Any]): Self = StObject.set(x, "_defaultModules", value.asInstanceOf[js.Any])
      
      inline def set_destroyed(value: Any): Self = StObject.set(x, "_destroyed", value.asInstanceOf[js.Any])
      
      inline def set_getPlayerAPIMethodDescriptor(value: Any): Self = StObject.set(x, "_getPlayerAPIMethodDescriptor", value.asInstanceOf[js.Any])
      
      inline def set_getWrappedCallToModuleFunction(value: Any): Self = StObject.set(x, "_getWrappedCallToModuleFunction", value.asInstanceOf[js.Any])
      
      inline def set_resolveAdditionalModules(value: Any): Self = StObject.set(x, "_resolveAdditionalModules", value.asInstanceOf[js.Any])
      
      inline def set_resolveDefaultModules(value: Any): Self = StObject.set(x, "_resolveDefaultModules", value.asInstanceOf[js.Any])
      
      inline def set_scope(value: Container): Self = StObject.set(x, "_scope", value.asInstanceOf[js.Any])
    }
  }
}
