package typings.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowInfo extends js.Object {
  var canNavigateBack: Boolean
  var canNavigateForward: Boolean
  var preloadScripts: js.Array[_]
  var title: String
  var url: String
}

object WindowInfo {
  @scala.inline
  def apply(
    canNavigateBack: Boolean,
    canNavigateForward: Boolean,
    preloadScripts: js.Array[_],
    title: String,
    url: String
  ): WindowInfo = {
    val __obj = js.Dynamic.literal(canNavigateBack = canNavigateBack.asInstanceOf[js.Any], canNavigateForward = canNavigateForward.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowInfo]
  }
}

