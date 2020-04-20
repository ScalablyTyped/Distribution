package typings.openpgp.mod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maps curve names under various standards to one
  * @see
  */
/* Rewritten from type alias, can be one of: 
  - typings.openpgp.openpgpStrings.p256
  - typings.openpgp.openpgpStrings.p384
  - typings.openpgp.openpgpStrings.p251
  - typings.openpgp.openpgpStrings.secp256k1
  - typings.openpgp.openpgpStrings.ed25519
  - typings.openpgp.openpgpStrings.curve25519
  - typings.openpgp.openpgpStrings.brainpoolP256r1
  - typings.openpgp.openpgpStrings.brainpoolP384r1
  - typings.openpgp.openpgpStrings.brainpoolP512r1
*/
trait curve extends js.Object

object curve {
  @scala.inline
  def brainpoolP256r1: typings.openpgp.openpgpStrings.brainpoolP256r1 = "brainpoolP256r1".asInstanceOf[typings.openpgp.openpgpStrings.brainpoolP256r1]
  @scala.inline
  def brainpoolP384r1: typings.openpgp.openpgpStrings.brainpoolP384r1 = "brainpoolP384r1".asInstanceOf[typings.openpgp.openpgpStrings.brainpoolP384r1]
  @scala.inline
  def brainpoolP512r1: typings.openpgp.openpgpStrings.brainpoolP512r1 = "brainpoolP512r1".asInstanceOf[typings.openpgp.openpgpStrings.brainpoolP512r1]
  @scala.inline
  def curve25519: typings.openpgp.openpgpStrings.curve25519 = "curve25519".asInstanceOf[typings.openpgp.openpgpStrings.curve25519]
  @scala.inline
  def ed25519: typings.openpgp.openpgpStrings.ed25519 = "ed25519".asInstanceOf[typings.openpgp.openpgpStrings.ed25519]
  @scala.inline
  def p251: typings.openpgp.openpgpStrings.p251 = "p251".asInstanceOf[typings.openpgp.openpgpStrings.p251]
  @scala.inline
  def p256: typings.openpgp.openpgpStrings.p256 = "p256".asInstanceOf[typings.openpgp.openpgpStrings.p256]
  @scala.inline
  def p384: typings.openpgp.openpgpStrings.p384 = "p384".asInstanceOf[typings.openpgp.openpgpStrings.p384]
  @scala.inline
  def secp256k1: typings.openpgp.openpgpStrings.secp256k1 = "secp256k1".asInstanceOf[typings.openpgp.openpgpStrings.secp256k1]
}

