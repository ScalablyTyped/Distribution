package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpCookieEvidence extends StObject {
  
  /**
    * Names of cookies that violate Google policies. For TOO_MANY_COOKIES policy, this will be the cookie names of top domains with the largest number of cookies. For other policies, this
    * will be all the cookie names that violate the policy.
    */
  var cookieNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The largest number of cookies set by a creative. If this field is set, cookie_names above will be set to the cookie names of top domains with the largest number of cookies. This
    * field will only be set for TOO_MANY_COOKIES policy.
    */
  var maxCookieCount: js.UndefOr[Double] = js.undefined
}
object HttpCookieEvidence {
  
  inline def apply(): HttpCookieEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCookieEvidence]
  }
  
  extension [Self <: HttpCookieEvidence](x: Self) {
    
    inline def setCookieNames(value: js.Array[String]): Self = StObject.set(x, "cookieNames", value.asInstanceOf[js.Any])
    
    inline def setCookieNamesUndefined: Self = StObject.set(x, "cookieNames", js.undefined)
    
    inline def setCookieNamesVarargs(value: String*): Self = StObject.set(x, "cookieNames", js.Array(value*))
    
    inline def setMaxCookieCount(value: Double): Self = StObject.set(x, "maxCookieCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCookieCountUndefined: Self = StObject.set(x, "maxCookieCount", js.undefined)
  }
}
