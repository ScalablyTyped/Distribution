package typings
package nedbLib.nedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * multi (defaults to false) which allows the modification of several documents if set to true
  * upsert (defaults to false) if you want to insert a new document corresponding to the update rules if your query doesn't match anything
  */
trait UpdateOptions extends js.Object {
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var returnUpdatedDocs: js.UndefOr[scala.Boolean] = js.undefined
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    returnUpdatedDocs: js.UndefOr[scala.Boolean] = js.undefined,
    upsert: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(returnUpdatedDocs)) __obj.updateDynamic("returnUpdatedDocs")(returnUpdatedDocs)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[UpdateOptions]
  }
}

