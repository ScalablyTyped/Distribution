package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransactionOptions extends js.Object {
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  var readPreference: js.UndefOr[js.Any] = js.undefined
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}

