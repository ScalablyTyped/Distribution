package typings.perfy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncOperationFn = js.Function1[/* done */ js.Function0[typings.perfy.mod.PerfyResult], scala.Unit]
  type SyncOperationFn = js.Function0[typings.perfy.mod.PerfyResult]
}
