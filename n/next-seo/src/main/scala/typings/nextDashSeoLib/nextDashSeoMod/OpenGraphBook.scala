package typings
package nextDashSeoLib.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphBook extends js.Object {
  var authors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isbn: js.UndefOr[java.lang.String] = js.undefined
  var releaseDate: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OpenGraphBook {
  @scala.inline
  def apply(
    authors: js.Array[java.lang.String] = null,
    isbn: java.lang.String = null,
    releaseDate: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): OpenGraphBook = {
    val __obj = js.Dynamic.literal()
    if (authors != null) __obj.updateDynamic("authors")(authors)
    if (isbn != null) __obj.updateDynamic("isbn")(isbn)
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[OpenGraphBook]
  }
}

