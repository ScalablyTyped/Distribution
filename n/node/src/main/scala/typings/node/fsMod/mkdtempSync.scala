package typings.node.fsMod

import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "mkdtempSync")
@js.native
object mkdtempSync extends js.Object {
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(prefix: java.lang.String): java.lang.String | Buffer = js.native
  def apply(prefix: java.lang.String, options: java.lang.String): java.lang.String | Buffer = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(prefix: java.lang.String, options: Anon_BufferEncoding): Buffer = js.native
  def apply(prefix: java.lang.String, options: Anon_EncodingBufferEncoding): java.lang.String = js.native
  def apply(prefix: java.lang.String, options: Anon_EncodingNull): java.lang.String | Buffer = js.native
  def apply(prefix: java.lang.String, options: BufferEncoding): java.lang.String = js.native
}

