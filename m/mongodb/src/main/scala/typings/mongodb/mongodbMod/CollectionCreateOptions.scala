package typings.mongodb.mongodbMod

import typings.mongodb.mongodbStrings.error
import typings.mongodb.mongodbStrings.majority
import typings.mongodb.mongodbStrings.moderate
import typings.mongodb.mongodbStrings.off
import typings.mongodb.mongodbStrings.strict
import typings.mongodb.mongodbStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionCreateOptions extends CommonOptions {
  var autoIndexId: js.UndefOr[Boolean] = js.undefined
  var capped: js.UndefOr[Boolean] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var flags: js.UndefOr[scala.Double] = js.undefined
  var indexOptionDefaults: js.UndefOr[js.Object] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var pipeline: js.UndefOr[js.Array[_]] = js.undefined
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var storageEngine: js.UndefOr[js.Object] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var validationAction: js.UndefOr[error | warn] = js.undefined
  var validationLevel: js.UndefOr[off | strict | moderate] = js.undefined
  var validator: js.UndefOr[js.Object] = js.undefined
  var viewOn: js.UndefOr[String] = js.undefined
}

object CollectionCreateOptions {
  @scala.inline
  def apply(
    autoIndexId: js.UndefOr[Boolean] = js.undefined,
    capped: js.UndefOr[Boolean] = js.undefined,
    collation: CollationDocument = null,
    flags: Int | scala.Double = null,
    indexOptionDefaults: js.Object = null,
    j: js.UndefOr[Boolean] = js.undefined,
    max: Int | scala.Double = null,
    pipeline: js.Array[_] = null,
    pkFactory: js.Object = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    size: Int | scala.Double = null,
    storageEngine: js.Object = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    validationAction: error | warn = null,
    validationLevel: off | strict | moderate = null,
    validator: js.Object = null,
    viewOn: String = null,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
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
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
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

