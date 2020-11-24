package typings.mfiles

import typings.mfiles.MFiles.MFDataType
import typings.mfiles.MFiles.MFOCRDimensionUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRZone extends js.Object {
  
  var Barcode: Boolean = js.native
  
  def ClearOCROptions(): Unit = js.native
  
  def Clone(): IOCRZone = js.native
  
  var DataType: MFDataType = js.native
  
  var DimensionUnit: MFOCRDimensionUnit = js.native
  
  val HasOCROptions: Boolean = js.native
  
  var Height: Double = js.native
  
  var ID: Double = js.native
  
  var Left: Double = js.native
  
  var Name: String = js.native
  
  var OCROptions: IOCROptions = js.native
  
  def SetOCROptions(OCROptions: IOCROptions): Unit = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
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
  
  @scala.inline
  implicit class IOCRZoneOps[Self <: IOCRZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBarcode(value: Boolean): Self = this.set("Barcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOCROptions(value: () => Unit): Self = this.set("ClearOCROptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone(value: () => IOCRZone): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataType(value: MFDataType): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUnit(value: MFOCRDimensionUnit): Self = this.set("DimensionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOCROptions(value: Boolean): Self = this.set("HasOCROptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOCROptions(value: IOCROptions): Self = this.set("OCROptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOCROptions(value: IOCROptions => Unit): Self = this.set("SetOCROptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
}
