package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticsOptions extends StObject {
  
  var diagnosticCodesToIgnore: js.UndefOr[js.Array[Double]] = js.native
  
  var noSemanticValidation: js.UndefOr[Boolean] = js.native
  
  var noSuggestionDiagnostics: js.UndefOr[Boolean] = js.native
  
  var noSyntaxValidation: js.UndefOr[Boolean] = js.native
}
object DiagnosticsOptions {
  
  @scala.inline
  def apply(): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticsOptions]
  }
  
  @scala.inline
  implicit class DiagnosticsOptionsMutableBuilder[Self <: DiagnosticsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnosticCodesToIgnore(value: js.Array[Double]): Self = StObject.set(x, "diagnosticCodesToIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticCodesToIgnoreUndefined: Self = StObject.set(x, "diagnosticCodesToIgnore", js.undefined)
    
    @scala.inline
    def setDiagnosticCodesToIgnoreVarargs(value: Double*): Self = StObject.set(x, "diagnosticCodesToIgnore", js.Array(value :_*))
    
    @scala.inline
    def setNoSemanticValidation(value: Boolean): Self = StObject.set(x, "noSemanticValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSemanticValidationUndefined: Self = StObject.set(x, "noSemanticValidation", js.undefined)
    
    @scala.inline
    def setNoSuggestionDiagnostics(value: Boolean): Self = StObject.set(x, "noSuggestionDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSuggestionDiagnosticsUndefined: Self = StObject.set(x, "noSuggestionDiagnostics", js.undefined)
    
    @scala.inline
    def setNoSyntaxValidation(value: Boolean): Self = StObject.set(x, "noSyntaxValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSyntaxValidationUndefined: Self = StObject.set(x, "noSyntaxValidation", js.undefined)
  }
}
