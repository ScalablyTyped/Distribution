package typings.node.fsMod

import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readlinkSync")
@js.native
object readlinkSync extends js.Object {
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): java.lang.String | Buffer = js.native
  def apply(path: PathLike, options: java.lang.String): java.lang.String | Buffer = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: Anon_BufferEncoding): Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingBufferEncoding): java.lang.String = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): java.lang.String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): java.lang.String = js.native
}

