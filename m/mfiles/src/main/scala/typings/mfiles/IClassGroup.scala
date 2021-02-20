package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClassGroup extends StObject {
  
  def AddMember(Member: Double): Unit = js.native
  
  def Clone(): IClassGroup = js.native
  
  var ID: Double = js.native
  
  var Members: IIDs = js.native
  
  var Name: String = js.native
  
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  def RemoveMember(Member: Double): Unit = js.native
}
object IClassGroup {
  
  @scala.inline
  def apply(
    AddMember: Double => Unit,
    Clone: () => IClassGroup,
    ID: Double,
    Members: IIDs,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    RemoveMember: Double => Unit
  ): IClassGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1(AddMember), Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1(RemoveMember))
    __obj.asInstanceOf[IClassGroup]
  }
  
  @scala.inline
  implicit class IClassGroupMutableBuilder[Self <: IClassGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMember(value: Double => Unit): Self = StObject.set(x, "AddMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClone(value: () => IClassGroup): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: IIDs): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMember(value: Double => Unit): Self = StObject.set(x, "RemoveMember", js.Any.fromFunction1(value))
  }
}
