package typings.mfiles

import typings.mfiles.MFiles.MFOCRDimensionUnit
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
    val __obj = js.Dynamic.literal(Confidence = Confidence.asInstanceOf[js.Any], DimensionUnit = DimensionUnit.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], RecognizedOnPage = RecognizedOnPage.asInstanceOf[js.Any], ResultValue = ResultValue.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOCRZoneResult]
  }
}

