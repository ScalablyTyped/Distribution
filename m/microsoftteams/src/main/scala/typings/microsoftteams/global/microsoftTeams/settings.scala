package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.settings.RemoveEvent
import typings.microsoftteams.microsoftTeams.settings.SaveEvent
import typings.microsoftteams.microsoftTeams.settings.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the settings-specific part of the SDK.
  * This object is usable only on the settings frame.
  */
object settings {
  
  @JSGlobal("microsoftTeams.settings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the settings for the current instance.
    * @param callback The callback to invoke when the {@link Settings} object is retrieved.
    */
  inline def getSettings(callback: js.Function1[/* instanceSettings */ Settings, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  
  /**
    * Registers a handler for user attempts to remove content. This handler should be used
    * to remove the underlying resource powering the content.
    * The object passed to the handler must be used to indicate whether to proceed with the removal.
    * Only one handler may be registered at a time. Subsequent registrations will override the first.
    * @param handler The handler to invoke when the user selects the remove button.
    */
  inline def registerOnRemoveHandler(handler: js.Function1[/* evt */ RemoveEvent, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnRemoveHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers a handler for when the user attempts to save the settings. This handler should be used
    * to create or update the underlying resource powering the content.
    * The object passed to the handler must be used to notify whether to proceed with the save.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the user selects the save button.
    */
  inline def registerOnSaveHandler(handler: js.Function1[/* evt */ SaveEvent, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnSaveHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the settings for the current instance.
    * This is an asynchronous operation; calls to getSettings are not guaranteed to reflect the changed state.
    * @param settings The desired settings for this instance.
    */
  inline def setSettings(instanceSettings: Settings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(instanceSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setSettings(
    instanceSettings: Settings,
    onComplete: js.Function2[/* status */ Boolean, /* reason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(instanceSettings.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the validity state for the settings.
    * The initial value is false, so the user cannot save the settings until this is called with true.
    * @param validityState Indicates whether the save or remove button is enabled for the user.
    */
  inline def setValidityState(validityState: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setValidityState")(validityState.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
