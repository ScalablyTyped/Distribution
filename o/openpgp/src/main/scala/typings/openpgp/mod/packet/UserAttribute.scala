package typings.openpgp.mod.packet

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.UserAttribute")
@js.native
/**
  * Implementation of the User Attribute Packet (Tag 17)
  * The User Attribute packet is a variation of the User ID packet.  It
  * is capable of storing more types of data than the User ID packet,
  * which is limited to text.  Like the User ID packet, a User Attribute
  * packet may be certified by the key owner ("self-signed") or any other
  * key owner who cares to certify it.  Except as noted, a User Attribute
  * packet may be used anywhere that a User ID packet may be used.
  * While User Attribute packets are not a required part of the OpenPGP
  * standard, implementations SHOULD provide at least enough
  * compatibility to properly handle a certification signature on the
  * User Attribute packet.  A simple way to do this is by treating the
  * User Attribute packet as a User ID packet with opaque contents, but
  * an implementation may use any method desired.
  */
class UserAttribute () extends js.Object {
  
  /**
    * Compare for equality
    * @param usrAttr
    * @returns true if equal
    */
  def equals(usrAttr: UserAttribute): Boolean = js.native
  
  /**
    * parsing function for a user attribute packet (tag 17).
    * @param input payload of a tag 17 packet
    */
  def read(input: Uint8Array): Unit = js.native
  
  /**
    * Creates a binary representation of the user attribute packet
    * @returns string representation
    */
  def write(): Uint8Array = js.native
}
