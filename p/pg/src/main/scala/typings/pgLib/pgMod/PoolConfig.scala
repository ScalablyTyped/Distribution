package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends ClientConfig {
  var Promise: js.UndefOr[stdLib.PromiseConstructorLike] = js.undefined
  var application_name: js.UndefOr[java.lang.String] = js.undefined
  var connectionTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var idleTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  // properties from module 'node-pool'
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

