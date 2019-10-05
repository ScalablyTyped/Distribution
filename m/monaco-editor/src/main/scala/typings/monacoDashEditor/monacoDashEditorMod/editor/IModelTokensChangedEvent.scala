package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.Anon_FromLineNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelTokensChangedEvent extends js.Object {
  val ranges: js.Array[Anon_FromLineNumber]
  val tokenizationSupportChanged: Boolean
}

object IModelTokensChangedEvent {
  @scala.inline
  def apply(ranges: js.Array[Anon_FromLineNumber], tokenizationSupportChanged: Boolean): IModelTokensChangedEvent = {
    val __obj = js.Dynamic.literal(ranges = ranges, tokenizationSupportChanged = tokenizationSupportChanged)
  
    __obj.asInstanceOf[IModelTokensChangedEvent]
  }
}

