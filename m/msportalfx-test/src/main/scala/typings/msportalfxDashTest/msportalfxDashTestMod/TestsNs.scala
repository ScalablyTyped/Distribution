package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Tests")
@js.native
object TestsNs extends js.Object {
  @JSName("Parts")
  @js.native
  object PartsNs extends js.Object {
    def canPinAllBladeParts(targetBladeDeepLink: String, targetBladeTitle: String): Promise[Boolean] = js.native
    def canPinAllBladeParts(targetBladeDeepLink: String, targetBladeTitle: String, timeout: Double): Promise[Boolean] = js.native
  }
  
}

