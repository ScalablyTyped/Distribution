package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Tests")
@js.native
object Tests extends js.Object {
  @js.native
  object Parts extends js.Object {
    def canPinAllBladeParts(targetBladeDeepLink: String, targetBladeTitle: String): Promise[Boolean] = js.native
    def canPinAllBladeParts(targetBladeDeepLink: String, targetBladeTitle: String, timeout: Double): Promise[Boolean] = js.native
  }
  
}

