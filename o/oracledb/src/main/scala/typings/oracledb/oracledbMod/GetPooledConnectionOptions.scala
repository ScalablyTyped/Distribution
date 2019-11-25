package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with pool.getConnection().
  */
trait GetPooledConnectionOptions extends js.Object {
  /** Password of the specified user. */
  var password: js.UndefOr[String] = js.undefined
  /** Optionally set the connection tag. */
  var tag: js.UndefOr[String] = js.undefined
  /** Database user to retrieve the connection for. */
  var user: String
}

object GetPooledConnectionOptions {
  @scala.inline
  def apply(user: String, password: String = null, tag: String = null): GetPooledConnectionOptions = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPooledConnectionOptions]
  }
}

