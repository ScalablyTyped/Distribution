package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDefOrObjectType extends StObject {
  
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
  implicit class IPropertyDefOrObjectTypeMutableBuilder[Self <: IPropertyDefOrObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyDefOrObjectType): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAsExpression(value: () => IExpression): Self = StObject.set(x, "GetAsExpression", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDef(value: Boolean): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
  }
}
