package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRepoTreesha extends StObject {
  
  /**
    * Returns a single tree using the SHA1 value for that tree.
    *
    * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.
    *
    *
    * **Note**: The limit for the `tree` array is 100,000 entries with a maximum size of 7 MB when using the `recursive` parameter.
    */
  var get: ParametersPathRepoTreesha
}
object GetParametersPathRepoTreesha {
  
  inline def apply(get: ParametersPathRepoTreesha): GetParametersPathRepoTreesha = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRepoTreesha]
  }
  
  extension [Self <: GetParametersPathRepoTreesha](x: Self) {
    
    inline def setGet(value: ParametersPathRepoTreesha): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
