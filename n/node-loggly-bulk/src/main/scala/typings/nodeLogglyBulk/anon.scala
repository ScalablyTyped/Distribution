package typings.nodeLogglyBulk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait RetriesInMilliSeconds extends StObject {
    
    var retriesInMilliSeconds: Double = js.native
    
    var size: Double = js.native
  }
  object RetriesInMilliSeconds {
    
    @scala.inline
    def apply(retriesInMilliSeconds: Double, size: Double): RetriesInMilliSeconds = {
      val __obj = js.Dynamic.literal(retriesInMilliSeconds = retriesInMilliSeconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetriesInMilliSeconds]
    }
    
    @scala.inline
    implicit class RetriesInMilliSecondsMutableBuilder[Self <: RetriesInMilliSeconds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetriesInMilliSeconds(value: Double): Self = StObject.set(x, "retriesInMilliSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
