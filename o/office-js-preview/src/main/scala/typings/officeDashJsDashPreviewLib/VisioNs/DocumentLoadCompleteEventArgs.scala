package typings
package officeDashJsDashPreviewLib.VisioNs

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
  var success: scala.Boolean
}

object DocumentLoadCompleteEventArgs {
  @scala.inline
  def apply(success: scala.Boolean): DocumentLoadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(success = success)
  
    __obj.asInstanceOf[DocumentLoadCompleteEventArgs]
  }
}

