package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageClass extends StObject {
  
  /** Target storage class. Required iff the type of the action is SetStorageClass. */
  var storageClass: js.UndefOr[String] = js.undefined
  
  /** Type of the action. Currently, only Delete and SetStorageClass are supported. */
  var `type`: js.UndefOr[String] = js.undefined
}
object StorageClass {
  
  @scala.inline
  def apply(): StorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageClass]
  }
  
  @scala.inline
  implicit class StorageClassMutableBuilder[Self <: StorageClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
