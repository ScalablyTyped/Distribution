package typings.payuEmeaSdk.payu

import typings.payuEmeaSdk.payuEmeaSdkStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCvvResultSuccess extends StObject {
  
  var status: SUCCESS
}
object SendCvvResultSuccess {
  
  inline def apply(): SendCvvResultSuccess = {
    val __obj = js.Dynamic.literal(status = "SUCCESS")
    __obj.asInstanceOf[SendCvvResultSuccess]
  }
  
  extension [Self <: SendCvvResultSuccess](x: Self) {
    
    inline def setStatus(value: SUCCESS): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
