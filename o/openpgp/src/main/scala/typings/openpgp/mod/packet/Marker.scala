package typings.openpgp.mod.packet

import typings.openpgp.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.Marker")
@js.native
/**
  * Implementation of the strange "Marker packet" (Tag 10)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.8|RFC4880 5.8}:
  * An experimental version of PGP used this packet as the Literal
  * packet, but no released version of PGP generated Literal packets with this
  * tag. With PGP 5.x, this packet has been reassigned and is reserved for use as
  * the Marker packet.
  * Such a packet MUST be ignored when received.
  */
class Marker () extends js.Object {
  /**
    * Parsing function for a literal data packet (tag 10).
    * @param input Payload of a tag 10 packet
    * @param position Position to start reading from the input string
    * @param len Length of the packet or the remaining length of
    *        input at position
    * @returns Object representation
    */
  def read(input: String, position: Integer, len: Integer): Marker = js.native
}

