package typings.postlightMercuryParser.mod

import typings.postlightMercuryParser.postlightMercuryParserStrings.ltr
import typings.postlightMercuryParser.postlightMercuryParserStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseResult extends js.Object {
  var author: String | Null = js.native
  var content: String | Null = js.native
  var date_published: String | Null = js.native
  var dek: String | Null = js.native
  var direction: ltr | rtl = js.native
  var domain: String = js.native
  var excerpt: String | Null = js.native
  var lead_image_url: String | Null = js.native
  var next_page_url: String | Null = js.native
  var rendered_pages: Double = js.native
  var title: String | Null = js.native
  var total_pages: Double = js.native
  var url: String = js.native
  var word_count: Double = js.native
}

object ParseResult {
  @scala.inline
  def apply(
    direction: ltr | rtl,
    domain: String,
    rendered_pages: Double,
    total_pages: Double,
    url: String,
    word_count: Double
  ): ParseResult = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], rendered_pages = rendered_pages.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendered_pages(value: Double): Self = this.set("rendered_pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_pages(value: Double): Self = this.set("total_pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWord_count(value: Double): Self = this.set("word_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorNull: Self = this.set("author", null)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setDate_published(value: String): Self = this.set("date_published", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate_publishedNull: Self = this.set("date_published", null)
    @scala.inline
    def setDek(value: String): Self = this.set("dek", value.asInstanceOf[js.Any])
    @scala.inline
    def setDekNull: Self = this.set("dek", null)
    @scala.inline
    def setExcerpt(value: String): Self = this.set("excerpt", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcerptNull: Self = this.set("excerpt", null)
    @scala.inline
    def setLead_image_url(value: String): Self = this.set("lead_image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setLead_image_urlNull: Self = this.set("lead_image_url", null)
    @scala.inline
    def setNext_page_url(value: String): Self = this.set("next_page_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext_page_urlNull: Self = this.set("next_page_url", null)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

