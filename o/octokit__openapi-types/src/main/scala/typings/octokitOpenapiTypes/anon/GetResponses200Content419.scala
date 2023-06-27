package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content419 extends StObject {
  
  /**
    * Get the weekly commit count
    * @description Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    *
    * The most recent week is seven days ago at UTC midnight to today at UTC midnight.
    */
  var get: Responses200Content419
}
object GetResponses200Content419 {
  
  inline def apply(get: Responses200Content419): GetResponses200Content419 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content419]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content419] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content419): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
