package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupIDs extends StObject {
  
  def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit
  
  def Clone(): IUserOrUserGroupIDs
  
  val Count: Double
  
  def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID
  
  def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  
  def Item(Index: Double): IUserOrUserGroupID
  
  def Remove(Index: Double): Unit
}
object IUserOrUserGroupIDs {
  
  inline def apply(
    Add: (Double, IUserOrUserGroupID) => Unit,
    Clone: () => IUserOrUserGroupIDs,
    Count: Double,
    GetUserOrUserGroupID: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID,
    GetUserOrUserGroupIDIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupID,
    Remove: Double => Unit
  ): IUserOrUserGroupIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupID = js.Any.fromFunction2(GetUserOrUserGroupID), GetUserOrUserGroupIDIndex = js.Any.fromFunction2(GetUserOrUserGroupIDIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IUserOrUserGroupIDs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUserOrUserGroupIDs] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IUserOrUserGroupID) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IUserOrUserGroupIDs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetUserOrUserGroupID(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID): Self = StObject.set(x, "GetUserOrUserGroupID", js.Any.fromFunction2(value))
    
    inline def setGetUserOrUserGroupIDIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = StObject.set(x, "GetUserOrUserGroupIDIndex", js.Any.fromFunction2(value))
    
    inline def setItem(value: Double => IUserOrUserGroupID): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
