package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutomaticValue extends js.Object {
  
  var ANSIncrement: Double = js.native
  
  var ANVCode: String = js.native
  
  var CVSExpression: String = js.native
  
  var CVVCode: String = js.native
  
  var CalculationOrderNumber: Double = js.native
  
  def Clone(): IAutomaticValue = js.native
}
object IAutomaticValue {
  
  @scala.inline
  def apply(
    ANSIncrement: Double,
    ANVCode: String,
    CVSExpression: String,
    CVVCode: String,
    CalculationOrderNumber: Double,
    Clone: () => IAutomaticValue
  ): IAutomaticValue = {
    val __obj = js.Dynamic.literal(ANSIncrement = ANSIncrement.asInstanceOf[js.Any], ANVCode = ANVCode.asInstanceOf[js.Any], CVSExpression = CVSExpression.asInstanceOf[js.Any], CVVCode = CVVCode.asInstanceOf[js.Any], CalculationOrderNumber = CalculationOrderNumber.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone))
    __obj.asInstanceOf[IAutomaticValue]
  }
  
  @scala.inline
  implicit class IAutomaticValueOps[Self <: IAutomaticValue] (val x: Self) extends AnyVal {
    
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
    def setANSIncrement(value: Double): Self = this.set("ANSIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANVCode(value: String): Self = this.set("ANVCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVSExpression(value: String): Self = this.set("CVSExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVVCode(value: String): Self = this.set("CVVCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationOrderNumber(value: Double): Self = this.set("CalculationOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAutomaticValue): Self = this.set("Clone", js.Any.fromFunction0(value))
  }
}
