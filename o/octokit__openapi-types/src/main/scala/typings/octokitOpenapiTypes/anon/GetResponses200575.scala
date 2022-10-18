package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200575 extends StObject {
  
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  var get: Responses200575
}
object GetResponses200575 {
  
  inline def apply(get: Responses200575): GetResponses200575 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200575]
  }
  
  extension [Self <: GetResponses200575](x: Self) {
    
    inline def setGet(value: Responses200575): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
