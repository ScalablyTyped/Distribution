package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContentWidget extends js.Object {
  /**
    * Render this content widget in a location where it could overflow the editor's view dom node.
    */
  var allowEditorOverflow: js.UndefOr[Boolean] = js.native
  var suppressMouseDown: js.UndefOr[Boolean] = js.native
  /**
    * Get the dom node of the content widget.
    */
  def getDomNode(): HTMLElement = js.native
  /**
    * Get a unique identifier of the content widget.
    */
  def getId(): String = js.native
  /**
    * Get the placement of the content widget.
    * If null is returned, the content widget will be placed off screen.
    */
  def getPosition(): IContentWidgetPosition | Null = js.native
}

object IContentWidget {
  @scala.inline
  def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IContentWidgetPosition | Null
  ): IContentWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IContentWidget]
  }
  @scala.inline
  implicit class IContentWidgetOps[Self <: IContentWidget] (val x: Self) extends AnyVal {
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
    def setGetDomNode(value: () => HTMLElement): Self = this.set("getDomNode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosition(value: () => IContentWidgetPosition | Null): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setAllowEditorOverflow(value: Boolean): Self = this.set("allowEditorOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditorOverflow: Self = this.set("allowEditorOverflow", js.undefined)
    @scala.inline
    def setSuppressMouseDown(value: Boolean): Self = this.set("suppressMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMouseDown: Self = this.set("suppressMouseDown", js.undefined)
  }
  
}

