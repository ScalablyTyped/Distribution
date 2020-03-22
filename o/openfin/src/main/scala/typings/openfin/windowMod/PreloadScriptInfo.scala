package typings.openfin.windowMod

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreloadScriptInfo extends js.Object {
  var state: `load-failed` | failed | succeeded
}

object PreloadScriptInfo {
  @scala.inline
  def apply(state: `load-failed` | failed | succeeded): PreloadScriptInfo = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreloadScriptInfo]
  }
}

