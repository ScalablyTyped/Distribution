package typings.parse5DashPlainDashTextDashConversionDashStream.parse5DashPlainDashTextDashConversionDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("parse5-plain-text-conversion-stream", JSImport.Namespace)
@js.native
class ^[TDocument] () extends PlainTextConversionStream[TDocument]

