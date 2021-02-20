package typings.parse5ParserStream

import typings.node.streamMod.Writable
import typings.parse5.mod.Element
import typings.parse5.mod.ParserOptions
import typings.parse5ParserStream.parse5ParserStreamStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Streaming HTML parser with scripting support.
    * A [writable stream](https://nodejs.org/api/stream.html#stream_class_stream_writable).
    *
    * ** NOTE:** This API is available only for Node.js.
    *
    * @example
    * ```js
    *
    * const parse5 = require('parse5');
    * const http = require('http');
    *
    * // Fetch the page content and obtain it's <head> node
    * http.get('http://inikulin.github.io/parse5/', res => {
    *    const parser = new parse5.ParserStream();
    *
    *    parser.once('finish', () => {
    *        console.log(parser.document.childNodes[1].childNodes[0].tagName); //> 'head'
    *    });
    *
    *    res.pipe(parser);
    * });
    * ```
    */
  @JSImport("parse5-parser-stream", JSImport.Namespace)
  @js.native
  /**
    * @param options - Parsing options.
    */
  class ^[TDocument] () extends ParserStream[TDocument] {
    def this(options: ParserOptions) = this()
  }
  
  /**
    * Streaming HTML parser with scripting support.
    * A [writable stream](https://nodejs.org/api/stream.html#stream_class_stream_writable).
    *
    * ** NOTE:** This API is available only for Node.js.
    *
    * @example
    * ```js
    *
    * const parse5 = require('parse5');
    * const http = require('http');
    *
    * // Fetch the page content and obtain it's <head> node
    * http.get('http://inikulin.github.io/parse5/', res => {
    *    const parser = new parse5.ParserStream();
    *
    *    parser.once('finish', () => {
    *        console.log(parser.document.childNodes[1].childNodes[0].tagName); //> 'head'
    *    });
    *
    *    res.pipe(parser);
    * });
    * ```
    */
  @js.native
  trait ParserStream[TDocument] extends Writable {
    
    /**
      * The resulting document node.
      */
    var document: TDocument = js.native
    
    /**
      * Raised when parser encounters a `<script>` element.
      * If this event has listeners, parsing will be suspended once it is emitted.
      * So, if `<script>` has the `src` attribute, you can fetch it, execute and then resume parsing just like browsers do.
      *
      * @param listener.scriptElement - The script element that caused the event.
      * @param listener.documentWrite - Write additional `html` at the current parsing position. Suitable for implementing the DOM `document.write` and `document.writeln` methods.
      * @param listener.documentWrite.html - HTML to write.
      * @param listener.resume - Resumes parsing.
      *
      * @example
      * ```js
      *
      * const parse = require('parse5');
      * const http = require('http');
      *
      * const parser = new parse5.ParserStream();
      *
      * parser.on('script', (scriptElement, documentWrite, resume) => {
      *     const src = parse5.treeAdapters.default.getAttrList(scriptElement)[0].value;
      *
      *     http.get(src, res => {
      *        // Fetch the script content, execute it with DOM built around `parser.document` and
      *        // `document.write` implemented using `documentWrite`.
      *        ...
      *        // Then resume parsing.
      *        resume();
      *     });
      * });
      *
      * parser.end('<script src="example.com/script.js"></script>');
      * ```
      */
    @JSName("on")
    def on_script(
      event: script,
      listener: js.Function3[
          /* scriptElement */ Element, 
          /* documentWrite */ js.Function1[/* html */ String, Unit], 
          /* resume */ js.Function0[Unit], 
          Unit
        ]
    ): this.type = js.native
  }
}
