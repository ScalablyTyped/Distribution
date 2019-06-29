package typings
package nodeDashTimecodesLib.nodeDashTimecodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-timecodes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromSeconds(seconds: scala.Double): java.lang.String = js.native
  def fromSeconds(seconds: scala.Double, option: TimecodeOptions): java.lang.String = js.native
  def toSeconds(timecode: java.lang.String): scala.Double = js.native
  def toSeconds(timecode: java.lang.String, frameRate: scala.Double): scala.Double = js.native
}

