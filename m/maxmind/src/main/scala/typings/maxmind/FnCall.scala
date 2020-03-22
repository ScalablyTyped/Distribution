package typings.maxmind

import typings.node.AnonEncodingFlag
import typings.node.AnonFlag
import typings.node.AnonFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: Double): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: AnonEncodingFlag): js.Promise[String] = js.native
  def apply(path: Double, options: AnonFlag): js.Promise[Buffer] = js.native
  def apply(path: Double, options: AnonFlagString): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: AnonEncodingFlag): js.Promise[String] = js.native
  def apply(path: PathLike, options: AnonFlag): js.Promise[Buffer] = js.native
  def apply(path: PathLike, options: AnonFlagString): js.Promise[String | Buffer] = js.native
}

