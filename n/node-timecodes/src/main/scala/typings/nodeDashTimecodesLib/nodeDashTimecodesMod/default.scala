package typings
package nodeDashTimecodesLib.nodeDashTimecodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-timecodes", JSImport.Default)
@js.native
object default extends js.Object {
  var constants: nodeDashTimecodesLib.Anon_Framerate = js.native
  @JSName("fromSeconds")
  var fromSeconds_Original: js.Function2[
    /* seconds */ scala.Double, 
    /* option */ js.UndefOr[nodeDashTimecodesLib.nodeDashTimecodesMod.TimecodeOptions], 
    java.lang.String
  ] = js.native
  @JSName("toSeconds")
  var toSeconds_Original: js.Function2[
    /* timecode */ java.lang.String, 
    /* frameRate */ js.UndefOr[scala.Double], 
    scala.Double
  ] = js.native
  def fromSeconds(seconds: scala.Double): java.lang.String = js.native
  def fromSeconds(seconds: scala.Double, option: nodeDashTimecodesLib.nodeDashTimecodesMod.TimecodeOptions): java.lang.String = js.native
  def toSeconds(timecode: java.lang.String): scala.Double = js.native
  def toSeconds(timecode: java.lang.String, frameRate: scala.Double): scala.Double = js.native
}

