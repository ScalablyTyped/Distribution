package typings.maxmind.anon

import typings.node.Buffer
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.`3`
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
  def apply(path: Double, options: `3`): js.Promise[Buffer] = js.native
  def apply(path: PathLike): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: EncodingBufferEncoding): js.Promise[String] = js.native
  def apply(path: PathLike, options: `3`): js.Promise[Buffer] = js.native
}

