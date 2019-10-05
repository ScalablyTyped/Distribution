package typings.node.fsMod

import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_EncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingTrue
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
  def apply(path: PathLike): js.Array[java.lang.String] = js.native
  def apply(path: PathLike, options: java.lang.String): js.Array[Buffer | java.lang.String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalse): js.Array[java.lang.String] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | java.lang.String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def apply(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[java.lang.String] = js.native
}

