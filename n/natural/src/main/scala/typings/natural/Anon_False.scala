package typings.natural

import typings.natural.naturalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var search: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(search: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

