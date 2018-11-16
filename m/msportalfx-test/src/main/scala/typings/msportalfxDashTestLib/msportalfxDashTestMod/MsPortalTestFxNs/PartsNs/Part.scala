package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  var innerText: java.lang.String = js.native
  def hasError(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def isClickable(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def isLoaded(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def isSelected(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def waitUntilLoaded(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def waitUntilLoaded(timeout: scala.Double): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
}

