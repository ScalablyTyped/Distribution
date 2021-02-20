package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutomaticPermissions extends StObject {
  
  var CanDeactivate: Boolean = js.native
  
  def Clone(): IAutomaticPermissions = js.native
  
  val IsBasedOnObjectACL: Boolean = js.native
  
  val IsDefault: Boolean = js.native
  
  val NamedACL: INamedACL = js.native
  
  def SetBasedOnObjectACL(): Unit = js.native
  
  def SetNamedACL(NamedACL: INamedACL): Unit = js.native
}
object IAutomaticPermissions {
  
  @scala.inline
  def apply(
    CanDeactivate: Boolean,
    Clone: () => IAutomaticPermissions,
    IsBasedOnObjectACL: Boolean,
    IsDefault: Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: () => Unit,
    SetNamedACL: INamedACL => Unit
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal(CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), IsBasedOnObjectACL = IsBasedOnObjectACL.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], SetBasedOnObjectACL = js.Any.fromFunction0(SetBasedOnObjectACL), SetNamedACL = js.Any.fromFunction1(SetNamedACL))
    __obj.asInstanceOf[IAutomaticPermissions]
  }
  
  @scala.inline
  implicit class IAutomaticPermissionsMutableBuilder[Self <: IAutomaticPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDeactivate(value: Boolean): Self = StObject.set(x, "CanDeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAutomaticPermissions): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBasedOnObjectACL(value: Boolean): Self = StObject.set(x, "IsBasedOnObjectACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedACL(value: INamedACL): Self = StObject.set(x, "NamedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBasedOnObjectACL(value: () => Unit): Self = StObject.set(x, "SetBasedOnObjectACL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetNamedACL(value: INamedACL => Unit): Self = StObject.set(x, "SetNamedACL", js.Any.fromFunction1(value))
  }
}
