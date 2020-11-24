package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertTextFormat extends js.Object
@JSGlobal("InsertTextFormat")
@js.native
object InsertTextFormat extends js.Object {
  
  @js.native
  sealed trait PlainText extends InsertTextFormat
  
  @js.native
  sealed trait Snippet extends InsertTextFormat
}
