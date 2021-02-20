package typings.playable

import typings.playable.anon.End
import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoDataMod {
  
  @JSImport("playable/dist/src/utils/video-data", "geOverallBufferLength")
  @js.native
  def geOverallBufferLength(buffered: TimeRanges): Double = js.native
  
  @JSImport("playable/dist/src/utils/video-data", "getNearestBufferSegmentInfo")
  @js.native
  def getNearestBufferSegmentInfo(buffered: TimeRanges): End = js.native
  @JSImport("playable/dist/src/utils/video-data", "getNearestBufferSegmentInfo")
  @js.native
  def getNearestBufferSegmentInfo(buffered: TimeRanges, currentTime: Double): End = js.native
  
  @JSImport("playable/dist/src/utils/video-data", "getOverallBufferedPercent")
  @js.native
  def getOverallBufferedPercent(buffered: TimeRanges): Double = js.native
  @JSImport("playable/dist/src/utils/video-data", "getOverallBufferedPercent")
  @js.native
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: js.UndefOr[scala.Nothing], duration: Double): Double = js.native
  @JSImport("playable/dist/src/utils/video-data", "getOverallBufferedPercent")
  @js.native
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double): Double = js.native
  @JSImport("playable/dist/src/utils/video-data", "getOverallBufferedPercent")
  @js.native
  def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double, duration: Double): Double = js.native
  
  @JSImport("playable/dist/src/utils/video-data", "getOverallPlayedPercent")
  @js.native
  def getOverallPlayedPercent(): Double = js.native
  @JSImport("playable/dist/src/utils/video-data", "getOverallPlayedPercent")
  @js.native
  def getOverallPlayedPercent(currentTime: js.UndefOr[scala.Nothing], duration: Double): Double = js.native
  @JSImport("playable/dist/src/utils/video-data", "getOverallPlayedPercent")
  @js.native
  def getOverallPlayedPercent(currentTime: Double): Double = js.native
  @JSImport("playable/dist/src/utils/video-data", "getOverallPlayedPercent")
  @js.native
  def getOverallPlayedPercent(currentTime: Double, duration: Double): Double = js.native
  
  @JSImport("playable/dist/src/utils/video-data", "getTimePercent")
  @js.native
  def getTimePercent(time: Double, durationTime: Double): Double = js.native
}
