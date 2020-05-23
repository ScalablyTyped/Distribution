package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorCommentOptions extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object CursorCommentOptions {
  @scala.inline
  def apply(
    hint: String = null,
    limit: js.UndefOr[scala.Double] = js.undefined,
    maxTimeMS: js.UndefOr[scala.Double] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    skip: js.UndefOr[scala.Double] = js.undefined
  ): CursorCommentOptions = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorCommentOptions]
  }
}

