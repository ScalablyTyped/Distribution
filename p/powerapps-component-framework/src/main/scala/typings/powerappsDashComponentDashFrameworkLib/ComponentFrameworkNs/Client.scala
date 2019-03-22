package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.client
	 */
trait Client extends js.Object {
  /**
  		 * Whether this control should disable its scrolling capabilities.
  		 */
  var disableScroll: scala.Boolean
  /**
  		 * Returns a value to indicate which client the script is executing in.
  		 * Web: Web application, or Unified Interface
  		 * Outlook: Outlook
  		 * Mobile: Mobile app
  		 */
  def getClient(): java.lang.String
  /**
  		 * Device form factor.
  		 * Unknown = 0
  		 * Desktop = 1
  		 * Tablet = 2
  		 * Phone = 3
  		 */
  def getFormFactor(): scala.Double
  /**
  		 * Returns information whether the server is online or offline.
  		 */
  def isOffline(): scala.Boolean
}

object Client {
  @scala.inline
  def apply(
    disableScroll: scala.Boolean,
    getClient: () => java.lang.String,
    getFormFactor: () => scala.Double,
    isOffline: () => scala.Boolean
  ): Client = {
    val __obj = js.Dynamic.literal(disableScroll = disableScroll, getClient = js.Any.fromFunction0(getClient), getFormFactor = js.Any.fromFunction0(getFormFactor), isOffline = js.Any.fromFunction0(isOffline))
  
    __obj.asInstanceOf[Client]
  }
}

