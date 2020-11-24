package typings.mz.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "createDiffieHellman")
@js.native
object createDiffieHellman extends js.Object {
  
  def apply(prime_length: Double): typings.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime_length: Double, generator: Double): typings.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime_length: Double, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding): typings.node.cryptoMod.DiffieHellman_ = js.native
  def apply(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typings.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typings.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = js.native
}
