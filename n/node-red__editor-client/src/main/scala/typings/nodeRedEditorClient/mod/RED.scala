package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.ADDING
import typings.nodeRedEditorClient.anon.Buttons
import typings.nodeRedEditorClient.anon.FnCall
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedUtil.mod.I18nTFunction
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RED extends js.Object {
  
  // assigned in i18n.js (on init)
  @JSName("_")
  def _underscore(id: String): String = js.native
  @JSName("_")
  def _underscore(id: String, tplStrs: Record[String, String | Double]): String = js.native
  // assigned in i18n.js (on init)
  @JSName("_")
  var _underscore_Original: I18nTFunction = js.native
  
  // ui
  var actionList: ActionList = js.native
  
  var actions: Actions = js.native
  
  var clipboard: Clipboard = js.native
  
  // ui > common
  var colorPicker: ColorPicker = js.native
  
  // root
  var comms: Comms = js.native
  
  var deploy: Deploy = js.native
  
  var diff: Diff = js.native
  
  var editor: Editor = js.native
  
  var eventLog: EventLog = js.native
  
  var events: Events = js.native
  
  var group: Group = js.native
  
  var history: History = js.native
  
  var i18n: I18n = js.native
  
  var keyboard: Keyboard = js.native
  
  var library: Library = js.native
  
  var menu: Menu = js.native
  
  var nodes: Nodes = js.native
  
  var notifications: Notifications = js.native
  
  // assigned in ui/notifications.js
  /*
    If RED.notifications.hide is set to true, all notifications will be hidden.
    This is to help with UI testing in certain cases and not intended for the
    end-user.
    // Example usage for a modal dialog with buttons
    var myNotification = RED.notify("This is the message to display",{
    modal: true,
    fixed: true,
    type: 'warning', // 'compact', 'success', 'warning', 'error'
    buttons: [
    {
    text: "cancel",
    click: function(e) {
    myNotification.close();
    }
    },
    {
    text: "okay",
    class:"primary",
    click: function(e) {
    myNotification.close();
    }
    }
    ]
    });
    */
  def notify(msg: String): HTMLDivElement = js.native
  // assigned in ui/notifications.js
  /*
    If RED.notifications.hide is set to true, all notifications will be hidden.
    This is to help with UI testing in certain cases and not intended for the
    end-user.
    // Example usage for a modal dialog with buttons
    var myNotification = RED.notify("This is the message to display",{
    modal: true,
    fixed: true,
    type: 'warning', // 'compact', 'success', 'warning', 'error'
    buttons: [
    {
    text: "cancel",
    click: function(e) {
    myNotification.close();
    }
    },
    {
    text: "okay",
    class:"primary",
    click: function(e) {
    myNotification.close();
    }
    }
    ]
    });
    */
  def notify(msg: String, options: Buttons): HTMLDivElement = js.native
  def notify(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: js.UndefOr[scala.Nothing], timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: js.UndefOr[scala.Nothing], timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement]): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], options: Buttons): HTMLDivElement = js.native
  def notify(
    msg: JQuery[HTMLElement],
    `type`: js.UndefOr[scala.Nothing],
    fixed: js.UndefOr[scala.Nothing],
    timeout: Double
  ): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: js.UndefOr[scala.Nothing], fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: js.UndefOr[scala.Nothing], fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType): HTMLDivElement = js.native
  def notify(
    msg: JQuery[HTMLElement],
    `type`: NotificationType,
    fixed: js.UndefOr[scala.Nothing],
    timeout: Double
  ): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  // assigned in ui/notifications.js
  /*
    If RED.notifications.hide is set to true, all notifications will be hidden.
    This is to help with UI testing in certain cases and not intended for the
    end-user.
    // Example usage for a modal dialog with buttons
    var myNotification = RED.notify("This is the message to display",{
    modal: true,
    fixed: true,
    type: 'warning', // 'compact', 'success', 'warning', 'error'
    buttons: [
    {
    text: "cancel",
    click: function(e) {
    myNotification.close();
    }
    },
    {
    text: "okay",
    class:"primary",
    click: function(e) {
    myNotification.close();
    }
    }
    ]
    });
    */
  @JSName("notify")
  var notify_Original: FnCall = js.native
  
  var palette: Palette = js.native
  
  var panels: Panels = js.native
  
  var popover: Popover = js.native
  
  var projects: Projects = js.native
  
  var search: Search = js.native
  
  var settings: SettingsWithData = js.native
  
  var sidebar: Sidebar = js.native
  
  var stack: Stack = js.native
  
  var state: ADDING = js.native
  
  var statusBar: StatusBar = js.native
  
  var subflow: Subflow = js.native
  
  var tabs: Tabs = js.native
  
  // text
  var text: Text = js.native
  
  var touch: Touch = js.native
  
  var tray: Tray = js.native
  
  var typeSearch: TypeSearch = js.native
  
  var user: User = js.native
  
  var userSettings: UserSettings = js.native
  
  var utils: Utils = js.native
  
  var validators: Validators = js.native
  
  var view: View = js.native
  
  var workspaces: Workspaces = js.native
}
