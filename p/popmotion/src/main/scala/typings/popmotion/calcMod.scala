package typings.popmotion

import typings.popmotionPopcorn.AnonX
import typings.popmotionPopcorn.typesMod.Point
import typings.popmotionPopcorn.typesMod.Point2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/calc", JSImport.Namespace)
@js.native
object calcMod extends js.Object {
  def angle(a: Point): Double = js.native
  def angle(a: Point, b: Point): Double = js.native
  def degreesToRadians(degrees: Double): Double = js.native
  def dilate(from: Double, to: Double, progress: Double): Double = js.native
  def distance(a: typings.popmotionPopcorn.distanceMod.Point): Double = js.native
  def distance(a: typings.popmotionPopcorn.distanceMod.Point, b: typings.popmotionPopcorn.distanceMod.Point): Double = js.native
  def getProgressFromValue(from: Double, to: Double, value: Double): Double = js.native
  def getValueFromProgress(from: Double, to: Double, progress: Double): Double = js.native
  def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ Boolean = js.native
  def isPoint3D(point: Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ Boolean = js.native
  def pointFromAngleAndDistance(origin: Point2D, angle: Double, distance: Double): AnonX = js.native
  def radiansToDegrees(radians: Double): Double = js.native
  def smooth(prevValue: Double, nextValue: Double, duration: Double): Double = js.native
  def smooth(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = js.native
  def speedPerFrame(xps: Double, frameDuration: Double): Double = js.native
  def speedPerSecond(velocity: Double, frameDuration: Double): Double = js.native
  def stepProgress(steps: Double, progress: Double): Double = js.native
}

