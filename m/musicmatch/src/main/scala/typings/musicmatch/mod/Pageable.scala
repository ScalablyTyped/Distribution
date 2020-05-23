package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pageable extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var page_size: js.UndefOr[Double] = js.undefined
}

object Pageable {
  @scala.inline
  def apply(page: js.UndefOr[Double] = js.undefined, page_size: js.UndefOr[Double] = js.undefined): Pageable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pageable]
  }
}

