package typings.mongodb

import typings.mongodb.mod.ClientSession
import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.UpdateOneOptions & {  multi ? :boolean} */
trait UpdateOneOptionsmultibool extends js.Object {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.undefined
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object UpdateOneOptionsmultibool {
  @scala.inline
  def apply(
    arrayFilters: js.Array[js.Object] = null,
    bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    multi: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    upsert: js.UndefOr[Boolean] = js.undefined,
    w: Double | majority | String = null,
    wtimeout: Int | Double = null
  ): UpdateOneOptionsmultibool = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOneOptionsmultibool]
  }
}

