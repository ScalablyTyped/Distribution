package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet")
@js.native
object packetNs extends js.Object {
  trait PublicKey extends js.Object {
    var algorithm: openpgpLib.openpgpMod.enumsNs.publicKey
    var created: stdLib.Date
    var fingerprint: java.lang.String
    def getBitSize(): scala.Double
    def getFingerprint(): java.lang.String
    def getKeyId(): java.lang.String
    def read(input: java.lang.String): js.Any
    def write(): js.Any
  }
  
  trait SecretKey extends PublicKey {
    def clearPrivateMPIs(str_passphrase: java.lang.String): scala.Boolean
    def encrypt(passphrase: java.lang.String): scala.Unit
  }
  
  /** Allocate a new packet from structured packet clone
    @param packetClone packet clone
    */
  def fromStructuredClone(packetClone: js.Object): js.Object = js.native
  /** Allocate a new packet
    @param property name from enums.packet
    */
  def newPacketFromTag(tag: java.lang.String): js.Object = js.native
}

