package typings.maxmind

import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(path: Double): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: Anon_EncodingFlag): js.Promise[Buffer] = js.native
  def apply(path: Double, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: Anon_EncodingFlagString): js.Promise[String] = js.native
  def apply(path: PathLike): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingFlag): js.Promise[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingFlagString): js.Promise[String] = js.native
}

