package typings.powerappsComponentFramework.ComponentFramework.DeviceApi

import typings.powerappsComponentFramework.anon.Accuracy
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of return geological information in context.device.getCurrentPosition
  */
@js.native
trait Position extends js.Object {
  /**
    * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
    */
  var coords: Accuracy = js.native
  /**
    * Represents the time when the object was acquired and is represented as DOMTimeStamp.
    */
  var timestamp: Date = js.native
}

object Position {
  @scala.inline
  def apply(coords: Accuracy, timestamp: Date): Position = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoords(value: Accuracy): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

