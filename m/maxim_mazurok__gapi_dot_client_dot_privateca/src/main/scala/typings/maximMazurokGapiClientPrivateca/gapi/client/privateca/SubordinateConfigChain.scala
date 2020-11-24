package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubordinateConfigChain extends js.Object {
  
  /** Required. Expected to be in leaf-to-root order according to RFC 5246. */
  var pemCertificates: js.UndefOr[js.Array[String]] = js.native
}
object SubordinateConfigChain {
  
  @scala.inline
  def apply(): SubordinateConfigChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubordinateConfigChain]
  }
  
  @scala.inline
  implicit class SubordinateConfigChainOps[Self <: SubordinateConfigChain] (val x: Self) extends AnyVal {
    
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
    def setPemCertificatesVarargs(value: String*): Self = this.set("pemCertificates", js.Array(value :_*))
    
    @scala.inline
    def setPemCertificates(value: js.Array[String]): Self = this.set("pemCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemCertificates: Self = this.set("pemCertificates", js.undefined)
  }
}
