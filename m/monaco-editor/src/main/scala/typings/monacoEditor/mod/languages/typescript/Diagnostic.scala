package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorNumbers.`0`
import typings.monacoEditor.monacoEditorNumbers.`1`
import typings.monacoEditor.monacoEditorNumbers.`2`
import typings.monacoEditor.monacoEditorNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostic extends DiagnosticRelatedInformation {
  
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.native
  
  /** May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic. */
  var reportsUnnecessary: js.UndefOr[js.Object] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object Diagnostic {
  
  @scala.inline
  def apply(category: `0` | `1` | `2` | `3`, code: Double, messageText: String | DiagnosticMessageChain): Diagnostic = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  @scala.inline
  implicit class DiagnosticMutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedInformation(value: js.Array[DiagnosticRelatedInformation]): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    @scala.inline
    def setRelatedInformationVarargs(value: DiagnosticRelatedInformation*): Self = StObject.set(x, "relatedInformation", js.Array(value :_*))
    
    @scala.inline
    def setReportsUnnecessary(value: js.Object): Self = StObject.set(x, "reportsUnnecessary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUnnecessaryUndefined: Self = StObject.set(x, "reportsUnnecessary", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
