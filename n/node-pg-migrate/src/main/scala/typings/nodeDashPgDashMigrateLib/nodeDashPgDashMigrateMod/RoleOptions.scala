package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleOptions extends js.Object {
  var admin: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var bypassrls: js.UndefOr[scala.Boolean] = js.undefined
  var createdb: js.UndefOr[scala.Boolean] = js.undefined
  var createrole: js.UndefOr[scala.Boolean] = js.undefined
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  var inRole: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var login: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[Value] = js.undefined
  var replication: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var superuser: js.UndefOr[scala.Boolean] = js.undefined
  var valid: js.UndefOr[Value] = js.undefined
}

object RoleOptions {
  @scala.inline
  def apply(
    admin: java.lang.String | js.Array[java.lang.String] = null,
    bypassrls: js.UndefOr[scala.Boolean] = js.undefined,
    createdb: js.UndefOr[scala.Boolean] = js.undefined,
    createrole: js.UndefOr[scala.Boolean] = js.undefined,
    encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    inRole: java.lang.String | js.Array[java.lang.String] = null,
    inherit: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    login: js.UndefOr[scala.Boolean] = js.undefined,
    password: Value = null,
    replication: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String | js.Array[java.lang.String] = null,
    superuser: js.UndefOr[scala.Boolean] = js.undefined,
    valid: Value = null
  ): RoleOptions = {
    val __obj = js.Dynamic.literal()
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassrls)) __obj.updateDynamic("bypassrls")(bypassrls)
    if (!js.isUndefined(createdb)) __obj.updateDynamic("createdb")(createdb)
    if (!js.isUndefined(createrole)) __obj.updateDynamic("createrole")(createrole)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (inRole != null) __obj.updateDynamic("inRole")(inRole.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(login)) __obj.updateDynamic("login")(login)
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(replication)) __obj.updateDynamic("replication")(replication)
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(superuser)) __obj.updateDynamic("superuser")(superuser)
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleOptions]
  }
}

