package typings.oauthJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureMethod extends js.Object {
  
  def getSignature(baseString: String): String = js.native
  
  /** Set the key string for signing. */
  def initialize(name: String, accessor: Accessor): Unit = js.native
  
  var key: String = js.native
  
  /** Add a signature to the message. */
  def sign(message: Message): String = js.native
}
object SignatureMethod {
  
  @scala.inline
  def apply(
    getSignature: String => String,
    initialize: (String, Accessor) => Unit,
    key: String,
    sign: Message => String
  ): SignatureMethod = {
    val __obj = js.Dynamic.literal(getSignature = js.Any.fromFunction1(getSignature), initialize = js.Any.fromFunction2(initialize), key = key.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
    __obj.asInstanceOf[SignatureMethod]
  }
  
  @scala.inline
  implicit class SignatureMethodOps[Self <: SignatureMethod] (val x: Self) extends AnyVal {
    
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
    def setGetSignature(value: String => String): Self = this.set("getSignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: (String, Accessor) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: Message => String): Self = this.set("sign", js.Any.fromFunction1(value))
  }
}
