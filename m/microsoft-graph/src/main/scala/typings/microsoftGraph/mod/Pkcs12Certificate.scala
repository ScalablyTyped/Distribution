package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pkcs12Certificate
  extends StObject
     with ApiAuthenticationConfigurationBase {
  
  // The password for the pfx file. Required. If no password is used, you must still provide a value of ''.
  var password: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Represents the pfx content that is sent. The value should be a base-64 encoded version of the actual certificate
    * content. Required.
    */
  var pkcs12Value: js.UndefOr[NullableOption[String]] = js.undefined
}
object Pkcs12Certificate {
  
  inline def apply(): Pkcs12Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pkcs12Certificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pkcs12Certificate] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: NullableOption[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPkcs12Value(value: NullableOption[String]): Self = StObject.set(x, "pkcs12Value", value.asInstanceOf[js.Any])
    
    inline def setPkcs12ValueNull: Self = StObject.set(x, "pkcs12Value", null)
    
    inline def setPkcs12ValueUndefined: Self = StObject.set(x, "pkcs12Value", js.undefined)
  }
}
