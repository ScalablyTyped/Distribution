package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pageable extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var page_size: js.UndefOr[scala.Double] = js.undefined
}

object Pageable {
  @scala.inline
  def apply(page: scala.Int | scala.Double = null, page_size: scala.Int | scala.Double = null): Pageable = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pageable]
  }
}

