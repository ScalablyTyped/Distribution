package typings.mixpanelBrowser

import typings.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixpanelBrowserStrings {
  
  @scala.inline
  def cookie: cookie = "cookie".asInstanceOf[cookie]
  
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  
  @scala.inline
  def sendBeacon: sendBeacon = "sendBeacon".asInstanceOf[sendBeacon]
  
  @scala.inline
  def xhr: xhr = "xhr".asInstanceOf[xhr]
  
  @js.native
  sealed trait cookie extends Persistence
  
  @js.native
  sealed trait localStorage extends Persistence
  
  @js.native
  sealed trait sendBeacon extends js.Object
  
  @js.native
  sealed trait xhr extends js.Object
}
