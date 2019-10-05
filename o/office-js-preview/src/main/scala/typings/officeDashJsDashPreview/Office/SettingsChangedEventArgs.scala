package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the settings that raised the settingsChanged event.
  * 
  * To add an event handler for the settingsChanged event, use the addHandlerAsync method of the 
  * {@link Office.Settings} object.
  * 
  * The settingsChanged event fires only when your add-in's script calls the Settings.saveAsync method to persist 
  * the in-memory copy of the settings into the document file. The settingsChanged event is not triggered when the 
  * Settings.set or Settings.remove methods are called.
  * 
  * The settingsChanged event was designed to let you to handle potential conflicts when two or more users are 
  * attempting to save settings at the same time when your add-in is used in a shared (coauthored) document.
  * 
  * **Important**: Your add-in's code can register a handler for the settingsChanged event when the add-in 
  * is running with any Excel client, but the event will fire only when the add-in is loaded with a spreadsheet 
  * that is opened in Excel on the web, and more than one user is editing the spreadsheet (coauthoring). 
  * Therefore, effectively the settingsChanged event is supported only in Excel on the web in coauthoring scenarios.
  */
trait SettingsChangedEventArgs extends js.Object {
  /**
    * Gets an {@link Office.Settings} object that represents the settings that raised the settingsChanged event.
    */
  var settings: Settings
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType
}

object SettingsChangedEventArgs {
  @scala.inline
  def apply(settings: Settings, `type`: EventType): SettingsChangedEventArgs = {
    val __obj = js.Dynamic.literal(settings = settings)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SettingsChangedEventArgs]
  }
}

