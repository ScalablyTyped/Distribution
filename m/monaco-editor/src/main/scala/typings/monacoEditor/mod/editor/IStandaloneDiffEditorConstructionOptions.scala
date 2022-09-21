package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStandaloneDiffEditorConstructionOptions
  extends StObject
     with IDiffEditorConstructionOptions {
  
  /**
    * If enabled, will automatically change to high contrast theme if the OS is using a high contrast theme.
    * Defaults to true.
    */
  var autoDetectHighContrast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Initial theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black', 'hc-light.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`.
    * **NOTE**: The theme might be overwritten if the OS is in high contrast mode, unless `autoDetectHighContrast` is set to false.
    */
  var theme: js.UndefOr[String] = js.undefined
}
object IStandaloneDiffEditorConstructionOptions {
  
  inline def apply(): IStandaloneDiffEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStandaloneDiffEditorConstructionOptions]
  }
  
  extension [Self <: IStandaloneDiffEditorConstructionOptions](x: Self) {
    
    inline def setAutoDetectHighContrast(value: Boolean): Self = StObject.set(x, "autoDetectHighContrast", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectHighContrastUndefined: Self = StObject.set(x, "autoDetectHighContrast", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
