package typings.openui5.sap.m.routing

import typings.openui5.sap.ui.base.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteMatchedHandler extends js.Object {
  /**
    * Removes the routeMatchedHandler from the Router
    * @returns for chaining
    */
  def destroy(): RouteMatchedHandler
  /**
    * Gets if a navigation should close dialogs
    * @returns a flag indication if dialogs will be closed
    */
  def getCloseDialogs(): Boolean
  /**
    * Returns a metadata object for class sap.m.routing.RouteMatchedHandler.
    * @returns Metadata object describing this class
    */
  def getMetadata(): Metadata
  /**
    * Sets if a navigation should close dialogs
    * @param bCloseDialogs close dialogs if true
    * @returns for chaining
    */
  def setCloseDialogs(bCloseDialogs: Boolean): RouteMatchedHandler
}

object RouteMatchedHandler {
  @scala.inline
  def apply(
    destroy: () => RouteMatchedHandler,
    getCloseDialogs: () => Boolean,
    getMetadata: () => Metadata,
    setCloseDialogs: Boolean => RouteMatchedHandler
  ): RouteMatchedHandler = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getCloseDialogs = js.Any.fromFunction0(getCloseDialogs), getMetadata = js.Any.fromFunction0(getMetadata), setCloseDialogs = js.Any.fromFunction1(setCloseDialogs))
    __obj.asInstanceOf[RouteMatchedHandler]
  }
}

