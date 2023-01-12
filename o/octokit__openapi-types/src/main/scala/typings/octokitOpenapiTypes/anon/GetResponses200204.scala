package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200204 extends StObject {
  
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  var get: Responses200204
}
object GetResponses200204 {
  
  inline def apply(get: Responses200204): GetResponses200204 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200204]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200204] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200204): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
