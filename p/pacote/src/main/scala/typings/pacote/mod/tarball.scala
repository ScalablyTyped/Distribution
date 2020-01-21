package typings.pacote.mod

import typings.node.Buffer
import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote", "tarball")
@js.native
object tarball extends js.Object {
  /**
    * Fetches package data identified by `spec` and returns the data as a buffer.
    */
  def apply(spec: String): js.Promise[Buffer] = js.native
  def apply(spec: String, opts: Options): js.Promise[Buffer] = js.native
  /**
    * Same as `pacote.tarball`, except it returns a stream instead of a Promise.
    */
  def stream(spec: String): PassThrough = js.native
  def stream(spec: String, opts: Options): PassThrough = js.native
  /**
    * Like `pacote.tarball`, but instead of returning data directly, data will
    * be written directly to `dest`, and create any required directories along
    * the way.
    */
  def toFile(spec: String, dest: String): js.Promise[Unit] = js.native
  def toFile(spec: String, dest: String, opts: Options): js.Promise[Unit] = js.native
}

