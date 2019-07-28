package typings.objection.objectionMod

import typings.knex.knexMod.Knex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchTableMetadataOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var knex: js.UndefOr[Knex[_, js.Array[_]]] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object FetchTableMetadataOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, knex: Knex[_, js.Array[_]] = null, table: String = null): FetchTableMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (knex != null) __obj.updateDynamic("knex")(knex)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[FetchTableMetadataOptions]
  }
}

