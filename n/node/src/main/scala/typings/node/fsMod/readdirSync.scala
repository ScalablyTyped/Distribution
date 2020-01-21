package typings.node.fsMod

import typings.node.AnonBufferEncodingFalse
import typings.node.AnonEncodingFalse
import typings.node.AnonEncodingFalseWithFileTypes
import typings.node.AnonEncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readdirSync")
@js.native
object readdirSync extends js.Object {
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): js.Array[String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: AnonBufferEncodingFalse): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: AnonEncodingFalse): js.Array[String] = js.native
  def apply(path: PathLike, options: AnonEncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def apply(path: PathLike, options: AnonEncodingTrue): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

