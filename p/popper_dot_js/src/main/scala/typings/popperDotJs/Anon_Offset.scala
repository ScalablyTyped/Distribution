package typings.popperDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: js.UndefOr[Double | String] = js.undefined
}

object Anon_Offset {
  @scala.inline
  def apply(offset: Double | String = null): Anon_Offset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Offset]
  }
}

