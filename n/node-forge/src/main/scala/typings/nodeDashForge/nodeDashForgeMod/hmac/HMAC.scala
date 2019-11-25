package typings.nodeDashForge.nodeDashForgeMod.hmac

import typings.node.Buffer
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HMAC extends js.Object {
  def digest(): ByteBuffer = js.native
  def getMact(): ByteBuffer = js.native
  def start(md: Algorithm): Unit = js.native
  def start(md: Algorithm, key: String): Unit = js.native
  def start(md: Algorithm, key: ByteBuffer): Unit = js.native
  def update(bytes: String): Unit = js.native
  def update(bytes: Buffer): Unit = js.native
  def update(bytes: ByteBuffer): Unit = js.native
}

