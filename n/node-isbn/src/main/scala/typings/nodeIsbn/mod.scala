package typings.nodeIsbn

import org.scalablytyped.runtime.Shortcut
import typings.axios.mod.AxiosRequestConfig
import typings.nodeIsbn.anon.GOOGLE
import typings.nodeIsbn.anon.SmallThumbnail
import typings.nodeIsbn.mod.isbn.Isbn
import typings.nodeIsbn.nodeIsbnStrings.BOOK
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-isbn", JSImport.Namespace)
  @js.native
  val ^ : Isbn = js.native
  
  type _To = Isbn
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Isbn = ^
  
  object isbn {
    
    trait Book extends StObject {
      
      var authors: js.Array[String]
      
      var categories: js.Array[String]
      
      var description: js.UndefOr[String] = js.undefined
      
      var imageLinks: js.UndefOr[SmallThumbnail] = js.undefined
      
      var industryIdentifiers: js.Array[String]
      
      var infoLink: String
      
      var language: BookLanguage
      
      var pageCount: js.UndefOr[Double] = js.undefined
      
      var previewLink: String
      
      var printType: BOOK
      
      var publishedDate: String
      
      var publisher: String
      
      var title: String
    }
    object Book {
      
      @scala.inline
      def apply(
        authors: js.Array[String],
        categories: js.Array[String],
        industryIdentifiers: js.Array[String],
        infoLink: String,
        language: BookLanguage,
        previewLink: String,
        publishedDate: String,
        publisher: String,
        title: String
      ): Book = {
        val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], industryIdentifiers = industryIdentifiers.asInstanceOf[js.Any], infoLink = infoLink.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], previewLink = previewLink.asInstanceOf[js.Any], printType = "BOOK", publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Book]
      }
      
      @scala.inline
      implicit class BookMutableBuilder[Self <: Book] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value :_*))
        
        @scala.inline
        def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setImageLinks(value: SmallThumbnail): Self = StObject.set(x, "imageLinks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageLinksUndefined: Self = StObject.set(x, "imageLinks", js.undefined)
        
        @scala.inline
        def setIndustryIdentifiers(value: js.Array[String]): Self = StObject.set(x, "industryIdentifiers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndustryIdentifiersVarargs(value: String*): Self = StObject.set(x, "industryIdentifiers", js.Array(value :_*))
        
        @scala.inline
        def setInfoLink(value: String): Self = StObject.set(x, "infoLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguage(value: BookLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
        
        @scala.inline
        def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrintType(value: BOOK): Self = StObject.set(x, "printType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublishedDate(value: String): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodeIsbn.nodeIsbnStrings.en
      - typings.nodeIsbn.nodeIsbnStrings.es
      - typings.nodeIsbn.nodeIsbnStrings.fr
      - typings.nodeIsbn.nodeIsbnStrings.unknown
    */
    trait BookLanguage extends StObject
    object BookLanguage {
      
      @scala.inline
      def en: typings.nodeIsbn.nodeIsbnStrings.en = "en".asInstanceOf[typings.nodeIsbn.nodeIsbnStrings.en]
      
      @scala.inline
      def es: typings.nodeIsbn.nodeIsbnStrings.es = "es".asInstanceOf[typings.nodeIsbn.nodeIsbnStrings.es]
      
      @scala.inline
      def fr: typings.nodeIsbn.nodeIsbnStrings.fr = "fr".asInstanceOf[typings.nodeIsbn.nodeIsbnStrings.fr]
      
      @scala.inline
      def unknown: typings.nodeIsbn.nodeIsbnStrings.unknown = "unknown".asInstanceOf[typings.nodeIsbn.nodeIsbnStrings.unknown]
    }
    
    @js.native
    trait Isbn extends StObject {
      
      var PROVIDER_NAMES: GOOGLE = js.native
      
      /**
        * Provider API that gets chained before `resolve`. If this is specified, the
        * `resolve` fn will honor this order.
        *
        * @param providers - Array of providers. Must be one of more from `isbn.PROVIDER_NAMES`
        *
        * @example
        *
        * ```
        * isbn
        *  .provider([isbn.PROVIDER_NAMES.OPENLIBRARY, isbn.PROVIDER_NAMES.GOOGLE])
        *  .resolve(...)
        * ```
        */
      def provider(providers: js.Array[String]): this.type = js.native
      
      def resolve(isbn: String, callback: ResolveCallback): Unit = js.native
      /**
        * Resolves book info, given an isbn
        * @param isbn
        */
      def resolve(isbn: String, options: AxiosRequestConfig): Unit = js.native
      def resolve(isbn: String, options: AxiosRequestConfig, callback: ResolveCallback): Unit = js.native
      def resolve(isnb: String): js.Promise[Book] = js.native
      @JSName("resolve")
      def resolve_Promise(isnb: String, options: AxiosRequestConfig): js.Promise[Book] = js.native
    }
    
    type ResolveCallback = js.Function2[/* error */ Error | Null, /* book */ Book, Unit]
  }
}
