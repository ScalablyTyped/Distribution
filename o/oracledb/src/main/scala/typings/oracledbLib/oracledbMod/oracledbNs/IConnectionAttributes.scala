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

