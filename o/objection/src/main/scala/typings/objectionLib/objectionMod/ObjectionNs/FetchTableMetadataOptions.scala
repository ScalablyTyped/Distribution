package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchTableMetadataOptions extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var knex: js.UndefOr[knexLib.knexMod.Knex] = js.undefined
  var table: js.UndefOr[java.lang.String] = js.undefined
}

object FetchTableMetadataOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    knex: knexLib.knexMod.Knex = null,
    table: java.lang.String = null
  ): FetchTableMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (knex != null) __obj.updateDynamic("knex")(knex)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[FetchTableMetadataOptions]
  }
}

