package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CascadeConfiguration extends StObject {
  
  var Assign: CascadeType = js.native
  
  var Delete: CascadeType = js.native
  
  var ExtensionData: CascadeType = js.native
  
  var Merge: CascadeType = js.native
  
  var Reparent: CascadeType = js.native
  
  var Share: CascadeType = js.native
  
  var Unshare: CascadeType = js.native
}
object CascadeConfiguration {
  
  @scala.inline
  def apply(
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
  implicit class CascadeConfigurationMutableBuilder[Self <: CascadeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssign(value: CascadeType): Self = StObject.set(x, "Assign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: CascadeType): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionData(value: CascadeType): Self = StObject.set(x, "ExtensionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: CascadeType): Self = StObject.set(x, "Merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReparent(value: CascadeType): Self = StObject.set(x, "Reparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare(value: CascadeType): Self = StObject.set(x, "Share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnshare(value: CascadeType): Self = StObject.set(x, "Unshare", value.asInstanceOf[js.Any])
  }
}
