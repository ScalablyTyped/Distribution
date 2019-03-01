package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOneOptions extends ReplaceOneOptions {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object UpdateOneOptions {
  @scala.inline
  def apply(
    arrayFilters: js.Array[js.Object] = null,
    bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    upsert: js.UndefOr[scala.Boolean] = js.undefined,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): UpdateOneOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters)
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOneOptions]
  }
}

