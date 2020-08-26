package typings.novaEditorNode

import typings.novaEditorNode.anon.AllowDirectories
import typings.novaEditorNode.anon.Buttons
import typings.novaEditorNode.anon.Label
import typings.novaEditorNode.anon.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/workspace/
@js.native
trait Workspace extends js.Object {
  val activeTextEditor: TextEditor = js.native
  val config: Configuration = js.native
  val path: String | Null = js.native
  val textDocuments: js.Array[TextDocument] = js.native
  val textEditors: js.Array[TextEditor] = js.native
  def contains(path: String): Boolean = js.native
  def onDidAddTextEditor(callback: js.Function1[/* editor */ TextEditor, Unit]): Unit = js.native
  def onDidChangePath(callback: js.Function1[/* newPath */ TextEditor, Unit]): Unit = js.native
  def onDidOpenTextDocument(callback: js.Function1[/* textDocument */ TextDocument, Unit]): Unit = js.native
  def openConfig(): Unit = js.native
  def openConfig(identifier: String): Unit = js.native
  def openFile(uri: String): js.Promise[TextEditor | Null] = js.native
  def relativizePath(path: String): String = js.native
  def showActionPanel(message: String): Unit = js.native
  def showActionPanel(
    message: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* buttonIndex */ Double | Null, Unit]
  ): Unit = js.native
  def showActionPanel(message: String, options: Buttons): Unit = js.native
  def showActionPanel(message: String, options: Buttons, callback: js.Function1[/* buttonIndex */ Double | Null, Unit]): Unit = js.native
  def showChoicePalette(choices: js.Array[String]): Unit = js.native
  def showChoicePalette(
    choices: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* choice */ String | Null, /* choiceIndex */ Double | Null, Unit]
  ): Unit = js.native
  def showChoicePalette(choices: js.Array[String], options: Placeholder): Unit = js.native
  def showChoicePalette(
    choices: js.Array[String],
    options: Placeholder,
    callback: js.Function2[/* choice */ String | Null, /* choiceIndex */ Double | Null, Unit]
  ): Unit = js.native
  def showErrorMessage(message: String): Unit = js.native
  def showFileChooser(message: String): Unit = js.native
  def showFileChooser(
    message: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* paths */ js.Array[String] | Null, Unit]
  ): Unit = js.native
  def showFileChooser(message: String, options: AllowDirectories): Unit = js.native
  def showFileChooser(
    message: String,
    options: AllowDirectories,
    callback: js.Function1[/* paths */ js.Array[String] | Null, Unit]
  ): Unit = js.native
  def showInformativeMessage(message: String): Unit = js.native
  def showInputPalette(message: String): Unit = js.native
  def showInputPalette(
    message: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Unit = js.native
  def showInputPalette(message: String, options: Placeholder): Unit = js.native
  def showInputPalette(message: String, options: Placeholder, callback: js.Function1[/* value */ String | Null, Unit]): Unit = js.native
  def showInputPanel(message: String): Unit = js.native
  def showInputPanel(
    message: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Unit = js.native
  def showInputPanel(message: String, options: Label): Unit = js.native
  def showInputPanel(message: String, options: Label, callback: js.Function1[/* value */ String | Null, Unit]): Unit = js.native
  def showWarningMessage(message: String): Unit = js.native
}

