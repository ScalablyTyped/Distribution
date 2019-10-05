package typings.mz.fsMod

import typings.mz.mzStrings.buffer
import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/fs", "realpathSync")
@js.native
object realpathSync extends js.Object {
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def apply(path: PathLike, options: buffer): Buffer = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: Anon_BufferEncoding): Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingBufferEncoding): String = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
  def native(path: PathLike): String | Buffer = js.native
  def native(path: PathLike, options: String): String | Buffer = js.native
  def native(path: PathLike, options: Anon_BufferEncoding): Buffer = js.native
  def native(path: PathLike, options: Anon_EncodingBufferEncoding): String = js.native
  def native(path: PathLike, options: Anon_EncodingNull): String | Buffer = js.native
  def native(path: PathLike, options: BufferEncoding): String = js.native
  @JSName("native")
  def native_String(path: PathLike): String = js.native
  @JSName("native")
  def native_buffer(path: PathLike, options: buffer): Buffer = js.native
}

