package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpCookieEvidence extends js.Object {
  
  /**
    * Names of cookies that violate Google policies. For TOO_MANY_COOKIES policy, this will be the cookie names of top domains with the largest number of cookies. For other policies, this
    * will be all the cookie names that violate the policy.
    */
  var cookieNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The largest number of cookies set by a creative. If this field is set, cookie_names above will be set to the cookie names of top domains with the largest number of cookies. This
    * field will only be set for TOO_MANY_COOKIES policy.
    */
  var maxCookieCount: js.UndefOr[Double] = js.native
}
object HttpCookieEvidence {
  
  @scala.inline
  def apply(): HttpCookieEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCookieEvidence]
  }
  
  @scala.inline
  implicit class HttpCookieEvidenceOps[Self <: HttpCookieEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCookieNamesVarargs(value: String*): Self = this.set("cookieNames", js.Array(value :_*))
    
    @scala.inline
    def setCookieNames(value: js.Array[String]): Self = this.set("cookieNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieNames: Self = this.set("cookieNames", js.undefined)
    
    @scala.inline
    def setMaxCookieCount(value: Double): Self = this.set("maxCookieCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCookieCount: Self = this.set("maxCookieCount", js.undefined)
  }
}
