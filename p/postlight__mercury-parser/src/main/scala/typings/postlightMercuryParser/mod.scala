package typings.postlightMercuryParser

import typings.node.bufferMod.global.Buffer
import typings.postlightMercuryParser.postlightMercuryParserStrings.html
import typings.postlightMercuryParser.postlightMercuryParserStrings.ltr
import typings.postlightMercuryParser.postlightMercuryParserStrings.markdown
import typings.postlightMercuryParser.postlightMercuryParserStrings.rtl
import typings.postlightMercuryParser.postlightMercuryParserStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@postlight/mercury-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchResource(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchResource")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def parse(url: String): js.Promise[ParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParseResult]]
  inline def parse(url: String, options: ParseOptions): js.Promise[ParseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParseResult]]
  
  trait ParseOptions extends StObject {
    
    var contentType: js.UndefOr[html | markdown | text] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var html: js.UndefOr[String | Buffer] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: html | markdown | text): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHtml(value: String | Buffer): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    }
  }
  
  trait ParseResult extends StObject {
    
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
    
    inline def apply(
      direction: ltr | rtl,
      domain: String,
      rendered_pages: Double,
      total_pages: Double,
      url: String,
      word_count: Double
    ): ParseResult = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], rendered_pages = rendered_pages.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any], author = null, content = null, date_published = null, dek = null, excerpt = null, lead_image_url = null, next_page_url = null, title = null)
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorNull: Self = StObject.set(x, "author", null)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setDate_published(value: String): Self = StObject.set(x, "date_published", value.asInstanceOf[js.Any])
      
      inline def setDate_publishedNull: Self = StObject.set(x, "date_published", null)
      
      inline def setDek(value: String): Self = StObject.set(x, "dek", value.asInstanceOf[js.Any])
      
      inline def setDekNull: Self = StObject.set(x, "dek", null)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      inline def setExcerptNull: Self = StObject.set(x, "excerpt", null)
      
      inline def setLead_image_url(value: String): Self = StObject.set(x, "lead_image_url", value.asInstanceOf[js.Any])
      
      inline def setLead_image_urlNull: Self = StObject.set(x, "lead_image_url", null)
      
      inline def setNext_page_url(value: String): Self = StObject.set(x, "next_page_url", value.asInstanceOf[js.Any])
      
      inline def setNext_page_urlNull: Self = StObject.set(x, "next_page_url", null)
      
      inline def setRendered_pages(value: Double): Self = StObject.set(x, "rendered_pages", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWord_count(value: Double): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
    }
  }
}
