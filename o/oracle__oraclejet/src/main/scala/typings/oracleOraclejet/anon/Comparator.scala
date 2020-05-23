package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comparator
  extends /* key */ StringDictionary[js.Any] {
  var comparator: js.UndefOr[
    Null | String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])
  ] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var modelLimit: js.UndefOr[Double] = js.undefined
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Comparator {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    comparator: js.UndefOr[
      Null | String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])
    ] = js.undefined,
    fetchSize: js.UndefOr[Double] = js.undefined,
    initialize: (/* models */ js.Array[Model], /* options */ js.Object) => Unit = null,
    model: Model = null,
    modelLimit: js.UndefOr[Double] = js.undefined,
    parse: /* data */ js.Any => _ = null,
    url: String = null
  ): Comparator = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(comparator)) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchSize)) __obj.updateDynamic("fetchSize")(fetchSize.get.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction2(initialize))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(modelLimit)) __obj.updateDynamic("modelLimit")(modelLimit.get.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
}

