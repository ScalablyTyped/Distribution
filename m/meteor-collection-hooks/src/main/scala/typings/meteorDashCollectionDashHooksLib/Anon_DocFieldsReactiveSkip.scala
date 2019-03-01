package typings
package meteorDashCollectionDashHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocFieldsReactiveSkip extends js.Object {
  var fields: js.UndefOr[meteorDashTypingsLib.MongoNs.FieldSpecifier] = js.undefined
  var reactive: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[meteorDashTypingsLib.MongoNs.SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function1[/* doc */ js.Any, scala.Unit]] = js.undefined
}

object Anon_DocFieldsReactiveSkip {
  @scala.inline
  def apply(
    fields: meteorDashTypingsLib.MongoNs.FieldSpecifier = null,
    reactive: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null,
    sort: meteorDashTypingsLib.MongoNs.SortSpecifier = null,
    transform: js.Function1[/* doc */ js.Any, scala.Unit] = null
  ): Anon_DocFieldsReactiveSkip = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_DocFieldsReactiveSkip]
  }
}

