package typings.otplibPresetV11

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotpOptionsInterface extends HmacOptions {
  
  var createHmacSecret: js.UndefOr[typings.otplibPresetV11.createHmacSecret] = js.native
  
  var crypto: js.UndefOr[js.Any] = js.native
  
  var digits: js.UndefOr[Double] = js.native
}
object HotpOptionsInterface {
  
  @scala.inline
  def apply(): HotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotpOptionsInterface]
  }
  
  @scala.inline
  implicit class HotpOptionsInterfaceOps[Self <: HotpOptionsInterface] (val x: Self) extends AnyVal {
    
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
    def setCreateHmacSecret(value: (/* secret */ String, /* options */ HmacOptions) => Buffer): Self = this.set("createHmacSecret", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateHmacSecret: Self = this.set("createHmacSecret", js.undefined)
    
    @scala.inline
    def setCrypto(value: js.Any): Self = this.set("crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrypto: Self = this.set("crypto", js.undefined)
    
    @scala.inline
    def setDigits(value: Double): Self = this.set("digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
  }
}
