package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd
  extends /* propName */ StringDictionary[js.Any] {
  var add: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[
    js.Function3[/* collection */ Collection, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
  var set: js.UndefOr[Boolean] = js.undefined
  var since: js.UndefOr[js.Any] = js.undefined
  var startID: js.UndefOr[js.Any] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* collection */ Collection, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  var until: js.UndefOr[js.Any] = js.undefined
}

object AnonAdd {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    add: js.UndefOr[Boolean] = js.undefined,
    error: (/* collection */ Collection, /* xhr */ js.Any, /* options */ js.Object) => Unit = null,
    fetchSize: Int | Double = null,
    set: js.UndefOr[Boolean] = js.undefined,
    since: js.Any = null,
    startID: js.Any = null,
    startIndex: Int | Double = null,
    success: (/* collection */ Collection, /* response */ js.Any, /* options */ js.Object) => Unit = null,
    until: js.Any = null
  ): AnonAdd = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(set)) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (startID != null) __obj.updateDynamic("startID")(startID.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdd]
  }
}

