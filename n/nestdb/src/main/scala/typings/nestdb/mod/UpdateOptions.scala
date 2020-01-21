package typings.nestdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * multi (defaults to false) which allows the modification of several documents if set to true
  * upsert (defaults to false) if you want to insert a new document corresponding to the update rules if your query doesn't match anything
  */
trait UpdateOptions extends js.Object {
  var multi: js.UndefOr[Boolean] = js.undefined
  var returnUpdatedDocs: js.UndefOr[Boolean] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    multi: js.UndefOr[Boolean] = js.undefined,
    returnUpdatedDocs: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (!js.isUndefined(returnUpdatedDocs)) __obj.updateDynamic("returnUpdatedDocs")(returnUpdatedDocs.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

