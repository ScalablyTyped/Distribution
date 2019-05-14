package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with pool.getConnection().
  */
trait GetPooledConnectionOptions extends js.Object {
  /** Password of the specified user. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Optionally set the connection tag. */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /** Database user to retrieve the connection for. */
  var user: java.lang.String
}

object GetPooledConnectionOptions {
  @scala.inline
  def apply(user: java.lang.String, password: java.lang.String = null, tag: java.lang.String = null): GetPooledConnectionOptions = {
    val __obj = js.Dynamic.literal(user = user)
    if (password != null) __obj.updateDynamic("password")(password)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[GetPooledConnectionOptions]
  }
}

