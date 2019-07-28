package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.PartsNs.Tile
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "StartBoard")
@js.native
class StartBoard () extends PortalElement {
  def getTiles(): Promise[js.Array[Tile]] = js.native
}

