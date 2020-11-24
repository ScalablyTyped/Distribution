package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorNumbers.`0`
import typings.monacoEditor.monacoEditorNumbers.`1`
import typings.monacoEditor.monacoEditorNumbers.`2`
import typings.monacoEditor.monacoEditorNumbers.`3`
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
  implicit class DiagnosticOps[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelatedInformationVarargs(value: DiagnosticRelatedInformation*): Self = this.set("relatedInformation", js.Array(value :_*))
    
    @scala.inline
    def setRelatedInformation(value: js.Array[DiagnosticRelatedInformation]): Self = this.set("relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedInformation: Self = this.set("relatedInformation", js.undefined)
    
    @scala.inline
    def setReportsUnnecessary(value: js.Object): Self = this.set("reportsUnnecessary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportsUnnecessary: Self = this.set("reportsUnnecessary", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
