package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200318 extends StObject {
  
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  var get: Responses200318
}
object GetResponses200318 {
  
  inline def apply(get: Responses200318): GetResponses200318 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200318]
  }
  
  extension [Self <: GetResponses200318](x: Self) {
    
    inline def setGet(value: Responses200318): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
