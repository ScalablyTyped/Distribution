package typings.microsoftteams.global.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the logging part of the SDK.
  * This object is used to send the app logs on demand to the host client
  *
  * Hide from docs
  */
object logs {
  
  @JSGlobal("microsoftTeams.logs")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Hide from docs
    * ------
    * Registers a handler for getting app log
    * @param handler The handler to invoke to get the app log
    */
  inline def registerGetLogHandler(handler: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerGetLogHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
