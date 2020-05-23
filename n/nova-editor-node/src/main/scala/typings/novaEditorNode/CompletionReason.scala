package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompletionReason extends js.Object

@JSGlobal("CompletionReason")
@js.native
object CompletionReason extends js.Object {
  @js.native
  sealed trait Character extends CompletionReason
  
  @js.native
  sealed trait Invoke extends CompletionReason
  
}

