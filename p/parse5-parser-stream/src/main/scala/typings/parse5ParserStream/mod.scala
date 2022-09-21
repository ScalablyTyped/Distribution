package typings.parse5ParserStream

import typings.node.nodeStreamMod.Writable
import typings.parse5.distParserMod.ParserOptions
import typings.parse5.mod.Parser
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapterTypeMap
import typings.parse5ParserStream.parse5ParserStreamStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse5-parser-stream", "ParserStream")
  @js.native
  /**
    * @param options Parsing options.
    */
  open class ParserStream[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] () extends Writable {
    def this(options: ParserOptions[T]) = this()
    def this(options: Unit, parser: Parser[T]) = this()
    def this(options: ParserOptions[T], parser: Parser[T]) = this()
    
    def _write(chunk: String, _encoding: String, callback: js.Function0[Unit]): Unit = js.native
    
    /** The resulting document node. */
    def document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = js.native
    
    def end(): Any = js.native
    def end(chunk: Any): Any = js.native
    def end(chunk: Any, encoding: Any): Any = js.native
    def end(chunk: Any, encoding: Any, callback: Any): Any = js.native
    def end(chunk: Any, encoding: Unit, callback: Any): Any = js.native
    def end(chunk: Unit, encoding: Any): Any = js.native
    def end(chunk: Unit, encoding: Any, callback: Any): Any = js.native
    def end(chunk: Unit, encoding: Unit, callback: Any): Any = js.native
    
    def getFragment(): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = js.native
    
    /* private */ var lastChunkWritten: Any = js.native
    
    /**
      * Base event handler.
      *
      * @param event Name of the event
      * @param handler Event handler
      */
    def on(event: String, handler: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /**
      * Raised when parser encounters a `<script>` element. If this event has listeners, parsing will be suspended once
      * it is emitted. So, if `<script>` has the `src` attribute, you can fetch it, execute and then resume parsing just
      * like browsers do.
      *
      * @example
      *
      * ```js
      * const ParserStream = require('parse5-parser-stream');
      * const http = require('http');
      *
      * const parser = new ParserStream();
      *
      * parser.on('script', (scriptElement, documentWrite, resume) => {
      *     const src = scriptElement.attrs.find(({ name }) => name === 'src').value;
      *
      *     http.get(src, res => {
      *         // Fetch the script content, execute it with DOM built around `parser.document` and
      *         // `document.write` implemented using `documentWrite`.
      *         ...
      *         // Then resume parsing.
      *         resume();
      *     });
      * });
      *
      * parser.end('<script src="example.com/script.js"></script>');
      * ```
      *
      * @param event Name of the event
      * @param handler
      */
    def on(
      event: script,
      handler: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* scriptElement */ js.Any, 
          /* documentWrite */ js.Function1[/* html */ String, Unit], 
          /* resume */ js.Function0[Unit], 
          Unit
        ]
    ): Unit = js.native
    
    var parser: Parser[T] = js.native
    
    /* private */ var pendingHtmlInsertions: Any = js.native
    
    /* private */ var writeCallback: Any = js.native
  }
  /* static members */
  object ParserStream {
    
    @JSImport("parse5-parser-stream", "ParserStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFragmentStream[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](): ParserStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentStream")().asInstanceOf[ParserStream[T]]
    inline def getFragmentStream[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Null, options: ParserOptions[T]): ParserStream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentStream")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParserStream[T]]
    inline def getFragmentStream[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Unit, options: ParserOptions[T]): ParserStream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentStream")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParserStream[T]]
    
    inline def getFragmentStream_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): ParserStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentStream")(fragmentContext.asInstanceOf[js.Any]).asInstanceOf[ParserStream[T]]
    inline def getFragmentStream_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      options: ParserOptions[T]
    ): ParserStream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentStream")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParserStream[T]]
  }
}
