package typings.parse5SerializerStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Streaming AST node to an HTML serializer.
    * A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable).
    *
    * ** NOTE:** This API is available only for Node.js.
    *
    * @example
    * ```js
    *
    * const parse5 = require('parse5');
    * const fs = require('fs');
    *
    * const file = fs.createWriteStream('/home/index.html');
    *
    * // Serializes the parsed document to HTML and writes it to the file.
    * const document = parse5.parse('<body>Who is John Galt?</body>');
    * const serializer = new parse5.SerializerStream(document);
    *
    * serializer.pipe(file);
    * ```
    */
  type SerializerStream = typings.node.streamMod.Readable
}
