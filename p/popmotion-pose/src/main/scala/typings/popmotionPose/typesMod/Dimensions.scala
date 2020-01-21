package typings.popmotionPose.typesMod

import typings.styleValueTypes.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  def get(): BoundingBox | Double = js.native
  def get(measurement: BoundingBoxDimension): BoundingBox | Double = js.native
  def has(): Boolean = js.native
  def measure(): BoundingBox = js.native
  def measurementAsPixels(measurement: BoundingBoxDimension, value: String): Double = js.native
  def measurementAsPixels(measurement: BoundingBoxDimension, value: String, `type`: ValueType): Double = js.native
  def measurementAsPixels(measurement: BoundingBoxDimension, value: Double): Double = js.native
  def measurementAsPixels(measurement: BoundingBoxDimension, value: Double, `type`: ValueType): Double = js.native
}

