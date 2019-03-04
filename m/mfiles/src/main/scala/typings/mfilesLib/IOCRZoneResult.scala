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
    val __obj = js.Dynamic.literal(Confidence = Confidence, DimensionUnit = DimensionUnit, Height = Height, ID = ID, Left = Left, RecognizedOnPage = RecognizedOnPage, ResultValue = ResultValue, Top = Top, Width = Width)
  
    __obj.asInstanceOf[IOCRZoneResult]
  }
}

