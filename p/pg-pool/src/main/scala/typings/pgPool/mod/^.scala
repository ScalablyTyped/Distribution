package typings.pgPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-pool", JSImport.Namespace)
@js.native
class ^[T /* <: typings.pg.mod.Client */] () extends Pool[T] {
  def this(config: Config[T]) = this()
  def this(config: js.UndefOr[scala.Nothing], client: ClientLikeCtr[T]) = this()
  def this(config: Config[T], client: ClientLikeCtr[T]) = this()
}
