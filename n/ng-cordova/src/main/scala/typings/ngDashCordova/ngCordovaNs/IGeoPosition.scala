package typings.ngDashCordova.ngCordovaNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoPosition extends js.Object {
  var coords: IGeoCoordinates
  var timestamp: Date
}

object IGeoPosition {
  @scala.inline
  def apply(coords: IGeoCoordinates, timestamp: Date): IGeoPosition = {
    val __obj = js.Dynamic.literal(coords = coords, timestamp = timestamp)
  
    __obj.asInstanceOf[IGeoPosition]
  }
}

