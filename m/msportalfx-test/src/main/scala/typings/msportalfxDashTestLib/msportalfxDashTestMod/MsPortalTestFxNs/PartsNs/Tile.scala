package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tile
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  var progressLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
  def getPart(): Part = js.native
  def tryPin(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def waitUntilLoaded(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def waitUntilLoaded(timeout: scala.Double): qLib.qMod.QNs.Promise[scala.Unit] = js.native
}

