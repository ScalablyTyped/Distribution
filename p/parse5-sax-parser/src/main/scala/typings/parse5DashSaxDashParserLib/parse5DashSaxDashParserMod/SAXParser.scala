package typings
package parse5DashSaxDashParserLib.parse5DashSaxDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait SAXParser
  extends nodeLib.streamMod.Transform {
  /**
       * Raised when parser encounters a comment.
       *
       * @param listener.comment - Comment content.
       */
  @JSName("on")
  def on_comment(
    event: parse5DashSaxDashParserLib.parse5DashSaxDashParserLibStrings.comment,
    listener: js.Function1[
      /* comment */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.CommentToken, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Raised when parser encounters a [document type declaration](https://en.wikipedia.org/wiki/Document_type_declaration).
       *
       * @param listener.doctype - Document type token.
       */
  @JSName("on")
  def on_doctype(
    event: parse5DashSaxDashParserLib.parse5DashSaxDashParserLibStrings.doctype,
    listener: js.Function1[
      /* doctype */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.DoctypeToken, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Raised when parser encounters an end tag.
       *
       * @param listener.endTag - End tag token.
       */
  @JSName("on")
  def on_endTag(
    event: parse5DashSaxDashParserLib.parse5DashSaxDashParserLibStrings.endTag,
    listener: js.Function1[
      /* endTag */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.EndTagToken, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Raised when the parser encounters a start tag.
       *
       * @param listener.startTag - Start tag token.
       */
  @JSName("on")
  def on_startTag(
    event: parse5DashSaxDashParserLib.parse5DashSaxDashParserLibStrings.startTag,
    listener: js.Function1[
      /* startTag */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.StartTagToken, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Raised when parser encounters text content.
       *
       * @param listener.text - Text token.
       */
  @JSName("on")
  def on_text(
    event: parse5DashSaxDashParserLib.parse5DashSaxDashParserLibStrings.text,
    listener: js.Function1[
      /* text */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.TextToken, 
      scala.Unit
    ]
  ): this.type = js.native
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
  def stop(): scala.Unit = js.native
}

