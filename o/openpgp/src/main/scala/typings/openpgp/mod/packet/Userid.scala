package typings.openpgp.mod.packet

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.Userid")
@js.native
/**
  * Implementation of the User ID Packet (Tag 13)
  * A User ID packet consists of UTF-8 text that is intended to represent
  * the name and email address of the key holder.  By convention, it
  * includes an RFC 2822 [RFC2822] mail name-addr, but there are no
  * restrictions on its content.  The packet length in the header
  * specifies the length of the User ID.
  */
class Userid () extends js.Object {
  /**
    * A string containing the user id. Usually in the form
    * John Doe <john@example.com>
    */
  var userid: String = js.native
  /**
    * Set userid string from object, e.g. { name:'Phil Zimmermann', email:'phil@openpgp.org' }
    */
  def format(): Unit = js.native
  /**
    * Parse userid string, e.g. 'John Doe <john@example.com>'
    */
  def parse(): Unit = js.native
  /**
    * Parsing function for a user id packet (tag 13).
    * @param input payload of a tag 13 packet
    */
  def read(input: Uint8Array): Unit = js.native
  /**
    * Creates a binary representation of the user id packet
    * @returns binary representation
    */
  def write(): Uint8Array = js.native
}

