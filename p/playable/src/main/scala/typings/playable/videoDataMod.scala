package typings.playable

import typings.playable.anon.End
import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoDataMod {
  
  @JSImport("playable/dist/src/utils/video-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def geOverallBufferLength(buffered: TimeRanges): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geOverallBufferLength")(buffered.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getNearestBufferSegmentInfo(buffered: TimeRanges): End = ^.asInstanceOf[js.Dynamic].applyDynamic("getNearestBufferSegmentInfo")(buffered.asInstanceOf[js.Any]).asInstanceOf[End]
  @scala.inline
  def getNearestBufferSegmentInfo(buffered: TimeRanges, currentTime: Double): End = (^.asInstanceOf[js.Dynamic].applyDynamic("getNearestBufferSegmentInfo")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any])).asInstanceOf[End]
  
  @scala.inline
  def getOverallBufferedPercent(buffered: TimeRanges): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Unit, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getOverallPlayedPercent(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")().asInstanceOf[Double]
  @scala.inline
  def getOverallPlayedPercent(currentTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")(currentTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getOverallPlayedPercent(currentTime: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")(currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getOverallPlayedPercent(currentTime: Unit, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")(currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTimePercent(time: Double, durationTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimePercent")(time.asInstanceOf[js.Any], durationTime.asInstanceOf[js.Any])).asInstanceOf[Double]
}
