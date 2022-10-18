package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content585 extends StObject {
  
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  var get: Responses200Content585
}
object GetResponses200Content585 {
  
  inline def apply(get: Responses200Content585): GetResponses200Content585 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content585]
  }
  
  extension [Self <: GetResponses200Content585](x: Self) {
    
    inline def setGet(value: Responses200Content585): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
