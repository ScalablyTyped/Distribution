package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSAKeyPairKeyObjectOptions extends js.Object {
  /**
    * Size of q in bits
    */
  var divisorLength: Double = js.native
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
}

object DSAKeyPairKeyObjectOptions {
  @scala.inline
  def apply(divisorLength: Double, modulusLength: Double): DSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSAKeyPairKeyObjectOptions]
  }
  @scala.inline
  implicit class DSAKeyPairKeyObjectOptionsOps[Self <: DSAKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
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
    def setDivisorLength(value: Double): Self = this.set("divisorLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setModulusLength(value: Double): Self = this.set("modulusLength", value.asInstanceOf[js.Any])
  }
  
}

