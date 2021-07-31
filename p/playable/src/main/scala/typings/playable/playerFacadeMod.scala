package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.playable.configMod.IPlayerConfig
import typings.playable.createContainerMod.Container
import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerFacadeMod {
  
  @JSImport("playable/dist/src/core/player-facade", JSImport.Default)
  @js.native
  class default protected ()
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
    
    /* CompleteClass */
    var _addPlayerAPIFromModule: js.Any = js.native
    
    /* CompleteClass */
    var _additionalModules: StringDictionary[js.Any] = js.native
    
    /* CompleteClass */
    var _clearPlayerAPIForModule: js.Any = js.native
    
    /* CompleteClass */
    var _config: IPlayerConfig = js.native
    
    /* CompleteClass */
    var _defaultModules: StringDictionary[js.Any] = js.native
    
    /* CompleteClass */
    var _destroyed: js.Any = js.native
    
    /* CompleteClass */
    var _getPlayerAPIMethodDescriptor: js.Any = js.native
    
    /* CompleteClass */
    var _getWrappedCallToModuleFunction: js.Any = js.native
    
    /* CompleteClass */
    var _resolveAdditionalModules: js.Any = js.native
    
    /* CompleteClass */
    var _resolveDefaultModules: js.Any = js.native
    
    /* CompleteClass */
    var _scope: Container = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  trait Player extends StObject {
    
    var _addPlayerAPIFromModule: js.Any
    
    var _additionalModules: StringDictionary[js.Any]
    
    var _clearPlayerAPIForModule: js.Any
    
    var _config: IPlayerConfig
    
    var _defaultModules: StringDictionary[js.Any]
    
    var _destroyed: js.Any
    
    var _getPlayerAPIMethodDescriptor: js.Any
    
    var _getWrappedCallToModuleFunction: js.Any
    
    var _resolveAdditionalModules: js.Any
    
    var _resolveDefaultModules: js.Any
    
    var _scope: Container
    
    def destroy(): Unit
  }
  object Player {
    
    @scala.inline
    def apply(
      _addPlayerAPIFromModule: js.Any,
      _additionalModules: StringDictionary[js.Any],
      _clearPlayerAPIForModule: js.Any,
      _config: IPlayerConfig,
      _defaultModules: StringDictionary[js.Any],
      _destroyed: js.Any,
      _getPlayerAPIMethodDescriptor: js.Any,
      _getWrappedCallToModuleFunction: js.Any,
      _resolveAdditionalModules: js.Any,
      _resolveDefaultModules: js.Any,
      _scope: Container,
      destroy: () => Unit
    ): Player = {
      val __obj = js.Dynamic.literal(_addPlayerAPIFromModule = _addPlayerAPIFromModule.asInstanceOf[js.Any], _additionalModules = _additionalModules.asInstanceOf[js.Any], _clearPlayerAPIForModule = _clearPlayerAPIForModule.asInstanceOf[js.Any], _config = _config.asInstanceOf[js.Any], _defaultModules = _defaultModules.asInstanceOf[js.Any], _destroyed = _destroyed.asInstanceOf[js.Any], _getPlayerAPIMethodDescriptor = _getPlayerAPIMethodDescriptor.asInstanceOf[js.Any], _getWrappedCallToModuleFunction = _getWrappedCallToModuleFunction.asInstanceOf[js.Any], _resolveAdditionalModules = _resolveAdditionalModules.asInstanceOf[js.Any], _resolveDefaultModules = _resolveDefaultModules.asInstanceOf[js.Any], _scope = _scope.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[Player]
    }
    
    @scala.inline
    implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_addPlayerAPIFromModule(value: js.Any): Self = StObject.set(x, "_addPlayerAPIFromModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_additionalModules(value: StringDictionary[js.Any]): Self = StObject.set(x, "_additionalModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_clearPlayerAPIForModule(value: js.Any): Self = StObject.set(x, "_clearPlayerAPIForModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_config(value: IPlayerConfig): Self = StObject.set(x, "_config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultModules(value: StringDictionary[js.Any]): Self = StObject.set(x, "_defaultModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_destroyed(value: js.Any): Self = StObject.set(x, "_destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getPlayerAPIMethodDescriptor(value: js.Any): Self = StObject.set(x, "_getPlayerAPIMethodDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getWrappedCallToModuleFunction(value: js.Any): Self = StObject.set(x, "_getWrappedCallToModuleFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_resolveAdditionalModules(value: js.Any): Self = StObject.set(x, "_resolveAdditionalModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_resolveDefaultModules(value: js.Any): Self = StObject.set(x, "_resolveDefaultModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_scope(value: Container): Self = StObject.set(x, "_scope", value.asInstanceOf[js.Any])
    }
  }
}
