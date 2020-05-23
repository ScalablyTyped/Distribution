package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelChangedEvent extends js.Object {
  /**
    * The `uri` of the new model or null.
    */
  val newModelUrl: Uri | Null
  /**
    * The `uri` of the previous model or null.
    */
  val oldModelUrl: Uri | Null
}

object IModelChangedEvent {
  @scala.inline
  def apply(newModelUrl: Uri = null, oldModelUrl: Uri = null): IModelChangedEvent = {
    val __obj = js.Dynamic.literal(newModelUrl = newModelUrl.asInstanceOf[js.Any], oldModelUrl = oldModelUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelChangedEvent]
  }
}

