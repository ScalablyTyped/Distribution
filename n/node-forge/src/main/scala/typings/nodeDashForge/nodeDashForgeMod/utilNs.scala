package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.nodeDashForgeMod.utilNs.ArrayBufferView
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteBuffer
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteStringBuffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util")
@js.native
object utilNs extends js.Object {
  trait ArrayBufferView extends js.Object {
    var buffer: ArrayBuffer
    var byteLength: Double
  }
  
  @js.native
  class ByteStringBuffer () extends js.Object {
    def this(bytes: Bytes) = this()
    def this(bytes: ArrayBufferView) = this()
    def this(bytes: ByteStringBuffer) = this()
    def this(bytes: ArrayBuffer) = this()
    var data: String = js.native
    var read: Double = js.native
    def at(index: Double): Byte = js.native
    def bytes(): Bytes = js.native
    def bytes(count: Double): Bytes = js.native
    def clear(): ByteStringBuffer = js.native
    def compact(): ByteStringBuffer = js.native
    def copy(): ByteStringBuffer = js.native
    def fillWithByte(byte: Byte, n: Double): ByteStringBuffer = js.native
    def getByte(): Double = js.native
    def getBytes(): Bytes = js.native
    def getBytes(count: Double): Bytes = js.native
    def getInt(numOfBits: Double): Double = js.native
    def getInt16(): Double = js.native
    def getInt16Le(): Double = js.native
    def getInt24(): Double = js.native
    def getInt24Le(): Double = js.native
    def getInt32(): Double = js.native
    def getInt32Le(): Double = js.native
    def getSignedInt(numOfBits: Double): Double = js.native
    def isEmpty(): Boolean = js.native
    def last(): Byte = js.native
    def length(): Double = js.native
    def putBuffer(buffer: ByteStringBuffer): ByteStringBuffer = js.native
    def putByte(byte: Byte): ByteStringBuffer = js.native
    def putBytes(bytes: Bytes): ByteStringBuffer = js.native
    def putInt(int: Double, numOfBits: Double): ByteStringBuffer = js.native
    def putInt16(int: Double): ByteStringBuffer = js.native
    def putInt16Le(int: Double): ByteStringBuffer = js.native
    def putInt24(int: Double): ByteStringBuffer = js.native
    def putInt24Le(int: Double): ByteStringBuffer = js.native
    def putInt32(int: Double): ByteStringBuffer = js.native
    def putInt32Le(int: Double): ByteStringBuffer = js.native
    def putSignedInt(int: Double, numOfBits: Double): ByteStringBuffer = js.native
    def putString(str: String): ByteStringBuffer = js.native
    def setAt(index: Double, byte: Double): ByteStringBuffer = js.native
    def toHex(): Hex = js.native
    def truncate(): ByteStringBuffer = js.native
  }
  
  def bytesToHex(bytes: Bytes): Hex = js.native
  def createBuffer(): ByteBuffer = js.native
  def createBuffer(input: Bytes): ByteBuffer = js.native
  def createBuffer(input: Bytes, encoding: Encoding): ByteBuffer = js.native
  def createBuffer(input: ArrayBufferView): ByteBuffer = js.native
  def createBuffer(input: ArrayBufferView, encoding: Encoding): ByteBuffer = js.native
  def createBuffer(input: ByteStringBuffer): ByteBuffer = js.native
  def createBuffer(input: ByteStringBuffer, encoding: Encoding): ByteBuffer = js.native
  def createBuffer(input: ArrayBuffer): ByteBuffer = js.native
  def createBuffer(input: ArrayBuffer, encoding: Encoding): ByteBuffer = js.native
  def decode64(encoded: Base64): Bytes = js.native
  def decodeUtf8(encoded: Utf8): String = js.native
  def encode64(bytes: Bytes): Base64 = js.native
  def encode64(bytes: Bytes, maxline: Double): Base64 = js.native
  def encodeUtf8(str: String): Utf8 = js.native
  def fillString(char: String, count: Double): String = js.native
  def hexToBytes(hex: Hex): Bytes = js.native
  def int32ToBytes(int: Double): Bytes = js.native
  def isArray(x: js.Any): Boolean = js.native
  def isArrayBuffer(x: js.Any): Boolean = js.native
  def isArrayBufferView(x: js.Any): Boolean = js.native
  def xorBytes(bytes1: String, bytes2: String, count: Double): String = js.native
  @JSName("binary")
  @js.native
  object binaryNs extends js.Object {
    @JSName("base64")
    @js.native
    object base64Ns extends js.Object {
      def decode(input: Base64): Uint8Array = js.native
      def decode(input: Base64, output: Uint8Array): Uint8Array = js.native
      def decode(input: Base64, output: Uint8Array, offset: Double): Uint8Array = js.native
      def encode(input: Uint8Array): Base64 = js.native
      def encode(input: Uint8Array, maxline: Double): Base64 = js.native
    }
    
    @JSName("hex")
    @js.native
    object hexNs extends js.Object {
      def decode(hex: Hex): Uint8Array = js.native
      def decode(hex: Hex, output: Uint8Array): Uint8Array = js.native
      def decode(hex: Hex, output: Uint8Array, offset: Double): Uint8Array = js.native
      def encode(bytes: Bytes): Hex = js.native
      def encode(bytes: ArrayBufferView): Hex = js.native
      def encode(bytes: ByteStringBuffer): Hex = js.native
      def encode(bytes: ArrayBuffer): Hex = js.native
    }
    
    @JSName("raw")
    @js.native
    object rawNs extends js.Object {
      def decode(str: Bytes): Uint8Array = js.native
      def decode(str: Bytes, output: Uint8Array): Uint8Array = js.native
      def decode(str: Bytes, output: Uint8Array, offset: Double): Uint8Array = js.native
      def encode(x: Uint8Array): Bytes = js.native
    }
    
  }
  
  @JSName("text")
  @js.native
  object textNs extends js.Object {
    @JSName("utf16")
    @js.native
    object utf16Ns extends js.Object {
      def decode(bytes: Uint8Array): String = js.native
      def encode(str: String): Uint8Array = js.native
      def encode(str: String, output: Uint8Array): Uint8Array = js.native
      def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = js.native
    }
    
    @JSName("utf8")
    @js.native
    object utf8Ns extends js.Object {
      def decode(bytes: Uint8Array): Utf8 = js.native
      def encode(str: String): Uint8Array = js.native
      def encode(str: String, output: Uint8Array): Uint8Array = js.native
      def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = js.native
    }
    
  }
  
  type ByteBuffer = ByteStringBuffer
}

