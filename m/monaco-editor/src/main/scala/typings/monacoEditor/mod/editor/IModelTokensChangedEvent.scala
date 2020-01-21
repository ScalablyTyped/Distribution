package typings.monacoEditor.mod.editor

import typings.monacoEditor.AnonFromLineNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelTokensChangedEvent extends js.Object {
  val ranges: js.Array[AnonFromLineNumber]
  val tokenizationSupportChanged: Boolean
}

object IModelTokensChangedEvent {
  @scala.inline
  def apply(ranges: js.Array[AnonFromLineNumber], tokenizationSupportChanged: Boolean): IModelTokensChangedEvent = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], tokenizationSupportChanged = tokenizationSupportChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IModelTokensChangedEvent]
  }
}

