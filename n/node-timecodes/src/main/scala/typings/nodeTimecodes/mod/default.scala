package typings.nodeTimecodes.mod

import typings.nodeTimecodes.anon.Framerate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-timecodes", JSImport.Default)
@js.native
object default extends js.Object {
  var constants: Framerate = js.native
  @JSName("fromSeconds")
  var fromSeconds_Original: js.Function2[/* seconds */ Double, /* option */ js.UndefOr[TimecodeOptions], String] = js.native
  @JSName("toSeconds")
  var toSeconds_Original: js.Function2[/* timecode */ String, /* frameRate */ js.UndefOr[Double], Double] = js.native
  def fromSeconds(seconds: Double): String = js.native
  def fromSeconds(seconds: Double, option: TimecodeOptions): String = js.native
  def toSeconds(timecode: String): Double = js.native
  def toSeconds(timecode: String, frameRate: Double): Double = js.native
}

