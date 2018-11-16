package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Blade
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  var title: java.lang.String
  def clickCommand(commandText: java.lang.String): qLib.qMod.QNs.Promise[Blade]
  def getTiles(): qLib.qMod.QNs.Promise[
    js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs.Tile]
  ]
}

