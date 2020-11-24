package typings.openfin.utilsMod

import typings.openfin.monitorMod.MonitorInfo
import typings.openfin.shapesPlatformMod.Snapshot
import typings.openfin.windowOptionsMod.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/platform/utils", "getOutOfBoundsWindows")
@js.native
object getOutOfBoundsWindows extends js.Object {
  
  def apply(snapshot: Snapshot, monitorInfo: MonitorInfo): js.Promise[js.Array[WindowOptions]] = js.native
}
