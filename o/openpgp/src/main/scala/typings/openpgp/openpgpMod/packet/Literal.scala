package typings.openpgp.openpgpMod.packet

import typings.openpgp.openpgpMod.ReadableStream
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.Literal")
@js.native
class Literal protected () extends js.Object {
  /**
    * Implementation of the Literal Data Packet (Tag 11)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.9|RFC4880 5.9}:
    * A Literal Data packet contains the body of a message; data that is not to be
    * further interpreted.
    * @param date the creation date of the literal package
    */
  def this(date: Date) = this()
  /**
    * Get the byte sequence representing the literal packet data
    * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
    * @returns A sequence of bytes
    */
  def getBytes(clone: Boolean): Uint8Array | ReadableStream[Uint8Array] = js.native
  /**
    * Get the filename of the literal packet data
    * @returns filename
    */
  def getFilename(): String = js.native
  /**
    * Returns literal data packets as native JavaScript string
    * with normalized end of line to \n
    * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
    * @returns literal data as text
    */
  def getText(clone: Boolean): String | ReadableStream[String] = js.native
  def read(input: ReadableStream[Uint8Array]): Literal = js.native
  /**
    * Parsing function for a literal data packet (tag 11).
    * @param input Payload of a tag 11 packet
    * @returns object representation
    */
  def read(input: Uint8Array): Literal = js.native
  def setBytes(bytes: ReadableStream[Uint8Array], format: js.Any): Unit = js.native
  /**
    * Set the packet data to value represented by the provided string of bytes.
    * @param bytes The string of bytes
    * @param {utf8 | binary | text | mime} format The format of the string of bytes
    */
  def setBytes(bytes: Uint8Array, format: js.Any): Unit = js.native
  /**
    * Sets the filename of the literal packet data
    * @param filename Any native javascript string
    */
  def setFilename(filename: String): Unit = js.native
  /**
    * Set the packet data to a javascript native string, end of line
    * will be normalized to \r\n and by default text is converted to UTF8
    * @param text Any native javascript string
    * @param {utf8 | binary | text | mime} format (optional) The format of the string of bytes
    */
  def setText(text: String, format: js.Any): Unit = js.native
  def setText(text: ReadableStream[String], format: js.Any): Unit = js.native
  /**
    * Creates a string representation of the packet
    * @returns Uint8Array representation of the packet
    */
  def write(): Uint8Array | ReadableStream[Uint8Array] = js.native
}

