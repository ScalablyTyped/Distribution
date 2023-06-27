package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200388 extends StObject {
  
  /**
    * Get the latest release
    * @description View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  var get: Responses200388
}
object GetResponses200388 {
  
  inline def apply(get: Responses200388): GetResponses200388 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200388]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200388] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200388): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
