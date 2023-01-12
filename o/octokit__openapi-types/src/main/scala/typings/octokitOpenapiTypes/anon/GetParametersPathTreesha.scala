package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathTreesha extends StObject {
  
  /**
    * Returns a single tree using the SHA1 value for that tree.
    *
    * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.
    *
    *
    * **Note**: The limit for the `tree` array is 100,000 entries with a maximum size of 7 MB when using the `recursive` parameter.
    */
  var get: ParametersPathTreesha
}
object GetParametersPathTreesha {
  
  inline def apply(get: ParametersPathTreesha): GetParametersPathTreesha = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathTreesha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathTreesha] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathTreesha): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
