package typings.openpgp.mod

import typings.openpgp.anon.Comment
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("openpgp", "util")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert an array of 8-bit integer to a Base-64 encoded string
    * @param bytes An array of 8-bit integers to convert
    * @param url If true, output is URL-safe
    * @returns Base-64 encoded string
    */
  inline def Uint8ArrayToB64(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint8Array_to_b64")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def Uint8ArrayToB64(bytes: Uint8Array, url: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("Uint8Array_to_b64")(bytes.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Convert an array of 8-bit integers to a hex string
    * @param bytes Array of 8-bit integers to convert
    * @returns Hexadecimal representation of the array
    */
  inline def Uint8ArrayToHex(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint8Array_to_hex")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Convert a Uint8Array to an MPI-formatted Uint8Array.
    * Note: the output is **not** an MPI object.
    * @see
    * @see
    * @param bin An array of 8-bit integers to convert
    * @returns MPI-formatted Uint8Array
    */
  inline def Uint8ArrayToMPI(bin: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint8Array_to_MPI")(bin.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  /**
    * Convert an array of 8-bit integers to a string
    * @param bytes An array of 8-bit integers to convert
    * @returns String representation of the array
    */
  inline def Uint8ArrayToStr(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint8Array_to_str")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Convert a Base-64 encoded string an array of 8-bit integer
    * Note: accepts both Radix-64 and URL-safe strings
    * @param base64 Base-64 encoded string to convert
    * @returns An array of 8-bit integers
    */
  inline def b64ToUint8Array(base64: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("b64_to_Uint8Array")(base64.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  /**
    * Normalize line endings to \r\n
    */
  inline def canonicalizeEOL(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalizeEOL")().asInstanceOf[Unit]
  
  /**
    * Concat a list of Uint8Arrays, Strings or Streams
    * The caller must not mix Uint8Arrays with Strings, but may mix Streams with non-Streams.
    * @param Array of Uint8Arrays/Strings/Streams to concatenate
    * @returns Concatenated array
    */
  @JSImport("openpgp", "util.concat")
  @js.native
  def concat: js.Any = js.native
  
  /**
    * Concat Uint8Arrays
    * @param Array of Uint8Arrays to concatenate
    * @returns Concatenated array
    */
  @JSImport("openpgp", "util.concatUint8Array")
  @js.native
  def concatUint8Array: js.Any = js.native
  inline def concatUint8Array_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatUint8Array")(x.asInstanceOf[js.Any])
  
  inline def concat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concat")(x.asInstanceOf[js.Any])
  
  inline def decodeUtf8(utf8: ReadableStream[String]): String | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_utf8")(utf8.asInstanceOf[js.Any]).asInstanceOf[String | ReadableStream[String]]
  /**
    * Convert a Uint8Array of utf8 bytes to a native javascript string
    * @param utf8 A valid squence of utf8 bytes
    * @returns A native javascript string
    */
  inline def decodeUtf8(utf8: Uint8Array): String | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_utf8")(utf8.asInstanceOf[js.Any]).asInstanceOf[String | ReadableStream[String]]
  
  /**
    * Detect Node.js runtime.
    */
  inline def detectNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detectNode")().asInstanceOf[Unit]
  
  /**
    * Convert a native javascript string to a Uint8Array of utf8 bytes
    * @param str The string to convert
    * @returns A valid squence of utf8 bytes
    */
  inline def encodeUtf8(str: String): Uint8Array | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_utf8")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array | ReadableStream[String]]
  inline def encodeUtf8(str: ReadableStream[String]): Uint8Array | ReadableStream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_utf8")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array | ReadableStream[String]]
  
  /**
    * Encode input buffer using Z-Base32 encoding.
    * See: https://tools.ietf.org/html/rfc6189#section-5.1.6
    * @param data The binary data to encode
    * @returns Binary data encoded using Z-Base32
    */
  inline def encodeZBase32(data: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeZBase32")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Check Uint8Array equality
    * @param first array
    * @param second array
    * @returns equality
    */
  inline def equalsUint8Array(first: Uint8Array, second: Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsUint8Array")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Format user id for internal use.
    */
  inline def formatUserId(id: Comment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUserId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get native Node.js Buffer constructor. This should be used since
    * Buffer is not available under browserify.
    * @returns The Buffer constructor or 'undefined'
    */
  inline def getNodeBuffer(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeBuffer")().asInstanceOf[js.Function]
  
  /**
    * Get native Node.js crypto api. The default configuration is to use
    * the api when available. But it can also be deactivated with config.use_native
    * @returns The crypto module or 'undefined'
    */
  inline def getNodeCrypto(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeCrypto")().asInstanceOf[js.Object]
  
  /**
    * Get transferable objects to pass buffers with zero copy (similar to "pass by reference" in C++)
    * See: https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage
    * Also, convert ReadableStreams to MessagePorts
    * @param obj the options object to be passed to the web worker
    * @returns an array of binary data to be passed
    */
  inline def getTransferables(obj: js.Object): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransferables")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Get native Web Cryptography api, only the current version of the spec.
    * The default configuration is to use the api when available. But it can
    * be deactivated with config.use_native
    * @returns The SubtleCrypto api or 'undefined'
    */
  inline def getWebCrypto(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebCrypto")().asInstanceOf[js.Object]
  
  /**
    * Get native Web Cryptography api for all browsers, including legacy
    * implementations of the spec e.g IE11 and Safari 8/9. The default
    * configuration is to use the api when available. But it can be deactivated
    * with config.use_native
    * @returns The SubtleCrypto api or 'undefined'
    */
  inline def getWebCryptoAll(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebCryptoAll")().asInstanceOf[js.Object]
  
  /**
    * Create binary string from a hex encoded string
    * @param str Hex string to convert
    * @returns
    */
  inline def hexToStr(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_to_str")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Convert a hex string to an array of 8-bit integers
    * @param hex A hex string to convert
    * @returns An array of 8-bit integers
    */
  inline def hexToUint8Array(hex: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_to_Uint8Array")(hex.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  /**
    * Convert line endings from canonicalized \r\n to native \n
    */
  inline def nativeEOL(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeEOL")().asInstanceOf[Unit]
  
  /**
    * Get native Node.js module
    * @param The module to require
    * @returns The required module or 'undefined'
    */
  inline def nodeRequire(The: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeRequire")(The.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  /**
    * Parse user id.
    */
  inline def parseUserId(userId: String): Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[Comment]
  
  /**
    * Helper function to print a debug message. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  inline def printDebug(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print_debug")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Helper function to print a debug error. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  inline def printDebugError(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print_debug_error")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Helper function to print a debug message. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  inline def printDebugHexarrayDump(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print_debug_hexarray_dump")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Helper function to print a debug message. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  inline def printDebugHexstrDump(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print_debug_hexstr_dump")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printEntireStream(str: String, input: String, concat: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print_entire_stream")(str.asInstanceOf[js.Any], input.asInstanceOf[js.Any], concat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Read a stream to the end and print it to the console when it's closed.
    * @param str String of the debug message
    * @param input Stream to print
    * @param concat Function to concatenate chunks of the stream (defaults to util.concat).
    */
  inline def printEntireStream(str: String, input: ReadableStream[String], concat: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print_entire_stream")(str.asInstanceOf[js.Any], input.asInstanceOf[js.Any], concat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printEntireStream(str: String, input: Uint8Array, concat: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print_entire_stream")(str.asInstanceOf[js.Any], input.asInstanceOf[js.Any], concat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Remove trailing spaces and tabs from each line
    */
  inline def removeTrailingSpaces(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTrailingSpaces")().asInstanceOf[Unit]
  
  /**
    * Convert MessagePorts back to ReadableStreams
    * @param obj
    * @returns
    */
  inline def restoreStreams(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreStreams")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  /**
    * If S[1] == 0, then double(S) == (S[2..128] || 0);
    * otherwise, double(S) == (S[2..128] || 0) xor
    * (zeros(120) || 10000111).
    * Both OCB and EAX (through CMAC) require this function to be constant-time.
    * @param data
    */
  /* Illegal function name 'double' can't be used here
    function double(data: Uint8Array): void;
    */
  /**
    * Shift a Uint8Array to the right by n bits
    * @param array The array to shift
    * @param bits Amount of bits to shift (MUST be smaller
    *        than 8)
    * @returns Resulting array.
    */
  inline def shiftRight(array: Uint8Array, bits: Integer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftRight")(array.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Create hex string from a binary
    * @param str String to convert
    * @returns String containing the hexadecimal values
    */
  inline def strToHex(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str_to_hex")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Convert a string to an array of 8-bit integers
    * @param str String to convert
    * @returns An array of 8-bit integers
    */
  inline def strToUint8Array(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("str_to_Uint8Array")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  /**
    * Calculates a 16bit sum of a Uint8Array by adding each character
    * codes modulus 65535
    * @param Uint8Array to create a sum of
    * @returns 2 bytes containing the sum of all charcodes % 65535
    */
  inline def writeChecksum(Uint8Array: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("write_checksum")(Uint8Array.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
