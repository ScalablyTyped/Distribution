package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaOptions extends js.Object {
  
  /** Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate. */
  var isCa: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value
    * is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
    */
  var maxIssuerPathLength: js.UndefOr[Double] = js.native
}
object CaOptions {
  
  @scala.inline
  def apply(): CaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaOptions]
  }
  
  @scala.inline
  implicit class CaOptionsOps[Self <: CaOptions] (val x: Self) extends AnyVal {
    
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
    def setIsCa(value: Boolean): Self = this.set("isCa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCa: Self = this.set("isCa", js.undefined)
    
    @scala.inline
    def setMaxIssuerPathLength(value: Double): Self = this.set("maxIssuerPathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIssuerPathLength: Self = this.set("maxIssuerPathLength", js.undefined)
  }
}
