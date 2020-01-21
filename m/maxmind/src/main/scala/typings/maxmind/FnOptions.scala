package typings.maxmind

import typings.node.AnonEncodingFlag
import typings.node.AnonEncodingFlagNull
import typings.node.AnonEncodingFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptions extends js.Object {
  def apply(path: Double): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: AnonEncodingFlag): js.Promise[Buffer] = js.native
  def apply(path: Double, options: AnonEncodingFlagNull): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: AnonEncodingFlagString): js.Promise[String] = js.native
  def apply(path: PathLike): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: AnonEncodingFlag): js.Promise[Buffer] = js.native
  def apply(path: PathLike, options: AnonEncodingFlagNull): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: AnonEncodingFlagString): js.Promise[String] = js.native
}

