package typings.nodePgMigrate.indexesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.btree
import typings.nodePgMigrate.nodePgMigrateStrings.gin
import typings.nodePgMigrate.nodePgMigrateStrings.gist
import typings.nodePgMigrate.nodePgMigrateStrings.hash
import typings.nodePgMigrate.nodePgMigrateStrings.spgist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var concurrently: js.UndefOr[Boolean] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[String | js.Array[String]] = js.undefined
  var method: js.UndefOr[btree | hash | gist | spgist | gin] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opclass: js.UndefOr[Name] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object CreateIndexOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[Boolean] = js.undefined,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    include: String | js.Array[String] = null,
    method: btree | hash | gist | spgist | gin = null,
    name: String = null,
    opclass: Name = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    where: String = null
  ): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opclass != null) __obj.updateDynamic("opclass")(opclass.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

