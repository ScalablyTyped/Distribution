package typings.pgPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-pool", JSImport.Namespace)
@js.native
class ^[T /* <: typings.pg.mod.Client */] () extends Pool[T] {
  def this(config: Config[T]) = this()
  def this(config: Config[T], client: ClientLikeCtr[T]) = this()
}

