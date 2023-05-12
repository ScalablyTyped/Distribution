package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200333 extends StObject {
  
  /**
    * Get the latest release
    * @description View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  var get: Responses200333
}
object GetResponses200333 {
  
  inline def apply(get: Responses200333): GetResponses200333 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200333]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200333] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200333): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
