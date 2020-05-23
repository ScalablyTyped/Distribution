package typings.pacote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Latest extends js.Object {
  var latest: String
}

object Latest {
  @scala.inline
  def apply(latest: String): Latest = {
    val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latest]
  }
}

