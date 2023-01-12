package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.ADDING
import typings.nodeRedEditorClient.anon.Buttons
import typings.nodeRedEditorClient.anon.FnCall
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedUtil.mod.I18nTFunction
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RED extends StObject {
  
  // assigned in i18n.js (on init)
  @JSName("_")
  def _underscore(id: String): String
  @JSName("_")
  def _underscore(id: String, tplStrs: Record[String, String | Double]): String
  // assigned in i18n.js (on init)
  @JSName("_")
  var _underscore_Original: I18nTFunction
  
  // ui
  var actionList: ActionList
  
  var actions: Actions
  
  var clipboard: Clipboard
  
  // ui > common
  var colorPicker: ColorPicker
  
  // root
  var comms: Comms
  
  var deploy: Deploy
  
  var diff: Diff
  
  var editor: Editor
  
  var eventLog: EventLog
  
  var events: Events
  
  var group: Group
  
  var history: History
  
  var i18n: I18n
  
  var keyboard: Keyboard
  
  var library: Library
  
  var menu: Menu
  
  var nodes: Nodes
  
  var notifications: Notifications
  
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
  def notify(msg: String): HTMLDivElement
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
  def notify(msg: String, options: Buttons): HTMLDivElement
  def notify(msg: String, `type`: Unit, fixed: Boolean): HTMLDivElement
  def notify(msg: String, `type`: Unit, fixed: Boolean, timeout: Double): HTMLDivElement
  def notify(msg: String, `type`: Unit, fixed: Unit, timeout: Double): HTMLDivElement
  def notify(msg: String, `type`: NotificationType): HTMLDivElement
  def notify(msg: String, `type`: NotificationType, fixed: Boolean): HTMLDivElement
  def notify(msg: String, `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement
  def notify(msg: String, `type`: NotificationType, fixed: Unit, timeout: Double): HTMLDivElement
  def notify(msg: JQuery[HTMLElement]): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], options: Buttons): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], `type`: Unit, fixed: Boolean): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], `type`: Unit, fixed: Boolean, timeout: Double): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], `type`: Unit, fixed: Unit, timeout: Double): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Unit, timeout: Double): HTMLDivElement
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
  var notify_Original: FnCall
  
  var palette: Palette
  
  var panels: Panels
  
  var popover: Popover
  
  var projects: Projects
  
  var search: Search
  
  var settings: SettingsWithData
  
  var sidebar: Sidebar
  
  var stack: Stack
  
  var state: ADDING
  
  var statusBar: StatusBar
  
  var subflow: Subflow
  
  var tabs: Tabs
  
  // text
  var text: Text
  
  var touch: Touch
  
  var tray: Tray
  
  var typeSearch: TypeSearch
  
  var user: User
  
  var userSettings: UserSettings
  
  var utils: Utils
  
  var validators: Validators
  
  var view: View
  
  var workspaces: Workspaces
}
object RED {
  
  inline def apply(
    _underscore: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String,
    actionList: ActionList,
    actions: Actions,
    clipboard: Clipboard,
    colorPicker: ColorPicker,
    comms: Comms,
    deploy: Deploy,
    diff: Diff,
    editor: Editor,
    eventLog: EventLog,
    events: Events,
    group: Group,
    history: History,
    i18n: I18n,
    keyboard: Keyboard,
    library: Library,
    menu: Menu,
    nodes: Nodes,
    notifications: Notifications,
    notify_ : FnCall,
    palette: Palette,
    panels: Panels,
    popover: Popover,
    projects: Projects,
    search: Search,
    settings: SettingsWithData,
    sidebar: Sidebar,
    stack: Stack,
    state: ADDING,
    statusBar: StatusBar,
    subflow: Subflow,
    tabs: Tabs,
    text: Text,
    touch: Touch,
    tray: Tray,
    typeSearch: TypeSearch,
    user: User,
    userSettings: UserSettings,
    utils: Utils,
    validators: Validators,
    view: View,
    workspaces: Workspaces
  ): RED = {
    val __obj = js.Dynamic.literal(actionList = actionList.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], colorPicker = colorPicker.asInstanceOf[js.Any], comms = comms.asInstanceOf[js.Any], deploy = deploy.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], eventLog = eventLog.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], popover = popover.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statusBar = statusBar.asInstanceOf[js.Any], subflow = subflow.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any], typeSearch = typeSearch.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(js.Any.fromFunction2(_underscore))
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[RED]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RED] (val x: Self) extends AnyVal {
    
    inline def setActionList(value: ActionList): Self = StObject.set(x, "actionList", value.asInstanceOf[js.Any])
    
    inline def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    inline def setColorPicker(value: ColorPicker): Self = StObject.set(x, "colorPicker", value.asInstanceOf[js.Any])
    
    inline def setComms(value: Comms): Self = StObject.set(x, "comms", value.asInstanceOf[js.Any])
    
    inline def setDeploy(value: Deploy): Self = StObject.set(x, "deploy", value.asInstanceOf[js.Any])
    
    inline def setDiff(value: Diff): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEventLog(value: EventLog): Self = StObject.set(x, "eventLog", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setKeyboard(value: Keyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Library): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Nodes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: Notifications): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: FnCall): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPanels(value: Panels): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setPopover(value: Popover): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setProjects(value: Projects): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: SettingsWithData): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSidebar(value: Sidebar): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    inline def setStack(value: Stack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setState(value: ADDING): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatusBar(value: StatusBar): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    inline def setSubflow(value: Subflow): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: Tabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTouch(value: Touch): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTray(value: Tray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
    
    inline def setTypeSearch(value: TypeSearch): Self = StObject.set(x, "typeSearch", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
    
    inline def setUtils(value: Utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    
    inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setWorkspaces(value: Workspaces): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def set_underscore(value: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String): Self = StObject.set(x, "_", js.Any.fromFunction2(value))
  }
}
