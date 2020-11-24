package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDefOrObjectType extends js.Object {
  
  def Clone(): IPropertyDefOrObjectType = js.native
  
  def GetAsExpression(): IExpression = js.native
  
  var ID: Double = js.native
  
  var PropertyDef: Boolean = js.native
}
object IPropertyDefOrObjectType {
  
  @scala.inline
  def apply(
    Clone: () => IPropertyDefOrObjectType,
    GetAsExpression: () => IExpression,
    ID: Double,
    PropertyDef: Boolean
  ): IPropertyDefOrObjectType = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetAsExpression = js.Any.fromFunction0(GetAsExpression), ID = ID.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDefOrObjectType]
  }
  
  @scala.inline
  implicit class IPropertyDefOrObjectTypeOps[Self <: IPropertyDefOrObjectType] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IPropertyDefOrObjectType): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAsExpression(value: () => IExpression): Self = this.set("GetAsExpression", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDef(value: Boolean): Self = this.set("PropertyDef", value.asInstanceOf[js.Any])
  }
}
