package typings.parse5SaxParser

import typings.node.streamMod.Transform
import typings.parse5.mod.Attribute
import typings.parse5.mod.Location
import typings.parse5.mod.StartTagLocation
import typings.parse5SaxParser.parse5SaxParserStrings.comment
import typings.parse5SaxParser.parse5SaxParserStrings.doctype
import typings.parse5SaxParser.parse5SaxParserStrings.endTag
import typings.parse5SaxParser.parse5SaxParserStrings.startTag
import typings.parse5SaxParser.parse5SaxParserStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  trait CommentToken extends StObject {
    
    /**
      * Comment source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.undefined
    
    /**
      * Comment text.
      */
    var text: String
  }
  object CommentToken {
    
    inline def apply(text: String): CommentToken = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentToken]
    }
    
    extension [Self <: CommentToken](x: Self) {
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait DoctypeToken extends StObject {
    
    /**
      * Document type name.
      */
    var name: String
    
    /**
      * Document type public identifier.
      */
    var publicId: String
    
    /**
      * Document type declaration source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.undefined
    
    /**
      * Document type system identifier.
      */
    var systemId: String
  }
  object DoctypeToken {
    
    inline def apply(name: String, publicId: String, systemId: String): DoctypeToken = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoctypeToken]
    }
    
    extension [Self <: DoctypeToken](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndTagToken extends StObject {
    
    /**
      * End tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.undefined
    
    /**
      * Tag name.
      */
    var tagName: String
  }
  object EndTagToken {
    
    inline def apply(tagName: String): EndTagToken = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndTagToken]
    }
    
    extension [Self <: EndTagToken](x: Self) {
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  trait SAXParserOptions extends StObject {
    
    /**
      * Enables source code location information for the tokens.
      * When enabled, each token event handler will receive {@link Location} (or {@link StartTagLocation})
      * object as its last argument.
      */
    var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined
  }
  object SAXParserOptions {
    
    inline def apply(): SAXParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SAXParserOptions]
    }
    
    extension [Self <: SAXParserOptions](x: Self) {
      
      inline def setSourceCodeLocationInfo(value: Boolean): Self = StObject.set(x, "sourceCodeLocationInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationInfoUndefined: Self = StObject.set(x, "sourceCodeLocationInfo", js.undefined)
    }
  }
  
  trait StartTagToken extends StObject {
    
    /**
      * List of attributes.
      */
    var attrs: js.Array[Attribute]
    
    /**
      * Indicates if the tag is self-closing.
      */
    var selfClosing: Boolean
    
    /**
      * Start tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[StartTagLocation] = js.undefined
    
    /**
      * Tag name.
      */
    var tagName: String
  }
  object StartTagToken {
    
    inline def apply(attrs: js.Array[Attribute], selfClosing: Boolean, tagName: String): StartTagToken = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartTagToken]
    }
    
    extension [Self <: StartTagToken](x: Self) {
      
      inline def setAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attribute*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocation(value: StartTagLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextToken extends StObject {
    
    /**
      * Text content source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.undefined
    
    /**
      * Text content.
      */
    var text: String
  }
  object TextToken {
    
    inline def apply(text: String): TextToken = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextToken]
    }
    
    extension [Self <: TextToken](x: Self) {
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
