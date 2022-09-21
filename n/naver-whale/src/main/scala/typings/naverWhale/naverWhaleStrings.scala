package typings.naverWhale

import typings.naverWhale.whale.contentSettings.DefaultContentSettingDetails
import typings.naverWhale.whale.contentSettings.ScopeEnum
import typings.naverWhale.whale.contextMenus.ContextItemType
import typings.naverWhale.whale.contextMenus.ContextType
import typings.naverWhale.whale.cookies.SameSiteStatus
import typings.naverWhale.whale.idle.IdleState
import typings.naverWhale.whale.notifications.TemplateType
import typings.naverWhale.whale.omnibox.OnInputEnteredDisposition
import typings.naverWhale.whale.runtime.ManifestPermissions
import typings.naverWhale.whale.runtime.PlatformArch
import typings.naverWhale.whale.runtime.PlatformNaclArch
import typings.naverWhale.whale.runtime.PlatformOs
import typings.naverWhale.whale.runtime.RequestUpdateCheckStatus
import typings.naverWhale.whale.storage.AccessLevel
import typings.naverWhale.whale.storage.AreaName
import typings.naverWhale.whale.types._settingsScope
import typings.naverWhale.whale.webRequest.ResourceType
import typings.naverWhale.whale.windows.createTypeEnum
import typings.naverWhale.whale.windows.windowStateEnum
import typings.naverWhale.whale.windows.windowTypeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object naverWhaleStrings {
  
  @js.native
  sealed trait TRUSTED_AND_UNTRUSTED_CONTEXTS
    extends StObject
       with AccessLevel
  inline def TRUSTED_AND_UNTRUSTED_CONTEXTS: TRUSTED_AND_UNTRUSTED_CONTEXTS = "TRUSTED_AND_UNTRUSTED_CONTEXTS".asInstanceOf[TRUSTED_AND_UNTRUSTED_CONTEXTS]
  
  @js.native
  sealed trait TRUSTED_CONTEXTS
    extends StObject
       with AccessLevel
  inline def TRUSTED_CONTEXTS: TRUSTED_CONTEXTS = "TRUSTED_CONTEXTS".asInstanceOf[TRUSTED_CONTEXTS]
  
  @js.native
  sealed trait action
    extends StObject
       with ContextType
  inline def action: action = "action".asInstanceOf[action]
  
  @js.native
  sealed trait active
    extends StObject
       with IdleState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activeTab
    extends StObject
       with ManifestPermissions
  inline def activeTab: activeTab = "activeTab".asInstanceOf[activeTab]
  
  @js.native
  sealed trait alarms
    extends StObject
       with ManifestPermissions
  inline def alarms: alarms = "alarms".asInstanceOf[alarms]
  
  @js.native
  sealed trait all
    extends StObject
       with ContextType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allow
    extends StObject
       with DefaultContentSettingDetails
  inline def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait android
    extends StObject
       with PlatformOs
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait app
    extends StObject
       with windowTypeEnum
  inline def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait arm
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def arm: arm = "arm".asInstanceOf[arm]
  
  @js.native
  sealed trait arm64
    extends StObject
       with PlatformArch
  inline def arm64: arm64 = "arm64".asInstanceOf[arm64]
  
  @js.native
  sealed trait ask
    extends StObject
       with DefaultContentSettingDetails
  inline def ask: ask = "ask".asInstanceOf[ask]
  
  @js.native
  sealed trait audio
    extends StObject
       with ContextType
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait background
    extends StObject
       with ManifestPermissions
  inline def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait basic
    extends StObject
       with TemplateType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait block
    extends StObject
       with DefaultContentSettingDetails
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait bookmarks
    extends StObject
       with ManifestPermissions
  inline def bookmarks: bookmarks = "bookmarks".asInstanceOf[bookmarks]
  
  @js.native
  sealed trait browser_action
    extends StObject
       with ContextType
  inline def browser_action: browser_action = "browser_action".asInstanceOf[browser_action]
  
  @js.native
  sealed trait browsingData
    extends StObject
       with ManifestPermissions
  inline def browsingData: browsingData = "browsingData".asInstanceOf[browsingData]
  
  @js.native
  sealed trait certificateProvider
    extends StObject
       with ManifestPermissions
  inline def certificateProvider: certificateProvider = "certificateProvider".asInstanceOf[certificateProvider]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with ContextItemType
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait clipboardRead
    extends StObject
       with ManifestPermissions
  inline def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  
  @js.native
  sealed trait clipboardWrite
    extends StObject
       with ManifestPermissions
  inline def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  
  @js.native
  sealed trait complete extends StObject
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait contentSettings
    extends StObject
       with ManifestPermissions
  inline def contentSettings: contentSettings = "contentSettings".asInstanceOf[contentSettings]
  
  @js.native
  sealed trait contextMenus
    extends StObject
       with ManifestPermissions
  inline def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  
  @js.native
  sealed trait controllable_by_this_extension extends StObject
  inline def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  
  @js.native
  sealed trait controlled_by_other_extensions extends StObject
  inline def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  
  @js.native
  sealed trait controlled_by_this_extension extends StObject
  inline def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  
  @js.native
  sealed trait cookies
    extends StObject
       with ManifestPermissions
  inline def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @js.native
  sealed trait cros
    extends StObject
       with PlatformOs
  inline def cros: cros = "cros".asInstanceOf[cros]
  
  @js.native
  sealed trait csp_report
    extends StObject
       with ResourceType
  inline def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait currentTab
    extends StObject
       with OnInputEnteredDisposition
  inline def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait cursive extends StObject
  inline def cursive: cursive = "cursive".asInstanceOf[cursive]
  
  @js.native
  sealed trait debugger
    extends StObject
       with ManifestPermissions
  inline def debugger: debugger = "debugger".asInstanceOf[debugger]
  
  @js.native
  sealed trait declarativeContent
    extends StObject
       with ManifestPermissions
  inline def declarativeContent: declarativeContent = "declarativeContent".asInstanceOf[declarativeContent]
  
  @js.native
  sealed trait declarativeNetRequest
    extends StObject
       with ManifestPermissions
  inline def declarativeNetRequest: declarativeNetRequest = "declarativeNetRequest".asInstanceOf[declarativeNetRequest]
  
  @js.native
  sealed trait declarativeNetRequestFeedback
    extends StObject
       with ManifestPermissions
  inline def declarativeNetRequestFeedback: declarativeNetRequestFeedback = "declarativeNetRequestFeedback".asInstanceOf[declarativeNetRequestFeedback]
  
  @js.native
  sealed trait declarativeWebRequest
    extends StObject
       with ManifestPermissions
  inline def declarativeWebRequest: declarativeWebRequest = "declarativeWebRequest".asInstanceOf[declarativeWebRequest]
  
  @js.native
  sealed trait desktopCapture
    extends StObject
       with ManifestPermissions
  inline def desktopCapture: desktopCapture = "desktopCapture".asInstanceOf[desktopCapture]
  
  @js.native
  sealed trait detect_important_content
    extends StObject
       with DefaultContentSettingDetails
  inline def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  
  @js.native
  sealed trait devtools
    extends StObject
       with windowTypeEnum
  inline def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait documentScan
    extends StObject
       with ManifestPermissions
  inline def documentScan: documentScan = "documentScan".asInstanceOf[documentScan]
  
  @js.native
  sealed trait downloads
    extends StObject
       with ManifestPermissions
  inline def downloads: downloads = "downloads".asInstanceOf[downloads]
  
  @js.native
  sealed trait editable
    extends StObject
       with ContextType
  inline def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait enterpriseDotdeviceAttributes
    extends StObject
       with ManifestPermissions
  inline def enterpriseDotdeviceAttributes: enterpriseDotdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[enterpriseDotdeviceAttributes]
  
  @js.native
  sealed trait enterpriseDothardwarePlatform
    extends StObject
       with ManifestPermissions
  inline def enterpriseDothardwarePlatform: enterpriseDothardwarePlatform = "enterprise.hardwarePlatform".asInstanceOf[enterpriseDothardwarePlatform]
  
  @js.native
  sealed trait enterpriseDotnetworkingAttributes
    extends StObject
       with ManifestPermissions
  inline def enterpriseDotnetworkingAttributes: enterpriseDotnetworkingAttributes = "enterprise.networkingAttributes".asInstanceOf[enterpriseDotnetworkingAttributes]
  
  @js.native
  sealed trait enterpriseDotplatformKeys
    extends StObject
       with ManifestPermissions
  inline def enterpriseDotplatformKeys: enterpriseDotplatformKeys = "enterprise.platformKeys".asInstanceOf[enterpriseDotplatformKeys]
  
  @js.native
  sealed trait experimental
    extends StObject
       with ManifestPermissions
  inline def experimental: experimental = "experimental".asInstanceOf[experimental]
  
  @js.native
  sealed trait fantasy extends StObject
  inline def fantasy: fantasy = "fantasy".asInstanceOf[fantasy]
  
  @js.native
  sealed trait fileBrowserHandler
    extends StObject
       with ManifestPermissions
  inline def fileBrowserHandler: fileBrowserHandler = "fileBrowserHandler".asInstanceOf[fileBrowserHandler]
  
  @js.native
  sealed trait fileSystemProvider
    extends StObject
       with ManifestPermissions
  inline def fileSystemProvider: fileSystemProvider = "fileSystemProvider".asInstanceOf[fileSystemProvider]
  
  @js.native
  sealed trait fixed extends StObject
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait font
    extends StObject
       with ResourceType
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait fontSettings
    extends StObject
       with ManifestPermissions
  inline def fontSettings: fontSettings = "fontSettings".asInstanceOf[fontSettings]
  
  @js.native
  sealed trait frame
    extends StObject
       with ContextType
  inline def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with windowStateEnum
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait gcm
    extends StObject
       with ManifestPermissions
  inline def gcm: gcm = "gcm".asInstanceOf[gcm]
  
  @js.native
  sealed trait geolocation
    extends StObject
       with ManifestPermissions
  inline def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait history
    extends StObject
       with ManifestPermissions
  inline def history: history = "history".asInstanceOf[history]
  
  @js.native
  sealed trait identity
    extends StObject
       with ManifestPermissions
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait idle
    extends StObject
       with IdleState
       with ManifestPermissions
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait image
    extends StObject
       with ContextType
       with ResourceType
       with TemplateType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait incognito_persistent
    extends StObject
       with _settingsScope
  inline def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  
  @js.native
  sealed trait incognito_session_only
    extends StObject
       with ScopeEnum
       with _settingsScope
  inline def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait launcher
    extends StObject
       with ContextType
  inline def launcher: launcher = "launcher".asInstanceOf[launcher]
  
  @js.native
  sealed trait lax
    extends StObject
       with SameSiteStatus
  inline def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait link
    extends StObject
       with ContextType
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linux
    extends StObject
       with PlatformOs
  inline def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait list
    extends StObject
       with TemplateType
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait loading extends StObject
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait local
    extends StObject
       with AreaName
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait locked
    extends StObject
       with IdleState
  inline def locked: locked = "locked".asInstanceOf[locked]
  
  @js.native
  sealed trait `locked-fullscreen`
    extends StObject
       with windowStateEnum
  inline def `locked-fullscreen`: `locked-fullscreen` = "locked-fullscreen".asInstanceOf[`locked-fullscreen`]
  
  @js.native
  sealed trait loginState
    extends StObject
       with ManifestPermissions
  inline def loginState: loginState = "loginState".asInstanceOf[loginState]
  
  @js.native
  sealed trait mac
    extends StObject
       with PlatformOs
  inline def mac: mac = "mac".asInstanceOf[mac]
  
  @js.native
  sealed trait main_frame
    extends StObject
       with ResourceType
  inline def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait managed
    extends StObject
       with AreaName
  inline def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait management
    extends StObject
       with ManifestPermissions
  inline def management: management = "management".asInstanceOf[management]
  
  @js.native
  sealed trait maximized
    extends StObject
       with windowStateEnum
  inline def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait media
    extends StObject
       with ResourceType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait minimized
    extends StObject
       with windowStateEnum
  inline def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait mips
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def mips: mips = "mips".asInstanceOf[mips]
  
  @js.native
  sealed trait mips64
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def mips64: mips64 = "mips64".asInstanceOf[mips64]
  
  @js.native
  sealed trait nativeMessaging
    extends StObject
       with ManifestPermissions
  inline def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  
  @js.native
  sealed trait newBackgroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @js.native
  sealed trait newForegroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @js.native
  sealed trait no_restriction
    extends StObject
       with SameSiteStatus
  inline def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update
    extends StObject
       with RequestUpdateCheckStatus
  inline def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait normal
    extends StObject
       with ContextItemType
       with createTypeEnum
       with windowStateEnum
       with windowTypeEnum
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait not_controllable extends StObject
  inline def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  
  @js.native
  sealed trait notifications
    extends StObject
       with ManifestPermissions
  inline def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ResourceType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait openbsd
    extends StObject
       with PlatformOs
  inline def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  
  @js.native
  sealed trait other
    extends StObject
       with ResourceType
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait page
    extends StObject
       with ContextType
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait pageCapture
    extends StObject
       with ManifestPermissions
  inline def pageCapture: pageCapture = "pageCapture".asInstanceOf[pageCapture]
  
  @js.native
  sealed trait page_action
    extends StObject
       with ContextType
  inline def page_action: page_action = "page_action".asInstanceOf[page_action]
  
  @js.native
  sealed trait panel
    extends StObject
       with createTypeEnum
       with windowTypeEnum
  inline def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait ping
    extends StObject
       with ResourceType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait platformKeys
    extends StObject
       with ManifestPermissions
  inline def platformKeys: platformKeys = "platformKeys".asInstanceOf[platformKeys]
  
  @js.native
  sealed trait popup
    extends StObject
       with createTypeEnum
       with windowTypeEnum
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait power
    extends StObject
       with ManifestPermissions
  inline def power: power = "power".asInstanceOf[power]
  
  @js.native
  sealed trait printerProvider
    extends StObject
       with ManifestPermissions
  inline def printerProvider: printerProvider = "printerProvider".asInstanceOf[printerProvider]
  
  @js.native
  sealed trait printing
    extends StObject
       with ManifestPermissions
  inline def printing: printing = "printing".asInstanceOf[printing]
  
  @js.native
  sealed trait printingMetrics
    extends StObject
       with ManifestPermissions
  inline def printingMetrics: printingMetrics = "printingMetrics".asInstanceOf[printingMetrics]
  
  @js.native
  sealed trait privacy
    extends StObject
       with ManifestPermissions
  inline def privacy: privacy = "privacy".asInstanceOf[privacy]
  
  @js.native
  sealed trait processes
    extends StObject
       with ManifestPermissions
  inline def processes: processes = "processes".asInstanceOf[processes]
  
  @js.native
  sealed trait progress
    extends StObject
       with TemplateType
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait proxy
    extends StObject
       with ManifestPermissions
  inline def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait radio
    extends StObject
       with ContextItemType
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait regular
    extends StObject
       with ScopeEnum
       with _settingsScope
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait regular_only
    extends StObject
       with _settingsScope
  inline def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  
  @js.native
  sealed trait sansserif extends StObject
  inline def sansserif: sansserif = "sansserif".asInstanceOf[sansserif]
  
  @js.native
  sealed trait script
    extends StObject
       with ResourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait scripting
    extends StObject
       with ManifestPermissions
  inline def scripting: scripting = "scripting".asInstanceOf[scripting]
  
  @js.native
  sealed trait search
    extends StObject
       with ManifestPermissions
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait selection
    extends StObject
       with ContextType
  inline def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait separator
    extends StObject
       with ContextItemType
  inline def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait serif extends StObject
  inline def serif: serif = "serif".asInstanceOf[serif]
  
  @js.native
  sealed trait session
    extends StObject
       with AreaName
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait session_only
    extends StObject
       with DefaultContentSettingDetails
  inline def session_only: session_only = "session_only".asInstanceOf[session_only]
  
  @js.native
  sealed trait sessions
    extends StObject
       with ManifestPermissions
  inline def sessions: sessions = "sessions".asInstanceOf[sessions]
  
  @js.native
  sealed trait signedInDevices
    extends StObject
       with ManifestPermissions
  inline def signedInDevices: signedInDevices = "signedInDevices".asInstanceOf[signedInDevices]
  
  @js.native
  sealed trait standard extends StObject
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait storage
    extends StObject
       with ManifestPermissions
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait strict
    extends StObject
       with SameSiteStatus
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with ResourceType
  inline def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame
    extends StObject
       with ResourceType
  inline def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait sync
    extends StObject
       with AreaName
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait systemDotcpu
    extends StObject
       with ManifestPermissions
  inline def systemDotcpu: systemDotcpu = "system.cpu".asInstanceOf[systemDotcpu]
  
  @js.native
  sealed trait systemDotdisplay
    extends StObject
       with ManifestPermissions
  inline def systemDotdisplay: systemDotdisplay = "system.display".asInstanceOf[systemDotdisplay]
  
  @js.native
  sealed trait systemDotmemory
    extends StObject
       with ManifestPermissions
  inline def systemDotmemory: systemDotmemory = "system.memory".asInstanceOf[systemDotmemory]
  
  @js.native
  sealed trait systemDotstorage
    extends StObject
       with ManifestPermissions
  inline def systemDotstorage: systemDotstorage = "system.storage".asInstanceOf[systemDotstorage]
  
  @js.native
  sealed trait tabCapture
    extends StObject
       with ManifestPermissions
  inline def tabCapture: tabCapture = "tabCapture".asInstanceOf[tabCapture]
  
  @js.native
  sealed trait tabGroups
    extends StObject
       with ManifestPermissions
  inline def tabGroups: tabGroups = "tabGroups".asInstanceOf[tabGroups]
  
  @js.native
  sealed trait tabs
    extends StObject
       with ManifestPermissions
  inline def tabs: tabs = "tabs".asInstanceOf[tabs]
  
  @js.native
  sealed trait throttled
    extends StObject
       with RequestUpdateCheckStatus
  inline def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait topSites
    extends StObject
       with ManifestPermissions
  inline def topSites: topSites = "topSites".asInstanceOf[topSites]
  
  @js.native
  sealed trait tts
    extends StObject
       with ManifestPermissions
  inline def tts: tts = "tts".asInstanceOf[tts]
  
  @js.native
  sealed trait ttsEngine
    extends StObject
       with ManifestPermissions
  inline def ttsEngine: ttsEngine = "ttsEngine".asInstanceOf[ttsEngine]
  
  @js.native
  sealed trait unlimitedStorage
    extends StObject
       with ManifestPermissions
  inline def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  
  @js.native
  sealed trait unspecified
    extends StObject
       with SameSiteStatus
  inline def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @js.native
  sealed trait update_available
    extends StObject
       with RequestUpdateCheckStatus
  inline def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait video
    extends StObject
       with ContextType
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait vpnProvider
    extends StObject
       with ManifestPermissions
  inline def vpnProvider: vpnProvider = "vpnProvider".asInstanceOf[vpnProvider]
  
  @js.native
  sealed trait wallpaper
    extends StObject
       with ManifestPermissions
  inline def wallpaper: wallpaper = "wallpaper".asInstanceOf[wallpaper]
  
  @js.native
  sealed trait webNavigation
    extends StObject
       with ManifestPermissions
  inline def webNavigation: webNavigation = "webNavigation".asInstanceOf[webNavigation]
  
  @js.native
  sealed trait webRequest
    extends StObject
       with ManifestPermissions
  inline def webRequest: webRequest = "webRequest".asInstanceOf[webRequest]
  
  @js.native
  sealed trait webRequestBlocking
    extends StObject
       with ManifestPermissions
  inline def webRequestBlocking: webRequestBlocking = "webRequestBlocking".asInstanceOf[webRequestBlocking]
  
  @js.native
  sealed trait websocket
    extends StObject
       with ResourceType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait win
    extends StObject
       with PlatformOs
  inline def win: win = "win".asInstanceOf[win]
  
  @js.native
  sealed trait `x86-32`
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  
  @js.native
  sealed trait `x86-64`
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  
  @js.native
  sealed trait xmlhttprequest
    extends StObject
       with ResourceType
  inline def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
}
