package typings.node.fsMod

import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.nodeStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "readlink")
@js.native
object readlinkNs extends js.Object {
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: PathLike): js.Promise[java.lang.String] = js.native
  def __promisify__(path: PathLike, options: java.lang.String): js.Promise[java.lang.String | Buffer] = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: PathLike, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingNull): js.Promise[java.lang.String | Buffer] = js.native
  def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
}

