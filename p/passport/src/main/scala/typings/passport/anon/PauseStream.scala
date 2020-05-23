package typings.passport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseStream extends js.Object {
  var pauseStream: Boolean
}

object PauseStream {
  @scala.inline
  def apply(pauseStream: Boolean): PauseStream = {
    val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseStream]
  }
}

