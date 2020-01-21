package typings.parse5HtmlRewritingStream.mod

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
@JSImport("parse5-html-rewriting-stream", JSImport.Namespace)
@js.native
class ^ () extends RewritingStream

