package typings.mixpanelBrowser

import typings.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mixpanelBrowserStrings {
  @js.native
  sealed trait cookie extends Persistence
  
  @js.native
  sealed trait localStorage extends Persistence
  
  @scala.inline
  def cookie: cookie = "cookie".asInstanceOf[cookie]
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
}

