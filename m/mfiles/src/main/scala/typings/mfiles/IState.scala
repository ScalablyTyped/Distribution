package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IState extends StObject {
  
  def GetAsLookup(): ILookup = js.native
  
  def GetAsTypedValue(): ITypedValue = js.native
  
  val ID: Double = js.native
  
  var Name: String = js.native
  
  var Selectable: Boolean = js.native
  
  var SelectableFlagAffectedByPseudoUsers: Boolean = js.native
}
object IState {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IStateMutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAsLookup(value: () => ILookup): Self = StObject.set(x, "GetAsLookup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAsTypedValue(value: () => ITypedValue): Self = StObject.set(x, "GetAsTypedValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "Selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableFlagAffectedByPseudoUsers(value: Boolean): Self = StObject.set(x, "SelectableFlagAffectedByPseudoUsers", value.asInstanceOf[js.Any])
  }
}
