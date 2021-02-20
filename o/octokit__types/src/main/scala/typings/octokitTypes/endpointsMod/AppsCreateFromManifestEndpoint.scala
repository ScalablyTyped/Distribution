package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsCreateFromManifestEndpoint extends StObject {
  
  var code: String = js.native
}
object AppsCreateFromManifestEndpoint {
  
  @scala.inline
  def apply(code: String): AppsCreateFromManifestEndpoint = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateFromManifestEndpoint]
  }
  
  @scala.inline
  implicit class AppsCreateFromManifestEndpointMutableBuilder[Self <: AppsCreateFromManifestEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
