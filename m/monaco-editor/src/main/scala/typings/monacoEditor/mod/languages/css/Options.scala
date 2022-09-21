package typings.monacoEditor.mod.languages.css

import typings.monacoEditor.anon.ArgumentsInColorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Configures the CSS data types known by the langauge service.
    */
  val data: js.UndefOr[CSSDataConfiguration] = js.undefined
  
  /**
    * Settings for the CSS formatter.
    */
  val format: js.UndefOr[CSSFormatConfiguration] = js.undefined
  
  val lint: js.UndefOr[ArgumentsInColorFunction] = js.undefined
  
  val validate: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setData(value: CSSDataConfiguration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFormat(value: CSSFormatConfiguration): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLint(value: ArgumentsInColorFunction): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
    
    inline def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
