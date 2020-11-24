package typings.nodeForge.mod.pki.rsa

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.rsa.generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  
  def apply(): KeyPair = js.native
  def apply(
    bits: js.UndefOr[scala.Nothing],
    e: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* keypair */ KeyPair, Unit]
  ): KeyPair = js.native
  def apply(bits: js.UndefOr[scala.Nothing], e: Double): KeyPair = js.native
  def apply(
    bits: js.UndefOr[scala.Nothing],
    e: Double,
    callback: js.Function2[/* err */ Error, /* keypair */ KeyPair, Unit]
  ): KeyPair = js.native
  def apply(bits: Double): KeyPair = js.native
  def apply(
    bits: Double,
    e: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* keypair */ KeyPair, Unit]
  ): KeyPair = js.native
  def apply(bits: Double, e: Double): KeyPair = js.native
  def apply(bits: Double, e: Double, callback: js.Function2[/* err */ Error, /* keypair */ KeyPair, Unit]): KeyPair = js.native
  def apply(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* keypair */ KeyPair, Unit]
  ): KeyPair = js.native
  def apply(options: GenerateKeyPairOptions): KeyPair = js.native
  def apply(
    options: GenerateKeyPairOptions,
    callback: js.Function2[/* err */ Error, /* keypair */ KeyPair, Unit]
  ): KeyPair = js.native
}
