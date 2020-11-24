package typings.parse5PlainTextConversionStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Converts plain text files into HTML document as required by [HTML specification](https://html.spec.whatwg.org/#read-text).
    * A [writable stream](https://nodejs.org/api/stream.html#stream_class_stream_writable).
    *
    * ** NOTE:** This API is available only for Node.js.
    *
    * @example
    * ```js
    *
    * const parse5 = require('parse5');
    * const fs = require('fs');
    *
    * const file = fs.createReadStream('war_and_peace.txt');
    * const converter = new parse5.PlainTextConversionStream();
    *
    * converter.once('finish', () => {
    *     console.log(converter.document.childNodes[1].childNodes[0].tagName); //> 'head'
    * });
    *
    * file.pipe(converter);
    * ```
    */
  type PlainTextConversionStream[TDocument] = typings.parse5ParserStream.mod.^[TDocument]
}
