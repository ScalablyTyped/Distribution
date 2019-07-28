package typings.mongodb.mongodbMod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbCollectionOptions extends CommonOptions {
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object DbCollectionOptions {
  @scala.inline
  def apply(
    j: js.UndefOr[Boolean] = js.undefined,
    pkFactory: js.Object = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    readConcern: ReadConcern = null,
    readPreference: ReadPreference | String = null,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
  ): DbCollectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCollectionOptions]
  }
}

