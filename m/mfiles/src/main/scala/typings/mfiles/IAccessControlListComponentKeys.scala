package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlListComponentKeys extends js.Object {
  
  def Clone(): IAccessControlListComponentKeys = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IAccessControlListComponentKey = js.native
}
object IAccessControlListComponentKeys {
  
  @scala.inline
  def apply(
    Clone: () => IAccessControlListComponentKeys,
    Count: Double,
    Item: Double => IAccessControlListComponentKey
  ): IAccessControlListComponentKeys = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IAccessControlListComponentKeys]
  }
  
  @scala.inline
  implicit class IAccessControlListComponentKeysOps[Self <: IAccessControlListComponentKeys] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IAccessControlListComponentKeys): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IAccessControlListComponentKey): Self = this.set("Item", js.Any.fromFunction1(value))
  }
}
