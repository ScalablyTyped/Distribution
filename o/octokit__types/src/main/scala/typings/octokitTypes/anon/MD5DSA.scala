package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MD5DSA extends StObject {
  
  var MD5_DSA: String
  
  var MD5_RSA: String
  
  var SHA256_DSA: String
  
  var SHA256_RSA: String
}
object MD5DSA {
  
  @scala.inline
  def apply(MD5_DSA: String, MD5_RSA: String, SHA256_DSA: String, SHA256_RSA: String): MD5DSA = {
    val __obj = js.Dynamic.literal(MD5_DSA = MD5_DSA.asInstanceOf[js.Any], MD5_RSA = MD5_RSA.asInstanceOf[js.Any], SHA256_DSA = SHA256_DSA.asInstanceOf[js.Any], SHA256_RSA = SHA256_RSA.asInstanceOf[js.Any])
    __obj.asInstanceOf[MD5DSA]
  }
  
  @scala.inline
  implicit class MD5DSAMutableBuilder[Self <: MD5DSA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMD5_DSA(value: String): Self = StObject.set(x, "MD5_DSA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5_RSA(value: String): Self = StObject.set(x, "MD5_RSA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA256_DSA(value: String): Self = StObject.set(x, "SHA256_DSA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA256_RSA(value: String): Self = StObject.set(x, "SHA256_RSA", value.asInstanceOf[js.Any])
  }
}
