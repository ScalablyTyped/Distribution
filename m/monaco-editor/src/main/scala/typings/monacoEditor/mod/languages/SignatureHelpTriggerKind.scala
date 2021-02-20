package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignatureHelpTriggerKind extends StObject
@JSImport("monaco-editor", "languages.SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind with Double] = js.native
  
  @js.native
  sealed trait ContentChange extends SignatureHelpTriggerKind
  /* 3 */ val ContentChange: typings.monacoEditor.mod.languages.SignatureHelpTriggerKind.ContentChange with Double = js.native
  
  @js.native
  sealed trait Invoke extends SignatureHelpTriggerKind
  /* 1 */ val Invoke: typings.monacoEditor.mod.languages.SignatureHelpTriggerKind.Invoke with Double = js.native
  
  @js.native
  sealed trait TriggerCharacter extends SignatureHelpTriggerKind
  /* 2 */ val TriggerCharacter: typings.monacoEditor.mod.languages.SignatureHelpTriggerKind.TriggerCharacter with Double = js.native
}
