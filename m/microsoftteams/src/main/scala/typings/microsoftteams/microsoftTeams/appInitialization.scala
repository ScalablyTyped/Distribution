package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appInitialization {
  
  @js.native
  sealed trait ExpectedFailureReason extends StObject
  @JSGlobal("microsoftTeams.appInitialization.ExpectedFailureReason")
  @js.native
  object ExpectedFailureReason extends StObject {
    
    @js.native
    sealed trait NotFound
      extends StObject
         with ExpectedFailureReason
    
    @js.native
    sealed trait Offline
      extends StObject
         with ExpectedFailureReason
    
    @js.native
    sealed trait Other
      extends StObject
         with ExpectedFailureReason
    
    @js.native
    sealed trait PermissionError
      extends StObject
         with ExpectedFailureReason
    
    @js.native
    sealed trait Throttling
      extends StObject
         with ExpectedFailureReason
  }
  
  @js.native
  sealed trait FailedReason extends StObject
  @JSGlobal("microsoftTeams.appInitialization.FailedReason")
  @js.native
  object FailedReason extends StObject {
    
    @js.native
    sealed trait AuthFailed
      extends StObject
         with FailedReason
    
    @js.native
    sealed trait Other
      extends StObject
         with FailedReason
    
    @js.native
    sealed trait Timeout
      extends StObject
         with FailedReason
  }
  
  // tslint:disable-next-line:interface-name
  trait IExpectedFailureRequest extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var reason: ExpectedFailureReason
  }
  object IExpectedFailureRequest {
    
    inline def apply(reason: ExpectedFailureReason): IExpectedFailureRequest = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpectedFailureRequest]
    }
    
    extension [Self <: IExpectedFailureRequest](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setReason(value: ExpectedFailureReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line:interface-name
  trait IFailedRequest extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var reason: FailedReason
  }
  object IFailedRequest {
    
    inline def apply(reason: FailedReason): IFailedRequest = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFailedRequest]
    }
    
    extension [Self <: IFailedRequest](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setReason(value: FailedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
