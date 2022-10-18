package typings.playable

import typings.playable.anon.ThemeConfig
import typings.playable.distSrcModulesUiCoreThemeTypesMod.ICSSRules
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typings.playable.distSrcModulesUiCoreTypesMod.IStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreThemeThemeServiceMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ThemeService {
    def this(hasThemeConfig: ThemeConfig) = this()
    
    /* private */ /* CompleteClass */
    var _styleSheet: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def get(module: js.Object): IStyles = js.native
    /* CompleteClass */
    override def get(module: Any): IStyles = js.native
    
    /* CompleteClass */
    override def registerModuleTheme(module: js.Object, rules: ICSSRules): Unit = js.native
    
    /* CompleteClass */
    override def updateTheme(config: IThemeConfig): Unit = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  object DEFAULT_THEME_CONFIG {
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG.color")
    @js.native
    def color: String = js.native
    inline def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG.liveColor")
    @js.native
    def liveColor: String = js.native
    inline def liveColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liveColor")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG.progressColor")
    @js.native
    def progressColor: String = js.native
    inline def progressColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(x.asInstanceOf[js.Any])
  }
  
  trait ThemeService
    extends StObject
       with IThemeService {
    
    /* private */ var _styleSheet: Any
    
    def get(module: Any): IStyles
  }
  object ThemeService {
    
    inline def apply(
      _styleSheet: Any,
      destroy: () => Unit,
      get: Any => IStyles,
      registerModuleTheme: (js.Object, ICSSRules) => Unit,
      updateTheme: IThemeConfig => Unit
    ): ThemeService = {
      val __obj = js.Dynamic.literal(_styleSheet = _styleSheet.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), get = js.Any.fromFunction1(get), registerModuleTheme = js.Any.fromFunction2(registerModuleTheme), updateTheme = js.Any.fromFunction1(updateTheme))
      __obj.asInstanceOf[ThemeService]
    }
    
    extension [Self <: ThemeService](x: Self) {
      
      inline def setGet(value: Any => IStyles): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def set_styleSheet(value: Any): Self = StObject.set(x, "_styleSheet", value.asInstanceOf[js.Any])
    }
  }
}
