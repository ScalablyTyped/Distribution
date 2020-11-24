package typings.pkijs.anon

import typings.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedCerts extends js.Object {
  
  var trustedCerts: js.UndefOr[js.Array[default]] = js.native
}
object TrustedCerts {
  
  @scala.inline
  def apply(): TrustedCerts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedCerts]
  }
  
  @scala.inline
  implicit class TrustedCertsOps[Self <: TrustedCerts] (val x: Self) extends AnyVal {
    
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
    def setTrustedCertsVarargs(value: default*): Self = this.set("trustedCerts", js.Array(value :_*))
    
    @scala.inline
    def setTrustedCerts(value: js.Array[default]): Self = this.set("trustedCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustedCerts: Self = this.set("trustedCerts", js.undefined)
  }
}
