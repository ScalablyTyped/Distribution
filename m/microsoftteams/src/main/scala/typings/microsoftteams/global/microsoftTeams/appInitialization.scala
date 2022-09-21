package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.appInitialization.IExpectedFailureRequest
import typings.microsoftteams.microsoftTeams.appInitialization.IFailedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appInitialization {
  
  @JSGlobal("microsoftTeams.appInitialization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("microsoftTeams.appInitialization.ExpectedFailureReason")
  @js.native
  object ExpectedFailureReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.microsoftteams.microsoftTeams.appInitialization.ExpectedFailureReason & String
      ] = js.native
    
    /* "NotFound" */ val NotFound: typings.microsoftteams.microsoftTeams.appInitialization.ExpectedFailureReason.NotFound & String = js.native
    
    /* "Offline" */ val Offline: typings.microsoftteams.microsoftTeams.appInitialization.ExpectedFailureReason.Offline & String = js.native
    
    /* "Other" */ val Other: typings.microsoftteams.microsoftTeams.appInitialization.ExpectedFailureReason.Other & String = js.native
    
    /* "PermissionError" */ val PermissionError: typings.microsoftteams.microsoftTeams.appInitialization.ExpectedFailureReason.PermissionError & String = js.native
    
    /* "Throttling" */ val Throttling: typings.microsoftteams.microsoftTeams.appInitialization.ExpectedFailureReason.Throttling & String = js.native
  }
  
  @JSGlobal("microsoftTeams.appInitialization.FailedReason")
  @js.native
  object FailedReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.microsoftteams.microsoftTeams.appInitialization.FailedReason & String] = js.native
    
    /* "AuthFailed" */ val AuthFailed: typings.microsoftteams.microsoftTeams.appInitialization.FailedReason.AuthFailed & String = js.native
    
    /* "Other" */ val Other: typings.microsoftteams.microsoftTeams.appInitialization.FailedReason.Other & String = js.native
    
    /* "Timeout" */ val Timeout: typings.microsoftteams.microsoftTeams.appInitialization.FailedReason.Timeout & String = js.native
  }
  
  object Messages {
    
    @JSGlobal("microsoftTeams.appInitialization.Messages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("microsoftTeams.appInitialization.Messages.AppLoaded")
    @js.native
    def AppLoaded: String = js.native
    inline def AppLoaded_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AppLoaded")(x.asInstanceOf[js.Any])
    
    @JSGlobal("microsoftTeams.appInitialization.Messages.ExpectedFailure")
    @js.native
    def ExpectedFailure: String = js.native
    inline def ExpectedFailure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpectedFailure")(x.asInstanceOf[js.Any])
    
    @JSGlobal("microsoftTeams.appInitialization.Messages.Failure")
    @js.native
    def Failure: String = js.native
    inline def Failure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Failure")(x.asInstanceOf[js.Any])
    
    @JSGlobal("microsoftTeams.appInitialization.Messages.Success")
    @js.native
    def Success: String = js.native
    inline def Success_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Notifies the frame that app has loaded and to hide the loading indicator if one is shown.
    */
  inline def notifyAppLoaded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyAppLoaded")().asInstanceOf[Unit]
  
  /**
    * Notifies the frame that app initialized with some expected errors.
    */
  inline def notifyExpectedFailure(expectedFailureRequest: IExpectedFailureRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyExpectedFailure")(expectedFailureRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Notifies the frame that app initialization has failed and to show an error page in its place.
    */
  inline def notifyFailure(appInitializationFailedRequest: IFailedRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyFailure")(appInitializationFailedRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Notifies the frame that app initialization is successful and is ready for user interaction.
    */
  inline def notifySuccess(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifySuccess")().asInstanceOf[Unit]
}
