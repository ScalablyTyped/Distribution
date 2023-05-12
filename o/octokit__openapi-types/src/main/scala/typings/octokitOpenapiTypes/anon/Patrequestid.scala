package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patrequestid extends StObject {
  
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  
  /** @description Unique identifier of the request for access via fine-grained personal access token. */
  var pat_request_id: Double
}
object Patrequestid {
  
  inline def apply(
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any,
    pat_request_id: Double
  ): Patrequestid = {
    val __obj = js.Dynamic.literal(pat_request_id = pat_request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patrequestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Patrequestid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPat_request_id(value: Double): Self = StObject.set(x, "pat_request_id", value.asInstanceOf[js.Any])
  }
}
