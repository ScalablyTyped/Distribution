package typings.nodeForge.mod.util

import typings.nodeForge.mod.Utf8
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.text")
@js.native
object text extends js.Object {
  @js.native
  object utf16 extends js.Object {
    def decode(bytes: Uint8Array): String = js.native
    def encode(str: String): Uint8Array = js.native
    def encode(str: String, output: Uint8Array): Uint8Array = js.native
    def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = js.native
  }
  
  @js.native
  object utf8 extends js.Object {
    def decode(bytes: Uint8Array): Utf8 = js.native
    def encode(str: String): Uint8Array = js.native
    def encode(str: String, output: Uint8Array): Uint8Array = js.native
    def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = js.native
  }
  
}

