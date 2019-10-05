package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createDiffieHellman")
@js.native
object createDiffieHellman extends js.Object {
  def apply(prime_length: Double): DiffieHellman = js.native
  def apply(prime_length: Double, generator: Double): DiffieHellman = js.native
  def apply(prime_length: Double, generator: Binary): DiffieHellman = js.native
  def apply(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def apply(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman = js.native
  def apply(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: Double): DiffieHellman = js.native
  def apply(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: Binary): DiffieHellman = js.native
  def apply(prime: Binary): DiffieHellman = js.native
}

