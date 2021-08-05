package typings.nodeLogglyBulk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RetriesInMilliSeconds extends StObject {
    
    var retriesInMilliSeconds: Double
    
    var size: Double
  }
  object RetriesInMilliSeconds {
    
    inline def apply(retriesInMilliSeconds: Double, size: Double): RetriesInMilliSeconds = {
      val __obj = js.Dynamic.literal(retriesInMilliSeconds = retriesInMilliSeconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetriesInMilliSeconds]
    }
    
    extension [Self <: RetriesInMilliSeconds](x: Self) {
      
      inline def setRetriesInMilliSeconds(value: Double): Self = StObject.set(x, "retriesInMilliSeconds", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
