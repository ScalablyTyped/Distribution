package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.loading
import typings.nextAuth.nextAuthStrings.unauthenticated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var data: Null
  
  var status: unauthenticated | loading
}
object Status {
  
  inline def apply(data: Null, status: unauthenticated | loading): Status = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: unauthenticated | loading): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
