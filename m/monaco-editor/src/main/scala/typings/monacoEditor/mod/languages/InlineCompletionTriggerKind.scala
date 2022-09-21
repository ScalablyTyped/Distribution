package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlineCompletionTriggerKind extends StObject
@JSImport("monaco-editor", "languages.InlineCompletionTriggerKind")
@js.native
object InlineCompletionTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineCompletionTriggerKind & Double] = js.native
  
  /**
    * Completion was triggered automatically while editing.
    * It is sufficient to return a single completion item in this case.
    */
  @js.native
  sealed trait Automatic
    extends StObject
       with InlineCompletionTriggerKind
  /* 0 */ val Automatic: typings.monacoEditor.mod.languages.InlineCompletionTriggerKind.Automatic & Double = js.native
  
  /**
    * Completion was triggered explicitly by a user gesture.
    * Return multiple completion items to enable cycling through them.
    */
  @js.native
  sealed trait Explicit
    extends StObject
       with InlineCompletionTriggerKind
  /* 1 */ val Explicit: typings.monacoEditor.mod.languages.InlineCompletionTriggerKind.Explicit & Double = js.native
}
