package typings.nodeForge.mod.util

import typings.nodeForge.mod.Base64
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.Hex
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.binary")
@js.native
object binary extends js.Object {
  @js.native
  object base64 extends js.Object {
    def decode(input: Base64): Uint8Array = js.native
    def decode(input: Base64, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
    def decode(input: Base64, output: Uint8Array): Uint8Array = js.native
    def decode(input: Base64, output: Uint8Array, offset: Double): Uint8Array = js.native
    def encode(input: Uint8Array): Base64 = js.native
    def encode(input: Uint8Array, maxline: Double): Base64 = js.native
  }
  
  @js.native
  object hex extends js.Object {
    def decode(hex: Hex): Uint8Array = js.native
    def decode(hex: Hex, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
    def decode(hex: Hex, output: Uint8Array): Uint8Array = js.native
    def decode(hex: Hex, output: Uint8Array, offset: Double): Uint8Array = js.native
    def encode(bytes: Bytes): Hex = js.native
    def encode(bytes: ArrayBufferView): Hex = js.native
    def encode(bytes: ByteStringBuffer): Hex = js.native
    def encode(bytes: ArrayBuffer): Hex = js.native
  }
  
  @js.native
  object raw extends js.Object {
    def decode(str: Bytes): Uint8Array = js.native
    def decode(str: Bytes, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
    def decode(str: Bytes, output: Uint8Array): Uint8Array = js.native
    def decode(str: Bytes, output: Uint8Array, offset: Double): Uint8Array = js.native
    def encode(x: Uint8Array): Bytes = js.native
  }
  
}

