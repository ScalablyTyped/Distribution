package typings.openpgp.openpgpMod.packet

import typings.openpgp.openpgpMod.Integer
import typings.openpgp.openpgpMod.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.packet")
@js.native
object packet extends js.Object {
  def read(input: ReadableStream[Uint8Array], callback: js.Function): Boolean = js.native
  /**
    * Generic static Packet Parser function
    * @param input Input stream as string
    * @param callback Function to call with the parsed packet
    * @returns Returns false if the stream was empty and parsing is done, and true otherwise.
    */
  def read(input: Uint8Array, callback: js.Function): Boolean = js.native
  /**
    * Whether the packet type supports partial lengths per RFC4880
    * @param tag_type Tag type
    * @returns String of the header
    */
  def supportsStreaming(tag_type: Integer): Boolean = js.native
  /**
    * Writes a packet header version 4 with the given tag_type and length to a
    * string
    * @param tag_type Tag type
    * @param length Length of the payload
    * @returns String of the header
    */
  def writeHeader(tag_type: Integer, length: Integer): String = js.native
  /**
    * Writes a packet header Version 3 with the given tag_type and length to a
    * string
    * @param tag_type Tag type
    * @param length Length of the payload
    * @returns String of the header
    */
  def writeOldHeader(tag_type: Integer, length: Integer): String = js.native
  /**
    * Encodes a given integer of length to the openpgp length specifier to a
    * string
    * @param length The length to encode
    * @returns String with openpgp length representation
    */
  def writeSimpleLength(length: Integer): Uint8Array = js.native
}

