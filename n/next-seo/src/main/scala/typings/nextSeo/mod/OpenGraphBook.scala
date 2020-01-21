package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphBook extends js.Object {
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  var isbn: js.UndefOr[String] = js.undefined
  var releaseDate: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object OpenGraphBook {
  @scala.inline
  def apply(
    authors: js.Array[String] = null,
    isbn: String = null,
    releaseDate: String = null,
    tags: js.Array[String] = null
  ): OpenGraphBook = {
    val __obj = js.Dynamic.literal()
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (isbn != null) __obj.updateDynamic("isbn")(isbn.asInstanceOf[js.Any])
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphBook]
  }
}

