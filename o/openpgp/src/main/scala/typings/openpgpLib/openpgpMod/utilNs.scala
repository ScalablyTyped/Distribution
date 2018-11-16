package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "util")
@js.native
object utilNs extends js.Object {
  /** Convert a Uint8Array to a string. This currently functions the same as bin2str.
          @param bin An array of (binary) integers to convert
       */
  def Uint8Array2str(bin: stdLib.Uint8Array): java.lang.String = js.native
  /** Convert an array of integers(0.255) to a string
          @param bin An array of (binary) integers to convert
       */
  def bin2str(bin: js.Array[scala.Double]): java.lang.String = js.native
  /** Calculates a 16bit sum of a string by adding each character codes modulus 65535
          @param text string to create a sum of
       */
  def calc_checksum(text: java.lang.String): scala.Double = js.native
  /** Convert a string of utf8 bytes to a native javascript string
          @param utf8 A valid squence of utf8 bytes
       */
  def decode_utf8(utf8: java.lang.String): java.lang.String = js.native
  /** Convert a native javascript string to a string of utf8 bytes
          param str The string to convert
       */
  def encode_utf8(str: java.lang.String): java.lang.String = js.native
  /** Get native Web Cryptography api. The default configuration is to use the api when available. But it can also be deactivated with config.useWebCrypto
       */
  def getWebCrypto(): js.Object = js.native
  /** Return the algorithm type as string
       */
  def get_hashAlgorithmString(): java.lang.String = js.native
  /** Create binary string from a hex encoded string
          @param str Hex string to convert
       */
  def hex2bin(str: java.lang.String): java.lang.String = js.native
  /** Creating a hex string from an binary array of integers (0..255)
          @param str Array of bytes to convert
       */
  def hexidump(str: java.lang.String): java.lang.String = js.native
  /** Create hexstring from a binary
          @param str string to convert
       */
  def hexstrdump(str: java.lang.String): java.lang.String = js.native
  /** Helper function to print a debug message. Debug messages are only printed if
          @param str string of the debug message
       */
  def print_debug(str: java.lang.String): scala.Unit = js.native
  /** Helper function to print a debug message. Debug messages are only printed if
          @param str string of the debug message
       */
  def print_debug_hexstr_dump(str: java.lang.String): scala.Unit = js.native
  /** Shifting a string to n bits right
          @param value The string to shift
          @param bitcount Amount of bits to shift (MUST be smaller than 9)
       */
  def shiftRight(value: java.lang.String, bitcount: scala.Double): java.lang.String = js.native
  /** Convert a string to a Uint8Array
          @param str string to convert
       */
  def str2Uint8Array(str: java.lang.String): stdLib.Uint8Array = js.native
  /** Convert a string to an array of integers(0.255)
          @param str string to convert
       */
  def str2bin(str: java.lang.String): js.Array[scala.Double] = js.native
}

