package typings.nodeDashTimecodes.nodeDashTimecodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-timecodes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromSeconds(seconds: Double): String = js.native
  def fromSeconds(seconds: Double, option: TimecodeOptions): String = js.native
  def toSeconds(timecode: String): Double = js.native
  def toSeconds(timecode: String, frameRate: Double): Double = js.native
}

