package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pkcs1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSigningSchemePKCS1 extends AdvancedSigningScheme {
  var hash: HashingAlgorithm = js.native
  var scheme: pkcs1 = js.native
}

object AdvancedSigningSchemePKCS1 {
  @scala.inline
  def apply(hash: HashingAlgorithm, scheme: pkcs1): AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSigningSchemePKCS1]
  }
  @scala.inline
  implicit class AdvancedSigningSchemePKCS1Ops[Self <: AdvancedSigningSchemePKCS1] (val x: Self) extends AnyVal {
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
    def setScheme(value: pkcs1): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
  
}

