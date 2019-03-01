package typings
package oracledbLib.oracledbMod.oracledbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionAttributes extends js.Object {
  var connectString: java.lang.String
  var externalAuth: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** If not passed, "default" will be used. */
  var poolAlias: js.UndefOr[java.lang.String] = js.undefined
  var stmtCacheSize: js.UndefOr[scala.Double] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object IConnectionAttributes {
  @scala.inline
  def apply(
    connectString: java.lang.String,
    externalAuth: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    poolAlias: java.lang.String = null,
    stmtCacheSize: scala.Int | scala.Double = null,
    user: java.lang.String = null
  ): IConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connectString")(connectString)
    if (!js.isUndefined(externalAuth)) __obj.updateDynamic("externalAuth")(externalAuth)
    if (password != null) __obj.updateDynamic("password")(password)
    if (poolAlias != null) __obj.updateDynamic("poolAlias")(poolAlias)
    if (stmtCacheSize != null) __obj.updateDynamic("stmtCacheSize")(stmtCacheSize.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IConnectionAttributes]
  }
}

