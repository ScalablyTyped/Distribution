package typings.nodePgMigrate.rolesTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleOptions extends js.Object {
  var admin: js.UndefOr[String | js.Array[String]] = js.undefined
  var bypassrls: js.UndefOr[Boolean] = js.undefined
  var createdb: js.UndefOr[Boolean] = js.undefined
  var createrole: js.UndefOr[Boolean] = js.undefined
  var encrypted: js.UndefOr[Boolean] = js.undefined
  var inRole: js.UndefOr[String | js.Array[String]] = js.undefined
  var inherit: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var login: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[Value] = js.undefined
  var replication: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String | js.Array[String]] = js.undefined
  var superuser: js.UndefOr[Boolean] = js.undefined
  var valid: js.UndefOr[Value] = js.undefined
}

object RoleOptions {
  @scala.inline
  def apply(
    admin: String | js.Array[String] = null,
    bypassrls: js.UndefOr[Boolean] = js.undefined,
    createdb: js.UndefOr[Boolean] = js.undefined,
    createrole: js.UndefOr[Boolean] = js.undefined,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    inRole: String | js.Array[String] = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    login: js.UndefOr[Boolean] = js.undefined,
    password: js.UndefOr[Null | Value] = js.undefined,
    replication: js.UndefOr[Boolean] = js.undefined,
    role: String | js.Array[String] = null,
    superuser: js.UndefOr[Boolean] = js.undefined,
    valid: js.UndefOr[Null | Value] = js.undefined
  ): RoleOptions = {
    val __obj = js.Dynamic.literal()
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassrls)) __obj.updateDynamic("bypassrls")(bypassrls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createdb)) __obj.updateDynamic("createdb")(createdb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createrole)) __obj.updateDynamic("createrole")(createrole.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.get.asInstanceOf[js.Any])
    if (inRole != null) __obj.updateDynamic("inRole")(inRole.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(login)) __obj.updateDynamic("login")(login.get.asInstanceOf[js.Any])
    if (!js.isUndefined(password)) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(replication)) __obj.updateDynamic("replication")(replication.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(superuser)) __obj.updateDynamic("superuser")(superuser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleOptions]
  }
}

