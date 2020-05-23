package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initialize
  extends /* key */ StringDictionary[js.Any] {
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.undefined
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var parseSave: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var urlRoot: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[
    Null | js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[this.type], Double])
  ] = js.undefined
}

object Initialize {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    initialize: (/* models */ js.Array[Model], /* options */ js.Object) => Unit = null,
    parse: /* data */ js.Any => _ = null,
    parseSave: /* data */ js.Any => _ = null,
    urlRoot: String = null,
    validate: js.UndefOr[
      Null | js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[Initialize], Double])
    ] = js.undefined
  ): Initialize = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction2(initialize))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (parseSave != null) __obj.updateDynamic("parseSave")(js.Any.fromFunction1(parseSave))
    if (urlRoot != null) __obj.updateDynamic("urlRoot")(urlRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initialize]
  }
}

