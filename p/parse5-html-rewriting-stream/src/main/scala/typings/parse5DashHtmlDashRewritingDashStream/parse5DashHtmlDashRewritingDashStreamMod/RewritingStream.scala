package typings.parse5DashHtmlDashRewritingDashStream.parse5DashHtmlDashRewritingDashStreamMod

import typings.node.streamMod.Transform
import typings.parse5DashHtmlDashRewritingDashStream.parse5DashHtmlDashRewritingDashStreamStrings.comment
import typings.parse5DashHtmlDashRewritingDashStream.parse5DashHtmlDashRewritingDashStreamStrings.doctype
import typings.parse5DashHtmlDashRewritingDashStream.parse5DashHtmlDashRewritingDashStreamStrings.endTag
import typings.parse5DashHtmlDashRewritingDashStream.parse5DashHtmlDashRewritingDashStreamStrings.startTag
import typings.parse5DashHtmlDashRewritingDashStream.parse5DashHtmlDashRewritingDashStreamStrings.text
import typings.parse5DashSaxDashParser.parse5DashSaxDashParserMod.CommentToken
import typings.parse5DashSaxDashParser.parse5DashSaxDashParserMod.DoctypeToken
import typings.parse5DashSaxDashParser.parse5DashSaxDashParserMod.EndTagToken
import typings.parse5DashSaxDashParser.parse5DashSaxDashParserMod.StartTagToken
import typings.parse5DashSaxDashParser.parse5DashSaxDashParserMod.TextToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Streaming SAX-style HTML rewriter. A transform stream (which means you can
  * pipe through it, see example). Rewriter uses raw source representation of
  * tokens if they are not modified by the user, therefore resulting HTML is
  * not affected by parser error-recovery mechanisms as in the classical
  * parsing-serialization roundtrip.
  */
@js.native
trait RewritingStream extends Transform {
  /**
    * Emits serialized comment token into the output stream.
    */
  def emitComment(text: CommentToken): Unit = js.native
  /**
    * Emits serialized document type token into the output stream.
    */
  def emitDoctype(text: DoctypeToken): Unit = js.native
  /**
    * Emits serialized end tag token into the output stream.
    */
  def emitEndTag(endTag: EndTagToken): Unit = js.native
  /**
    * Emits raw HTML string into the output stream.
    */
  def emitRaw(html: String): Unit = js.native
  /**
    * Emits serialized start tag token into the output stream.
    */
  def emitStartTag(startTag: StartTagToken): Unit = js.native
  /**
    * Emits serialized text token into the output stream.
    */
  def emitText(text: TextToken): Unit = js.native
  /**
    * Raised when rewriter encounters a comment.
    */
  @JSName("on")
  def on_comment(`type`: comment, callback: js.Function2[/* comment */ CommentToken, /* rawHtml */ String, Unit]): this.type = js.native
  /**
    * Raised when rewriter encounters a document type declaration.
    */
  @JSName("on")
  def on_doctype(`type`: doctype, callback: js.Function2[/* doctype */ DoctypeToken, /* rawHtml */ String, Unit]): this.type = js.native
  /**
    * Raised when rewriter encounters an end tag.
    */
  @JSName("on")
  def on_endTag(`type`: endTag, callback: js.Function2[/* endTag */ EndTagToken, /* rawHtml */ String, Unit]): this.type = js.native
  /**
    * Raised when the rewriter encounters a start tag.
    */
  @JSName("on")
  def on_startTag(`type`: startTag, callback: js.Function2[/* startTag */ StartTagToken, /* rawHtml */ String, Unit]): this.type = js.native
  /**
    * Raised when rewriter encounters text content.
    */
  @JSName("on")
  def on_text(`type`: text, callback: js.Function2[/* text */ TextToken, /* rawHtml */ String, Unit]): this.type = js.native
}

