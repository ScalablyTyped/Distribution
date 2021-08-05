package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IState extends StObject {
  
  def GetAsLookup(): ILookup
  
  def GetAsTypedValue(): ITypedValue
  
  val ID: Double
  
  var Name: String
  
  var Selectable: Boolean
  
  var SelectableFlagAffectedByPseudoUsers: Boolean
}
object IState {
  
  inline def apply(
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean
  ): IState = {
    val __obj = js.Dynamic.literal(GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
  
  extension [Self <: IState](x: Self) {
    
    inline def setGetAsLookup(value: () => ILookup): Self = StObject.set(x, "GetAsLookup", js.Any.fromFunction0(value))
    
    inline def setGetAsTypedValue(value: () => ITypedValue): Self = StObject.set(x, "GetAsTypedValue", js.Any.fromFunction0(value))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "Selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableFlagAffectedByPseudoUsers(value: Boolean): Self = StObject.set(x, "SelectableFlagAffectedByPseudoUsers", value.asInstanceOf[js.Any])
  }
}
