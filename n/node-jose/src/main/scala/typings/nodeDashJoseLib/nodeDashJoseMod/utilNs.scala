package typings
package nodeDashJoseLib.nodeDashJoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "util")
@js.native
object utilNs extends js.Object {
  def asBuffer(input: java.lang.String): nodeLib.Buffer = js.native
  def asBuffer(input: java.lang.String, encoding: java.lang.String): nodeLib.Buffer = js.native
  def asBuffer(input: nodeLib.Buffer): nodeLib.Buffer = js.native
  def asBuffer(input: nodeLib.Buffer, encoding: java.lang.String): nodeLib.Buffer = js.native
  def randomBytes(len: scala.Double): nodeLib.Buffer = js.native
  @JSName("base64url")
  @js.native
  object base64urlNs extends js.Object {
    def decode(base64url: java.lang.String): java.lang.String = js.native
    def encode(buffer: java.lang.String): java.lang.String = js.native
    def encode(buffer: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
    def encode(buffer: nodeLib.Buffer): java.lang.String = js.native
    def encode(buffer: nodeLib.Buffer, encoding: java.lang.String): java.lang.String = js.native
  }
  
  @JSName("utf8")
  @js.native
  object utf8Ns extends js.Object {
    def decode(input: java.lang.String): java.lang.String = js.native
    def encode(input: java.lang.String): java.lang.String = js.native
  }
  
}

