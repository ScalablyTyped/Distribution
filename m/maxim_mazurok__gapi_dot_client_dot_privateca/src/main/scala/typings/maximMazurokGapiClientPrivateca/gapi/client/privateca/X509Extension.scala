package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X509Extension extends js.Object {
  
  /** Required. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error). */
  var critical: js.UndefOr[Boolean] = js.native
  
  /** Required. The OID for this X.509 extension. */
  var objectId: js.UndefOr[ObjectId] = js.native
  
  /** Required. The value of this X.509 extension. */
  var value: js.UndefOr[String] = js.native
}
object X509Extension {
  
  @scala.inline
  def apply(): X509Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509Extension]
  }
  
  @scala.inline
  implicit class X509ExtensionOps[Self <: X509Extension] (val x: Self) extends AnyVal {
    
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
    def setCritical(value: Boolean): Self = this.set("critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCritical: Self = this.set("critical", js.undefined)
    
    @scala.inline
    def setObjectId(value: ObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
