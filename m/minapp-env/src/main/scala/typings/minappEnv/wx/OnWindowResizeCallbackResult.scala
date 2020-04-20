package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnWindowResizeCallbackResult extends js.Object {
  var size: Size
}

object OnWindowResizeCallbackResult {
  @scala.inline
  def apply(size: Size): OnWindowResizeCallbackResult = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnWindowResizeCallbackResult]
  }
}

