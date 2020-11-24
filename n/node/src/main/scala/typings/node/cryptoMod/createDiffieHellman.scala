package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "createDiffieHellman")
@js.native
object createDiffieHellman extends js.Object {
  
  def apply(prime_length: Double): DiffieHellman_ = js.native
  def apply(prime_length: Double, generator: Double): DiffieHellman_ = js.native
  def apply(prime_length: Double, generator: ArrayBufferView): DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman_ = js.native
  def apply(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): DiffieHellman_ = js.native
  def apply(prime: ArrayBufferView): DiffieHellman_ = js.native
}
