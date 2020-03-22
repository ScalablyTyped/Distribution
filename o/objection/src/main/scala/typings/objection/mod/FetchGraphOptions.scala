package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchGraphOptions extends js.Object {
  var skipFetched: js.UndefOr[Boolean] = js.undefined
  var transaction: js.UndefOr[TransactionOrKnex] = js.undefined
}

object FetchGraphOptions {
  @scala.inline
  def apply(skipFetched: js.UndefOr[Boolean] = js.undefined, transaction: TransactionOrKnex = null): FetchGraphOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipFetched)) __obj.updateDynamic("skipFetched")(skipFetched.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchGraphOptions]
  }
}

