package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://novadocs.panic.com/api-reference/text-document/
trait TextDocument extends js.Object {
  val eol: String
  val isClosed: Boolean
  val isDirty: Boolean
  val isEmpty: Boolean
  val isRemote: Boolean
  val isUntitled: Boolean
  val length: Double
  val path: String | Null
  val syntax: String | Null
  val uri: String
  def getLineRangeForRange(range: Range): Range
  def getTextInRange(range: Range): String
  def onDidChangePath(callback: js.Function2[/* document */ this.type, /* path */ String | Null, Unit]): Unit
  def onDidChangeSyntax(callback: js.Function2[/* document */ this.type, /* syntax */ String | Null, Unit]): Unit
}

object TextDocument {
  @scala.inline
  def apply(
    eol: String,
    getLineRangeForRange: Range => Range,
    getTextInRange: Range => String,
    isClosed: Boolean,
    isDirty: Boolean,
    isEmpty: Boolean,
    isRemote: Boolean,
    isUntitled: Boolean,
    length: Double,
    onDidChangePath: js.Function2[TextDocument, /* path */ String | Null, Unit] => Unit,
    onDidChangeSyntax: js.Function2[TextDocument, /* syntax */ String | Null, Unit] => Unit,
    uri: String,
    path: String = null,
    syntax: String = null
  ): TextDocument = {
    val __obj = js.Dynamic.literal(eol = eol.asInstanceOf[js.Any], getLineRangeForRange = js.Any.fromFunction1(getLineRangeForRange), getTextInRange = js.Any.fromFunction1(getTextInRange), isClosed = isClosed.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isRemote = isRemote.asInstanceOf[js.Any], isUntitled = isUntitled.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onDidChangePath = js.Any.fromFunction1(onDidChangePath), onDidChangeSyntax = js.Any.fromFunction1(onDidChangeSyntax), uri = uri.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocument]
  }
}

