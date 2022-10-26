package typings.pollyjsAdapter

import typings.pollyjsCore.mod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<@pollyjs/core.@pollyjs/core.Response, 'statusCode' | 'headers' | 'body' | 'encoding'> */
  trait PickResponsestatusCodehea extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var headers: Headers
    
    var statusCode: Double
  }
  object PickResponsestatusCodehea {
    
    inline def apply(headers: Headers, statusCode: Double): PickResponsestatusCodehea = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickResponsestatusCodehea]
    }
    
    extension [Self <: PickResponsestatusCodehea](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Time extends StObject {
    
    var time: Double
  }
  object Time {
    
    inline def apply(time: Double): Time = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    extension [Self <: Time](x: Self) {
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
