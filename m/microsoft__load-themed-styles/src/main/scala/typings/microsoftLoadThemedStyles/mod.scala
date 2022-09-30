package typings.microsoftLoadThemedStyles

import org.scalablytyped.runtime.StringDictionary
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`0`
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`1`
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`2`
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@microsoft/load-themed-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStyles")().asInstanceOf[Unit]
  inline def clearStyles(option: ClearStyleOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStyles")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def configureLoadStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureLoadStyles")().asInstanceOf[Unit]
  inline def configureLoadStyles(
    loadStylesFn: js.Function2[
      /* processedStyles */ String, 
      /* rawStyles */ js.UndefOr[String | ThemableArray], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureLoadStyles")(loadStylesFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def configureRunMode(mode: Mode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureRunMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detokenize(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detokenize")().asInstanceOf[js.UndefOr[String]]
  inline def detokenize(styles: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detokenize")(styles.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
  inline def loadStyles(styles: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadStyles(styles: String, loadAsync: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadStyles")(styles.asInstanceOf[js.Any], loadAsync.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadStyles(styles: ThemableArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadStyles(styles: ThemableArray, loadAsync: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadStyles")(styles.asInstanceOf[js.Any], loadAsync.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTheme")().asInstanceOf[Unit]
  inline def loadTheme(theme: ITheme): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def splitStyles(styles: String): ThemableArray = ^.asInstanceOf[js.Dynamic].applyDynamic("splitStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[ThemableArray]
  
  /* Rewritten from type alias, can be one of: 
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`1`
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`2`
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`3`
  */
  trait ClearStyleOptions extends StObject
  object ClearStyleOptions {
    
    /** both themable and non-themable styles will be cleared */
    inline def all: `3` = 3.asInstanceOf[`3`]
    
    /** only non-themable styles will be cleared */
    inline def onlyNonThemable: `2` = 2.asInstanceOf[`2`]
    
    /** only themable styles will be cleared */
    inline def onlyThemable: `1` = 1.asInstanceOf[`1`]
  }
  
  type ITheme = StringDictionary[String]
  
  trait IThemingInstruction extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var rawString: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object IThemingInstruction {
    
    inline def apply(): IThemingInstruction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemingInstruction]
    }
    
    extension [Self <: IThemingInstruction](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setRawString(value: String): Self = StObject.set(x, "rawString", value.asInstanceOf[js.Any])
      
      inline def setRawStringUndefined: Self = StObject.set(x, "rawString", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`0`
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesInts.`1`
  */
  trait Mode extends StObject
  object Mode {
    
    inline def async: `1` = 1.asInstanceOf[`1`]
    
    inline def sync: `0` = 0.asInstanceOf[`0`]
  }
  
  type ThemableArray = js.Array[IThemingInstruction]
}
