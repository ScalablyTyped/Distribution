package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  /**
    * Whether causal consistency should be enabled on this session
    * @default true
    */
  var causalConsistency: js.UndefOr[Boolean] = js.undefined
  /**
    * The default TransactionOptions to use for transactions started on this session.
    */
  var defaultTransactionOptions: js.UndefOr[TransactionOptions] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    causalConsistency: js.UndefOr[Boolean] = js.undefined,
    defaultTransactionOptions: TransactionOptions = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(causalConsistency)) __obj.updateDynamic("causalConsistency")(causalConsistency.asInstanceOf[js.Any])
    if (defaultTransactionOptions != null) __obj.updateDynamic("defaultTransactionOptions")(defaultTransactionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
}

