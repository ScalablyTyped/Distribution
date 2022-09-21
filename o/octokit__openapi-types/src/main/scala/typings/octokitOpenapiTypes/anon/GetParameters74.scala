package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters74 extends StObject {
  
  /**
    * Lists the codespaces associated to a specified organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Parameters74
}
object GetParameters74 {
  
  inline def apply(get: Parameters74): GetParameters74 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters74]
  }
  
  extension [Self <: GetParameters74](x: Self) {
    
    inline def setGet(value: Parameters74): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
