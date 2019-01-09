package typings
package mzLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/fs", "realpathSync")
@js.native
object realpathSyncNs extends js.Object {
  def native(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncoding_1560675869): nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncodingNull): java.lang.String = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingNull): java.lang.String | nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  @JSName("native")
  def native_String(path: nodeLib.fsMod.PathLike): java.lang.String = js.native
  @JSName("native")
  def native_buffer(path: nodeLib.fsMod.PathLike, options: mzLib.mzLibStrings.buffer): nodeLib.Buffer = js.native
}

