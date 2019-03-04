package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZone extends js.Object {
  var Barcode: scala.Boolean
  var DataType: mfilesLib.MFilesNs.MFDataType
  var DimensionUnit: mfilesLib.MFilesNs.MFOCRDimensionUnit
  val HasOCROptions: scala.Boolean
  var Height: scala.Double
  var ID: scala.Double
  var Left: scala.Double
  var Name: java.lang.String
  var OCROptions: IOCROptions
  var Top: scala.Double
  var Width: scala.Double
  def ClearOCROptions(): scala.Unit
  def Clone(): IOCRZone
  def SetOCROptions(OCROptions: IOCROptions): scala.Unit
}

object IOCRZone {
  @scala.inline
  def apply(
    Barcode: scala.Boolean,
    ClearOCROptions: js.Function0[scala.Unit],
    Clone: js.Function0[IOCRZone],
    DataType: mfilesLib.MFilesNs.MFDataType,
    DimensionUnit: mfilesLib.MFilesNs.MFOCRDimensionUnit,
    HasOCROptions: scala.Boolean,
    Height: scala.Double,
    ID: scala.Double,
    Left: scala.Double,
    Name: java.lang.String,
    OCROptions: IOCROptions,
    SetOCROptions: js.Function1[IOCROptions, scala.Unit],
    Top: scala.Double,
    Width: scala.Double
  ): IOCRZone = {
    val __obj = js.Dynamic.literal(Barcode = Barcode, ClearOCROptions = ClearOCROptions, Clone = Clone, DataType = DataType, DimensionUnit = DimensionUnit, HasOCROptions = HasOCROptions, Height = Height, ID = ID, Left = Left, Name = Name, OCROptions = OCROptions, SetOCROptions = SetOCROptions, Top = Top, Width = Width)
  
    __obj.asInstanceOf[IOCRZone]
  }
}

