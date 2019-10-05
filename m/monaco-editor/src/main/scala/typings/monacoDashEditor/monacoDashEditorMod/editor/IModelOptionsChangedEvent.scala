package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelOptionsChangedEvent extends js.Object {
  val indentSize: Boolean
  val insertSpaces: Boolean
  val tabSize: Boolean
  val trimAutoWhitespace: Boolean
}

object IModelOptionsChangedEvent {
  @scala.inline
  def apply(indentSize: Boolean, insertSpaces: Boolean, tabSize: Boolean, trimAutoWhitespace: Boolean): IModelOptionsChangedEvent = {
    val __obj = js.Dynamic.literal(indentSize = indentSize, insertSpaces = insertSpaces, tabSize = tabSize, trimAutoWhitespace = trimAutoWhitespace)
  
    __obj.asInstanceOf[IModelOptionsChangedEvent]
  }
}

