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
trait FnCallPathOptions extends js.Object {
  def apply(path: Double): String | Buffer = js.native
  def apply(path: Double, options: String): String = js.native
  def apply(path: Double, options: AnonEncodingFlag): String = js.native
  def apply(path: Double, options: AnonFlag): Buffer = js.native
  def apply(path: Double, options: AnonFlagString): String | Buffer = js.native
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: String): String = js.native
  def apply(path: PathLike, options: AnonEncodingFlag): String = js.native
  def apply(path: PathLike, options: AnonFlag): Buffer = js.native
  def apply(path: PathLike, options: AnonFlagString): String | Buffer = js.native
}

