package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderMutationEventDetail[K, D] extends js.Object {
  var add: js.UndefOr[DataProviderAddOperationEventDetail[K, D]] = js.undefined
  var remove: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.undefined
  var update: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.undefined
}

