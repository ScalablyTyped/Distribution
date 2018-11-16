package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BrowseResourceBlade extends Blade {
  def filterItems(filter: java.lang.String): qLib.qMod.QNs.Promise[BrowseResourceBlade]
  def selectResource(resourceName: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit]
}

