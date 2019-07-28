package typings.mfiles

import typings.mfiles.MFilesNs.MFOCRDimensionUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZoneResult extends js.Object {
  val Confidence: Double
  val DimensionUnit: MFOCRDimensionUnit
  val Height: Double
  val ID: Double
  val Left: Double
  val RecognizedOnPage: Double
  val ResultValue: ITypedValue
  val Top: Double
  val Width: Double
}

object IOCRZoneResult {
  @scala.inline
  def apply(
    Confidence: Double,
    DimensionUnit: MFOCRDimensionUnit,
    Height: Double,
    ID: Double,
    Left: Double,
    RecognizedOnPage: Double,
    ResultValue: ITypedValue,
    Top: Double,
    Width: Double
  ): IOCRZoneResult = {
    val __obj = js.Dynamic.literal(Confidence = Confidence, DimensionUnit = DimensionUnit, Height = Height, ID = ID, Left = Left, RecognizedOnPage = RecognizedOnPage, ResultValue = ResultValue, Top = Top, Width = Width)
  
    __obj.asInstanceOf[IOCRZoneResult]
  }
}

