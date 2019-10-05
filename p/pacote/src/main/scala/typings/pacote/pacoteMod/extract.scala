package typings.pacote.pacoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote", "extract")
@js.native
object extract extends js.Object {
  /**
    * Extracts package data identified by `spec` into a directory named
    * `destination`, which will be created if it does not already exist.
    *
    * If `opts.digest` is provided and the data it identifies is present in the
    * cache, `extract` will bypass most of its operations and go straight to
    * extracting the tarball.
    */
  def apply(spec: String): js.Promise[Unit] = js.native
  def apply(spec: String, destination: String): js.Promise[Unit] = js.native
  def apply(spec: String, destination: String, opts: Options): js.Promise[Unit] = js.native
}

