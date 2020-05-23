package typings.officeUiFabricReact.ratingBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingState extends js.Object {
  var rating: js.UndefOr[Double | Null] = js.undefined
}

object IRatingState {
  @scala.inline
  def apply(rating: js.UndefOr[Null | Double] = js.undefined): IRatingState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rating)) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRatingState]
  }
}

