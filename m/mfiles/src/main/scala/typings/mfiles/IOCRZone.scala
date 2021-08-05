package typings.mfiles

import typings.mfiles.MFiles.MFDataType
import typings.mfiles.MFiles.MFOCRDimensionUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRZone extends StObject {
  
  var Barcode: Boolean
  
  def ClearOCROptions(): Unit
  
  def Clone(): IOCRZone
  
  var DataType: MFDataType
  
  var DimensionUnit: MFOCRDimensionUnit
  
  val HasOCROptions: Boolean
  
  var Height: Double
  
  var ID: Double
  
  var Left: Double
  
  var Name: String
  
  var OCROptions: IOCROptions
  
  def SetOCROptions(OCROptions: IOCROptions): Unit
  
  var Top: Double
  
  var Width: Double
}
object IOCRZone {
  
  inline def apply(
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
  
  extension [Self <: IOCRZone](x: Self) {
    
    inline def setBarcode(value: Boolean): Self = StObject.set(x, "Barcode", value.asInstanceOf[js.Any])
    
    inline def setClearOCROptions(value: () => Unit): Self = StObject.set(x, "ClearOCROptions", js.Any.fromFunction0(value))
    
    inline def setClone(value: () => IOCRZone): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDimensionUnit(value: MFOCRDimensionUnit): Self = StObject.set(x, "DimensionUnit", value.asInstanceOf[js.Any])
    
    inline def setHasOCROptions(value: Boolean): Self = StObject.set(x, "HasOCROptions", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOCROptions(value: IOCROptions): Self = StObject.set(x, "OCROptions", value.asInstanceOf[js.Any])
    
    inline def setSetOCROptions(value: IOCROptions => Unit): Self = StObject.set(x, "SetOCROptions", js.Any.fromFunction1(value))
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
