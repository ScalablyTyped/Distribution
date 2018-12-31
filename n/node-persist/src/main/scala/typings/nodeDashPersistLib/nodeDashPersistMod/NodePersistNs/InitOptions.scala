package typings
package nodeDashPersistLib.nodeDashPersistMod.NodePersistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[nodeDashPersistLib.milliseconds | scala.Boolean] = js.undefined
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var parse: js.UndefOr[js.Function1[/* serialized */ java.lang.String, _]] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* toSerialize */ js.Any, java.lang.String]] = js.undefined
  var ttl: js.UndefOr[nodeDashPersistLib.milliseconds | scala.Boolean] = js.undefined
}

