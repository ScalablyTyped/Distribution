package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JwtLocation extends js.Object {
  
  /** Specifies HTTP header name to extract JWT token. */
  var header: js.UndefOr[String] = js.native
  
  /** Specifies URL query parameter name to extract JWT token. */
  var query: js.UndefOr[String] = js.native
  
  /**
    * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case
    * sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}",
    * value_prefix="Bearer " with a space at the end.
    */
  var valuePrefix: js.UndefOr[String] = js.native
}
object JwtLocation {
  
  @scala.inline
  def apply(): JwtLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JwtLocation]
  }
  
  @scala.inline
  implicit class JwtLocationOps[Self <: JwtLocation] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setValuePrefix(value: String): Self = this.set("valuePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePrefix: Self = this.set("valuePrefix", js.undefined)
  }
}
