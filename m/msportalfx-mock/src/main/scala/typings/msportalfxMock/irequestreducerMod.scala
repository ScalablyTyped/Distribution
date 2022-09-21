package typings.msportalfxMock

import typings.msportalfxMock.mockFxMod.MockFx.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object irequestreducerMod {
  
  trait RequestReducer extends StObject {
    
    /**
      * Replaces the requests array of the target with the return value.
      */
    def reduce(requests: js.Array[Request]): js.Array[Request]
  }
  object RequestReducer {
    
    inline def apply(reduce: js.Array[Request] => js.Array[Request]): RequestReducer = {
      val __obj = js.Dynamic.literal(reduce = js.Any.fromFunction1(reduce))
      __obj.asInstanceOf[RequestReducer]
    }
    
    extension [Self <: RequestReducer](x: Self) {
      
      inline def setReduce(value: js.Array[Request] => js.Array[Request]): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    }
  }
}
