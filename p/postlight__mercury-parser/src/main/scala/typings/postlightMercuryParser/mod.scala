package typings.postlightMercuryParser

import typings.node.Buffer
import typings.postlightMercuryParser.postlightMercuryParserStrings.html
import typings.postlightMercuryParser.postlightMercuryParserStrings.ltr
import typings.postlightMercuryParser.postlightMercuryParserStrings.markdown
import typings.postlightMercuryParser.postlightMercuryParserStrings.rtl
import typings.postlightMercuryParser.postlightMercuryParserStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@postlight/mercury-parser", "fetchResource")
  @js.native
  def fetchResource(url: String): js.Promise[String] = js.native
  
  @JSImport("@postlight/mercury-parser", "parse")
  @js.native
  def parse(url: String): js.Promise[ParseResult] = js.native
  @JSImport("@postlight/mercury-parser", "parse")
  @js.native
  def parse(url: String, options: ParseOptions): js.Promise[ParseResult] = js.native
  
  @js.native
  trait ParseOptions extends StObject {
    
    var contentType: js.UndefOr[html | markdown | text] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var html: js.UndefOr[String | Buffer] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: html | markdown | text): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHtml(value: String | Buffer): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    }
  }
  
  @js.native
  trait ParseResult extends StObject {
    
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
    implicit class ParseResultMutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorNull: Self = StObject.set(x, "author", null)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setDate_published(value: String): Self = StObject.set(x, "date_published", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_publishedNull: Self = StObject.set(x, "date_published", null)
      
      @scala.inline
      def setDek(value: String): Self = StObject.set(x, "dek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDekNull: Self = StObject.set(x, "dek", null)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcerptNull: Self = StObject.set(x, "excerpt", null)
      
      @scala.inline
      def setLead_image_url(value: String): Self = StObject.set(x, "lead_image_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLead_image_urlNull: Self = StObject.set(x, "lead_image_url", null)
      
      @scala.inline
      def setNext_page_url(value: String): Self = StObject.set(x, "next_page_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_page_urlNull: Self = StObject.set(x, "next_page_url", null)
      
      @scala.inline
      def setRendered_pages(value: Double): Self = StObject.set(x, "rendered_pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWord_count(value: Double): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
    }
  }
}
