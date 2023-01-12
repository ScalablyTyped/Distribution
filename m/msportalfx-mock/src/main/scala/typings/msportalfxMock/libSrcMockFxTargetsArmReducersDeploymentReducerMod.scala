package typings.msportalfxMock

import typings.msportalfxMock.libSrcMockFxMod.MockFx.Request
import typings.msportalfxMock.libSrcMockFxTargetsIrequestreducerMod.RequestReducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxTargetsArmReducersDeploymentReducerMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets/ARM/reducers/DeploymentReducer", "DeploymentReducer")
  @js.native
  open class DeploymentReducer ()
    extends StObject
       with RequestReducer {
    
    /**
      * Replaces the requests array of the target with the return value.
      */
    /* CompleteClass */
    override def reduce(requests: js.Array[Request]): js.Array[Request] = js.native
  }
  
  trait Deployment extends StObject {
    
    var successCommands: js.UndefOr[SuccessCommands] = js.undefined
    
    var url: String
  }
  object Deployment {
    
    inline def apply(url: String): Deployment = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deployment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
      
      inline def setSuccessCommands(value: SuccessCommands): Self = StObject.set(x, "successCommands", value.asInstanceOf[js.Any])
      
      inline def setSuccessCommandsUndefined: Self = StObject.set(x, "successCommands", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuccessCommands extends StObject {
    
    var successfulAttempt: js.UndefOr[Request] = js.undefined
    
    var successfulDeployment1: js.UndefOr[Request] = js.undefined
    
    var successfulDeployment2: js.UndefOr[Request] = js.undefined
    
    var successfulOperation: js.UndefOr[Request] = js.undefined
  }
  object SuccessCommands {
    
    inline def apply(): SuccessCommands = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuccessCommands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuccessCommands] (val x: Self) extends AnyVal {
      
      inline def setSuccessfulAttempt(value: Request): Self = StObject.set(x, "successfulAttempt", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulAttemptUndefined: Self = StObject.set(x, "successfulAttempt", js.undefined)
      
      inline def setSuccessfulDeployment1(value: Request): Self = StObject.set(x, "successfulDeployment1", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulDeployment1Undefined: Self = StObject.set(x, "successfulDeployment1", js.undefined)
      
      inline def setSuccessfulDeployment2(value: Request): Self = StObject.set(x, "successfulDeployment2", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulDeployment2Undefined: Self = StObject.set(x, "successfulDeployment2", js.undefined)
      
      inline def setSuccessfulOperation(value: Request): Self = StObject.set(x, "successfulOperation", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulOperationUndefined: Self = StObject.set(x, "successfulOperation", js.undefined)
    }
  }
}
