package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content582204 extends StObject {
  
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  var get: Responses200Content582204
}
object GetResponses200Content582204 {
  
  inline def apply(get: Responses200Content582204): GetResponses200Content582204 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content582204]
  }
  
  extension [Self <: GetResponses200Content582204](x: Self) {
    
    inline def setGet(value: Responses200Content582204): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
