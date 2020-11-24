package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MD5DSA extends js.Object {
  
  var MD5_DSA: String = js.native
  
  var MD5_RSA: String = js.native
  
  var SHA256_DSA: String = js.native
  
  var SHA256_RSA: String = js.native
}
object MD5DSA {
  
  @scala.inline
  def apply(MD5_DSA: String, MD5_RSA: String, SHA256_DSA: String, SHA256_RSA: String): MD5DSA = {
    val __obj = js.Dynamic.literal(MD5_DSA = MD5_DSA.asInstanceOf[js.Any], MD5_RSA = MD5_RSA.asInstanceOf[js.Any], SHA256_DSA = SHA256_DSA.asInstanceOf[js.Any], SHA256_RSA = SHA256_RSA.asInstanceOf[js.Any])
    __obj.asInstanceOf[MD5DSA]
  }
  
  @scala.inline
  implicit class MD5DSAOps[Self <: MD5DSA] (val x: Self) extends AnyVal {
    
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
    def setMD5_DSA(value: String): Self = this.set("MD5_DSA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5_RSA(value: String): Self = this.set("MD5_RSA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA256_DSA(value: String): Self = this.set("SHA256_DSA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA256_RSA(value: String): Self = this.set("SHA256_RSA", value.asInstanceOf[js.Any])
  }
}
