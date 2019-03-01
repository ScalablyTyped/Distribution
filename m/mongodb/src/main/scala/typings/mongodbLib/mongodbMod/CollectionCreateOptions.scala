package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionCreateOptions extends CommonOptions {
  var autoIndexId: js.UndefOr[scala.Boolean] = js.undefined
  var capped: js.UndefOr[scala.Boolean] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var flags: js.UndefOr[scala.Double] = js.undefined
  var indexOptionDefaults: js.UndefOr[js.Object] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var pipeline: js.UndefOr[js.Array[_]] = js.undefined
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var storageEngine: js.UndefOr[js.Object] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var validationAction: js.UndefOr[mongodbLib.mongodbLibStrings.error | mongodbLib.mongodbLibStrings.warn] = js.undefined
  var validationLevel: js.UndefOr[
    mongodbLib.mongodbLibStrings.off | mongodbLib.mongodbLibStrings.strict | mongodbLib.mongodbLibStrings.moderate
  ] = js.undefined
  var validator: js.UndefOr[js.Object] = js.undefined
  var viewOn: js.UndefOr[java.lang.String] = js.undefined
}

object CollectionCreateOptions {
  @scala.inline
  def apply(
    autoIndexId: js.UndefOr[scala.Boolean] = js.undefined,
    capped: js.UndefOr[scala.Boolean] = js.undefined,
    collation: CollationDocument = null,
    flags: scala.Int | scala.Double = null,
    indexOptionDefaults: js.Object = null,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    pipeline: js.Array[_] = null,
    pkFactory: js.Object = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    readPreference: ReadPreference | java.lang.String = null,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    size: scala.Int | scala.Double = null,
    storageEngine: js.Object = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    validationAction: mongodbLib.mongodbLibStrings.error | mongodbLib.mongodbLibStrings.warn = null,
    validationLevel: mongodbLib.mongodbLibStrings.off | mongodbLib.mongodbLibStrings.strict | mongodbLib.mongodbLibStrings.moderate = null,
    validator: js.Object = null,
    viewOn: java.lang.String = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndexId)) __obj.updateDynamic("autoIndexId")(autoIndexId)
    if (!js.isUndefined(capped)) __obj.updateDynamic("capped")(capped)
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (indexOptionDefaults != null) __obj.updateDynamic("indexOptionDefaults")(indexOptionDefaults)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (session != null) __obj.updateDynamic("session")(session)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (validationAction != null) __obj.updateDynamic("validationAction")(validationAction.asInstanceOf[js.Any])
    if (validationLevel != null) __obj.updateDynamic("validationLevel")(validationLevel.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator)
    if (viewOn != null) __obj.updateDynamic("viewOn")(viewOn)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionCreateOptions]
  }
}

