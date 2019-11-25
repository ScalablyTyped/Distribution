package typings.mfiles

import typings.mfiles.MFiles.MFDataType
import typings.mfiles.MFiles.MFOCRDimensionUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZone extends js.Object {
  var Barcode: Boolean
  var DataType: MFDataType
  var DimensionUnit: MFOCRDimensionUnit
  val HasOCROptions: Boolean
  var Height: Double
  var ID: Double
  var Left: Double
  var Name: String
  var OCROptions: IOCROptions
  var Top: Double
  var Width: Double
  def ClearOCROptions(): Unit
  def Clone(): IOCRZone
  def SetOCROptions(OCROptions: IOCROptions): Unit
}

object IOCRZone {
  @scala.inline
  def apply(
    Barcode: Boolean,
    ClearOCROptions: () => Unit,
    Clone: () => IOCRZone,
    DataType: MFDataType,
    DimensionUnit: MFOCRDimensionUnit,
    HasOCROptions: Boolean,
    Height: Double,
    ID: Double,
    Left: Double,
    Name: String,
    OCROptions: IOCROptions,
    SetOCROptions: IOCROptions => Unit,
    Top: Double,
    Width: Double
  ): IOCRZone = {
    val __obj = js.Dynamic.literal(Barcode = Barcode.asInstanceOf[js.Any], ClearOCROptions = js.Any.fromFunction0(ClearOCROptions), Clone = js.Any.fromFunction0(Clone), DataType = DataType.asInstanceOf[js.Any], DimensionUnit = DimensionUnit.asInstanceOf[js.Any], HasOCROptions = HasOCROptions.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OCROptions = OCROptions.asInstanceOf[js.Any], SetOCROptions = js.Any.fromFunction1(SetOCROptions), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOCRZone]
  }
}

