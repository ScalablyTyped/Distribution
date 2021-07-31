package typings.openfin

import typings.openfin.apiGlobalHotkeyMod.nonHotkeyEvents
import typings.openfin.frameFrameMod.EntityType
import typings.openfin.logMod.LogLevel
import typings.openfin.mod.fin.OpenFinApplicationEventType
import typings.openfin.mod.fin.OpenFinExternalApplicationEventType
import typings.openfin.mod.fin.OpenFinGlobalHotkeyEventType
import typings.openfin.mod.fin.OpenFinSystemEventType
import typings.openfin.mod.fin.OpenFinWindowEventType
import typings.openfin.shapesMod.AnchorType
import typings.openfin.utilsMod.LayoutPresetTypes
import typings.openfin.webcontentsWebcontentsMod.ImageFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openfinStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `abnormal-termination` extends StObject
  @scala.inline
  def `abnormal-termination`: `abnormal-termination` = "abnormal-termination".asInstanceOf[`abnormal-termination`]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait app extends StObject
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait application extends StObject
  @scala.inline
  def application: application = "application".asInstanceOf[application]
  
  @js.native
  sealed trait `application-closed`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `application-closed`: `application-closed` = "application-closed".asInstanceOf[`application-closed`]
  
  @js.native
  sealed trait `application-connected` extends StObject
  @scala.inline
  def `application-connected`: `application-connected` = "application-connected".asInstanceOf[`application-connected`]
  
  @js.native
  sealed trait `application-crashed`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `application-crashed`: `application-crashed` = "application-crashed".asInstanceOf[`application-crashed`]
  
  @js.native
  sealed trait `application-created`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `application-created`: `application-created` = "application-created".asInstanceOf[`application-created`]
  
  @js.native
  sealed trait `application-initialized` extends StObject
  @scala.inline
  def `application-initialized`: `application-initialized` = "application-initialized".asInstanceOf[`application-initialized`]
  
  @js.native
  sealed trait `application-manifest-changed` extends StObject
  @scala.inline
  def `application-manifest-changed`: `application-manifest-changed` = "application-manifest-changed".asInstanceOf[`application-manifest-changed`]
  
  @js.native
  sealed trait `application-not-responding` extends StObject
  @scala.inline
  def `application-not-responding`: `application-not-responding` = "application-not-responding".asInstanceOf[`application-not-responding`]
  
  @js.native
  sealed trait `application-responding` extends StObject
  @scala.inline
  def `application-responding`: `application-responding` = "application-responding".asInstanceOf[`application-responding`]
  
  @js.native
  sealed trait `application-started`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `application-started`: `application-started` = "application-started".asInstanceOf[`application-started`]
  
  @js.native
  sealed trait `application-tray-icon-clicked` extends StObject
  @scala.inline
  def `application-tray-icon-clicked`: `application-tray-icon-clicked` = "application-tray-icon-clicked".asInstanceOf[`application-tray-icon-clicked`]
  
  @js.native
  sealed trait attached extends StObject
  @scala.inline
  def attached: attached = "attached".asInstanceOf[attached]
  
  @js.native
  sealed trait `auth-requested`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `auth-requested`: `auth-requested` = "auth-requested".asInstanceOf[`auth-requested`]
  
  @js.native
  sealed trait `begin-user-bounds-changing` extends StObject
  @scala.inline
  def `begin-user-bounds-changing`: `begin-user-bounds-changing` = "begin-user-bounds-changing".asInstanceOf[`begin-user-bounds-changing`]
  
  @js.native
  sealed trait blurred
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def blurred: blurred = "blurred".asInstanceOf[blurred]
  
  @js.native
  sealed trait bmp
    extends StObject
       with ImageFormat
  @scala.inline
  def bmp: bmp = "bmp".asInstanceOf[bmp]
  
  @js.native
  sealed trait `bottom-left`
    extends StObject
       with AnchorType
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right`
    extends StObject
       with AnchorType
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait `bounds-changed`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `bounds-changed`: `bounds-changed` = "bounds-changed".asInstanceOf[`bounds-changed`]
  
  @js.native
  sealed trait `bounds-changing`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `bounds-changing`: `bounds-changing` = "bounds-changing".asInstanceOf[`bounds-changing`]
  
  @js.native
  sealed trait channel extends StObject
  @scala.inline
  def channel: channel = "channel".asInstanceOf[channel]
  
  @js.native
  sealed trait `channel-changed` extends StObject
  @scala.inline
  def `channel-changed`: `channel-changed` = "channel-changed".asInstanceOf[`channel-changed`]
  
  @js.native
  sealed trait clean extends StObject
  @scala.inline
  def clean: clean = "clean".asInstanceOf[clean]
  
  @js.native
  sealed trait click extends StObject
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait close extends StObject
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait `close-requested`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `close-requested`: `close-requested` = "close-requested".asInstanceOf[`close-requested`]
  
  @js.native
  sealed trait closed
    extends StObject
       with OpenFinApplicationEventType
       with OpenFinWindowEventType
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closing extends StObject
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait column extends StObject
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait columns
    extends StObject
       with LayoutPresetTypes
  @scala.inline
  def columns: columns = "columns".asInstanceOf[columns]
  
  @js.native
  sealed trait component extends StObject
  @scala.inline
  def component: component = "component".asInstanceOf[component]
  
  @js.native
  sealed trait connected
    extends StObject
       with OpenFinApplicationEventType
       with OpenFinExternalApplicationEventType
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait crashed
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def crashed: crashed = "crashed".asInstanceOf[crashed]
  
  @js.native
  sealed trait created extends StObject
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait custom extends StObject
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait debug extends StObject
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait `desktop-icon-clicked`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `desktop-icon-clicked`: `desktop-icon-clicked` = "desktop-icon-clicked".asInstanceOf[`desktop-icon-clicked`]
  
  @js.native
  sealed trait destroyed extends StObject
  @scala.inline
  def destroyed: destroyed = "destroyed".asInstanceOf[destroyed]
  
  @js.native
  sealed trait `disabled-frame-bounds-changed`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `disabled-frame-bounds-changed`: `disabled-frame-bounds-changed` = "disabled-frame-bounds-changed".asInstanceOf[`disabled-frame-bounds-changed`]
  
  @js.native
  sealed trait `disabled-frame-bounds-changing`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `disabled-frame-bounds-changing`: `disabled-frame-bounds-changing` = "disabled-frame-bounds-changing".asInstanceOf[`disabled-frame-bounds-changing`]
  
  @js.native
  sealed trait `disabled-movement-bounds-changed` extends StObject
  @scala.inline
  def `disabled-movement-bounds-changed`: `disabled-movement-bounds-changed` = "disabled-movement-bounds-changed".asInstanceOf[`disabled-movement-bounds-changed`]
  
  @js.native
  sealed trait `disabled-movement-bounds-changing` extends StObject
  @scala.inline
  def `disabled-movement-bounds-changing`: `disabled-movement-bounds-changing` = "disabled-movement-bounds-changing".asInstanceOf[`disabled-movement-bounds-changing`]
  
  @js.native
  sealed trait disband extends StObject
  @scala.inline
  def disband: disband = "disband".asInstanceOf[disband]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with OpenFinExternalApplicationEventType
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait embedded
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def embedded: embedded = "embedded".asInstanceOf[embedded]
  
  @js.native
  sealed trait `end-user-bounds-changing` extends StObject
  @scala.inline
  def `end-user-bounds-changing`: `end-user-bounds-changing` = "end-user-bounds-changing".asInstanceOf[`end-user-bounds-changing`]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait `external connection`
    extends StObject
       with EntityType
  @scala.inline
  def `external connection`: `external connection` = ("external connection").asInstanceOf[`external connection`]
  
  @js.native
  sealed trait `external-process-exited`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `external-process-exited`: `external-process-exited` = "external-process-exited".asInstanceOf[`external-process-exited`]
  
  @js.native
  sealed trait `external-process-started`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `external-process-started`: `external-process-started` = "external-process-started".asInstanceOf[`external-process-started`]
  
  @js.native
  sealed trait `external-window` extends StObject
  @scala.inline
  def `external-window`: `external-window` = "external-window".asInstanceOf[`external-window`]
  
  @js.native
  sealed trait `external-window-closed` extends StObject
  @scala.inline
  def `external-window-closed`: `external-window-closed` = "external-window-closed".asInstanceOf[`external-window-closed`]
  
  @js.native
  sealed trait `external-window-created` extends StObject
  @scala.inline
  def `external-window-created`: `external-window-created` = "external-window-created".asInstanceOf[`external-window-created`]
  
  @js.native
  sealed trait `external-window-hidden` extends StObject
  @scala.inline
  def `external-window-hidden`: `external-window-hidden` = "external-window-hidden".asInstanceOf[`external-window-hidden`]
  
  @js.native
  sealed trait `external-window-shown` extends StObject
  @scala.inline
  def `external-window-shown`: `external-window-shown` = "external-window-shown".asInstanceOf[`external-window-shown`]
  
  @js.native
  sealed trait externalapplication extends StObject
  @scala.inline
  def externalapplication: externalapplication = "externalapplication".asInstanceOf[externalapplication]
  
  @js.native
  sealed trait failed extends StObject
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevel
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait fdc3Dotcontact extends StObject
  @scala.inline
  def fdc3Dotcontact: fdc3Dotcontact = "fdc3.contact".asInstanceOf[fdc3Dotcontact]
  
  @js.native
  sealed trait fdc3Dotinstrument extends StObject
  @scala.inline
  def fdc3Dotinstrument: fdc3Dotinstrument = "fdc3.instrument".asInstanceOf[fdc3Dotinstrument]
  
  @js.native
  sealed trait fdc3Dotorganization extends StObject
  @scala.inline
  def fdc3Dotorganization: fdc3Dotorganization = "fdc3.organization".asInstanceOf[fdc3Dotorganization]
  
  @js.native
  sealed trait focused
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def focused: focused = "focused".asInstanceOf[focused]
  
  @js.native
  sealed trait frame extends StObject
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait `frame-disabled`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `frame-disabled`: `frame-disabled` = "frame-disabled".asInstanceOf[`frame-disabled`]
  
  @js.native
  sealed trait `frame-enabled`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `frame-enabled`: `frame-enabled` = "frame-enabled".asInstanceOf[`frame-enabled`]
  
  @js.native
  sealed trait `global-hotkey` extends StObject
  @scala.inline
  def `global-hotkey`: `global-hotkey` = "global-hotkey".asInstanceOf[`global-hotkey`]
  
  @js.native
  sealed trait grid
    extends StObject
       with LayoutPresetTypes
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait `group-changed`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `group-changed`: `group-changed` = "group-changed".asInstanceOf[`group-changed`]
  
  @js.native
  sealed trait hidden
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hide extends StObject
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait `hide-on-close` extends StObject
  @scala.inline
  def `hide-on-close`: `hide-on-close` = "hide-on-close".asInstanceOf[`hide-on-close`]
  
  @js.native
  sealed trait hotkey extends StObject
  @scala.inline
  def hotkey: hotkey = "hotkey".asInstanceOf[hotkey]
  
  @js.native
  sealed trait `idle-state-changed`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `idle-state-changed`: `idle-state-changed` = "idle-state-changed".asInstanceOf[`idle-state-changed`]
  
  @js.native
  sealed trait iframe
    extends StObject
       with EntityType
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait image extends StObject
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait initialized
    extends StObject
       with OpenFinApplicationEventType
       with OpenFinWindowEventType
  @scala.inline
  def initialized: initialized = "initialized".asInstanceOf[initialized]
  
  @js.native
  sealed trait join extends StObject
  @scala.inline
  def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait jpg
    extends StObject
       with ImageFormat
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
  
  @js.native
  sealed trait keyDown extends StObject
  @scala.inline
  def keyDown: keyDown = "keyDown".asInstanceOf[keyDown]
  
  @js.native
  sealed trait keyUp extends StObject
  @scala.inline
  def keyUp: keyUp = "keyUp".asInstanceOf[keyUp]
  
  @js.native
  sealed trait killed extends StObject
  @scala.inline
  def killed: killed = "killed".asInstanceOf[killed]
  
  @js.native
  sealed trait last extends StObject
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait `launch-failed` extends StObject
  @scala.inline
  def `launch-failed`: `launch-failed` = "launch-failed".asInstanceOf[`launch-failed`]
  
  @js.native
  sealed trait `layout-initialized` extends StObject
  @scala.inline
  def `layout-initialized`: `layout-initialized` = "layout-initialized".asInstanceOf[`layout-initialized`]
  
  @js.native
  sealed trait `layout-ready` extends StObject
  @scala.inline
  def `layout-ready`: `layout-ready` = "layout-ready".asInstanceOf[`layout-ready`]
  
  @js.native
  sealed trait leave extends StObject
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait `load-failed` extends StObject
  @scala.inline
  def `load-failed`: `load-failed` = "load-failed".asInstanceOf[`load-failed`]
  
  @js.native
  sealed trait `load-started` extends StObject
  @scala.inline
  def `load-started`: `load-started` = "load-started".asInstanceOf[`load-started`]
  
  @js.native
  sealed trait `load-succeeded` extends StObject
  @scala.inline
  def `load-succeeded`: `load-succeeded` = "load-succeeded".asInstanceOf[`load-succeeded`]
  
  @js.native
  sealed trait lock extends StObject
  @scala.inline
  def lock: lock = "lock".asInstanceOf[lock]
  
  @js.native
  sealed trait longEdge extends StObject
  @scala.inline
  def longEdge: longEdge = "longEdge".asInstanceOf[longEdge]
  
  @js.native
  sealed trait `main-window` extends StObject
  @scala.inline
  def `main-window`: `main-window` = "main-window".asInstanceOf[`main-window`]
  
  @js.native
  sealed trait mainFrame extends StObject
  @scala.inline
  def mainFrame: mainFrame = "mainFrame".asInstanceOf[mainFrame]
  
  @js.native
  sealed trait `manifest-changed`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `manifest-changed`: `manifest-changed` = "manifest-changed".asInstanceOf[`manifest-changed`]
  
  @js.native
  sealed trait maximized
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait merge extends StObject
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  
  @js.native
  sealed trait message extends StObject
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait minimized
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait `monitor-info-changed`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `monitor-info-changed`: `monitor-info-changed` = "monitor-info-changed".asInstanceOf[`monitor-info-changed`]
  
  @js.native
  sealed trait `navigation-rejected`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `navigation-rejected`: `navigation-rejected` = "navigation-rejected".asInstanceOf[`navigation-rejected`]
  
  @js.native
  sealed trait never extends StObject
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal extends StObject
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `normal-termination` extends StObject
  @scala.inline
  def `normal-termination`: `normal-termination` = "normal-termination".asInstanceOf[`normal-termination`]
  
  @js.native
  sealed trait `not-responding`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `not-responding`: `not-responding` = "not-responding".asInstanceOf[`not-responding`]
  
  @js.native
  sealed trait nothing extends StObject
  @scala.inline
  def nothing: nothing = "nothing".asInstanceOf[nothing]
  
  @js.native
  sealed trait notification extends StObject
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait `object` extends StObject
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait `options-changed` extends StObject
  @scala.inline
  def `options-changed`: `options-changed` = "options-changed".asInstanceOf[`options-changed`]
  
  @js.native
  sealed trait other extends StObject
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait `out-of-memory`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `out-of-memory`: `out-of-memory` = "out-of-memory".asInstanceOf[`out-of-memory`]
  
  @js.native
  sealed trait `performance-report` extends StObject
  @scala.inline
  def `performance-report`: `performance-report` = "performance-report".asInstanceOf[`performance-report`]
  
  @js.native
  sealed trait `platform-api-ready` extends StObject
  @scala.inline
  def `platform-api-ready`: `platform-api-ready` = "platform-api-ready".asInstanceOf[`platform-api-ready`]
  
  @js.native
  sealed trait `platform-snapshot-applied` extends StObject
  @scala.inline
  def `platform-snapshot-applied`: `platform-snapshot-applied` = "platform-snapshot-applied".asInstanceOf[`platform-snapshot-applied`]
  
  @js.native
  sealed trait png
    extends StObject
       with ImageFormat
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait `preload-scripts-state-changed` extends StObject
  @scala.inline
  def `preload-scripts-state-changed`: `preload-scripts-state-changed` = "preload-scripts-state-changed".asInstanceOf[`preload-scripts-state-changed`]
  
  @js.native
  sealed trait `preload-scripts-state-changing` extends StObject
  @scala.inline
  def `preload-scripts-state-changing`: `preload-scripts-state-changing` = "preload-scripts-state-changing".asInstanceOf[`preload-scripts-state-changing`]
  
  @js.native
  sealed trait printableArea extends StObject
  @scala.inline
  def printableArea: printableArea = "printableArea".asInstanceOf[printableArea]
  
  @js.native
  sealed trait `process-desktop-event` extends StObject
  @scala.inline
  def `process-desktop-event`: `process-desktop-event` = "process-desktop-event".asInstanceOf[`process-desktop-event`]
  
  @js.native
  sealed trait `process-notification-event` extends StObject
  @scala.inline
  def `process-notification-event`: `process-notification-event` = "process-notification-event".asInstanceOf[`process-notification-event`]
  
  @js.native
  sealed trait registered
    extends StObject
       with OpenFinGlobalHotkeyEventType
       with nonHotkeyEvents
  @scala.inline
  def registered: registered = "registered".asInstanceOf[registered]
  
  @js.native
  sealed trait reloaded extends StObject
  @scala.inline
  def reloaded: reloaded = "reloaded".asInstanceOf[reloaded]
  
  @js.native
  sealed trait `remote-connect` extends StObject
  @scala.inline
  def `remote-connect`: `remote-connect` = "remote-connect".asInstanceOf[`remote-connect`]
  
  @js.native
  sealed trait `remote-disconnect` extends StObject
  @scala.inline
  def `remote-disconnect`: `remote-disconnect` = "remote-disconnect".asInstanceOf[`remote-disconnect`]
  
  @js.native
  sealed trait `request-external-authorization` extends StObject
  @scala.inline
  def `request-external-authorization`: `request-external-authorization` = "request-external-authorization".asInstanceOf[`request-external-authorization`]
  
  @js.native
  sealed trait responding
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def responding: responding = "responding".asInstanceOf[responding]
  
  @js.native
  sealed trait restored
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def restored: restored = "restored".asInstanceOf[restored]
  
  @js.native
  sealed trait row extends StObject
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait rows
    extends StObject
       with LayoutPresetTypes
  @scala.inline
  def rows: rows = "rows".asInstanceOf[rows]
  
  @js.native
  sealed trait `run-requested`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `run-requested`: `run-requested` = "run-requested".asInstanceOf[`run-requested`]
  
  @js.native
  sealed trait script extends StObject
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait `session-changed`
    extends StObject
       with OpenFinSystemEventType
  @scala.inline
  def `session-changed`: `session-changed` = "session-changed".asInstanceOf[`session-changed`]
  
  @js.native
  sealed trait shortEdge extends StObject
  @scala.inline
  def shortEdge: shortEdge = "shortEdge".asInstanceOf[shortEdge]
  
  @js.native
  sealed trait show extends StObject
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait `show-requested`
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def `show-requested`: `show-requested` = "show-requested".asInstanceOf[`show-requested`]
  
  @js.native
  sealed trait shown
    extends StObject
       with OpenFinWindowEventType
  @scala.inline
  def shown: shown = "shown".asInstanceOf[shown]
  
  @js.native
  sealed trait simplex extends StObject
  @scala.inline
  def simplex: simplex = "simplex".asInstanceOf[simplex]
  
  @js.native
  sealed trait source extends StObject
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait started
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait `still-running` extends StObject
  @scala.inline
  def `still-running`: `still-running` = "still-running".asInstanceOf[`still-running`]
  
  @js.native
  sealed trait styleSheet extends StObject
  @scala.inline
  def styleSheet: styleSheet = "styleSheet".asInstanceOf[styleSheet]
  
  @js.native
  sealed trait subFrame extends StObject
  @scala.inline
  def subFrame: subFrame = "subFrame".asInstanceOf[subFrame]
  
  @js.native
  sealed trait succeeded extends StObject
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @js.native
  sealed trait system extends StObject
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait tabs
    extends StObject
       with LayoutPresetTypes
  @scala.inline
  def tabs: tabs = "tabs".asInstanceOf[tabs]
  
  @js.native
  sealed trait target extends StObject
  @scala.inline
  def target: target = "target".asInstanceOf[target]
  
  @js.native
  sealed trait `target-changed` extends StObject
  @scala.inline
  def `target-changed`: `target-changed` = "target-changed".asInstanceOf[`target-changed`]
  
  @js.native
  sealed trait terminated extends StObject
  @scala.inline
  def terminated: terminated = "terminated".asInstanceOf[terminated]
  
  @js.native
  sealed trait `top-left`
    extends StObject
       with AnchorType
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right`
    extends StObject
       with AnchorType
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait `tray-icon-clicked`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `tray-icon-clicked`: `tray-icon-clicked` = "tray-icon-clicked".asInstanceOf[`tray-icon-clicked`]
  
  @js.native
  sealed trait unknown
    extends StObject
       with EntityType
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unlock extends StObject
  @scala.inline
  def unlock: unlock = "unlock".asInstanceOf[unlock]
  
  @js.native
  sealed trait unregistered
    extends StObject
       with OpenFinGlobalHotkeyEventType
       with nonHotkeyEvents
  @scala.inline
  def unregistered: unregistered = "unregistered".asInstanceOf[unregistered]
  
  @js.native
  sealed trait `user-movement-disabled` extends StObject
  @scala.inline
  def `user-movement-disabled`: `user-movement-disabled` = "user-movement-disabled".asInstanceOf[`user-movement-disabled`]
  
  @js.native
  sealed trait `user-movement-enabled` extends StObject
  @scala.inline
  def `user-movement-enabled`: `user-movement-enabled` = "user-movement-enabled".asInstanceOf[`user-movement-enabled`]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevel
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait view
    extends StObject
       with EntityType
  @scala.inline
  def view: view = "view".asInstanceOf[view]
  
  @js.native
  sealed trait `view-attached` extends StObject
  @scala.inline
  def `view-attached`: `view-attached` = "view-attached".asInstanceOf[`view-attached`]
  
  @js.native
  sealed trait `view-blurred` extends StObject
  @scala.inline
  def `view-blurred`: `view-blurred` = "view-blurred".asInstanceOf[`view-blurred`]
  
  @js.native
  sealed trait `view-crashed` extends StObject
  @scala.inline
  def `view-crashed`: `view-crashed` = "view-crashed".asInstanceOf[`view-crashed`]
  
  @js.native
  sealed trait `view-created` extends StObject
  @scala.inline
  def `view-created`: `view-created` = "view-created".asInstanceOf[`view-created`]
  
  @js.native
  sealed trait `view-destroyed` extends StObject
  @scala.inline
  def `view-destroyed`: `view-destroyed` = "view-destroyed".asInstanceOf[`view-destroyed`]
  
  @js.native
  sealed trait `view-detached` extends StObject
  @scala.inline
  def `view-detached`: `view-detached` = "view-detached".asInstanceOf[`view-detached`]
  
  @js.native
  sealed trait `view-did-change-theme-color` extends StObject
  @scala.inline
  def `view-did-change-theme-color`: `view-did-change-theme-color` = "view-did-change-theme-color".asInstanceOf[`view-did-change-theme-color`]
  
  @js.native
  sealed trait `view-focused` extends StObject
  @scala.inline
  def `view-focused`: `view-focused` = "view-focused".asInstanceOf[`view-focused`]
  
  @js.native
  sealed trait `view-hidden` extends StObject
  @scala.inline
  def `view-hidden`: `view-hidden` = "view-hidden".asInstanceOf[`view-hidden`]
  
  @js.native
  sealed trait `view-hotkey` extends StObject
  @scala.inline
  def `view-hotkey`: `view-hotkey` = "view-hotkey".asInstanceOf[`view-hotkey`]
  
  @js.native
  sealed trait `view-navigation-rejected` extends StObject
  @scala.inline
  def `view-navigation-rejected`: `view-navigation-rejected` = "view-navigation-rejected".asInstanceOf[`view-navigation-rejected`]
  
  @js.native
  sealed trait `view-page-favicon-updated` extends StObject
  @scala.inline
  def `view-page-favicon-updated`: `view-page-favicon-updated` = "view-page-favicon-updated".asInstanceOf[`view-page-favicon-updated`]
  
  @js.native
  sealed trait `view-page-title-updated` extends StObject
  @scala.inline
  def `view-page-title-updated`: `view-page-title-updated` = "view-page-title-updated".asInstanceOf[`view-page-title-updated`]
  
  @js.native
  sealed trait `view-resource-load-failed` extends StObject
  @scala.inline
  def `view-resource-load-failed`: `view-resource-load-failed` = "view-resource-load-failed".asInstanceOf[`view-resource-load-failed`]
  
  @js.native
  sealed trait `view-resource-response-received` extends StObject
  @scala.inline
  def `view-resource-response-received`: `view-resource-response-received` = "view-resource-response-received".asInstanceOf[`view-resource-response-received`]
  
  @js.native
  sealed trait `view-shown` extends StObject
  @scala.inline
  def `view-shown`: `view-shown` = "view-shown".asInstanceOf[`view-shown`]
  
  @js.native
  sealed trait `view-target-changed` extends StObject
  @scala.inline
  def `view-target-changed`: `view-target-changed` = "view-target-changed".asInstanceOf[`view-target-changed`]
  
  @js.native
  sealed trait warn extends StObject
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait warning
    extends StObject
       with LogLevel
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait `will-move` extends StObject
  @scala.inline
  def `will-move`: `will-move` = "will-move".asInstanceOf[`will-move`]
  
  @js.native
  sealed trait `will-resize` extends StObject
  @scala.inline
  def `will-resize`: `will-resize` = "will-resize".asInstanceOf[`will-resize`]
  
  @js.native
  sealed trait window
    extends StObject
       with EntityType
  @scala.inline
  def window: window = "window".asInstanceOf[window]
  
  @js.native
  sealed trait `window-added` extends StObject
  @scala.inline
  def `window-added`: `window-added` = "window-added".asInstanceOf[`window-added`]
  
  @js.native
  sealed trait `window-alert-requested`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-alert-requested`: `window-alert-requested` = "window-alert-requested".asInstanceOf[`window-alert-requested`]
  
  @js.native
  sealed trait `window-auth-requested`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-auth-requested`: `window-auth-requested` = "window-auth-requested".asInstanceOf[`window-auth-requested`]
  
  @js.native
  sealed trait `window-begin-user-bounds-changing` extends StObject
  @scala.inline
  def `window-begin-user-bounds-changing`: `window-begin-user-bounds-changing` = "window-begin-user-bounds-changing".asInstanceOf[`window-begin-user-bounds-changing`]
  
  @js.native
  sealed trait `window-blurred` extends StObject
  @scala.inline
  def `window-blurred`: `window-blurred` = "window-blurred".asInstanceOf[`window-blurred`]
  
  @js.native
  sealed trait `window-bounds-changed` extends StObject
  @scala.inline
  def `window-bounds-changed`: `window-bounds-changed` = "window-bounds-changed".asInstanceOf[`window-bounds-changed`]
  
  @js.native
  sealed trait `window-bounds-changing` extends StObject
  @scala.inline
  def `window-bounds-changing`: `window-bounds-changing` = "window-bounds-changing".asInstanceOf[`window-bounds-changing`]
  
  @js.native
  sealed trait `window-closed`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-closed`: `window-closed` = "window-closed".asInstanceOf[`window-closed`]
  
  @js.native
  sealed trait `window-closing` extends StObject
  @scala.inline
  def `window-closing`: `window-closing` = "window-closing".asInstanceOf[`window-closing`]
  
  @js.native
  sealed trait `window-crashed` extends StObject
  @scala.inline
  def `window-crashed`: `window-crashed` = "window-crashed".asInstanceOf[`window-crashed`]
  
  @js.native
  sealed trait `window-created`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-created`: `window-created` = "window-created".asInstanceOf[`window-created`]
  
  @js.native
  sealed trait `window-did-change-theme-color` extends StObject
  @scala.inline
  def `window-did-change-theme-color`: `window-did-change-theme-color` = "window-did-change-theme-color".asInstanceOf[`window-did-change-theme-color`]
  
  @js.native
  sealed trait `window-disabled-movement-bounds-changed` extends StObject
  @scala.inline
  def `window-disabled-movement-bounds-changed`: `window-disabled-movement-bounds-changed` = "window-disabled-movement-bounds-changed".asInstanceOf[`window-disabled-movement-bounds-changed`]
  
  @js.native
  sealed trait `window-disabled-movement-bounds-changing` extends StObject
  @scala.inline
  def `window-disabled-movement-bounds-changing`: `window-disabled-movement-bounds-changing` = "window-disabled-movement-bounds-changing".asInstanceOf[`window-disabled-movement-bounds-changing`]
  
  @js.native
  sealed trait `window-embedded` extends StObject
  @scala.inline
  def `window-embedded`: `window-embedded` = "window-embedded".asInstanceOf[`window-embedded`]
  
  @js.native
  sealed trait `window-end-load`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-end-load`: `window-end-load` = "window-end-load".asInstanceOf[`window-end-load`]
  
  @js.native
  sealed trait `window-end-user-bounds-changing` extends StObject
  @scala.inline
  def `window-end-user-bounds-changing`: `window-end-user-bounds-changing` = "window-end-user-bounds-changing".asInstanceOf[`window-end-user-bounds-changing`]
  
  @js.native
  sealed trait `window-external-process-exited` extends StObject
  @scala.inline
  def `window-external-process-exited`: `window-external-process-exited` = "window-external-process-exited".asInstanceOf[`window-external-process-exited`]
  
  @js.native
  sealed trait `window-external-process-started` extends StObject
  @scala.inline
  def `window-external-process-started`: `window-external-process-started` = "window-external-process-started".asInstanceOf[`window-external-process-started`]
  
  @js.native
  sealed trait `window-focused` extends StObject
  @scala.inline
  def `window-focused`: `window-focused` = "window-focused".asInstanceOf[`window-focused`]
  
  @js.native
  sealed trait `window-group-changed` extends StObject
  @scala.inline
  def `window-group-changed`: `window-group-changed` = "window-group-changed".asInstanceOf[`window-group-changed`]
  
  @js.native
  sealed trait `window-hidden` extends StObject
  @scala.inline
  def `window-hidden`: `window-hidden` = "window-hidden".asInstanceOf[`window-hidden`]
  
  @js.native
  sealed trait `window-hotkey` extends StObject
  @scala.inline
  def `window-hotkey`: `window-hotkey` = "window-hotkey".asInstanceOf[`window-hotkey`]
  
  @js.native
  sealed trait `window-initialized` extends StObject
  @scala.inline
  def `window-initialized`: `window-initialized` = "window-initialized".asInstanceOf[`window-initialized`]
  
  @js.native
  sealed trait `window-layout-initialized` extends StObject
  @scala.inline
  def `window-layout-initialized`: `window-layout-initialized` = "window-layout-initialized".asInstanceOf[`window-layout-initialized`]
  
  @js.native
  sealed trait `window-layout-ready` extends StObject
  @scala.inline
  def `window-layout-ready`: `window-layout-ready` = "window-layout-ready".asInstanceOf[`window-layout-ready`]
  
  @js.native
  sealed trait `window-maximized` extends StObject
  @scala.inline
  def `window-maximized`: `window-maximized` = "window-maximized".asInstanceOf[`window-maximized`]
  
  @js.native
  sealed trait `window-minimized` extends StObject
  @scala.inline
  def `window-minimized`: `window-minimized` = "window-minimized".asInstanceOf[`window-minimized`]
  
  @js.native
  sealed trait `window-navigation-rejected`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-navigation-rejected`: `window-navigation-rejected` = "window-navigation-rejected".asInstanceOf[`window-navigation-rejected`]
  
  @js.native
  sealed trait `window-not-responding` extends StObject
  @scala.inline
  def `window-not-responding`: `window-not-responding` = "window-not-responding".asInstanceOf[`window-not-responding`]
  
  @js.native
  sealed trait `window-options-changed` extends StObject
  @scala.inline
  def `window-options-changed`: `window-options-changed` = "window-options-changed".asInstanceOf[`window-options-changed`]
  
  @js.native
  sealed trait `window-page-favicon-updated` extends StObject
  @scala.inline
  def `window-page-favicon-updated`: `window-page-favicon-updated` = "window-page-favicon-updated".asInstanceOf[`window-page-favicon-updated`]
  
  @js.native
  sealed trait `window-page-title-updated` extends StObject
  @scala.inline
  def `window-page-title-updated`: `window-page-title-updated` = "window-page-title-updated".asInstanceOf[`window-page-title-updated`]
  
  @js.native
  sealed trait `window-performance-report` extends StObject
  @scala.inline
  def `window-performance-report`: `window-performance-report` = "window-performance-report".asInstanceOf[`window-performance-report`]
  
  @js.native
  sealed trait `window-preload-scripts-state-changed` extends StObject
  @scala.inline
  def `window-preload-scripts-state-changed`: `window-preload-scripts-state-changed` = "window-preload-scripts-state-changed".asInstanceOf[`window-preload-scripts-state-changed`]
  
  @js.native
  sealed trait `window-preload-scripts-state-changing` extends StObject
  @scala.inline
  def `window-preload-scripts-state-changing`: `window-preload-scripts-state-changing` = "window-preload-scripts-state-changing".asInstanceOf[`window-preload-scripts-state-changing`]
  
  @js.native
  sealed trait `window-reloaded` extends StObject
  @scala.inline
  def `window-reloaded`: `window-reloaded` = "window-reloaded".asInstanceOf[`window-reloaded`]
  
  @js.native
  sealed trait `window-removed` extends StObject
  @scala.inline
  def `window-removed`: `window-removed` = "window-removed".asInstanceOf[`window-removed`]
  
  @js.native
  sealed trait `window-resource-load-failed` extends StObject
  @scala.inline
  def `window-resource-load-failed`: `window-resource-load-failed` = "window-resource-load-failed".asInstanceOf[`window-resource-load-failed`]
  
  @js.native
  sealed trait `window-resource-response-received` extends StObject
  @scala.inline
  def `window-resource-response-received`: `window-resource-response-received` = "window-resource-response-received".asInstanceOf[`window-resource-response-received`]
  
  @js.native
  sealed trait `window-responding` extends StObject
  @scala.inline
  def `window-responding`: `window-responding` = "window-responding".asInstanceOf[`window-responding`]
  
  @js.native
  sealed trait `window-restored` extends StObject
  @scala.inline
  def `window-restored`: `window-restored` = "window-restored".asInstanceOf[`window-restored`]
  
  @js.native
  sealed trait `window-show-requested`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-show-requested`: `window-show-requested` = "window-show-requested".asInstanceOf[`window-show-requested`]
  
  @js.native
  sealed trait `window-shown` extends StObject
  @scala.inline
  def `window-shown`: `window-shown` = "window-shown".asInstanceOf[`window-shown`]
  
  @js.native
  sealed trait `window-start-load`
    extends StObject
       with OpenFinApplicationEventType
  @scala.inline
  def `window-start-load`: `window-start-load` = "window-start-load".asInstanceOf[`window-start-load`]
  
  @js.native
  sealed trait `window-user-movement-disabled` extends StObject
  @scala.inline
  def `window-user-movement-disabled`: `window-user-movement-disabled` = "window-user-movement-disabled".asInstanceOf[`window-user-movement-disabled`]
  
  @js.native
  sealed trait `window-user-movement-enabled` extends StObject
  @scala.inline
  def `window-user-movement-enabled`: `window-user-movement-enabled` = "window-user-movement-enabled".asInstanceOf[`window-user-movement-enabled`]
  
  @js.native
  sealed trait `window-will-move` extends StObject
  @scala.inline
  def `window-will-move`: `window-will-move` = "window-will-move".asInstanceOf[`window-will-move`]
  
  @js.native
  sealed trait `window-will-resize` extends StObject
  @scala.inline
  def `window-will-resize`: `window-will-resize` = "window-will-resize".asInstanceOf[`window-will-resize`]
  
  @js.native
  sealed trait xhr extends StObject
  @scala.inline
  def xhr: xhr = "xhr".asInstanceOf[xhr]
}
