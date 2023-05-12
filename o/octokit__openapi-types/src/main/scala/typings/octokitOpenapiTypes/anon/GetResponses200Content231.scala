package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content231 extends StObject {
  
  /**
    * Export a software bill of materials (SBOM) for a repository.
    * @description Exports the software bill of materials (SBOM) for a repository in SPDX JSON format.
    */
  var get: Responses200Content231
}
object GetResponses200Content231 {
  
  inline def apply(get: Responses200Content231): GetResponses200Content231 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content231]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content231] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content231): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
