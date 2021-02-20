package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlListComponentContainer extends StObject {
  
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
  implicit class IAccessControlListComponentContainerMutableBuilder[Self <: IAccessControlListComponentContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAt(value: IAccessControlListComponentKey => IAccessControlListComponent): Self = StObject.set(x, "At", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKeys(value: () => IAccessControlListComponentKeys): Self = StObject.set(x, "GetKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKey(value: IAccessControlListComponentKey => Boolean): Self = StObject.set(x, "HasKey", js.Any.fromFunction1(value))
  }
}
