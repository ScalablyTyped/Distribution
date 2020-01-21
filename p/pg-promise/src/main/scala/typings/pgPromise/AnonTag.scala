package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTag extends js.Object {
  var tag: js.UndefOr[js.Any] = js.undefined
}

object AnonTag {
  @scala.inline
  def apply(tag: js.Any = null): AnonTag = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTag]
  }
}

