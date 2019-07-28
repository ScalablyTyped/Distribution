package typings.atPostlightMercuryDashParser.atPostlightMercuryDashParserMod

import typings.atPostlightMercuryDashParser.atPostlightMercuryDashParserStrings.ltr
import typings.atPostlightMercuryDashParser.atPostlightMercuryDashParserStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var author: String | Null
  var content: String | Null
  var date_published: String | Null
  var dek: String | Null
  var direction: ltr | rtl
  var domain: String
  var excerpt: String | Null
  var lead_image_url: String | Null
  var next_page_url: String | Null
  var rendered_pages: Double
  var title: String | Null
  var total_pages: Double
  var url: String
  var word_count: Double
}

object ParseResult {
  @scala.inline
  def apply(
    direction: ltr | rtl,
    domain: String,
    rendered_pages: Double,
    total_pages: Double,
    url: String,
    word_count: Double,
    author: String = null,
    content: String = null,
    date_published: String = null,
    dek: String = null,
    excerpt: String = null,
    lead_image_url: String = null,
    next_page_url: String = null,
    title: String = null
  ): ParseResult = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], domain = domain, rendered_pages = rendered_pages, total_pages = total_pages, url = url, word_count = word_count)
    if (author != null) __obj.updateDynamic("author")(author)
    if (content != null) __obj.updateDynamic("content")(content)
    if (date_published != null) __obj.updateDynamic("date_published")(date_published)
    if (dek != null) __obj.updateDynamic("dek")(dek)
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt)
    if (lead_image_url != null) __obj.updateDynamic("lead_image_url")(lead_image_url)
    if (next_page_url != null) __obj.updateDynamic("next_page_url")(next_page_url)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ParseResult]
  }
}

