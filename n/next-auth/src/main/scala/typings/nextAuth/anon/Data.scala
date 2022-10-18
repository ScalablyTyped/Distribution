package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.authenticated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: typings.nextAuth.coreTypesMod.Session
  
  var status: authenticated
}
object Data {
  
  inline def apply(data: typings.nextAuth.coreTypesMod.Session): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = "authenticated")
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: typings.nextAuth.coreTypesMod.Session): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: authenticated): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
