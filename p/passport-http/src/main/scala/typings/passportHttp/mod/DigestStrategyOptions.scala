package typings.passportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DigestStrategyOptions extends js.Object {
  
  var algorithm: js.UndefOr[String] = js.native
  
  var domain: js.UndefOr[String | js.Array[String]] = js.native
  
  var opaque: js.UndefOr[String] = js.native
  
  var qop: js.UndefOr[String | js.Array[String]] = js.native
  
  var realm: js.UndefOr[String] = js.native
}
object DigestStrategyOptions {
  
  @scala.inline
  def apply(): DigestStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigestStrategyOptions]
  }
  
  @scala.inline
  implicit class DigestStrategyOptionsOps[Self <: DigestStrategyOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setDomainVarargs(value: String*): Self = this.set("domain", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: String | js.Array[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setOpaque(value: String): Self = this.set("opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpaque: Self = this.set("opaque", js.undefined)
    
    @scala.inline
    def setQopVarargs(value: String*): Self = this.set("qop", js.Array(value :_*))
    
    @scala.inline
    def setQop(value: String | js.Array[String]): Self = this.set("qop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQop: Self = this.set("qop", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
  }
}
