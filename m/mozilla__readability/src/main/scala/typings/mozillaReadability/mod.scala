package typings.mozillaReadability

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mozilla/readability", "Readability")
  @js.native
  open class Readability protected () extends StObject {
    /**
      * ## Usage on the web
      *
      * To parse a document, you must create a new Readability object from a
      * DOM document object, and then call parse(). Here's an example:
      *
      * ```js
      * var article = new Readability(document).parse();
      * ```
      *
      * If you're using Readability on the web, you will likely be able to
      * use a document reference from elsewhere (e.g. fetched via XMLHttpRequest,
      * in a same-origin <iframe> you have access to, etc.).
      *
      * ## Usage from node.js
      *
      * In node.js, you won't generally have a DOM document object. To obtain one, you can use external
      * libraries like [jsdom](https://github.com/tmpvar/jsdom). While this repository contains a parser of
      * its own (`JSDOMParser`), that is restricted to reading XML-compatible markup and therefore we do
      * not recommend it for general use.
      *
      * If you're using `jsdom` to create a DOM object, you should ensure that the page doesn't run (page)
      * scripts (avoid fetching remote resources etc.) as well as passing it the page's URI as the `url`
      * property of the `options` object you pass the `JSDOM` constructor.
      *
      * ```js
      * var JSDOM = require('jsdom').JSDOM;
      * var doc = new JSDOM("<body>Here's a bunch of text</body>", {
      *   url: "https://www.example.com/the-page-i-got-the-source-from",
      * });
      * let reader = new Readability(doc.window.document);
      * let article = reader.parse();
      * ```
      */
    def this(doc: Document) = this()
    def this(doc: Document, options: Options) = this()
    
    /**
      * Runs readability.
      *
      * ## Workflow:
      *
      *  1. Prep the document by removing script tags, css, etc.
      *  2. Build readability's DOM tree.
      *  3. Grab the article content from the current dom tree.
      *  4. Replace the current DOM tree with the new one.
      *  5. Read peacefully.
      *
      * ## Additional notes:
      *
      * Readability's parse() works by modifying the DOM. This removes some
      * elements in the web page. You could avoid this by passing the clone
      * of the document object while creating a Readability object.
      *
      * ```js
      * var documentClone = document.cloneNode(true);
      * var article = new Readability(documentClone).parse();
      * ```
      *
      * The response will be null if the processing failed (https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L2038)
      */
    def parse(): ParseResult | Null = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Minimum number of characters in the extracted textContent in order to
      * consider the article correctly identified. If the threshold is not met then
      * the extraction process will automatically run again with different flags.
      *
      * See implementation details at https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L1208
      *
      * Changed from wordThreshold in https://github.com/mozilla/readability/commit/3ff9a166fb27928f222c4c0722e730eda412658a
      */
    var charThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * parse() removes the class="" attribute from every element in the given
      * subtree, except those that match CLASSES_TO_PRESERVE and
      * the classesToPreserve array from the options object.
      */
    var classesToPreserve: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Control whether log messages are sent to the console
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default Readability will strip all classes from the HTML elements in the
      * processed article. By setting this to `true` the classes will be retained.
      *
      * This is a blanket alternative to `classesToPreserve`.
      *
      * Added in https://github.com/mozilla/readability/commit/2982216913af2c66b0690e88606b03116553ad92
      */
    var keepClasses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set a maximum size on the documents that will be processed. This size is
      * checked before any parsing operations occur. If the number of elements in
      * the document exceeds this threshold then an Error will be thrown.
      *
      * See implementation details at https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L2019
      */
    var maxElemsToParse: js.UndefOr[Double] = js.undefined
    
    var nbTopCandidates: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCharThreshold(value: Double): Self = StObject.set(x, "charThreshold", value.asInstanceOf[js.Any])
      
      inline def setCharThresholdUndefined: Self = StObject.set(x, "charThreshold", js.undefined)
      
      inline def setClassesToPreserve(value: js.Array[String]): Self = StObject.set(x, "classesToPreserve", value.asInstanceOf[js.Any])
      
      inline def setClassesToPreserveUndefined: Self = StObject.set(x, "classesToPreserve", js.undefined)
      
      inline def setClassesToPreserveVarargs(value: String*): Self = StObject.set(x, "classesToPreserve", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setKeepClasses(value: Boolean): Self = StObject.set(x, "keepClasses", value.asInstanceOf[js.Any])
      
      inline def setKeepClassesUndefined: Self = StObject.set(x, "keepClasses", js.undefined)
      
      inline def setMaxElemsToParse(value: Double): Self = StObject.set(x, "maxElemsToParse", value.asInstanceOf[js.Any])
      
      inline def setMaxElemsToParseUndefined: Self = StObject.set(x, "maxElemsToParse", js.undefined)
      
      inline def setNbTopCandidates(value: Double): Self = StObject.set(x, "nbTopCandidates", value.asInstanceOf[js.Any])
      
      inline def setNbTopCandidatesUndefined: Self = StObject.set(x, "nbTopCandidates", js.undefined)
    }
  }
  
  trait ParseResult extends StObject {
    
    /** Author metadata */
    var byline: String
    
    /** HTML string of processed article content */
    var content: String
    
    /** Content direction */
    var dir: String
    
    /** Article description, or short excerpt from the content */
    var excerpt: String
    
    /** Length of an article, in characters */
    var length: Double
    
    /** Article site name */
    var siteName: String
    
    /** non-HTML version of `content`  */
    var textContent: String
    
    /** Article title */
    var title: String
  }
  object ParseResult {
    
    inline def apply(
      byline: String,
      content: String,
      dir: String,
      excerpt: String,
      length: Double,
      siteName: String,
      textContent: String,
      title: String
    ): ParseResult = {
      val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      inline def setByline(value: String): Self = StObject.set(x, "byline", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
