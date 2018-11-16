package typings
package nodeLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces

trait ClusterSettings extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // default: process.execArgv
  var exec: js.UndefOr[java.lang.String] = js.undefined
  var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var inspectPort: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var stdio: js.UndefOr[js.Array[_]] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

