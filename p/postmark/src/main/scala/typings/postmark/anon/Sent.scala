package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sent extends StObject {
  
  var Date: String
  
  var Sent: Double
}
object Sent {
  
  inline def apply(Date: String, Sent: Double): Sent = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sent]
  }
  
  extension [Self <: Sent](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setSent(value: Double): Self = StObject.set(x, "Sent", value.asInstanceOf[js.Any])
  }
}
