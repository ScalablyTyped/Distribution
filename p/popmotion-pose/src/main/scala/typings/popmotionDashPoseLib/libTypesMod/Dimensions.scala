package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  def get(): BoundingBox | scala.Double = js.native
  def get(measurement: BoundingBoxDimension): BoundingBox | scala.Double = js.native
  def has(): scala.Boolean = js.native
  def measure(): BoundingBox = js.native
  def measurementAsPixels(measurement: BoundingBoxDimension, value: java.lang.String): scala.Double = js.native
  def measurementAsPixels(
    measurement: BoundingBoxDimension,
    value: java.lang.String,
    `type`: styleDashValueDashTypesLib.libTypesMod.ValueType
  ): scala.Double = js.native
  def measurementAsPixels(measurement: BoundingBoxDimension, value: scala.Double): scala.Double = js.native
  def measurementAsPixels(
    measurement: BoundingBoxDimension,
    value: scala.Double,
    `type`: styleDashValueDashTypesLib.libTypesMod.ValueType
  ): scala.Double = js.native
}

