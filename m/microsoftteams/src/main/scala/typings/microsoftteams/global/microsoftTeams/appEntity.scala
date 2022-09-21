package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.SdkError
import typings.microsoftteams.microsoftTeams.appEntity.AppEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the application entities specific part of the SDK.
  *
  * Hide from docs
  */
object appEntity {
  
  @JSGlobal("microsoftTeams.appEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Hide from docs
    *
    * Open the Tab Gallery and retrieve the app entity
    * @param threadId ID of the thread where the app entity will be created
    * @param categories A list of app categories that will be displayed in the open tab gallery
    * @param callback Callback that will be triggered once the app entity information is available.
    *                 The callback takes two arguments: the app entity configuration, if available and
    *                 an optional SdkError in case something happened (i.e. the window was closed)
    */
  inline def selectAppEntity(
    threadId: String,
    categories: js.Array[String],
    callback: js.Function2[/* appEntity */ AppEntity, /* sdkError */ js.UndefOr[SdkError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAppEntity")(threadId.asInstanceOf[js.Any], categories.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
