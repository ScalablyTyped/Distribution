package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IssueSeverity extends js.Object

@JSGlobal("IssueSeverity")
@js.native
object IssueSeverity extends js.Object {
  @js.native
  sealed trait Error extends IssueSeverity
  
  @js.native
  sealed trait Hint extends IssueSeverity
  
  @js.native
  sealed trait Info extends IssueSeverity
  
  @js.native
  sealed trait Warning extends IssueSeverity
  
}

