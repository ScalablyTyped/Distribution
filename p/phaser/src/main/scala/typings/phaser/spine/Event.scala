package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Event")
@js.native
class Event protected () extends js.Object {
  def this(time: Double, data: EventData) = this()
  var balance: Double = js.native
  var data: EventData = js.native
  var floatValue: Double = js.native
  var intValue: Double = js.native
  var stringValue: String = js.native
  var time: Double = js.native
  var volume: Double = js.native
}

