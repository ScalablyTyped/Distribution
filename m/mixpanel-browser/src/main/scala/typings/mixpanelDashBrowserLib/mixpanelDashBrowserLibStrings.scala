package typings
package mixpanelDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mixpanelDashBrowserLibStrings {
  @js.native
  sealed trait cookie
    extends mixpanelDashBrowserLib.mixpanelDashBrowserMod.Persistence
  
  @js.native
  sealed trait localStorage
    extends mixpanelDashBrowserLib.mixpanelDashBrowserMod.Persistence
  
  @scala.inline
  def cookie: cookie = "cookie".asInstanceOf[cookie]
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
}

