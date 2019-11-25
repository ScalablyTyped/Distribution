package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInContentReturnType extends js.Object {
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch]
}

object SearchInContentReturnType {
  @scala.inline
  def apply(result: js.Array[SearchMatch]): SearchInContentReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchInContentReturnType]
  }
}

