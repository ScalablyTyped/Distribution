package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourcePackageResourceDeb extends StObject {
  
  /** Whether dependencies should also be installed. - install when false: `dpkg -i package` - install when true: `apt-get update && apt-get -y install package.deb` */
  var pullDeps: js.UndefOr[Boolean] = js.undefined
  
  /** Required. A deb package. */
  var source: js.UndefOr[OSPolicyResourceFile] = js.undefined
}
object OSPolicyResourcePackageResourceDeb {
  
  inline def apply(): OSPolicyResourcePackageResourceDeb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourcePackageResourceDeb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourcePackageResourceDeb] (val x: Self) extends AnyVal {
    
    inline def setPullDeps(value: Boolean): Self = StObject.set(x, "pullDeps", value.asInstanceOf[js.Any])
    
    inline def setPullDepsUndefined: Self = StObject.set(x, "pullDeps", js.undefined)
    
    inline def setSource(value: OSPolicyResourceFile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
