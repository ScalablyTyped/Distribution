package typings.postlightMercuryParser.mod

import typings.postlightMercuryParser.postlightMercuryParserStrings.ltr
import typings.postlightMercuryParser.postlightMercuryParserStrings.rtl
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
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], rendered_pages = rendered_pages.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date_published = date_published.asInstanceOf[js.Any], dek = dek.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], lead_image_url = lead_image_url.asInstanceOf[js.Any], next_page_url = next_page_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
}

