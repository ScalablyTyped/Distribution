package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodeActionTriggerType extends StObject
@JSImport("monaco-editor", "languages.CodeActionTriggerType")
@js.native
object CodeActionTriggerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CodeActionTriggerType & Double] = js.native
  
  @js.native
  sealed trait Auto
    extends StObject
       with CodeActionTriggerType
  /* 2 */ val Auto: typings.monacoEditor.mod.languages.CodeActionTriggerType.Auto & Double = js.native
  
  @js.native
  sealed trait Invoke
    extends StObject
       with CodeActionTriggerType
  /* 1 */ val Invoke: typings.monacoEditor.mod.languages.CodeActionTriggerType.Invoke & Double = js.native
}
