package typings.mfiles

import typings.mfiles.MFiles.MFOCRDimensionUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRZoneResult extends js.Object {
  
  val Confidence: Double = js.native
  
  val DimensionUnit: MFOCRDimensionUnit = js.native
  
  val Height: Double = js.native
  
  val ID: Double = js.native
  
  val Left: Double = js.native
  
  val RecognizedOnPage: Double = js.native
  
  val ResultValue: ITypedValue = js.native
  
  val Top: Double = js.native
  
  val Width: Double = js.native
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
  
  @scala.inline
  implicit class IOCRZoneResultOps[Self <: IOCRZoneResult] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUnit(value: MFOCRDimensionUnit): Self = this.set("DimensionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognizedOnPage(value: Double): Self = this.set("RecognizedOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultValue(value: ITypedValue): Self = this.set("ResultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
}
