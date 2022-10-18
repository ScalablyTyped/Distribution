package typings.parse5SerializerStream

import typings.node.streamMod.Readable
import typings.parse5.distSerializerMod.SerializerOptions
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("parse5-serializer-stream", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Readable {
    /**
      * Streaming AST node to an HTML serializer. A readable stream.
      *
      * @param node - Node to serialize.
      * @param options - Serialization options.
      */
    def this(node: Node) = this()
    def this(
      node: Node,
      options: SerializerOptions[TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]]
    ) = this()
  }
  
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
  type SerializerStream = Readable
}
