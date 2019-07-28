package typings.openui5.sapNs.mNs.routingNs

import typings.openui5.sapNs.uiNs.baseNs.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.routing.RouteMatchedHandler")
@js.native
class RouteMatchedHandler protected () extends js.Object {
  /**
    * Instantiates a RouteMatchedHandler.
    * @param router A router that creates views</br>
    * @param closeDialogs the default is true - will close all open dialogs before navigating, if set to
    * true. If set to false it will just navigate without closing dialogs.
    */
  def this(router: Router, closeDialogs: Boolean) = this()
  /**
    * Removes the routeMatchedHandler from the Router
    * @returns for chaining
    */
  def destroy(): RouteMatchedHandler = js.native
  /**
    * Gets if a navigation should close dialogs
    * @returns a flag indication if dialogs will be closed
    */
  def getCloseDialogs(): Boolean = js.native
  /**
    * Returns a metadata object for class sap.m.routing.RouteMatchedHandler.
    * @returns Metadata object describing this class
    */
  def getMetadata(): Metadata = js.native
  /**
    * Sets if a navigation should close dialogs
    * @param bCloseDialogs close dialogs if true
    * @returns for chaining
    */
  def setCloseDialogs(bCloseDialogs: Boolean): RouteMatchedHandler = js.native
}

