package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote", "prefetch")
@js.native
object prefetch extends js.Object {
  /**
    * @deprecated * **THIS API IS DEPRECATED. USE pacote.tarball() INSTEAD**
    *
    * Fetches package data identified by `spec`, usually for the purpose of warming
    * up the local package cache (with `opts.cache`). It does not return anything.
    */
  def apply(spec: String): js.Promise[Unit] = js.native
  def apply(spec: String, opts: Options): js.Promise[Unit] = js.native
}

