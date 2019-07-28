package typings.mfiles

import typings.mfiles.MFilesNs.MFDataType
import typings.mfiles.MFilesNs.MFOCRDimensionUnit
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
    val __obj = js.Dynamic.literal(Barcode = Barcode, ClearOCROptions = js.Any.fromFunction0(ClearOCROptions), Clone = js.Any.fromFunction0(Clone), DataType = DataType, DimensionUnit = DimensionUnit, HasOCROptions = HasOCROptions, Height = Height, ID = ID, Left = Left, Name = Name, OCROptions = OCROptions, SetOCROptions = js.Any.fromFunction1(SetOCROptions), Top = Top, Width = Width)
  
    __obj.asInstanceOf[IOCRZone]
  }
}

