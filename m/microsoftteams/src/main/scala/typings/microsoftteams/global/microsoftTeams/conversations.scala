package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.OpenConversationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the conversational subEntities inside the tab
  */
object conversations {
  
  @JSGlobal("microsoftTeams.conversations")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Hide from docs
    * --------------
    * Allows the user to close the conversation in the right pane
    */
  inline def closeConversation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeConversation")().asInstanceOf[Unit]
  
  /**
    * Hide from docs
    * --------------
    * Allows the user to start or continue a conversation with each subentity inside the tab
    */
  inline def openConversation(openConversationRequest: OpenConversationRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openConversation")(openConversationRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
