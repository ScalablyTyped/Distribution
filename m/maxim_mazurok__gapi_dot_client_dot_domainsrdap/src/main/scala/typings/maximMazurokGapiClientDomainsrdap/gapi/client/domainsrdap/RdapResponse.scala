package typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RdapResponse extends js.Object {
  
  /** Error description. */
  var description: js.UndefOr[js.Array[String]] = js.native
  
  /** Error HTTP code. Example: "501". */
  var errorCode: js.UndefOr[Double] = js.native
  
  /** HTTP response with content type set to "application/json+rdap". */
  var jsonResponse: js.UndefOr[HttpBody] = js.native
  
  /** Error language code. Error response info fields are defined in [section 6 of RFC 7483](https://tools.ietf.org/html/rfc7483#section-6). */
  var lang: js.UndefOr[String] = js.native
  
  /** Notices applying to this response. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  
  /** RDAP conformance level. */
  var rdapConformance: js.UndefOr[js.Array[String]] = js.native
  
  /** Error title. */
  var title: js.UndefOr[String] = js.native
}
object RdapResponse {
  
  @scala.inline
  def apply(): RdapResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdapResponse]
  }
  
  @scala.inline
  implicit class RdapResponseOps[Self <: RdapResponse] (val x: Self) extends AnyVal {
    
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
    def setDescriptionVarargs(value: String*): Self = this.set("description", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: js.Array[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setJsonResponse(value: HttpBody): Self = this.set("jsonResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonResponse: Self = this.set("jsonResponse", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = this.set("notices", js.Array(value :_*))
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = this.set("notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
    
    @scala.inline
    def setRdapConformanceVarargs(value: String*): Self = this.set("rdapConformance", js.Array(value :_*))
    
    @scala.inline
    def setRdapConformance(value: js.Array[String]): Self = this.set("rdapConformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdapConformance: Self = this.set("rdapConformance", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
