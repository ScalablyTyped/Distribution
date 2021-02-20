package typings.naverWhale

import typings.naverWhale.whale.contentSettings.ScopeEnum
import typings.naverWhale.whale.cookies.SameSiteStatus
import typings.naverWhale.whale.idle.IdleState
import typings.naverWhale.whale.omnibox.OnInputEnteredDisposition
import typings.naverWhale.whale.runtime.RequestUpdateCheckStatus
import typings.naverWhale.whale.storage.AreaName
import typings.naverWhale.whale.webRequest.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object naverWhaleStrings {
  
  @js.native
  sealed trait active extends IdleState
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait allow extends StObject
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait app extends StObject
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait ask extends StObject
  @scala.inline
  def ask: ask = "ask".asInstanceOf[ask]
  
  @js.native
  sealed trait block extends StObject
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait complete extends StObject
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait csp_report extends ResourceType
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait currentTab extends OnInputEnteredDisposition
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait detect_important_content extends StObject
  @scala.inline
  def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  
  @js.native
  sealed trait devtools extends StObject
  @scala.inline
  def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait font extends ResourceType
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait idle extends IdleState
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait image extends ResourceType
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait incognito_session_only extends ScopeEnum
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait lax extends SameSiteStatus
  @scala.inline
  def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait loading extends StObject
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait local extends AreaName
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait locked extends IdleState
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  
  @js.native
  sealed trait main_frame extends ResourceType
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait managed extends AreaName
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait media extends ResourceType
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait newBackgroundTab extends OnInputEnteredDisposition
  @scala.inline
  def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @js.native
  sealed trait newForegroundTab extends OnInputEnteredDisposition
  @scala.inline
  def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @js.native
  sealed trait no_restriction extends SameSiteStatus
  @scala.inline
  def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update extends RequestUpdateCheckStatus
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait normal extends StObject
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `object` extends ResourceType
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait other extends ResourceType
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait panel extends StObject
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait ping extends ResourceType
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait popup extends StObject
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait regular extends ScopeEnum
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait script extends ResourceType
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait session_only extends StObject
  @scala.inline
  def session_only: session_only = "session_only".asInstanceOf[session_only]
  
  @js.native
  sealed trait strict extends SameSiteStatus
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stylesheet extends ResourceType
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame extends ResourceType
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait sync extends AreaName
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait throttled extends RequestUpdateCheckStatus
  @scala.inline
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait unspecified extends SameSiteStatus
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @js.native
  sealed trait update_available extends RequestUpdateCheckStatus
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait websocket extends ResourceType
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
}
