package typings.notp.notpMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notp", "hotp")
@js.native
object hotpNs extends js.Object {
  /**
    * Generate a counter based One Time Password.
    * @param key Key for the one time password. This should be unique and secret
    * for every user as this is the seed that is used to calculate the HMAC.
    * @param opt HOTP generate options.
    */
  def gen(key: String): String = js.native
  def gen(key: String, opt: HOTPGenOpt): String = js.native
  def gen(key: Buffer): String = js.native
  def gen(key: Buffer, opt: HOTPGenOpt): String = js.native
  def gen(key: Uint8Array): String = js.native
  def gen(key: Uint8Array, opt: HOTPGenOpt): String = js.native
  /**
    * Check a One Time Password based on a counter.
    * @param token Passcode to validate.
    * @param key Key for the one time password. This should be unique and secret for
    * every user as it is the seed used to calculate the HMAC.
    * @param opt HOTP verify options.
    */
  def verify(token: String, key: String): VerifyResult | Null = js.native
  def verify(token: String, key: String, opt: HOTPVerifyOpt): VerifyResult | Null = js.native
  def verify(token: String, key: Buffer): VerifyResult | Null = js.native
  def verify(token: String, key: Buffer, opt: HOTPVerifyOpt): VerifyResult | Null = js.native
  def verify(token: String, key: Uint8Array): VerifyResult | Null = js.native
  def verify(token: String, key: Uint8Array, opt: HOTPVerifyOpt): VerifyResult | Null = js.native
}

