package typings.openfin.applicationMod

import typings.openfin.baseMod.Reply
import typings.openfin.monitorMod.MonitorInfo
import typings.openfin.openfinStrings.`tray-icon-clicked`
import typings.openfin.openfinStrings.application
import typings.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrayIconClickReply
  extends Reply[application, `tray-icon-clicked`]
     with Point {
  
  var button: Double = js.native
  
  var monitorInfo: MonitorInfo = js.native
}
