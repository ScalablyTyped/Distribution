package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Tag {
  @scala.inline
  def apply(tag: js.Any = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

