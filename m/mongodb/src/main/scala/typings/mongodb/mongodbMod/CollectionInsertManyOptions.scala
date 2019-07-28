package typings.mongodb.mongodbMod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionInsertManyOptions extends CommonOptions {
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  /**
    * Force server to assign _id values instead of driver.
    */
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, when an insert fails, don't execute the remaining writes. If false, continue with remaining inserts when one fails.
    */
  var ordered: js.UndefOr[Boolean] = js.undefined
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
}

object CollectionInsertManyOptions {
  @scala.inline
  def apply(
    bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined,
    forceServerObjectId: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    ordered: js.UndefOr[Boolean] = js.undefined,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
  ): CollectionInsertManyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation)
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (session != null) __obj.updateDynamic("session")(session)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionInsertManyOptions]
  }
}

