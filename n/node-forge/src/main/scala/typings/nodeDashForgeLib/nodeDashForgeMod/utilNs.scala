package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util")
@js.native
object utilNs extends js.Object {
  
  trait ArrayBufferView extends js.Object {
    var buffer: stdLib.ArrayBuffer
    var byteLength: scala.Double
  }
  
  @js.native
  class ByteStringBuffer () extends js.Object {
    def this(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes) = this()
    def this(bytes: ArrayBufferView) = this()
    def this(bytes: ByteStringBuffer) = this()
    def this(bytes: stdLib.ArrayBuffer) = this()
    var data: java.lang.String = js.native
    var read: scala.Double = js.native
    def at(index: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Byte = js.native
    def bytes(): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
    def bytes(count: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
    def clear(): ByteStringBuffer = js.native
    def compact(): ByteStringBuffer = js.native
    def copy(): ByteStringBuffer = js.native
    def fillWithByte(byte: nodeDashForgeLib.nodeDashForgeMod.Byte, n: scala.Double): ByteStringBuffer = js.native
    def getByte(): scala.Double = js.native
    def getBytes(): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
    def getBytes(count: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
    def getInt(numOfBits: scala.Double): scala.Double = js.native
    def getInt16(): scala.Double = js.native
    def getInt16Le(): scala.Double = js.native
    def getInt24(): scala.Double = js.native
    def getInt24Le(): scala.Double = js.native
    def getInt32(): scala.Double = js.native
    def getInt32Le(): scala.Double = js.native
    def getSignedInt(numOfBits: scala.Double): scala.Double = js.native
    def isEmpty(): scala.Boolean = js.native
    def last(): nodeDashForgeLib.nodeDashForgeMod.Byte = js.native
    def length(): scala.Double = js.native
    def putBuffer(buffer: ByteStringBuffer): ByteStringBuffer = js.native
    def putByte(byte: nodeDashForgeLib.nodeDashForgeMod.Byte): ByteStringBuffer = js.native
    def putBytes(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes): ByteStringBuffer = js.native
    def putInt(int: scala.Double, numOfBits: scala.Double): ByteStringBuffer = js.native
    def putInt16(int: scala.Double): ByteStringBuffer = js.native
    def putInt16Le(int: scala.Double): ByteStringBuffer = js.native
    def putInt24(int: scala.Double): ByteStringBuffer = js.native
    def putInt24Le(int: scala.Double): ByteStringBuffer = js.native
    def putInt32(int: scala.Double): ByteStringBuffer = js.native
    def putInt32Le(int: scala.Double): ByteStringBuffer = js.native
    def putSignedInt(int: scala.Double, numOfBits: scala.Double): ByteStringBuffer = js.native
    def putString(str: java.lang.String): ByteStringBuffer = js.native
    def setAt(index: scala.Double, byte: scala.Double): ByteStringBuffer = js.native
    def toHex(): nodeDashForgeLib.nodeDashForgeMod.Hex = js.native
    def truncate(): ByteStringBuffer = js.native
  }
  
  def bytesToHex(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes): nodeDashForgeLib.nodeDashForgeMod.Hex = js.native
  def createBuffer(): ByteBuffer = js.native
  def createBuffer(input: nodeDashForgeLib.nodeDashForgeMod.Bytes, encode: java.lang.String): ByteBuffer = js.native
  def createBuffer(input: ArrayBufferView, encode: java.lang.String): ByteBuffer = js.native
  def createBuffer(input: ByteStringBuffer, encode: java.lang.String): ByteBuffer = js.native
  def createBuffer(input: stdLib.ArrayBuffer, encode: java.lang.String): ByteBuffer = js.native
  def decode64(encoded: nodeDashForgeLib.nodeDashForgeMod.Base64): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def decodeUtf8(encoded: nodeDashForgeLib.nodeDashForgeMod.Utf8): java.lang.String = js.native
  def encode64(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes): nodeDashForgeLib.nodeDashForgeMod.Base64 = js.native
  def encode64(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes, maxline: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Base64 = js.native
  def encodeUtf8(str: java.lang.String): nodeDashForgeLib.nodeDashForgeMod.Utf8 = js.native
  def fillString(char: java.lang.String, count: scala.Double): java.lang.String = js.native
  def hexToBytes(hex: nodeDashForgeLib.nodeDashForgeMod.Hex): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def int32ToBytes(int: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def isArray(x: js.Any): scala.Boolean = js.native
  def isArrayBuffer(x: js.Any): scala.Boolean = js.native
  def isArrayBufferView(x: js.Any): scala.Boolean = js.native
  def xorBytes(bytes1: java.lang.String, bytes2: java.lang.String, count: scala.Double): java.lang.String = js.native
  @JSName("binary")
  @js.native
  object binaryNs extends js.Object {
    @JSName("base64")
    @js.native
    object base64Ns extends js.Object {
      def decode(input: nodeDashForgeLib.nodeDashForgeMod.Base64): stdLib.Uint8Array = js.native
      def decode(input: nodeDashForgeLib.nodeDashForgeMod.Base64, output: stdLib.Uint8Array): stdLib.Uint8Array = js.native
      def decode(input: nodeDashForgeLib.nodeDashForgeMod.Base64, output: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
      def encode(input: stdLib.Uint8Array): nodeDashForgeLib.nodeDashForgeMod.Base64 = js.native
      def encode(input: stdLib.Uint8Array, maxline: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Base64 = js.native
    }
    
    @JSName("hex")
    @js.native
    object hexNs extends js.Object {
      def decode(hex: nodeDashForgeLib.nodeDashForgeMod.Hex): stdLib.Uint8Array = js.native
      def decode(hex: nodeDashForgeLib.nodeDashForgeMod.Hex, output: stdLib.Uint8Array): stdLib.Uint8Array = js.native
      def decode(hex: nodeDashForgeLib.nodeDashForgeMod.Hex, output: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
      def encode(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes): nodeDashForgeLib.nodeDashForgeMod.Hex = js.native
      def encode(bytes: nodeDashForgeLib.nodeDashForgeMod.utilNs.ArrayBufferView): nodeDashForgeLib.nodeDashForgeMod.Hex = js.native
      def encode(bytes: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer): nodeDashForgeLib.nodeDashForgeMod.Hex = js.native
      def encode(bytes: stdLib.ArrayBuffer): nodeDashForgeLib.nodeDashForgeMod.Hex = js.native
    }
    
    @JSName("raw")
    @js.native
    object rawNs extends js.Object {
      def decode(str: nodeDashForgeLib.nodeDashForgeMod.Bytes): stdLib.Uint8Array = js.native
      def decode(str: nodeDashForgeLib.nodeDashForgeMod.Bytes, output: stdLib.Uint8Array): stdLib.Uint8Array = js.native
      def decode(str: nodeDashForgeLib.nodeDashForgeMod.Bytes, output: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
      def encode(x: stdLib.Uint8Array): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
    }
    
  }
  
  @JSName("text")
  @js.native
  object textNs extends js.Object {
    @JSName("utf16")
    @js.native
    object utf16Ns extends js.Object {
      def decode(bytes: stdLib.Uint8Array): java.lang.String = js.native
      def encode(str: java.lang.String): stdLib.Uint8Array = js.native
      def encode(str: java.lang.String, output: stdLib.Uint8Array): stdLib.Uint8Array = js.native
      def encode(str: java.lang.String, output: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
    }
    
    @JSName("utf8")
    @js.native
    object utf8Ns extends js.Object {
      def decode(bytes: stdLib.Uint8Array): nodeDashForgeLib.nodeDashForgeMod.Utf8 = js.native
      def encode(str: java.lang.String): stdLib.Uint8Array = js.native
      def encode(str: java.lang.String, output: stdLib.Uint8Array): stdLib.Uint8Array = js.native
      def encode(str: java.lang.String, output: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
    }
    
  }
  
  type ByteBuffer = ByteStringBuffer
}

