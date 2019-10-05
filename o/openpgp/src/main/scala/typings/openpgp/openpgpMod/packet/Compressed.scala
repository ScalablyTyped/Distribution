package typings.openpgp.openpgpMod.packet

import typings.openpgp.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.Compressed")
@js.native
/**
  * Implementation of the Compressed Data Packet (Tag 8)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.6|RFC4880 5.6}:
  * The Compressed Data packet contains compressed data.  Typically,
  * this packet is found as the contents of an encrypted packet, or following
  * a Signature or One-Pass Signature packet, and contains a literal data packet.
  */
class Compressed () extends js.Object {
  /**
    * Compression algorithm
    * @type {compression}
    */
  var algorithm: js.Any = js.native
  /**
    * Compressed packet data
    */
  var compressed: Uint8Array | ReadableStream[Uint8Array] = js.native
  /**
    * List of packets
    */
  var packets: List = js.native
  /**
    * Packet type
    */
  var tag: typings.openpgp.openpgpMod.enums.packet = js.native
  /**
    * Compress the packet data (member decompressedData)
    */
  def compress(): Unit = js.native
  /**
    * Decompression method for decompressing the compressed data
    * read by read_packet
    */
  def decompress(): Unit = js.native
  def read(bytes: ReadableStream[Uint8Array]): Unit = js.native
  /**
    * Parsing function for the packet.
    * @param bytes Payload of a tag 8 packet
    */
  def read(bytes: Uint8Array): Unit = js.native
  /**
    * Return the compressed packet.
    * @returns binary compressed packet
    */
  def write(): Uint8Array | ReadableStream[Uint8Array] = js.native
}

