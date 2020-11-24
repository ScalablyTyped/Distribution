package typings.playable

import typings.playable.anon.End
import typings.std.TimeRanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/utils/video-data", JSImport.Namespace)
@js.native
object videoDataMod extends js.Object {
  
  def geOverallBufferLength(buffered: TimeRanges): Double = js.native
  
  def getNearestBufferSegmentInfo(buffered: TimeRanges): End = js.native
  def getNearestBufferSegmentInfo(buffered: TimeRanges, currentTime: Double): End = js.native
  
  def getOverallBufferedPercent(buffered: TimeRanges): Double = js.native
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: js.UndefOr[scala.Nothing], duration: Double): Double = js.native
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double): Double = js.native
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double, duration: Double): Double = js.native
  
  def getOverallPlayedPercent(): Double = js.native
  def getOverallPlayedPercent(currentTime: js.UndefOr[scala.Nothing], duration: Double): Double = js.native
  def getOverallPlayedPercent(currentTime: Double): Double = js.native
  def getOverallPlayedPercent(currentTime: Double, duration: Double): Double = js.native
  
  def getTimePercent(time: Double, durationTime: Double): Double = js.native
}
