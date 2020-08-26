package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * Country code.
    */
  var C: String = js.native
  /**
    * Common name.
    */
  var CN: String = js.native
  /**
    * Locality.
    */
  var L: String = js.native
  /**
    * Organization.
    */
  var O: String = js.native
  /**
    * Organizational unit.
    */
  var OU: String = js.native
  /**
    * Street.
    */
  var ST: String = js.native
}

object Certificate {
  @scala.inline
  def apply(C: String, CN: String, L: String, O: String, OU: String, ST: String): Certificate = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], OU = OU.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
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
    def setC(value: String): Self = this.set("C", value.asInstanceOf[js.Any])
    @scala.inline
    def setCN(value: String): Self = this.set("CN", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: String): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def setO(value: String): Self = this.set("O", value.asInstanceOf[js.Any])
    @scala.inline
    def setOU(value: String): Self = this.set("OU", value.asInstanceOf[js.Any])
    @scala.inline
    def setST(value: String): Self = this.set("ST", value.asInstanceOf[js.Any])
  }
  
}

