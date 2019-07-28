package typings.mongodb.mongodbMod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOneOptions extends CommonOptions {
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object ReplaceOneOptions {
  @scala.inline
  def apply(
    bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    upsert: js.UndefOr[Boolean] = js.undefined,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
  ): ReplaceOneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOneOptions]
  }
}

