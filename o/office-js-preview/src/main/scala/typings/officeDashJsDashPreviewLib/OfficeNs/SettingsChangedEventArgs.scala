package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides information about the settings that raised the settingsChanged event.
     * 
     * @remarks
     * <table><tr><td>Requirement Sets</td><td>Settings</td></tr></table>
     * 
     * To add an event handler for the settingsChanged event, use the addHandlerAsync method of the 
     * {@link Office.Settings} object.
     * 
     * The settingsChanged event fires only when your add-in's script calls the Settings.saveAsync method to persist 
     * the in-memory copy of the settings into the document file. The settingsChanged event is not triggered when the 
     * Settings.set or Settings.remove methods are called.
     * 
     * The settingsChanged event was designed to let you to handle potential conflicts when two or more users are 
     * attempting to save settings at the same time when your add-in is used in a shared (co-authored) document.
     * 
     * **Important:** Your add-in's code can register a handler for the settingsChanged event when the add-in 
     * is running with any Excel client, but the event will fire only when the add-in is loaded with a spreadsheet 
     * that is opened in Excel Online, and more than one user is editing the spreadsheet (co-authoring). 
     * Therefore, effectively the settingsChanged event is supported only in Excel Online in co-authoring scenarios.
     * 
     * **Support details**
     * 
     * A capital Y in the following matrix indicates that this interface is supported in the corresponding Office host application. 
     * An empty cell indicates that the Office host application doesn't support this interface.
     * 
     * For more information about Office host application and server requirements, see 
     * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
     * 
     * *Supported hosts, by platform*
     *  <table>
     *   <tr><th>                        </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
     *   <tr><td><strong> Excel </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
     *   <tr><td><strong> Word  </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td></tr>
     *  </table>
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

