package typings.mongration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbConfig extends js.Object {
  var db: js.UndefOr[String] = js.undefined
  var hosts: js.UndefOr[String] = js.undefined
  var migrationCollection: String
  var mongoUri: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var replicaSet: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object DbConfig {
  @scala.inline
  def apply(
    migrationCollection: String,
    db: String = null,
    hosts: String = null,
    mongoUri: String = null,
    password: String = null,
    replicaSet: String = null,
    user: String = null
  ): DbConfig = {
    val __obj = js.Dynamic.literal(migrationCollection = migrationCollection.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (mongoUri != null) __obj.updateDynamic("mongoUri")(mongoUri.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbConfig]
  }
}

