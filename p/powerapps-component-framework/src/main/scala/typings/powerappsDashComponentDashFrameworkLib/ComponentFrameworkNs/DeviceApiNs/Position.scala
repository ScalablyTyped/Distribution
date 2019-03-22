package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.DeviceApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface of return geological information in context.device.getCurrentPosition
		 */
trait Position extends js.Object {
  /**
  			 * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
  			 */
  var coords: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.Dictionary
  /**
  			 * Represents the time when the object was acquired and is represented as DOMTimeStamp.
  			 */
  var timestamp: stdLib.Date
}

object Position {
  @scala.inline
  def apply(
    coords: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.Dictionary,
    timestamp: stdLib.Date
  ): Position = {
    val __obj = js.Dynamic.literal(coords = coords, timestamp = timestamp)
  
    __obj.asInstanceOf[Position]
  }
}

