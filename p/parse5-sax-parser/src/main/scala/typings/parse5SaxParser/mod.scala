package typings.parse5SaxParser

import typings.node.nodeStreamMod.Transform
import typings.parse5.commonTokenMod.Attribute
import typings.parse5.commonTokenMod.CharacterToken
import typings.parse5.commonTokenMod.CommentToken
import typings.parse5.commonTokenMod.DoctypeToken
import typings.parse5.commonTokenMod.EOFToken
import typings.parse5.commonTokenMod.Location
import typings.parse5.commonTokenMod.TagToken
import typings.parse5.distTokenizerMod.TokenHandler
import typings.parse5.mod.Tokenizer
import typings.parse5SaxParser.parse5SaxParserStrings.comment
import typings.parse5SaxParser.parse5SaxParserStrings.doctype
import typings.parse5SaxParser.parse5SaxParserStrings.endTag
import typings.parse5SaxParser.parse5SaxParserStrings.startTag
import typings.parse5SaxParser.parse5SaxParserStrings.text
import typings.parse5SaxParser.parserFeedbackSimulatorMod.ParserFeedbackSimulator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse5-sax-parser", "SAXParser")
  @js.native
  /**
    * @param options Parsing options.
    */
  open class SAXParser ()
    extends Transform
       with TokenHandler {
    def this(options: SAXParserOptions) = this()
    
    /* private */ var _emitPendingText: Any = js.native
    
    /* protected */ def _emitToken(eventName: String, token: SaxToken): Unit = js.native
    
    def _final(
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def _transform(
      chunk: String,
      _encoding: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    /* protected */ def _transformChunk(chunk: String): String = js.native
    
    /* protected */ def emitIfListenerExists(eventName: String, token: SaxToken): Boolean = js.native
    
    /* private */ var lastChunkWritten: Any = js.native
    
    /**
      * Base event handler.
      *
      * @param event Name of the event
      * @param handler Event handler
      */
    def on(event: String, handler: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def onCharacter(token: CharacterToken): Unit = js.native
    
    /* CompleteClass */
    override def onComment(token: CommentToken): Unit = js.native
    
    /* CompleteClass */
    override def onDoctype(token: DoctypeToken): Unit = js.native
    
    /* CompleteClass */
    override def onEndTag(token: TagToken): Unit = js.native
    
    /** @internal */
    def onEof(): Unit = js.native
    /* CompleteClass */
    override def onEof(token: EOFToken): Unit = js.native
    
    /* CompleteClass */
    override def onNullCharacter(token: CharacterToken): Unit = js.native
    
    /* CompleteClass */
    override def onStartTag(token: TagToken): Unit = js.native
    
    /* CompleteClass */
    override def onWhitespaceCharacter(token: CharacterToken): Unit = js.native
    
    /** Raised when the parser encounters a comment. */
    @JSName("on")
    def on_comment(event: comment, listener: js.Function1[/* comment */ Comment, Unit]): this.type = js.native
    /** Raised when the parser encounters a [document type declaration](https://en.wikipedia.org/wiki/Document_type_declaration) */
    @JSName("on")
    def on_doctype(event: doctype, listener: js.Function1[/* doctype */ Doctype, Unit]): this.type = js.native
    /** Raised when the parser encounters an end tag. */
    @JSName("on")
    def on_endTag(event: endTag, listener: js.Function1[/* endTag */ EndTag, Unit]): this.type = js.native
    /** Raised when the parser encounters a start tag. */
    @JSName("on")
    def on_startTag(event: startTag, listener: js.Function1[/* startTag */ StartTag, Unit]): this.type = js.native
    /** Raised when the parser encounters text content. */
    @JSName("on")
    def on_text(event: text, listener: js.Function1[/* text */ Text, Unit]): this.type = js.native
    
    /* protected */ var options: SAXParserOptions = js.native
    
    /* protected */ var parserFeedbackSimulator: ParserFeedbackSimulator = js.native
    
    /* private */ var pendingText: Any = js.native
    
    /**
      * Stops parsing. Useful if you want the parser to stop consuming CPU time
      * once you've obtained the desired info from the input stream. Doesn't
      * prevent piping, so that data will flow through the parser as usual.
      *
      * @example
      *
      * ```js
      * const SAXParser = require('parse5-sax-parser');
      * const http = require('http');
      * const fs = require('fs');
      *
      * const file = fs.createWriteStream('google.com.html');
      * const parser = new SAXParser();
      *
      * parser.on('doctype', ({ name, publicId, systemId }) => {
      *     // Process doctype info and stop parsing
      *     ...
      *     parser.stop();
      * });
      *
      * http.get('http://google.com', res => {
      *     // Despite the fact that parser.stop() was called whole
      *     // content of the page will be written to the file
      *     res.pipe(parser).pipe(file);
      * });
      * ```
      */
    def stop(): Unit = js.native
    
    /* private */ var stopped: Any = js.native
    
    /* protected */ var tokenizer: Tokenizer = js.native
  }
  
  trait Comment
    extends StObject
       with SaxToken {
    
    /** Comment text. */
    var text: String
  }
  object Comment {
    
    inline def apply(text: String): Comment = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Doctype
    extends StObject
       with SaxToken {
    
    /** Document type name. */
    var name: String | Null
    
    /** Document type public identifier. */
    var publicId: String | Null
    
    /** Document type system identifier. */
    var systemId: String | Null
  }
  object Doctype {
    
    inline def apply(): Doctype = {
      val __obj = js.Dynamic.literal(name = null, publicId = null, systemId = null)
      __obj.asInstanceOf[Doctype]
    }
    
    extension [Self <: Doctype](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
      
      inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
      
      inline def setSystemIdNull: Self = StObject.set(x, "systemId", null)
    }
  }
  
  trait EndTag
    extends StObject
       with SaxToken {
    
    /** Tag name */
    var tagName: String
  }
  object EndTag {
    
    inline def apply(tagName: String): EndTag = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndTag]
    }
    
    extension [Self <: EndTag](x: Self) {
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait SAXParserOptions extends StObject {
    
    /**
      * Enables source code location information for tokens.
      *
      * When enabled, each token will have a `sourceCodeLocation` property.
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
  
  trait SaxToken extends StObject {
    
    /** Source code location info. Available if location info is enabled via {@link SAXParserOptions}. */
    var sourceCodeLocation: js.UndefOr[Location | Null] = js.undefined
  }
  object SaxToken {
    
    inline def apply(): SaxToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaxToken]
    }
    
    extension [Self <: SaxToken](x: Self) {
      
      inline def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationNull: Self = StObject.set(x, "sourceCodeLocation", null)
      
      inline def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    }
  }
  
  trait StartTag
    extends StObject
       with SaxToken {
    
    /** List of attributes */
    var attrs: js.Array[Attribute]
    
    /** Indicates if the tag is self-closing */
    var selfClosing: Boolean
    
    /** Tag name */
    var tagName: String
  }
  object StartTag {
    
    inline def apply(attrs: js.Array[Attribute], selfClosing: Boolean, tagName: String): StartTag = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartTag]
    }
    
    extension [Self <: StartTag](x: Self) {
      
      inline def setAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attribute*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with SaxToken {
    
    /** Text content. */
    var text: String
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
