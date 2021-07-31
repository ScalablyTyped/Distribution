package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedProperty[T] extends StObject {
  
  var CanBeChanged: Boolean
  
  var ManagedPropertyLogicalName: String
  
  var Value: T
}
object ManagedProperty {
  
  @scala.inline
  def apply[T](CanBeChanged: Boolean, ManagedPropertyLogicalName: String, Value: T): ManagedProperty[T] = {
    val __obj = js.Dynamic.literal(CanBeChanged = CanBeChanged.asInstanceOf[js.Any], ManagedPropertyLogicalName = ManagedPropertyLogicalName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedProperty[T]]
  }
  
  @scala.inline
  implicit class ManagedPropertyMutableBuilder[Self <: ManagedProperty[?], T] (val x: Self & ManagedProperty[T]) extends AnyVal {
    
    @scala.inline
    def setCanBeChanged(value: Boolean): Self = StObject.set(x, "CanBeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertyLogicalName(value: String): Self = StObject.set(x, "ManagedPropertyLogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
