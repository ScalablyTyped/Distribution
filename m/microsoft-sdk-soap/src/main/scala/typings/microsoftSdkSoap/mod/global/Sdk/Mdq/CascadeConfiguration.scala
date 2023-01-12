package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CascadeConfiguration extends StObject {
  
  var Assign: CascadeType
  
  var Delete: CascadeType
  
  var ExtensionData: CascadeType
  
  var Merge: CascadeType
  
  var Reparent: CascadeType
  
  var Share: CascadeType
  
  var Unshare: CascadeType
}
object CascadeConfiguration {
  
  inline def apply(
    Assign: CascadeType,
    Delete: CascadeType,
    ExtensionData: CascadeType,
    Merge: CascadeType,
    Reparent: CascadeType,
    Share: CascadeType,
    Unshare: CascadeType
  ): CascadeConfiguration = {
    val __obj = js.Dynamic.literal(Assign = Assign.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], ExtensionData = ExtensionData.asInstanceOf[js.Any], Merge = Merge.asInstanceOf[js.Any], Reparent = Reparent.asInstanceOf[js.Any], Share = Share.asInstanceOf[js.Any], Unshare = Unshare.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CascadeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAssign(value: CascadeType): Self = StObject.set(x, "Assign", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CascadeType): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setExtensionData(value: CascadeType): Self = StObject.set(x, "ExtensionData", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: CascadeType): Self = StObject.set(x, "Merge", value.asInstanceOf[js.Any])
    
    inline def setReparent(value: CascadeType): Self = StObject.set(x, "Reparent", value.asInstanceOf[js.Any])
    
    inline def setShare(value: CascadeType): Self = StObject.set(x, "Share", value.asInstanceOf[js.Any])
    
    inline def setUnshare(value: CascadeType): Self = StObject.set(x, "Unshare", value.asInstanceOf[js.Any])
  }
}
