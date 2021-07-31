package typings.openpgp.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoding {
  
  object armor {
    
    @JSImport("openpgp", "encoding.armor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add additional information to the armor version of an OpenPGP binary
      * packet block.
      * @version 2011-12-16
      * @param customComment (optional) additional comment to add to the armored string
      * @returns The header information
      */
    @scala.inline
    def addheader(customComment: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addheader")(customComment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Armor an OpenPGP binary packet block
      * @param messagetype type of the message
      * @param body
      * @param partindex
      * @param parttotal
      * @param customComment (optional) additional comment to add to the armored string
      * @returns Armored text
      */
    @scala.inline
    def armor(messagetype: Integer, body: js.Any, partindex: Integer, parttotal: Integer): String | ReadableStream[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("armor")(messagetype.asInstanceOf[js.Any], body.asInstanceOf[js.Any], partindex.asInstanceOf[js.Any], parttotal.asInstanceOf[js.Any])).asInstanceOf[String | ReadableStream[String]]
    @scala.inline
    def armor(messagetype: Integer, body: js.Any, partindex: Integer, parttotal: Integer, customComment: String): String | ReadableStream[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("armor")(messagetype.asInstanceOf[js.Any], body.asInstanceOf[js.Any], partindex.asInstanceOf[js.Any], parttotal.asInstanceOf[js.Any], customComment.asInstanceOf[js.Any])).asInstanceOf[String | ReadableStream[String]]
    
    /**
      * Internal function to calculate a CRC-24 checksum over a given string (data)
      * @param data Data to create a CRC-24 checksum for
      * @returns The CRC-24 checksum
      */
    @scala.inline
    def createcrc24(data: String): Uint8Array | ReadableStream[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createcrc24")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array | ReadableStream[Uint8Array]]
    @scala.inline
    def createcrc24(data: ReadableStream[String]): Uint8Array | ReadableStream[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createcrc24")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array | ReadableStream[Uint8Array]]
    
    /**
      * DeArmor an OpenPGP armored message; verify the checksum and return
      * the encoded bytes
      * @param text OpenPGP armored message
      * @returns An object with attribute "text" containing the message text,
      *          an attribute "data" containing a stream of bytes and "type" for the ASCII armor type
      */
    @scala.inline
    def dearmor(text: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("dearmor")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
    
    /**
      * Calculates a checksum over the given data and returns it base64 encoded
      * @param data Data to create a CRC-24 checksum for
      * @returns Base64 encoded checksum
      */
    @scala.inline
    def getCheckSum(data: String): String | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckSum")(data.asInstanceOf[js.Any]).asInstanceOf[String | ReadableStream[String]]
    @scala.inline
    def getCheckSum(data: ReadableStream[String]): String | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckSum")(data.asInstanceOf[js.Any]).asInstanceOf[String | ReadableStream[String]]
    
    /**
      * Splits a message into two parts, the body and the checksum. This is an internal function
      * @param text OpenPGP armored message part
      * @returns An object with attribute "body" containing the body
      *          and an attribute "checksum" containing the checksum.
      */
    @scala.inline
    def splitChecksum(text: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChecksum")(text.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  object base64 {
    
    @JSImport("openpgp", "encoding.base64")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert radix-64 to binary array
      * @param t radix-64 string to convert
      * @param u if true, input is interpreted as URL-safe
      * @returns binary array version of input string
      */
    @scala.inline
    def r2s(t: String, u: Boolean): Uint8Array | ReadableStream[Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("r2s")(t.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Uint8Array | ReadableStream[Uint8Array]]
    @scala.inline
    def r2s(t: ReadableStream[String], u: Boolean): Uint8Array | ReadableStream[Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("r2s")(t.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Uint8Array | ReadableStream[Uint8Array]]
    
    @scala.inline
    def s2r(t: ReadableStream[Uint8Array]): String | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("s2r")(t.asInstanceOf[js.Any]).asInstanceOf[String | ReadableStream[String]]
    @scala.inline
    def s2r(t: ReadableStream[Uint8Array], u: Boolean): String | ReadableStream[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("s2r")(t.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[String | ReadableStream[String]]
    /**
      * Convert binary array to radix-64
      * @param t Uint8Array to convert
      * @param u if true, output is URL-safe
      * @returns radix-64 version of input string
      */
    @scala.inline
    def s2r(t: Uint8Array): String | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("s2r")(t.asInstanceOf[js.Any]).asInstanceOf[String | ReadableStream[String]]
    @scala.inline
    def s2r(t: Uint8Array, u: Boolean): String | ReadableStream[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("s2r")(t.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[String | ReadableStream[String]]
  }
}
