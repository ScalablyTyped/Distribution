package typings.pgDashCopyDashStreams.pgDashCopyDashStreamsMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-copy-streams", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def from(txt: String): CopyStreamQuery = js.native
  def from(txt: String, options: TransformOptions): CopyStreamQuery = js.native
  def to(txt: String): CopyToStreamQuery = js.native
  def to(txt: String, options: TransformOptions): CopyToStreamQuery = js.native
}

