package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/text-editor/
@js.native
trait TextEditor extends js.Object {
  val document: TextDocument = js.native
  val selectedRange: Range = js.native
  val selectedRanges: js.Array[Range] = js.native
  val selectedText: String = js.native
  val softTabs: Boolean = js.native
  val tabLength: Double = js.native
  val tabText: String = js.native
  def addSelectionForRange(range: Range): Unit = js.native
  def edit(callback: js.Function1[/* edit */ TextEditorEdit, Unit]): js.Promise[Unit] = js.native
  def edit(callback: js.Function1[/* edit */ TextEditorEdit, Unit], options: js.Any): js.Promise[Unit] = js.native
  def getLineRangeForRange(range: Range): String = js.native
  def getTextInRange(range: Range): String = js.native
  def insert(string: String): js.Promise[Unit] = js.native
  def onDidChange(callback: js.Function1[/* textEditor */ this.type, Unit]): Unit = js.native
  def onDidChangeSelection(callback: js.Function1[/* textEditor */ this.type, Unit]): Unit = js.native
  def onDidDestroy(callback: js.Function1[/* textEditor */ this.type, Unit]): Unit = js.native
  def onDidSave(callback: js.Function1[/* textEditor */ this.type, Unit]): Unit = js.native
  def onDidStopChanging(callback: js.Function1[/* textEditor */ this.type, Unit]): Unit = js.native
  def onWillSave(callback: js.Function1[/* textEditor */ this.type, Unit]): Unit = js.native
  def save(): Unit = js.native
  def scrollToCursorPosition(): Unit = js.native
  def scrollToPosition(position: Double): Unit = js.native
  def selectAll(): Unit = js.native
  def selectDown(rowCount: Double): Unit = js.native
  def selectLeft(rowCount: Double): Unit = js.native
  def selectLinesContainingCursors(): Unit = js.native
  def selectRight(rowCount: Double): Unit = js.native
  def selectToBeginningOfLine(): Unit = js.native
  def selectToBeginningOfWord(): Unit = js.native
  def selectToBottom(): Unit = js.native
  def selectToEndOfLine(): Unit = js.native
  def selectToEndOfWord(): Unit = js.native
  def selectToPosition(position: Double): Unit = js.native
  def selectToTop(): Unit = js.native
  def selectUp(rowCount: Double): Unit = js.native
  def selectWordsContainingCursors(): Unit = js.native
  def symbolAtPosition(position: Double): NovaSymbol | Null = js.native
  def symbolsForSelectedRanges(): js.Array[NovaSymbol | Null] = js.native
}

