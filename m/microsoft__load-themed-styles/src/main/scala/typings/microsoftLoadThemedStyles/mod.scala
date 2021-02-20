package typings.microsoftLoadThemedStyles

import org.scalablytyped.runtime.StringDictionary
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`0`
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`1`
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`2`
import typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@microsoft/load-themed-styles", "clearStyles")
  @js.native
  def clearStyles(): Unit = js.native
  @JSImport("@microsoft/load-themed-styles", "clearStyles")
  @js.native
  def clearStyles(option: ClearStyleOptions): Unit = js.native
  
  @JSImport("@microsoft/load-themed-styles", "configureLoadStyles")
  @js.native
  def configureLoadStyles(): Unit = js.native
  @JSImport("@microsoft/load-themed-styles", "configureLoadStyles")
  @js.native
  def configureLoadStyles(
    loadStylesFn: js.Function2[
      /* processedStyles */ String, 
      /* rawStyles */ js.UndefOr[String | ThemableArray], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("@microsoft/load-themed-styles", "configureRunMode")
  @js.native
  def configureRunMode(mode: Mode): Unit = js.native
  
  @JSImport("@microsoft/load-themed-styles", "detokenize")
  @js.native
  def detokenize(): js.UndefOr[String] = js.native
  @JSImport("@microsoft/load-themed-styles", "detokenize")
  @js.native
  def detokenize(styles: String): js.UndefOr[String] = js.native
  
  @JSImport("@microsoft/load-themed-styles", "flush")
  @js.native
  def flush(): Unit = js.native
  
  @JSImport("@microsoft/load-themed-styles", "loadStyles")
  @js.native
  def loadStyles(styles: String): Unit = js.native
  @JSImport("@microsoft/load-themed-styles", "loadStyles")
  @js.native
  def loadStyles(styles: String, loadAsync: Boolean): Unit = js.native
  @JSImport("@microsoft/load-themed-styles", "loadStyles")
  @js.native
  def loadStyles(styles: ThemableArray): Unit = js.native
  @JSImport("@microsoft/load-themed-styles", "loadStyles")
  @js.native
  def loadStyles(styles: ThemableArray, loadAsync: Boolean): Unit = js.native
  
  @JSImport("@microsoft/load-themed-styles", "loadTheme")
  @js.native
  def loadTheme(): Unit = js.native
  @JSImport("@microsoft/load-themed-styles", "loadTheme")
  @js.native
  def loadTheme(theme: ITheme): Unit = js.native
  
  @JSImport("@microsoft/load-themed-styles", "splitStyles")
  @js.native
  def splitStyles(styles: String): ThemableArray = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`1`
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`2`
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`3`
  */
  trait ClearStyleOptions extends StObject
  object ClearStyleOptions {
    
    /** both themable and non-themable styles will be cleared */
    @scala.inline
    def all: `3` = 3.asInstanceOf[`3`]
    
    /** only non-themable styles will be cleared */
    @scala.inline
    def onlyNonThemable: `2` = 2.asInstanceOf[`2`]
    
    /** only themable styles will be cleared */
    @scala.inline
    def onlyThemable: `1` = 1.asInstanceOf[`1`]
  }
  
  type ITheme = StringDictionary[String]
  
  @js.native
  trait IThemingInstruction extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var rawString: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[String] = js.native
  }
  object IThemingInstruction {
    
    @scala.inline
    def apply(): IThemingInstruction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemingInstruction]
    }
    
    @scala.inline
    implicit class IThemingInstructionMutableBuilder[Self <: IThemingInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setRawString(value: String): Self = StObject.set(x, "rawString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawStringUndefined: Self = StObject.set(x, "rawString", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`0`
    - typings.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`1`
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def async: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def sync: `0` = 0.asInstanceOf[`0`]
  }
  
  type ThemableArray = js.Array[IThemingInstruction]
}
