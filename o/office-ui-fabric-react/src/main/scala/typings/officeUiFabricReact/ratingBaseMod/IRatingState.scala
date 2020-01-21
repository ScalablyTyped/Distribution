package typings.officeUiFabricReact.ratingBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingState extends js.Object {
  var rating: js.UndefOr[Double | Null] = js.undefined
}

object IRatingState {
  @scala.inline
  def apply(rating: Int | Double = null): IRatingState = {
    val __obj = js.Dynamic.literal()
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRatingState]
  }
}

