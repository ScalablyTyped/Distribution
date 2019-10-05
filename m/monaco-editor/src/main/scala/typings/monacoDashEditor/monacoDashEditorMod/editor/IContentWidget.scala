package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentWidget extends js.Object {
  /**
    * Render this content widget in a location where it could overflow the editor's view dom node.
    */
  var allowEditorOverflow: js.UndefOr[Boolean] = js.undefined
  var suppressMouseDown: js.UndefOr[Boolean] = js.undefined
  /**
    * Get the dom node of the content widget.
    */
  def getDomNode(): HTMLElement
  /**
    * Get a unique identifier of the content widget.
    */
  def getId(): String
  /**
    * Get the placement of the content widget.
    * If null is returned, the content widget will be placed off screen.
    */
  def getPosition(): IContentWidgetPosition | Null
}

object IContentWidget {
  @scala.inline
  def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IContentWidgetPosition | Null,
    allowEditorOverflow: js.UndefOr[Boolean] = js.undefined,
    suppressMouseDown: js.UndefOr[Boolean] = js.undefined
  ): IContentWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    if (!js.isUndefined(allowEditorOverflow)) __obj.updateDynamic("allowEditorOverflow")(allowEditorOverflow)
    if (!js.isUndefined(suppressMouseDown)) __obj.updateDynamic("suppressMouseDown")(suppressMouseDown)
    __obj.asInstanceOf[IContentWidget]
  }
}

