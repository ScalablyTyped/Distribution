package typings.openui5.sap.m.routing

import typings.openui5.sap.ui.base.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHandler extends js.Object {
  /**
    * Gets if a navigation should close dialogs
    * @returns a flag indication if dialogs will be closed
    */
  def getCloseDialogs(): Boolean
  /**
    * Returns a metadata object for class sap.m.routing.TargetHandler.
    * @returns Metadata object describing this class
    */
  def getMetadata(): Metadata
  /**
    * Sets if a navigation should close dialogs
    * @param bCloseDialogs close dialogs if true
    * @returns for chaining
    */
  def setCloseDialogs(bCloseDialogs: Boolean): TargetHandler
}

object TargetHandler {
  @scala.inline
  def apply(
    getCloseDialogs: () => Boolean,
    getMetadata: () => Metadata,
    setCloseDialogs: Boolean => TargetHandler
  ): TargetHandler = {
    val __obj = js.Dynamic.literal(getCloseDialogs = js.Any.fromFunction0(getCloseDialogs), getMetadata = js.Any.fromFunction0(getMetadata), setCloseDialogs = js.Any.fromFunction1(setCloseDialogs))
    __obj.asInstanceOf[TargetHandler]
  }
}

