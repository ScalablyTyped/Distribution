package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResource extends StObject {
  
  /** Exec resource */
  var exec: js.UndefOr[OSPolicyResourceExecResource] = js.undefined
  
  /** File resource */
  var file: js.UndefOr[OSPolicyResourceFileResource] = js.undefined
  
  /**
    * Required. The id of the resource with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63
    * characters. * Must end with a number or a letter. * Must be unique within the OS policy.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** Package resource */
  var pkg: js.UndefOr[OSPolicyResourcePackageResource] = js.undefined
  
  /** Package repository resource */
  var repository: js.UndefOr[OSPolicyResourceRepositoryResource] = js.undefined
}
object OSPolicyResource {
  
  inline def apply(): OSPolicyResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResource]
  }
  
  extension [Self <: OSPolicyResource](x: Self) {
    
    inline def setExec(value: OSPolicyResourceExecResource): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setFile(value: OSPolicyResourceFileResource): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPkg(value: OSPolicyResourcePackageResource): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    
    inline def setRepository(value: OSPolicyResourceRepositoryResource): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
