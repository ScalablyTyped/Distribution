package typings.msportalfxMock

import typings.msportalfxMock.irequestreducerMod.RequestReducer
import typings.msportalfxMock.mockFxMod.MockFx.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureAsyncReducerMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets/ARM/reducers/AzureAsyncReducer", "AzureAsyncReducer")
  @js.native
  open class AzureAsyncReducer ()
    extends StObject
       with RequestReducer {
    
    /**
      * Replaces the requests array of the target with the return value.
      */
    /* CompleteClass */
    override def reduce(requests: js.Array[Request]): js.Array[Request] = js.native
  }
}
