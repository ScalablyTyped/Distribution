package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayWidget extends js.Object {
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null
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
}

