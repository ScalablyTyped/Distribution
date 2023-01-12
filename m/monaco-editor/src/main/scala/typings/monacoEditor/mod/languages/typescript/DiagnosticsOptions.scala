package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticsOptions extends StObject {
  
  var diagnosticCodesToIgnore: js.UndefOr[js.Array[Double]] = js.undefined
  
  var noSemanticValidation: js.UndefOr[Boolean] = js.undefined
  
  var noSuggestionDiagnostics: js.UndefOr[Boolean] = js.undefined
  
  var noSyntaxValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Limit diagnostic computation to only visible files.
    * Defaults to false.
    */
  var onlyVisible: js.UndefOr[Boolean] = js.undefined
}
object DiagnosticsOptions {
  
  inline def apply(): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticsOptions] (val x: Self) extends AnyVal {
    
    inline def setDiagnosticCodesToIgnore(value: js.Array[Double]): Self = StObject.set(x, "diagnosticCodesToIgnore", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticCodesToIgnoreUndefined: Self = StObject.set(x, "diagnosticCodesToIgnore", js.undefined)
    
    inline def setDiagnosticCodesToIgnoreVarargs(value: Double*): Self = StObject.set(x, "diagnosticCodesToIgnore", js.Array(value*))
    
    inline def setNoSemanticValidation(value: Boolean): Self = StObject.set(x, "noSemanticValidation", value.asInstanceOf[js.Any])
    
    inline def setNoSemanticValidationUndefined: Self = StObject.set(x, "noSemanticValidation", js.undefined)
    
    inline def setNoSuggestionDiagnostics(value: Boolean): Self = StObject.set(x, "noSuggestionDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setNoSuggestionDiagnosticsUndefined: Self = StObject.set(x, "noSuggestionDiagnostics", js.undefined)
    
    inline def setNoSyntaxValidation(value: Boolean): Self = StObject.set(x, "noSyntaxValidation", value.asInstanceOf[js.Any])
    
    inline def setNoSyntaxValidationUndefined: Self = StObject.set(x, "noSyntaxValidation", js.undefined)
    
    inline def setOnlyVisible(value: Boolean): Self = StObject.set(x, "onlyVisible", value.asInstanceOf[js.Any])
    
    inline def setOnlyVisibleUndefined: Self = StObject.set(x, "onlyVisible", js.undefined)
  }
}
