package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelOptionsChangedEvent extends js.Object {
  val indentSize: Boolean = js.native
  val insertSpaces: Boolean = js.native
  val tabSize: Boolean = js.native
  val trimAutoWhitespace: Boolean = js.native
}

object IModelOptionsChangedEvent {
  @scala.inline
  def apply(indentSize: Boolean, insertSpaces: Boolean, tabSize: Boolean, trimAutoWhitespace: Boolean): IModelOptionsChangedEvent = {
    val __obj = js.Dynamic.literal(indentSize = indentSize.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], trimAutoWhitespace = trimAutoWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelOptionsChangedEvent]
  }
  @scala.inline
  implicit class IModelOptionsChangedEventOps[Self <: IModelOptionsChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndentSize(value: Boolean): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabSize(value: Boolean): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrimAutoWhitespace(value: Boolean): Self = this.set("trimAutoWhitespace", value.asInstanceOf[js.Any])
  }
  
}

