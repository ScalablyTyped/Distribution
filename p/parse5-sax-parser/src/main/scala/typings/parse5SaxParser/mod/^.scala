package typings.parse5SaxParser.mod

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
@JSImport("parse5-sax-parser", JSImport.Namespace)
@js.native
/**
  * @param options - Parsing options.
  */
class ^ () extends SAXParser {
  def this(options: SAXParserOptions) = this()
}
