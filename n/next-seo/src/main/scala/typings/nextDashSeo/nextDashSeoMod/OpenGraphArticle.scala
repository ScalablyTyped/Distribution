package typings.nextDashSeo.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphArticle extends js.Object {
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  var expirationTime: js.UndefOr[String] = js.undefined
  var modifiedTime: js.UndefOr[String] = js.undefined
  var publishedTime: js.UndefOr[String] = js.undefined
  var section: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object OpenGraphArticle {
  @scala.inline
  def apply(
    authors: js.Array[String] = null,
    expirationTime: String = null,
    modifiedTime: String = null,
    publishedTime: String = null,
    section: String = null,
    tags: js.Array[String] = null
  ): OpenGraphArticle = {
    val __obj = js.Dynamic.literal()
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime.asInstanceOf[js.Any])
    if (publishedTime != null) __obj.updateDynamic("publishedTime")(publishedTime.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphArticle]
  }
}

