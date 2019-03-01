package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZoneResult extends js.Object {
  val Confidence: scala.Double
  val DimensionUnit: mfilesLib.MFilesNs.MFOCRDimensionUnit
  val Height: scala.Double
  val ID: scala.Double
  val Left: scala.Double
  val RecognizedOnPage: scala.Double
  val ResultValue: ITypedValue
  val Top: scala.Double
  val Width: scala.Double
}

object IOCRZoneResult {
  @scala.inline
  def apply(
    Confidence: scala.Double,
    DimensionUnit: mfilesLib.MFilesNs.MFOCRDimensionUnit,
    Height: scala.Double,
    ID: scala.Double,
    Left: scala.Double,
    RecognizedOnPage: scala.Double,
    ResultValue: ITypedValue,
    Top: scala.Double,
    Width: scala.Double
  ): IOCRZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Confidence")(Confidence)
    __obj.updateDynamic("DimensionUnit")(DimensionUnit)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Left")(Left)
    __obj.updateDynamic("RecognizedOnPage")(RecognizedOnPage)
    __obj.updateDynamic("ResultValue")(ResultValue)
    __obj.updateDynamic("Top")(Top)
    __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[IOCRZoneResult]
  }
}

