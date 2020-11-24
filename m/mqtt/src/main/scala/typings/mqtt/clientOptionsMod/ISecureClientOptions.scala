package typings.mqtt.clientOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISecureClientOptions extends js.Object {
  
  /**
    * Optionally override the trusted CA certificates in PEM format
    */
  var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  
  /**
    * optional cert chains in PEM format
    */
  var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  
  /**
    * optional private keys in PEM format
    */
  var key: js.UndefOr[String | (js.Array[Buffer | js.Object | String]) | Buffer] = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
}
object ISecureClientOptions {
  
  @scala.inline
  def apply(): ISecureClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISecureClientOptions]
  }
  
  @scala.inline
  implicit class ISecureClientOptionsOps[Self <: ISecureClientOptions] (val x: Self) extends AnyVal {
    
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
    def setCaVarargs(value: (Buffer | String)*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (Buffer | String)*): Self = this.set("cert", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: (Buffer | js.Object | String)*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String | (js.Array[Buffer | js.Object | String]) | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
  }
}
