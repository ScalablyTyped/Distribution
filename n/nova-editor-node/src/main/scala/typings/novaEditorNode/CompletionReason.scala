package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionReason extends StObject
@JSGlobal("CompletionReason")
@js.native
object CompletionReason extends StObject {
  
  @js.native
  sealed trait Character extends CompletionReason
  
  @js.native
  sealed trait Invoke extends CompletionReason
}
