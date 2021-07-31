package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserGroup extends StObject {
  
  def AddMember(ID: Double): Unit
  
  def Clone(): IUserGroup
  
  def CloneFrom(UserGroup: IUserGroup): Unit
  
  var ID: Double
  
  var Members: IIDs
  
  var Name: String
  
  val Predefined: Boolean
  
  def RemoveMember(ID: Double): Unit
}
object IUserGroup {
  
  @scala.inline
  def apply(
    AddMember: Double => Unit,
    Clone: () => IUserGroup,
    CloneFrom: IUserGroup => Unit,
    ID: Double,
    Members: IIDs,
    Name: String,
    Predefined: Boolean,
    RemoveMember: Double => Unit
  ): IUserGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1(AddMember), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1(RemoveMember))
    __obj.asInstanceOf[IUserGroup]
  }
  
  @scala.inline
  implicit class IUserGroupMutableBuilder[Self <: IUserGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMember(value: Double => Unit): Self = StObject.set(x, "AddMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClone(value: () => IUserGroup): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IUserGroup => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: IIDs): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefined(value: Boolean): Self = StObject.set(x, "Predefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMember(value: Double => Unit): Self = StObject.set(x, "RemoveMember", js.Any.fromFunction1(value))
  }
}
