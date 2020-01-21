package typings.openpgp.mod.packet

import typings.openpgp.mod.Integer
import typings.openpgp.mod.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.List")
@js.native
/**
  * This class represents a list of openpgp packets.
  * Take care when iterating over it - the packets themselves
  * are stored as numerical indices.
  */
class List () extends js.Object {
  /**
    * The number of packets contained within the list.
    */
  val length: Integer = js.native
  /**
    * Concatenates packetlist or array of packets
    */
  def concat(): Unit = js.native
  /**
    * Creates a new PacketList with all packets from the given types
    */
  def filterByTag(): Unit = js.native
  /**
    * Traverses packet tree and returns first matching packet
    * @param type The packet type
    * @returns
    */
  def findPacket(`type`: typings.openpgp.mod.enums.packet): js.UndefOr[List] = js.native
  /**
    * Returns array of found indices by tag
    */
  def indexOfTag(): Unit = js.native
  /**
    * Adds a packet to the list. This is the only supported method of doing so;
    * writing to packetlist[i] directly will result in an error.
    * @param packet Packet to push
    */
  def push(packet: js.Object): Unit = js.native
  def read(A: ReadableStream[Uint8Array]): Unit = js.native
  /**
    * Reads a stream of binary data and interprents it as a list of packets.
    * @param A Uint8Array of bytes.
    */
  def read(A: Uint8Array): Unit = js.native
  /**
    * Creates a binary representation of openpgp objects contained within the
    * class instance.
    * @returns A Uint8Array containing valid openpgp packets.
    */
  def write(): Uint8Array | ReadableStream[Uint8Array] = js.native
}

/* static members */
@JSImport("openpgp", "packet.List")
@js.native
object List extends js.Object {
  /**
    * Allocate a new packetlist from structured packetlist clone
    * See {@link https://w3c.github.io/html/infrastructure.html#safe-passing-of-structured-data}
    * @param packetClone packetlist clone
    * @returns new packetlist object with data from packetlist clone
    */
  def fromStructuredClone(packetClone: js.Object): js.Object = js.native
}

