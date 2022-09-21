package typings.payuEmeaSdk.payu

import typings.payuEmeaSdk.anon.Mask
import typings.payuEmeaSdk.payuEmeaSdkStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizeResultSuccess extends StObject {
  
  var body: Mask
  
  var status: SUCCESS
}
object TokenizeResultSuccess {
  
  inline def apply(body: Mask): TokenizeResultSuccess = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], status = "SUCCESS")
    __obj.asInstanceOf[TokenizeResultSuccess]
  }
  
  extension [Self <: TokenizeResultSuccess](x: Self) {
    
    inline def setBody(value: Mask): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SUCCESS): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
