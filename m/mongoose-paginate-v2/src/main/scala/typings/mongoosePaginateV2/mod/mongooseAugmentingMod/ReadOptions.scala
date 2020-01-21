package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var pref: String
  var tags: js.UndefOr[js.Array[_]] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(pref: String, tags: js.Array[_] = null): ReadOptions = {
    val __obj = js.Dynamic.literal(pref = pref.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

