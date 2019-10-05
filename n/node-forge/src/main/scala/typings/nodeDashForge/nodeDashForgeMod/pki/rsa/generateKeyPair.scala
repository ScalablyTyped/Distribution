package typings.nodeDashForge.nodeDashForgeMod.pki.rsa

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.rsa.generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  def apply(): typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(bits: Double): typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(bits: Double, e: Double): typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(
    bits: Double,
    e: Double,
    callback: js.Function2[
      /* err */ Error, 
      /* keypair */ typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(options: GenerateKeyPairOptions): typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(
    options: GenerateKeyPairOptions,
    callback: js.Function2[
      /* err */ Error, 
      /* keypair */ typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typings.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
}

