package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBulkWriteOptions extends CommonOptions {
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined
  //Force server to assign _id values instead of driver.
  var forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Execute write operation in ordered or unordered fashion.
    */
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
}

object CollectionBulkWriteOptions {
  @scala.inline
  def apply(
    bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined,
    forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): CollectionBulkWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation)
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (session != null) __obj.updateDynamic("session")(session)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionBulkWriteOptions]
  }
}

