package typings
package popmotionLib.popmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "calc")
@js.native
object calcNs extends js.Object {
  def angle(a: atPopmotionPopcornLib.libTypesMod.Point): scala.Double = js.native
  def angle(a: atPopmotionPopcornLib.libTypesMod.Point, b: atPopmotionPopcornLib.libTypesMod.Point): scala.Double = js.native
  def degreesToRadians(degrees: scala.Double): scala.Double = js.native
  def dilate(from: scala.Double, to: scala.Double, progress: scala.Double): scala.Double = js.native
  def distance(a: atPopmotionPopcornLib.libUtilsDistanceMod._Point): scala.Double = js.native
  def distance(
    a: atPopmotionPopcornLib.libUtilsDistanceMod._Point,
    b: atPopmotionPopcornLib.libUtilsDistanceMod._Point
  ): scala.Double = js.native
  def getProgressFromValue(from: scala.Double, to: scala.Double, value: scala.Double): scala.Double = js.native
  def getValueFromProgress(from: scala.Double, to: scala.Double, progress: scala.Double): scala.Double = js.native
  def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ scala.Boolean = js.native
  def isPoint3D(point: atPopmotionPopcornLib.libTypesMod.Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ scala.Boolean = js.native
  def pointFromAngleAndDistance(origin: atPopmotionPopcornLib.libTypesMod.Point2D, angle: scala.Double, distance: scala.Double): atPopmotionPopcornLib.Anon_X = js.native
  def radiansToDegrees(radians: scala.Double): scala.Double = js.native
  def smooth(prevValue: scala.Double, nextValue: scala.Double, duration: scala.Double): scala.Double = js.native
  def smooth(prevValue: scala.Double, nextValue: scala.Double, duration: scala.Double, smoothing: scala.Double): scala.Double = js.native
  def speedPerFrame(xps: scala.Double, frameDuration: scala.Double): scala.Double = js.native
  def speedPerSecond(velocity: scala.Double, frameDuration: scala.Double): scala.Double = js.native
  def stepProgress(steps: scala.Double, progress: scala.Double): scala.Double = js.native
}

