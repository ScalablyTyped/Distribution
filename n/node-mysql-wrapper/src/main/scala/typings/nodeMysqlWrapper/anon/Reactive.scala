package typings.nodeMysqlWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reactive extends js.Object {
  var fields: js.UndefOr[js.Any] = js.undefined
  var reactive: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var transform: js.UndefOr[js.Function] = js.undefined
}

object Reactive {
  @scala.inline
  def apply(
    fields: js.Any = null,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    sort: js.Any = null,
    transform: js.Function = null
  ): Reactive = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reactive]
  }
}

