package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayWidget extends js.Object {
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement = js.native
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String = js.native
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null = js.native
}

object IOverlayWidget {
  @scala.inline
  def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IOverlayWidgetPosition | Null
  ): IOverlayWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IOverlayWidget]
  }
  @scala.inline
  implicit class IOverlayWidgetOps[Self <: IOverlayWidget] (val x: Self) extends AnyVal {
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
    def setGetPosition(value: () => IOverlayWidgetPosition | Null): Self = this.set("getPosition", js.Any.fromFunction0(value))
  }
  
}

