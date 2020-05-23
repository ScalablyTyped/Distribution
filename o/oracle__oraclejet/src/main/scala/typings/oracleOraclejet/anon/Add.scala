package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Add
  extends /* key */ StringDictionary[js.Any] {
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

object Add {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    add: js.UndefOr[Boolean] = js.undefined,
    error: (/* collection */ Collection, /* xhr */ js.Any, /* options */ js.Object) => Unit = null,
    fetchSize: js.UndefOr[Double] = js.undefined,
    set: js.UndefOr[Boolean] = js.undefined,
    since: js.Any = null,
    startID: js.Any = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    success: (/* collection */ Collection, /* response */ js.Any, /* options */ js.Object) => Unit = null,
    until: js.Any = null
  ): Add = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (!js.isUndefined(fetchSize)) __obj.updateDynamic("fetchSize")(fetchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(set)) __obj.updateDynamic("set")(set.get.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (startID != null) __obj.updateDynamic("startID")(startID.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
}

