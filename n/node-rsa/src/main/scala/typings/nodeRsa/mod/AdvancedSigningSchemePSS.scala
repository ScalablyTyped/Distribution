package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSigningSchemePSS extends AdvancedSigningScheme {
  
  var hash: HashingAlgorithm = js.native
  
  var saltLength: Double = js.native
  
  var scheme: pss = js.native
}
object AdvancedSigningSchemePSS {
  
  @scala.inline
  def apply(hash: HashingAlgorithm, saltLength: Double, scheme: pss): AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSigningSchemePSS]
  }
  
  @scala.inline
  implicit class AdvancedSigningSchemePSSOps[Self <: AdvancedSigningSchemePSS] (val x: Self) extends AnyVal {
    
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
    def setHash(value: HashingAlgorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLength(value: Double): Self = this.set("saltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: pss): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
}
