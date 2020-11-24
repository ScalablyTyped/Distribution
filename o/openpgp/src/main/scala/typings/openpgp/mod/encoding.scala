package typings.openpgp.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "encoding")
@js.native
object encoding extends js.Object {
  
  @js.native
  object armor extends js.Object {
    
    /**
      * Add additional information to the armor version of an OpenPGP binary
      * packet block.
      * @version 2011-12-16
      * @param customComment (optional) additional comment to add to the armored string
      * @returns The header information
      */
    def addheader(customComment: String): String = js.native
    
    /**
      * Armor an OpenPGP binary packet block
      * @param messagetype type of the message
      * @param body
      * @param partindex
      * @param parttotal
      * @param customComment (optional) additional comment to add to the armored string
      * @returns Armored text
      */
    def armor(messagetype: Integer, body: js.Any, partindex: Integer, parttotal: Integer): String | ReadableStream[String] = js.native
    def armor(messagetype: Integer, body: js.Any, partindex: Integer, parttotal: Integer, customComment: String): String | ReadableStream[String] = js.native
    
    /**
      * Internal function to calculate a CRC-24 checksum over a given string (data)
      * @param data Data to create a CRC-24 checksum for
      * @returns The CRC-24 checksum
      */
    def createcrc24(data: String): Uint8Array | ReadableStream[Uint8Array] = js.native
    def createcrc24(data: ReadableStream[String]): Uint8Array | ReadableStream[Uint8Array] = js.native
    
    /**
      * DeArmor an OpenPGP armored message; verify the checksum and return
      * the encoded bytes
      * @param text OpenPGP armored message
      * @returns An object with attribute "text" containing the message text,
      *          an attribute "data" containing a stream of bytes and "type" for the ASCII armor type
      */
    def dearmor(text: String): js.Promise[js.Object] = js.native
    
    /**
      * Calculates a checksum over the given data and returns it base64 encoded
      * @param data Data to create a CRC-24 checksum for
      * @returns Base64 encoded checksum
      */
    def getCheckSum(data: String): String | ReadableStream[String] = js.native
    def getCheckSum(data: ReadableStream[String]): String | ReadableStream[String] = js.native
    
    /**
      * Splits a message into two parts, the body and the checksum. This is an internal function
      * @param text OpenPGP armored message part
      * @returns An object with attribute "body" containing the body
      *          and an attribute "checksum" containing the checksum.
      */
    def splitChecksum(text: String): js.Object = js.native
  }
  
  @js.native
  object base64 extends js.Object {
    
    /**
      * Convert radix-64 to binary array
      * @param t radix-64 string to convert
      * @param u if true, input is interpreted as URL-safe
      * @returns binary array version of input string
      */
    def r2s(t: String, u: Boolean): Uint8Array | ReadableStream[Uint8Array] = js.native
    def r2s(t: ReadableStream[String], u: Boolean): Uint8Array | ReadableStream[Uint8Array] = js.native
    
    def s2r(t: ReadableStream[Uint8Array]): String | ReadableStream[String] = js.native
    def s2r(t: ReadableStream[Uint8Array], u: Boolean): String | ReadableStream[String] = js.native
    /**
      * Convert binary array to radix-64
      * @param t Uint8Array to convert
      * @param u if true, output is URL-safe
      * @returns radix-64 version of input string
      */
    def s2r(t: Uint8Array): String | ReadableStream[String] = js.native
    def s2r(t: Uint8Array, u: Boolean): String | ReadableStream[String] = js.native
  }
}
