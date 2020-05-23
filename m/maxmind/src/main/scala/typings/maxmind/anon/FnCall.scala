package typings.maxmind.anon

import typings.node.Buffer
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.EncodingNull
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: Double): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: EncodingBufferEncoding): js.Promise[String] = js.native
  def apply(path: Double, options: EncodingNull): js.Promise[Buffer] = js.native
  def apply(path: PathLike): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: EncodingBufferEncoding): js.Promise[String] = js.native
  def apply(path: PathLike, options: EncodingNull): js.Promise[Buffer] = js.native
}

