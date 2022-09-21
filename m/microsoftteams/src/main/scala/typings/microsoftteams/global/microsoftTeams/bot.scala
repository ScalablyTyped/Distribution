package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.bot.AuthQueryRequest
import typings.microsoftteams.microsoftTeams.bot.Command
import typings.microsoftteams.microsoftTeams.bot.QueryRequest
import typings.microsoftteams.microsoftTeams.bot.QueryResponse
import typings.microsoftteams.microsoftTeams.bot.Results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with bots using the SDK.
  */
object bot {
  
  @JSGlobal("microsoftTeams.bot")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("microsoftTeams.bot.ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.microsoftteams.microsoftTeams.bot.ResponseType & String] = js.native
    
    /* "Auth" */ val Auth: typings.microsoftteams.microsoftTeams.bot.ResponseType.Auth & String = js.native
    
    /* "Results" */ val Results: typings.microsoftteams.microsoftTeams.bot.ResponseType.Results & String = js.native
  }
  
  /**
    * Hide from docs until release.
    * -----
    * Authenticates a user for json tab
    * @param authRequest callback to invoke when data is retrieved from bot
    * @param onSuccess callback to invoke when user is authenticated
    * @param onError callback to invoke should an error occur
    */
  inline def authenticate(authRequest: AuthQueryRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(authRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def authenticate(authRequest: AuthQueryRequest, onSuccess: js.Function1[/* results */ Results, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(authRequest.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def authenticate(
    authRequest: AuthQueryRequest,
    onSuccess: js.Function1[/* results */ Results, Unit],
    onError: js.Function1[/* error */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(authRequest.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def authenticate(authRequest: AuthQueryRequest, onSuccess: Unit, onError: js.Function1[/* error */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(authRequest.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Hide from docs until release.
    * -----
    * Retrieves list of support commands from bot
    * @param onSuccess callback to invoke when data is retrieved from bot
    * @param onError callback to invoke should an error occur
    */
  inline def getSupportedCommands(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCommands")().asInstanceOf[Unit]
  inline def getSupportedCommands(onSuccess: js.Function1[/* response */ js.Array[Command], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCommands")(onSuccess.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getSupportedCommands(
    onSuccess: js.Function1[/* response */ js.Array[Command], Unit],
    onError: js.Function1[/* error */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCommands")(onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getSupportedCommands(onSuccess: Unit, onError: js.Function1[/* error */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCommands")(onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Hide from docs until release.
    * ------
    * Sends query to bot in order to retrieve data.
    * @param botRequest query to send to bot.
    * @param onSuccess callback to invoke when data is retrieved from bot
    * @param onError callback to invoke should an error occur
    */
  inline def sendQuery(botRequest: QueryRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendQuery")(botRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sendQuery(botRequest: QueryRequest, onSuccess: js.Function1[/* data */ QueryResponse, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendQuery")(botRequest.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendQuery(
    botRequest: QueryRequest,
    onSuccess: js.Function1[/* data */ QueryResponse, Unit],
    onError: js.Function1[/* error */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendQuery")(botRequest.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendQuery(botRequest: QueryRequest, onSuccess: Unit, onError: js.Function1[/* error */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendQuery")(botRequest.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
