package typings
package pgDashPoolLib.pgDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-pool", "Pool")
@js.native
// `new Pool('pg://user@localhost/mydb')` is not allowed.
// But it passes type check because of issue:
// https://github.com/Microsoft/TypeScript/issues/7485
class Pool ()
  extends pgLib.pgMod.Pool {
  def this(config: pgLib.pgMod.PoolConfig) = this()
}

