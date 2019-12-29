package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createDiffieHellman")
@js.native
object createDiffieHellman extends js.Object {
  def apply(prime_length: Double): DiffieHellman = js.native
  def apply(prime_length: Double, generator: Double): DiffieHellman = js.native
  def apply(prime_length: Double, generator: ArrayBufferView): DiffieHellman = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def apply(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): DiffieHellman = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): DiffieHellman = js.native
  def apply(prime: ArrayBufferView): DiffieHellman = js.native
}

