package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyUsage extends js.Object {
  
  /** Describes high-level ways in which a key may be used. */
  var baseKeyUsage: js.UndefOr[KeyUsageOptions] = js.native
  
  /** Detailed scenarios in which a key may be used. */
  var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageOptions] = js.native
  
  /** Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message. */
  var unknownExtendedKeyUsages: js.UndefOr[js.Array[ObjectId]] = js.native
}
object KeyUsage {
  
  @scala.inline
  def apply(): KeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyUsage]
  }
  
  @scala.inline
  implicit class KeyUsageOps[Self <: KeyUsage] (val x: Self) extends AnyVal {
    
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
    def setBaseKeyUsage(value: KeyUsageOptions): Self = this.set("baseKeyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseKeyUsage: Self = this.set("baseKeyUsage", js.undefined)
    
    @scala.inline
    def setExtendedKeyUsage(value: ExtendedKeyUsageOptions): Self = this.set("extendedKeyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedKeyUsage: Self = this.set("extendedKeyUsage", js.undefined)
    
    @scala.inline
    def setUnknownExtendedKeyUsagesVarargs(value: ObjectId*): Self = this.set("unknownExtendedKeyUsages", js.Array(value :_*))
    
    @scala.inline
    def setUnknownExtendedKeyUsages(value: js.Array[ObjectId]): Self = this.set("unknownExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownExtendedKeyUsages: Self = this.set("unknownExtendedKeyUsages", js.undefined)
  }
}
