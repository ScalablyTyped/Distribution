package typings
package nextDashSeoLib.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphArticle extends js.Object {
  var authors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var expirationTime: js.UndefOr[java.lang.String] = js.undefined
  var modifiedTime: js.UndefOr[java.lang.String] = js.undefined
  var publishedTime: js.UndefOr[java.lang.String] = js.undefined
  var section: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OpenGraphArticle {
  @scala.inline
  def apply(
    authors: js.Array[java.lang.String] = null,
    expirationTime: java.lang.String = null,
    modifiedTime: java.lang.String = null,
    publishedTime: java.lang.String = null,
    section: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): OpenGraphArticle = {
    val __obj = js.Dynamic.literal()
    if (authors != null) __obj.updateDynamic("authors")(authors)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime)
    if (publishedTime != null) __obj.updateDynamic("publishedTime")(publishedTime)
    if (section != null) __obj.updateDynamic("section")(section)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[OpenGraphArticle]
  }
}

