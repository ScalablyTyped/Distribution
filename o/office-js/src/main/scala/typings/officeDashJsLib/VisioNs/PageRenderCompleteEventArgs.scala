package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the page that raised the PageRenderComplete event.
  *
  * [Api set:  1.1]
  */
trait PageRenderCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page that raised the PageLoad event.
    *
    * [Api set:  1.1]
    */
  var pageName: java.lang.String
  /**
    *
    * Gets the success/failure of the PageRender event.
    *
    * [Api set:  1.1]
    */
  var success: scala.Boolean
}

object PageRenderCompleteEventArgs {
  @scala.inline
  def apply(pageName: java.lang.String, success: scala.Boolean): PageRenderCompleteEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName, success = success)
  
    __obj.asInstanceOf[PageRenderCompleteEventArgs]
  }
}

