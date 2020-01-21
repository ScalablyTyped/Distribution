package typings.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnippetListeners extends js.Object {
  var afterUpdate: SnippetUpdateListener
  var beforeUpdate: SnippetUpdateListener
}

object SnippetListeners {
  @scala.inline
  def apply(afterUpdate: SnippetUpdateListener, beforeUpdate: SnippetUpdateListener): SnippetListeners = {
    val __obj = js.Dynamic.literal(afterUpdate = afterUpdate.asInstanceOf[js.Any], beforeUpdate = beforeUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnippetListeners]
  }
}

