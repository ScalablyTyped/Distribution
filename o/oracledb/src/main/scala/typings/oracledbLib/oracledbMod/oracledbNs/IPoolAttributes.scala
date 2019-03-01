package typings
package oracledbLib.oracledbMod.oracledbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoolAttributes extends IConnectionAttributes {
  var poolIncrement: js.UndefOr[scala.Double] = js.undefined
  var poolMax: js.UndefOr[scala.Double] = js.undefined
  var poolMin: js.UndefOr[scala.Double] = js.undefined
  var poolTimeout: js.UndefOr[scala.Double] = js.undefined
}

object IPoolAttributes {
  @scala.inline
  def apply(
    connectString: java.lang.String,
    externalAuth: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    poolAlias: java.lang.String = null,
    poolIncrement: scala.Int | scala.Double = null,
    poolMax: scala.Int | scala.Double = null,
    poolMin: scala.Int | scala.Double = null,
    poolTimeout: scala.Int | scala.Double = null,
    stmtCacheSize: scala.Int | scala.Double = null,
    user: java.lang.String = null
  ): IPoolAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connectString")(connectString)
    if (!js.isUndefined(externalAuth)) __obj.updateDynamic("externalAuth")(externalAuth)
    if (password != null) __obj.updateDynamic("password")(password)
    if (poolAlias != null) __obj.updateDynamic("poolAlias")(poolAlias)
    if (poolIncrement != null) __obj.updateDynamic("poolIncrement")(poolIncrement.asInstanceOf[js.Any])
    if (poolMax != null) __obj.updateDynamic("poolMax")(poolMax.asInstanceOf[js.Any])
    if (poolMin != null) __obj.updateDynamic("poolMin")(poolMin.asInstanceOf[js.Any])
    if (poolTimeout != null) __obj.updateDynamic("poolTimeout")(poolTimeout.asInstanceOf[js.Any])
    if (stmtCacheSize != null) __obj.updateDynamic("stmtCacheSize")(stmtCacheSize.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IPoolAttributes]
  }
}

