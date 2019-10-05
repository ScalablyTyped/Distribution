package typings.objectDashHash.objectDashHashMod.ObjectHash

import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  def apply(`object`: js.Any): String = js.native
  def apply(`object`: js.Any, options: IOptions): String = js.native
  def MD5(`object`: js.Any): String = js.native
  def keys(`object`: js.Any): String = js.native
  def keysMD5(`object`: js.Any): String = js.native
  def sha1(`object`: js.Any): String = js.native
  def writeToStream(value: js.Any, options: IOptions, stream: PassThrough): Unit = js.native
  def writeToStream(value: js.Any, stream: PassThrough): Unit = js.native
}

