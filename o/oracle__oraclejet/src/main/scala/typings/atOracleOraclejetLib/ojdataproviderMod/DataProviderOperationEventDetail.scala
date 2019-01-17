package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderOperationEventDetail[K, D] extends js.Object {
  var data: js.UndefOr[js.Array[D]] = js.undefined
  var indexes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var keys: stdLib.Set[K]
  var metadata: js.UndefOr[js.Array[ItemMetadata[K]]] = js.undefined
}

