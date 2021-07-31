package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionTriggerKind extends StObject
@JSImport("monaco-editor", "languages.CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind & Double] = js.native
  
  @js.native
  sealed trait Invoke
    extends StObject
       with CompletionTriggerKind
  /* 0 */ val Invoke: typings.monacoEditor.mod.languages.CompletionTriggerKind.Invoke & Double = js.native
  
  @js.native
  sealed trait TriggerCharacter
    extends StObject
       with CompletionTriggerKind
  /* 1 */ val TriggerCharacter: typings.monacoEditor.mod.languages.CompletionTriggerKind.TriggerCharacter & Double = js.native
  
  @js.native
  sealed trait TriggerForIncompleteCompletions
    extends StObject
       with CompletionTriggerKind
  /* 2 */ val TriggerForIncompleteCompletions: typings.monacoEditor.mod.languages.CompletionTriggerKind.TriggerForIncompleteCompletions & Double = js.native
}
