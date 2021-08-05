package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupIDExs extends StObject {
  
  def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit
  
  def Clone(): IUserOrUserGroupIDExs
  
  val Count: Double
  
  def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx
  
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  
  def Item(Index: Double): IUserOrUserGroupIDEx
  
  def Remove(Index: Double): Unit
}
object IUserOrUserGroupIDExs {
  
  inline def apply(
    Add: (Double, IUserOrUserGroupIDEx) => Unit,
    Clone: () => IUserOrUserGroupIDExs,
    Count: Double,
    GetUserOrUserGroupIDEx: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx,
    GetUserOrUserGroupIDExIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupIDEx,
    Remove: Double => Unit
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupIDEx = js.Any.fromFunction2(GetUserOrUserGroupIDEx), GetUserOrUserGroupIDExIndex = js.Any.fromFunction2(GetUserOrUserGroupIDExIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
  
  extension [Self <: IUserOrUserGroupIDExs](x: Self) {
    
    inline def setAdd(value: (Double, IUserOrUserGroupIDEx) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IUserOrUserGroupIDExs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetUserOrUserGroupIDEx(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx): Self = StObject.set(x, "GetUserOrUserGroupIDEx", js.Any.fromFunction2(value))
    
    inline def setGetUserOrUserGroupIDExIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = StObject.set(x, "GetUserOrUserGroupIDExIndex", js.Any.fromFunction2(value))
    
    inline def setItem(value: Double => IUserOrUserGroupIDEx): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
