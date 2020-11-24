package typings.parse5SaxParser.mod

import typings.node.streamMod.Transform
import typings.parse5SaxParser.parse5SaxParserStrings.comment
import typings.parse5SaxParser.parse5SaxParserStrings.doctype
import typings.parse5SaxParser.parse5SaxParserStrings.endTag
import typings.parse5SaxParser.parse5SaxParserStrings.startTag
import typings.parse5SaxParser.parse5SaxParserStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Streaming [SAX](https://en.wikipedia.org/wiki/Simple_API_for_XML)-style HTML parser.
  * A [transform stream](https://nodejs.org/api/stream.html#stream_class_stream_transform)
  * (which means you can pipe *through* it, see example).
  *
  * ** NOTE:** This API is available only for Node.js.
  *
  * @example
  * ```js
  *
  * const parse5 = require('parse5');
  * const http = require('http');
  * const fs = require('fs');
  *
  * const file = fs.createWriteStream('/home/google.com.html');
  * const parser = new parse5.SAXParser();
  *
  * parser.on('text', text => {
  *    // Handle page text content
  *    ...
  * });
  *
  * http.get('http://google.com', res => {
  *    // SAXParser is the Transform stream, which means you can pipe
  *    // through it. So, you can analyze page content and, e.g., save it
  *    // to the file at the same time:
  *    res.pipe(parser).pipe(file);
  * });
  * ```
  */
@js.native
trait SAXParser extends Transform {
  
  /**
    * Raised when parser encounters a comment.
    *
    * @param listener.comment - Comment content.
    */
  @JSName("on")
  def on_comment(event: comment, listener: js.Function1[/* comment */ CommentToken, Unit]): this.type = js.native
  /**
    * Raised when parser encounters a [document type declaration](https://en.wikipedia.org/wiki/Document_type_declaration).
    *
    * @param listener.doctype - Document type token.
    */
  @JSName("on")
  def on_doctype(event: doctype, listener: js.Function1[/* doctype */ DoctypeToken, Unit]): this.type = js.native
  /**
    * Raised when parser encounters an end tag.
    *
    * @param listener.endTag - End tag token.
    */
  @JSName("on")
  def on_endTag(event: endTag, listener: js.Function1[/* endTag */ EndTagToken, Unit]): this.type = js.native
  /**
    * Raised when the parser encounters a start tag.
    *
    * @param listener.startTag - Start tag token.
    */
  @JSName("on")
  def on_startTag(event: startTag, listener: js.Function1[/* startTag */ StartTagToken, Unit]): this.type = js.native
  /**
    * Raised when parser encounters text content.
    *
    * @param listener.text - Text token.
    */
  @JSName("on")
  def on_text(event: text, listener: js.Function1[/* text */ TextToken, Unit]): this.type = js.native
  
  /**
    * Stops parsing. Useful if you want the parser to stop consuming CPU time once you've obtained the desired info
    * from the input stream. Doesn't prevent piping, so that data will flow through the parser as usual.
    *
    * @example
    * ```js
    *
    * const parse5 = require('parse5');
    * const http = require('http');
    * const fs = require('fs');
    *
    * const file = fs.createWriteStream('google.com.html');
    * const parser = new parse5.SAXParser();
    *
    * parser.on('doctype', (name, publicId, systemId) => {
    *    // Process doctype info ans stop parsing
    *    ...
    *    parser.stop();
    * });
    *
    * http.get('http://google.com', res => {
    *    // Despite the fact that parser.stop() was called whole
    *    // content of the page will be written to the file
    *    res.pipe(parser).pipe(file);
    * });
    * ```
    */
  def stop(): Unit = js.native
}
