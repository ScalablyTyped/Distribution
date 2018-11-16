package typings
package openui5Lib.sapNs.mNs.routingNs

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
  def this(router: Router, closeDialogs: scala.Boolean) = this()
  /**
           * Removes the routeMatchedHandler from the Router
           * @returns for chaining
          */
  def destroy(): RouteMatchedHandler = js.native
  /**
           * Gets if a navigation should close dialogs
           * @returns a flag indication if dialogs will be closed
          */
  def getCloseDialogs(): scala.Boolean = js.native
  /**
           * Returns a metadata object for class sap.m.routing.RouteMatchedHandler.
           * @returns Metadata object describing this class
          */
  def getMetadata(): openui5Lib.sapNs.uiNs.baseNs.Metadata = js.native
  /**
           * Sets if a navigation should close dialogs
           * @param bCloseDialogs close dialogs if true
           * @returns for chaining
          */
  def setCloseDialogs(bCloseDialogs: scala.Boolean): RouteMatchedHandler = js.native
}

