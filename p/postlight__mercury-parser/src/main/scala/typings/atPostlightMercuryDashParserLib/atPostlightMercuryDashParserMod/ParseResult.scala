package typings
package atPostlightMercuryDashParserLib.atPostlightMercuryDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var author: java.lang.String | scala.Null
  var content: java.lang.String | scala.Null
  var date_published: java.lang.String | scala.Null
  var dek: java.lang.String | scala.Null
  var direction: atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.ltr | atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.rtl
  var domain: java.lang.String
  var excerpt: java.lang.String | scala.Null
  var lead_image_url: java.lang.String | scala.Null
  var next_page_url: java.lang.String | scala.Null
  var rendered_pages: scala.Double
  var title: java.lang.String | scala.Null
  var total_pages: scala.Double
  var url: java.lang.String
  var word_count: scala.Double
}

object ParseResult {
  @scala.inline
  def apply(
    direction: atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.ltr | atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.rtl,
    domain: java.lang.String,
    rendered_pages: scala.Double,
    total_pages: scala.Double,
    url: java.lang.String,
    word_count: scala.Double,
    author: java.lang.String = null,
    content: java.lang.String = null,
    date_published: java.lang.String = null,
    dek: java.lang.String = null,
    excerpt: java.lang.String = null,
    lead_image_url: java.lang.String = null,
    next_page_url: java.lang.String = null,
    title: java.lang.String = null
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

