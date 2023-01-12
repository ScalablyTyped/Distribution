package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceRepositoryResource extends StObject {
  
  /** An Apt Repository. */
  var apt: js.UndefOr[OSPolicyResourceRepositoryResourceAptRepository] = js.undefined
  
  /** A Goo Repository. */
  var goo: js.UndefOr[OSPolicyResourceRepositoryResourceGooRepository] = js.undefined
  
  /** A Yum Repository. */
  var yum: js.UndefOr[OSPolicyResourceRepositoryResourceYumRepository] = js.undefined
  
  /** A Zypper Repository. */
  var zypper: js.UndefOr[OSPolicyResourceRepositoryResourceZypperRepository] = js.undefined
}
object OSPolicyResourceRepositoryResource {
  
  inline def apply(): OSPolicyResourceRepositoryResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceRepositoryResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourceRepositoryResource] (val x: Self) extends AnyVal {
    
    inline def setApt(value: OSPolicyResourceRepositoryResourceAptRepository): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    inline def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    inline def setGoo(value: OSPolicyResourceRepositoryResourceGooRepository): Self = StObject.set(x, "goo", value.asInstanceOf[js.Any])
    
    inline def setGooUndefined: Self = StObject.set(x, "goo", js.undefined)
    
    inline def setYum(value: OSPolicyResourceRepositoryResourceYumRepository): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    inline def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    inline def setZypper(value: OSPolicyResourceRepositoryResourceZypperRepository): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    inline def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
