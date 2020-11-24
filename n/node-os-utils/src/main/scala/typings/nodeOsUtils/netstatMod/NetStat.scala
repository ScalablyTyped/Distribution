package typings.nodeOsUtils.netstatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetStat extends js.Object {
  
  def inOut(): js.Promise[NetStatMetrics | String] = js.native
  def inOut(interval: Double): js.Promise[NetStatMetrics | String] = js.native
  
  def stats(): js.Promise[js.Array[NetStatInfo]] = js.native
}
