package typings
package mongrationLib.mongrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbConfig extends js.Object {
  var db: js.UndefOr[java.lang.String] = js.undefined
  var hosts: js.UndefOr[java.lang.String] = js.undefined
  var migrationCollection: java.lang.String
  var mongoUri: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var replicaSet: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object DbConfig {
  @scala.inline
  def apply(
    migrationCollection: java.lang.String,
    db: java.lang.String = null,
    hosts: java.lang.String = null,
    mongoUri: java.lang.String = null,
    password: java.lang.String = null,
    replicaSet: java.lang.String = null,
    user: java.lang.String = null
  ): DbConfig = {
    val __obj = js.Dynamic.literal(migrationCollection = migrationCollection)
    if (db != null) __obj.updateDynamic("db")(db)
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (mongoUri != null) __obj.updateDynamic("mongoUri")(mongoUri)
    if (password != null) __obj.updateDynamic("password")(password)
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[DbConfig]
  }
}

