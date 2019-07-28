package typings.openui5.sapNs.mNs.routingNs

import typings.openui5.sapNs.uiNs.baseNs.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.routing.TargetHandler")
@js.native
class TargetHandler protected () extends js.Object {
  /**
    * Instantiates a TargetHandler, a class used for closing dialogs and showing transitions in
    * NavContainers when targets are displayed.<br/><b>You should not create an own instance of this
    * class.</b> It will be created when using {@link sap.m.routing.Router} or {@link
    * sap.m.routing.Targets}.You may use the {@link #setCloseDialogs} function to specify if dialogs
    * should be closed on displaying other views.
    * @param closeDialogs the default is true - will close all open dialogs before navigating, if set to
    * true. If set to false it will just navigate without closing dialogs.
    */
  def this(closeDialogs: Boolean) = this()
  /**
    * Gets if a navigation should close dialogs
    * @returns a flag indication if dialogs will be closed
    */
  def getCloseDialogs(): Boolean = js.native
  /**
    * Returns a metadata object for class sap.m.routing.TargetHandler.
    * @returns Metadata object describing this class
    */
  def getMetadata(): Metadata = js.native
  /**
    * Sets if a navigation should close dialogs
    * @param bCloseDialogs close dialogs if true
    * @returns for chaining
    */
  def setCloseDialogs(bCloseDialogs: Boolean): TargetHandler = js.native
}

