package typings.podium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CriteriaFilterOptionsObject extends js.Object {
  /** if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag). */
  var all: js.UndefOr[Boolean] = js.undefined
  /** a tag string or array of tag strings. */
  var tags: js.UndefOr[String | js.Array[String]] = js.undefined
}

object CriteriaFilterOptionsObject {
  @scala.inline
  def apply(all: js.UndefOr[Boolean] = js.undefined, tags: String | js.Array[String] = null): CriteriaFilterOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriteriaFilterOptionsObject]
  }
}

