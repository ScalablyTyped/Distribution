package typings
package parse5DashHtmlDashRewritingDashStreamLib.parse5DashHtmlDashRewritingDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RewritingStream
  extends nodeLib.streamMod.Transform {
  /**
    * Emits serialized comment token into the output stream.
    */
  def emitComment(text: parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.CommentToken): scala.Unit = js.native
  /**
    * Emits serialized document type token into the output stream.
    */
  def emitDoctype(text: parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.DoctypeToken): scala.Unit = js.native
  /**
    * Emits serialized end tag token into the output stream.
    */
  def emitEndTag(endTag: parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.EndTagToken): scala.Unit = js.native
  /**
    * Emits raw HTML string into the output stream.
    */
  def emitRaw(html: java.lang.String): scala.Unit = js.native
  /**
    * Emits serialized start tag token into the output stream.
    */
  def emitStartTag(startTag: parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.StartTagToken): scala.Unit = js.native
  /**
    * Emits serialized text token into the output stream.
    */
  def emitText(text: parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.TextToken): scala.Unit = js.native
  /**
    * Raised when rewriter encounters a comment.
    */
  @JSName("on")
  def on_comment(
    `type`: parse5DashHtmlDashRewritingDashStreamLib.parse5DashHtmlDashRewritingDashStreamLibStrings.comment,
    callback: js.Function2[
      /* comment */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.CommentToken, 
      /* rawHtml */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Raised when rewriter encounters a document type declaration.
    */
  @JSName("on")
  def on_doctype(
    `type`: parse5DashHtmlDashRewritingDashStreamLib.parse5DashHtmlDashRewritingDashStreamLibStrings.doctype,
    callback: js.Function2[
      /* doctype */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.DoctypeToken, 
      /* rawHtml */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Raised when rewriter encounters an end tag.
    */
  @JSName("on")
  def on_endTag(
    `type`: parse5DashHtmlDashRewritingDashStreamLib.parse5DashHtmlDashRewritingDashStreamLibStrings.endTag,
    callback: js.Function2[
      /* endTag */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.EndTagToken, 
      /* rawHtml */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Raised when the rewriter encounters a start tag.
    */
  @JSName("on")
  def on_startTag(
    `type`: parse5DashHtmlDashRewritingDashStreamLib.parse5DashHtmlDashRewritingDashStreamLibStrings.startTag,
    callback: js.Function2[
      /* startTag */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.StartTagToken, 
      /* rawHtml */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Raised when rewriter encounters text content.
    */
  @JSName("on")
  def on_text(
    `type`: parse5DashHtmlDashRewritingDashStreamLib.parse5DashHtmlDashRewritingDashStreamLibStrings.text,
    callback: js.Function2[
      /* text */ parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs.TextToken, 
      /* rawHtml */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
}

