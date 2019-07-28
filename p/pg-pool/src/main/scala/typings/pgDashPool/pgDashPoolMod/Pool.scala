package typings.pgDashPool.pgDashPoolMod

import typings.pg.pgMod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-pool", "Pool")
@js.native
// `new Pool('pg://user@localhost/mydb')` is not allowed.
// But it passes type check because of issue:
// https://github.com/Microsoft/TypeScript/issues/7485
class Pool ()
  extends typings.pg.pgMod.Pool {
  def this(config: PoolConfig) = this()
}

