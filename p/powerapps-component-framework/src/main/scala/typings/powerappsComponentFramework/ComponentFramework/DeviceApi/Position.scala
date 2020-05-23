package typings.powerappsComponentFramework.ComponentFramework.DeviceApi

import typings.powerappsComponentFramework.anon.Accuracy
import typings.std.Date
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
  var coords: Accuracy
  /**
    * Represents the time when the object was acquired and is represented as DOMTimeStamp.
    */
  var timestamp: Date
}

object Position {
  @scala.inline
  def apply(coords: Accuracy, timestamp: Date): Position = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

