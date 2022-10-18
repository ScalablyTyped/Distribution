package typings.next

import typings.next.anon.Output
import typings.next.nextInts.`1`
import typings.next.nextInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEslintCustomFormatterMod {
  
  @JSImport("next/dist/lib/eslint/customFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MessageSeverity extends StObject
  @JSImport("next/dist/lib/eslint/customFormatter", "MessageSeverity")
  @js.native
  object MessageSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageSeverity & Double] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with MessageSeverity
    /* 2 */ val Error: typings.next.distLibEslintCustomFormatterMod.MessageSeverity.Error & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with MessageSeverity
    /* 1 */ val Warning: typings.next.distLibEslintCustomFormatterMod.MessageSeverity.Warning & Double = js.native
  }
  
  inline def formatResults(
    baseDir: String,
    results: js.Array[LintResult],
    format: js.Function1[/* r */ js.Array[LintResult], String]
  ): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResults")(baseDir.asInstanceOf[js.Any], results.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  trait LintMessage extends StObject {
    
    var column: Double
    
    var line: Double
    
    var message: String
    
    var ruleId: String | Null
    
    var severity: `1` | `2`
  }
  object LintMessage {
    
    inline def apply(column: Double, line: Double, message: String, severity: `1` | `2`): LintMessage = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], ruleId = null)
      __obj.asInstanceOf[LintMessage]
    }
    
    extension [Self <: LintMessage](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      inline def setRuleIdNull: Self = StObject.set(x, "ruleId", null)
      
      inline def setSeverity(value: `1` | `2`): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
  
  trait LintResult extends StObject {
    
    var errorCount: Double
    
    var filePath: String
    
    var messages: js.Array[LintMessage]
    
    var output: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var warningCount: Double
  }
  object LintResult {
    
    inline def apply(errorCount: Double, filePath: String, messages: js.Array[LintMessage], warningCount: Double): LintResult = {
      val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintResult]
    }
    
    extension [Self <: LintResult](x: Self) {
      
      inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[LintMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: LintMessage*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    }
  }
}
