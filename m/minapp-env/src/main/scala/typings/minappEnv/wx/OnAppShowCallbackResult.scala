package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAppShowCallbackResult extends js.Object {
  var `object`: ResultOption
}

object OnAppShowCallbackResult {
  @scala.inline
  def apply(`object`: ResultOption): OnAppShowCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAppShowCallbackResult]
  }
}

