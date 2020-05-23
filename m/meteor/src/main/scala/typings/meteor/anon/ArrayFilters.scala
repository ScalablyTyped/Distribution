package typings.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFilters extends js.Object {
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object ArrayFilters {
  @scala.inline
  def apply(
    arrayFilters: js.Array[StringDictionary[_]] = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): ArrayFilters = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFilters]
  }
}

