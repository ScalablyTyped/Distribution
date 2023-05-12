package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content350 extends StObject {
  
  /**
    * Get all contributor commit activity
    * @description
    * Returns the `total` number of commits authored by the contributor. In addition, the response includes a Weekly Hash (`weeks` array) with the following information:
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  var get: Responses200Content350
}
object GetResponses200Content350 {
  
  inline def apply(get: Responses200Content350): GetResponses200Content350 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content350]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content350] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content350): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
