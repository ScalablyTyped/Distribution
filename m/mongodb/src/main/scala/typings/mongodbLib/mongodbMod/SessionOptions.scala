package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  /**
    * Whether causal consistency should be enabled on this session
    * @type {boolean} default true
    */
  var causalConsistency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default TransactionOptions to use for transactions started on this session.
    */
  var defaultTransactionOptions: js.UndefOr[TransactionOptions] = js.undefined
}

