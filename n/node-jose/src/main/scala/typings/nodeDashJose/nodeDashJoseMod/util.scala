package typings.nodeDashJose.nodeDashJoseMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "util")
@js.native
object util extends js.Object {
  def asBuffer(input: String): Buffer = js.native
  def asBuffer(input: String, encoding: String): Buffer = js.native
  def asBuffer(input: Buffer): Buffer = js.native
  def asBuffer(input: Buffer, encoding: String): Buffer = js.native
  def randomBytes(len: Double): Buffer = js.native
  @js.native
  object base64url extends js.Object {
    def decode(base64url: String): String = js.native
    def encode(buffer: String): String = js.native
    def encode(buffer: String, encoding: String): String = js.native
    def encode(buffer: Buffer): String = js.native
    def encode(buffer: Buffer, encoding: String): String = js.native
  }
  
  @js.native
  object utf8 extends js.Object {
    def decode(input: String): String = js.native
    def encode(input: String): String = js.native
  }
  
}

