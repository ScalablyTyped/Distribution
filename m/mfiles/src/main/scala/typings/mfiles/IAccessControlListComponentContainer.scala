package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlListComponentContainer extends js.Object {
  
  def At(AccessControlListComponentKey: IAccessControlListComponentKey): IAccessControlListComponent = js.native
  
  val Count: Double = js.native
  
  def GetKeys(): IAccessControlListComponentKeys = js.native
  
  def HasKey(AccessControlListComponentKey: IAccessControlListComponentKey): Boolean = js.native
}
object IAccessControlListComponentContainer {
  
  @scala.inline
  def apply(
    At: IAccessControlListComponentKey => IAccessControlListComponent,
    Count: Double,
    GetKeys: () => IAccessControlListComponentKeys,
    HasKey: IAccessControlListComponentKey => Boolean
  ): IAccessControlListComponentContainer = {
    val __obj = js.Dynamic.literal(At = js.Any.fromFunction1(At), Count = Count.asInstanceOf[js.Any], GetKeys = js.Any.fromFunction0(GetKeys), HasKey = js.Any.fromFunction1(HasKey))
    __obj.asInstanceOf[IAccessControlListComponentContainer]
  }
  
  @scala.inline
  implicit class IAccessControlListComponentContainerOps[Self <: IAccessControlListComponentContainer] (val x: Self) extends AnyVal {
    
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
    def setAt(value: IAccessControlListComponentKey => IAccessControlListComponent): Self = this.set("At", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKeys(value: () => IAccessControlListComponentKeys): Self = this.set("GetKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKey(value: IAccessControlListComponentKey => Boolean): Self = this.set("HasKey", js.Any.fromFunction1(value))
  }
}
