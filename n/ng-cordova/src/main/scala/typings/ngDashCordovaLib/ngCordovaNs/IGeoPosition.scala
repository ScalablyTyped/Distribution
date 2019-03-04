package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoPosition extends js.Object {
  var coords: IGeoCoordinates
  var timestamp: stdLib.Date
}

object IGeoPosition {
  @scala.inline
  def apply(coords: IGeoCoordinates, timestamp: stdLib.Date): IGeoPosition = {
    val __obj = js.Dynamic.literal(coords = coords, timestamp = timestamp)
  
    __obj.asInstanceOf[IGeoPosition]
  }
}

