package typings.pacote

import typings.pacote.pacoteMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote/prefetch", JSImport.Namespace)
@js.native
object prefetchMod extends js.Object {
  /**
    * @deprecated * **THIS API IS DEPRECATED. USE pacote.tarball() INSTEAD**
    *
    * Fetches package data identified by `spec`, usually for the purpose of warming
    * up the local package cache (with `opts.cache`). It does not return anything.
    */
  def apply(spec: String): js.Promise[Unit] = js.native
  def apply(spec: String, opts: Options): js.Promise[Unit] = js.native
}

