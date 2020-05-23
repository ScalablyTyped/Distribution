package typings.parents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  var platform: js.UndefOr[String] = js.undefined
}

object Platform {
  @scala.inline
  def apply(platform: String = null): Platform = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform]
  }
}

