package typings.nodeTimecodes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-timecodes", "toSeconds")
@js.native
object toSeconds extends js.Object {
  def apply(timecode: String): Double = js.native
  def apply(timecode: String, frameRate: Double): Double = js.native
}

