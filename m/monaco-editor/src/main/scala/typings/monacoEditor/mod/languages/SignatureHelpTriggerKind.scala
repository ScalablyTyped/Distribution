package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureHelpTriggerKind extends js.Object

@JSImport("monaco-editor", "languages.SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends js.Object {
  @js.native
  sealed trait ContentChange extends SignatureHelpTriggerKind
  
  @js.native
  sealed trait Invoke extends SignatureHelpTriggerKind
  
  @js.native
  sealed trait TriggerCharacter extends SignatureHelpTriggerKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind with Double] = js.native
  /* 3 */ @js.native
  object ContentChange extends TopLevel[ContentChange with Double]
  
  /* 1 */ @js.native
  object Invoke extends TopLevel[Invoke with Double]
  
  /* 2 */ @js.native
  object TriggerCharacter extends TopLevel[TriggerCharacter with Double]
  
}

