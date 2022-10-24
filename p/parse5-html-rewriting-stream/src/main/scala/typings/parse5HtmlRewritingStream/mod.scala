package typings.parse5HtmlRewritingStream

import typings.parse5HtmlRewritingStream.parse5HtmlRewritingStreamStrings.comment
import typings.parse5HtmlRewritingStream.parse5HtmlRewritingStreamStrings.doctype
import typings.parse5HtmlRewritingStream.parse5HtmlRewritingStreamStrings.endTag
import typings.parse5HtmlRewritingStream.parse5HtmlRewritingStreamStrings.startTag
import typings.parse5HtmlRewritingStream.parse5HtmlRewritingStreamStrings.text
import typings.parse5SaxParser.mod.Comment
import typings.parse5SaxParser.mod.Doctype
import typings.parse5SaxParser.mod.EndTag
import typings.parse5SaxParser.mod.SAXParser
import typings.parse5SaxParser.mod.StartTag
import typings.parse5SaxParser.mod.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse5-html-rewriting-stream", "RewritingStream")
  @js.native
  /** Note: `sourceCodeLocationInfo` is always enabled. */
  open class RewritingStream () extends SAXParser {
    
    /* private */ var _getRawHtml: Any = js.native
    
    /** Emits a serialized comment token into the output stream. */
    def emitComment(token: Comment): Unit = js.native
    
    /** Emits a serialized document type token into the output stream. */
    def emitDoctype(token: Doctype): Unit = js.native
    
    /** Emits a serialized end tag token into the output stream. */
    def emitEndTag(token: EndTag): Unit = js.native
    
    /** Emits a raw HTML string into the output stream. */
    def emitRaw(html: String): Unit = js.native
    
    /** Emits a serialized start tag token into the output stream. */
    def emitStartTag(token: StartTag): Unit = js.native
    
    /** Emits a serialized text token into the output stream. */
    def emitText(param0: Text): Unit = js.native
    
    /** Raised when rewriter encounters a comment. */
    @JSName("on")
    def on_comment(event: comment, listener: js.Function2[/* comment */ Comment, /* rawHtml */ String, Unit]): this.type = js.native
    /** Raised when rewriter encounters a [document type declaration](https://en.wikipedia.org/wiki/Document_type_declaration). */
    @JSName("on")
    def on_doctype(event: doctype, listener: js.Function2[/* doctype */ Doctype, /* rawHtml */ String, Unit]): this.type = js.native
    /** Raised when rewriter encounters an end tag. */
    @JSName("on")
    def on_endTag(event: endTag, listener: js.Function2[/* endTag */ EndTag, /* rawHtml */ String, Unit]): this.type = js.native
    /** Raised when the rewriter encounters a start tag. */
    @JSName("on")
    def on_startTag(event: startTag, listener: js.Function2[/* startTag */ StartTag, /* rawHtml */ String, Unit]): this.type = js.native
    /** Raised when rewriter encounters text content. */
    @JSName("on")
    def on_text(event: text, listener: js.Function2[/* text */ Text, /* rawHtml */ String, Unit]): this.type = js.native
  }
}
