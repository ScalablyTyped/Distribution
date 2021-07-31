package typings.mixpanelBrowser

import typings.mixpanelBrowser.mod.Persistence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixpanelBrowserStrings {
  
  @js.native
  sealed trait cookie
    extends StObject
       with Persistence
  @scala.inline
  def cookie: cookie = "cookie".asInstanceOf[cookie]
  
  @js.native
  sealed trait localStorage
    extends StObject
       with Persistence
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  
  @js.native
  sealed trait sendBeacon extends StObject
  @scala.inline
  def sendBeacon: sendBeacon = "sendBeacon".asInstanceOf[sendBeacon]
  
  @js.native
  sealed trait xhr extends StObject
  @scala.inline
  def xhr: xhr = "xhr".asInstanceOf[xhr]
}
