package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceRepositoryResourceGooRepository extends StObject {
  
  /** Required. The name of the repository. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The url of the repository. */
  var url: js.UndefOr[String] = js.undefined
}
object OSPolicyResourceRepositoryResourceGooRepository {
  
  inline def apply(): OSPolicyResourceRepositoryResourceGooRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceRepositoryResourceGooRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourceRepositoryResourceGooRepository] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
