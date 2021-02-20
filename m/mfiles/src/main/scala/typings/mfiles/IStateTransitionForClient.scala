package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateTransitionForClient extends StObject {
  
  def Clone(): IStateTransitionForClient = js.native
  
  var FromState: Double = js.native
  
  def GetAsLookup(): ILookup = js.native
  
  def GetAsTypedValue(): ITypedValue = js.native
  
  val ID: Double = js.native
  
  var Name: String = js.native
  
  var Selectable: Boolean = js.native
  
  var SelectableFlagAffectedByPseudoUsers: Boolean = js.native
  
  var ToState: Double = js.native
}
object IStateTransitionForClient {
  
  @scala.inline
  def apply(
    Clone: () => IStateTransitionForClient,
    FromState: Double,
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean,
    ToState: Double
  ): IStateTransitionForClient = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FromState = FromState.asInstanceOf[js.Any], GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateTransitionForClient]
  }
  
  @scala.inline
  implicit class IStateTransitionForClientMutableBuilder[Self <: IStateTransitionForClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IStateTransitionForClient): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFromState(value: Double): Self = StObject.set(x, "FromState", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setToState(value: Double): Self = StObject.set(x, "ToState", value.asInstanceOf[js.Any])
  }
}
