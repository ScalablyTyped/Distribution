package typings
package parse5DashParserDashStreamLib.parse5DashParserDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class namespaced[TDocument] () extends ParserStream[TDocument] {
  /**
       * @param options - Parsing options.
       */
  def this(options: parse5Lib.parse5Mod.ParserOptions) = this()
}

