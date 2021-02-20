package typings.nodeForge.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("node-forge", "util.ByteStringBuffer")
  @js.native
  class ByteStringBuffer () extends StObject {
    def this(bytes: Bytes) = this()
    def this(bytes: ArrayBufferView) = this()
    def this(bytes: ByteStringBuffer) = this()
    def this(bytes: ArrayBuffer) = this()
    
    def at(index: Double): Byte = js.native
    
    def bytes(): Bytes = js.native
    def bytes(count: Double): Bytes = js.native
    
    def clear(): ByteStringBuffer = js.native
    
    def compact(): ByteStringBuffer = js.native
    
    def copy(): ByteStringBuffer = js.native
    
    var data: String = js.native
    
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
    
    var read: Double = js.native
    
    def setAt(index: Double, byte: Double): ByteStringBuffer = js.native
    
    def toHex(): Hex = js.native
    
    def truncate(): ByteStringBuffer = js.native
  }
  
  object binary {
    
    object base64 {
      
      @JSImport("node-forge", "util.binary.base64.decode")
      @js.native
      def decode(input: Base64): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.base64.decode")
      @js.native
      def decode(input: Base64, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.base64.decode")
      @js.native
      def decode(input: Base64, output: Uint8Array): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.base64.decode")
      @js.native
      def decode(input: Base64, output: Uint8Array, offset: Double): Uint8Array = js.native
      
      @JSImport("node-forge", "util.binary.base64.encode")
      @js.native
      def encode(input: Uint8Array): Base64 = js.native
      @JSImport("node-forge", "util.binary.base64.encode")
      @js.native
      def encode(input: Uint8Array, maxline: Double): Base64 = js.native
    }
    
    object hex {
      
      @JSImport("node-forge", "util.binary.hex.decode")
      @js.native
      def decode(hex: Hex): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.hex.decode")
      @js.native
      def decode(hex: Hex, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.hex.decode")
      @js.native
      def decode(hex: Hex, output: Uint8Array): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.hex.decode")
      @js.native
      def decode(hex: Hex, output: Uint8Array, offset: Double): Uint8Array = js.native
      
      @JSImport("node-forge", "util.binary.hex.encode")
      @js.native
      def encode(bytes: Bytes): Hex = js.native
      @JSImport("node-forge", "util.binary.hex.encode")
      @js.native
      def encode(bytes: ArrayBufferView): Hex = js.native
      @JSImport("node-forge", "util.binary.hex.encode")
      @js.native
      def encode(bytes: ByteStringBuffer): Hex = js.native
      @JSImport("node-forge", "util.binary.hex.encode")
      @js.native
      def encode(bytes: ArrayBuffer): Hex = js.native
    }
    
    object raw {
      
      @JSImport("node-forge", "util.binary.raw.decode")
      @js.native
      def decode(str: Bytes): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.raw.decode")
      @js.native
      def decode(str: Bytes, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.raw.decode")
      @js.native
      def decode(str: Bytes, output: Uint8Array): Uint8Array = js.native
      @JSImport("node-forge", "util.binary.raw.decode")
      @js.native
      def decode(str: Bytes, output: Uint8Array, offset: Double): Uint8Array = js.native
      
      @JSImport("node-forge", "util.binary.raw.encode")
      @js.native
      def encode(x: Uint8Array): Bytes = js.native
    }
  }
  
  @JSImport("node-forge", "util.bytesToHex")
  @js.native
  def bytesToHex(bytes: Bytes): Hex = js.native
  
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: Bytes): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: Bytes, encoding: Encoding): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: ArrayBufferView): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: ArrayBufferView, encoding: Encoding): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: ByteStringBuffer): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: ByteStringBuffer, encoding: Encoding): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: ArrayBuffer): ByteBuffer = js.native
  @JSImport("node-forge", "util.createBuffer")
  @js.native
  def createBuffer(input: ArrayBuffer, encoding: Encoding): ByteBuffer = js.native
  
  @JSImport("node-forge", "util.decode64")
  @js.native
  def decode64(encoded: Base64): Bytes = js.native
  
  @JSImport("node-forge", "util.decodeUtf8")
  @js.native
  def decodeUtf8(encoded: Utf8): String = js.native
  
  @JSImport("node-forge", "util.encode64")
  @js.native
  def encode64(bytes: Bytes): Base64 = js.native
  @JSImport("node-forge", "util.encode64")
  @js.native
  def encode64(bytes: Bytes, maxline: Double): Base64 = js.native
  
  @JSImport("node-forge", "util.encodeUtf8")
  @js.native
  def encodeUtf8(str: String): Utf8 = js.native
  
  @JSImport("node-forge", "util.fillString")
  @js.native
  def fillString(char: String, count: Double): String = js.native
  
  @JSImport("node-forge", "util.hexToBytes")
  @js.native
  def hexToBytes(hex: Hex): Bytes = js.native
  
  @JSImport("node-forge", "util.int32ToBytes")
  @js.native
  def int32ToBytes(int: Double): Bytes = js.native
  
  @JSImport("node-forge", "util.isArray")
  @js.native
  def isArray(x: js.Any): Boolean = js.native
  
  @JSImport("node-forge", "util.isArrayBuffer")
  @js.native
  def isArrayBuffer(x: js.Any): Boolean = js.native
  
  @JSImport("node-forge", "util.isArrayBufferView")
  @js.native
  def isArrayBufferView(x: js.Any): Boolean = js.native
  
  object text {
    
    object utf16 {
      
      @JSImport("node-forge", "util.text.utf16.decode")
      @js.native
      def decode(bytes: Uint8Array): String = js.native
      
      @JSImport("node-forge", "util.text.utf16.encode")
      @js.native
      def encode(str: String): Uint8Array = js.native
      @JSImport("node-forge", "util.text.utf16.encode")
      @js.native
      def encode(str: String, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
      @JSImport("node-forge", "util.text.utf16.encode")
      @js.native
      def encode(str: String, output: Uint8Array): Uint8Array = js.native
      @JSImport("node-forge", "util.text.utf16.encode")
      @js.native
      def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = js.native
    }
    
    object utf8 {
      
      @JSImport("node-forge", "util.text.utf8.decode")
      @js.native
      def decode(bytes: Uint8Array): Utf8 = js.native
      
      @JSImport("node-forge", "util.text.utf8.encode")
      @js.native
      def encode(str: String): Uint8Array = js.native
      @JSImport("node-forge", "util.text.utf8.encode")
      @js.native
      def encode(str: String, output: js.UndefOr[scala.Nothing], offset: Double): Uint8Array = js.native
      @JSImport("node-forge", "util.text.utf8.encode")
      @js.native
      def encode(str: String, output: Uint8Array): Uint8Array = js.native
      @JSImport("node-forge", "util.text.utf8.encode")
      @js.native
      def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = js.native
    }
  }
  
  @JSImport("node-forge", "util.xorBytes")
  @js.native
  def xorBytes(bytes1: String, bytes2: String, count: Double): String = js.native
  
  @js.native
  trait ArrayBufferView extends StObject {
    
    var buffer: ArrayBuffer = js.native
    
    var byteLength: Double = js.native
  }
  object ArrayBufferView {
    
    @scala.inline
    def apply(buffer: ArrayBuffer, byteLength: Double): ArrayBufferView = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayBufferView]
    }
    
    @scala.inline
    implicit class ArrayBufferViewMutableBuilder[Self <: ArrayBufferView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    }
  }
  
  type ByteBuffer = ByteStringBuffer
}
