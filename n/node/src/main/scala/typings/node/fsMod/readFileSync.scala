package typings.node.fsMod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(path: Double): String | Buffer = js.native
  def apply(path: Double, options: BufferEncoding): String = js.native
  def apply(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def apply(path: Double, options: EncodingBufferEncoding): String = js.native
  def apply(path: Double, options: `3`): Buffer = js.native
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
  def apply(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def apply(path: PathLike, options: EncodingBufferEncoding): String = js.native
  def apply(path: PathLike, options: `3`): Buffer = js.native
}

