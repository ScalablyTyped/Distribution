package typings.officeDashJsDashPreview.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the success or failure of the DocumentLoadComplete event.
  *
  * [Api set:  1.1]
  */
trait DocumentLoadCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the success or failure of the DocumentLoadComplete event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean
}

object DocumentLoadCompleteEventArgs {
  @scala.inline
  def apply(success: Boolean): DocumentLoadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentLoadCompleteEventArgs]
  }
}

