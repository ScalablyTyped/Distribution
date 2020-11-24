package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserOrUserGroupIDExs extends js.Object {
  
  def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit = js.native
  
  def Clone(): IUserOrUserGroupIDExs = js.native
  
  val Count: Double = js.native
  
  def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx = js.native
  
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  
  def Item(Index: Double): IUserOrUserGroupIDEx = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IUserOrUserGroupIDExs {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IUserOrUserGroupIDExsOps[Self <: IUserOrUserGroupIDExs] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Double, IUserOrUserGroupIDEx) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IUserOrUserGroupIDExs): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUserOrUserGroupIDEx(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx): Self = this.set("GetUserOrUserGroupIDEx", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUserOrUserGroupIDExIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = this.set("GetUserOrUserGroupIDExIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItem(value: Double => IUserOrUserGroupIDEx): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
}
