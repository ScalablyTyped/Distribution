package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message used in the `onVisibilityModeChanged` invocation.
  */
trait VisibilityModeChangedMessage extends js.Object {
  /**
    * Visibility changed state.
    */
  var visibilityMode: VisibilityMode
}

object VisibilityModeChangedMessage {
  @scala.inline
  def apply(visibilityMode: VisibilityMode): VisibilityModeChangedMessage = {
    val __obj = js.Dynamic.literal(visibilityMode = visibilityMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisibilityModeChangedMessage]
  }
}

