package typings.mozillaReadability.mod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A standalone version of the readability library used for Firefox Reader View.
  *
  * Note that isProbablyReaderable() was moved into a separate file in https://github.com/mozilla/readability/commit/2620542dd1e8380220d82afa97a2c283ae636e40
  * and therefore is no longer part of the Readability class.
  */
@JSImport("mozilla-readability", JSImport.Namespace)
@js.native
class ^ protected () extends Readability {
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
  /* CompleteClass */
  override def parse(): ParseResult | Null = js.native
}

