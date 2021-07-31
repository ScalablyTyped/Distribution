package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/issue/
trait Issue extends StObject {
  
  var code: Double | String
  
  var column: js.UndefOr[Double] = js.undefined
  
  var endColumn: js.UndefOr[Double] = js.undefined
  
  var endLine: js.UndefOr[Double] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
  
  var message: String
  
  var severity: IssueSeverity
  
  var source: String | Null
  
  var textRange: js.UndefOr[Range] = js.undefined
}
object Issue {
  
  @scala.inline
  def apply(code: Double | String, message: String, severity: IssueSeverity): Issue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], source = null)
    __obj.asInstanceOf[Issue]
  }
  
  @scala.inline
  implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: IssueSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
