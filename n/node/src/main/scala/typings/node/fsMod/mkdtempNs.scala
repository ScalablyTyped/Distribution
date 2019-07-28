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
@JSImport("fs", "mkdtemp")
@js.native
object mkdtempNs extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: java.lang.String): js.Promise[java.lang.String] = js.native
  def __promisify__(prefix: java.lang.String, options: java.lang.String): js.Promise[java.lang.String | Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: java.lang.String, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(prefix: java.lang.String, options: Anon_EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
  def __promisify__(prefix: java.lang.String, options: Anon_EncodingNull): js.Promise[java.lang.String | Buffer] = js.native
  def __promisify__(prefix: java.lang.String, options: BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: java.lang.String, options: buffer): js.Promise[Buffer] = js.native
}

