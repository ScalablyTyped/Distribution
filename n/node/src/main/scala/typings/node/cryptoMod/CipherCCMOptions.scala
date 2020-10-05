package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherCCMOptions extends TransformOptions {
  var authTagLength: Double = js.native
}

object CipherCCMOptions {
  @scala.inline
  def apply(authTagLength: Double): CipherCCMOptions = {
    val __obj = js.Dynamic.literal(authTagLength = authTagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherCCMOptions]
  }
  @scala.inline
  implicit class CipherCCMOptionsOps[Self <: CipherCCMOptions] (val x: Self) extends AnyVal {
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
    def setAuthTagLength(value: Double): Self = this.set("authTagLength", value.asInstanceOf[js.Any])
  }
  
}

