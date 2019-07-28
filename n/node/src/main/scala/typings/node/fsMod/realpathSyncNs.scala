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

@JSImport("fs", "realpathSync")
@js.native
object realpathSyncNs extends js.Object {
  def native(path: PathLike): java.lang.String | Buffer = js.native
  def native(path: PathLike, options: java.lang.String): java.lang.String | Buffer = js.native
  def native(path: PathLike, options: Anon_BufferEncoding): Buffer = js.native
  def native(path: PathLike, options: Anon_EncodingBufferEncoding): java.lang.String = js.native
  def native(path: PathLike, options: Anon_EncodingNull): java.lang.String | Buffer = js.native
  def native(path: PathLike, options: BufferEncoding): java.lang.String = js.native
  @JSName("native")
  def native_String(path: PathLike): java.lang.String = js.native
  @JSName("native")
  def native_buffer(path: PathLike, options: buffer): Buffer = js.native
}

