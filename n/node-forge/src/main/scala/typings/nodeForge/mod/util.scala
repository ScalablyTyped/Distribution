package typings.nodeForge.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("node-forge", "util")
  @js.native
  val ^ : js.Any = js.native
  
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
      
      @JSImport("node-forge", "util.binary.base64")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(input: Base64): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
      inline def decode(input: Base64, output: Unit, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def decode(input: Base64, output: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def decode(input: Base64, output: Uint8Array, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      
      inline def encode(input: Uint8Array): Base64 = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[Base64]
      inline def encode(input: Uint8Array, maxline: Double): Base64 = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[Base64]
    }
    
    object hex {
      
      @JSImport("node-forge", "util.binary.hex")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(hex: Hex): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(hex.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
      inline def decode(hex: Hex, output: Unit, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(hex.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def decode(hex: Hex, output: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(hex.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def decode(hex: Hex, output: Uint8Array, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(hex.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      
      inline def encode(bytes: Bytes): Hex = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bytes.asInstanceOf[js.Any]).asInstanceOf[Hex]
      inline def encode(bytes: ArrayBufferView): Hex = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bytes.asInstanceOf[js.Any]).asInstanceOf[Hex]
      inline def encode(bytes: ByteStringBuffer): Hex = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bytes.asInstanceOf[js.Any]).asInstanceOf[Hex]
      inline def encode(bytes: ArrayBuffer): Hex = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bytes.asInstanceOf[js.Any]).asInstanceOf[Hex]
    }
    
    object raw {
      
      @JSImport("node-forge", "util.binary.raw")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(str: Bytes): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
      inline def decode(str: Bytes, output: Unit, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def decode(str: Bytes, output: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def decode(str: Bytes, output: Uint8Array, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      
      inline def encode(x: Uint8Array): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(x.asInstanceOf[js.Any]).asInstanceOf[Bytes]
    }
  }
  
  inline def bytesToHex(bytes: Bytes): Hex = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(bytes.asInstanceOf[js.Any]).asInstanceOf[Hex]
  
  inline def createBuffer(): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")().asInstanceOf[ByteBuffer]
  inline def createBuffer(input: Bytes): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  inline def createBuffer(input: Bytes, encoding: Encoding): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  inline def createBuffer(input: ArrayBufferView): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  inline def createBuffer(input: ArrayBufferView, encoding: Encoding): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  inline def createBuffer(input: ByteStringBuffer): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  inline def createBuffer(input: ByteStringBuffer, encoding: Encoding): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  inline def createBuffer(input: ArrayBuffer): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  inline def createBuffer(input: ArrayBuffer, encoding: Encoding): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  inline def decode64(encoded: Base64): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("decode64")(encoded.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  
  inline def decodeUtf8(encoded: Utf8): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUtf8")(encoded.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode64(bytes: Bytes): Base64 = ^.asInstanceOf[js.Dynamic].applyDynamic("encode64")(bytes.asInstanceOf[js.Any]).asInstanceOf[Base64]
  inline def encode64(bytes: Bytes, maxline: Double): Base64 = (^.asInstanceOf[js.Dynamic].applyDynamic("encode64")(bytes.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[Base64]
  
  inline def encodeUtf8(str: String): Utf8 = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUtf8")(str.asInstanceOf[js.Any]).asInstanceOf[Utf8]
  
  inline def fillString(char: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fillString")(char.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexToBytes(hex: Hex): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  
  inline def int32ToBytes(int: Double): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("int32ToBytes")(int.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  
  inline def isArray(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArrayBuffer(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBuffer")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArrayBufferView(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBufferView")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object text {
    
    object utf16 {
      
      @JSImport("node-forge", "util.text.utf16")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def encode(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
      inline def encode(str: String, output: Unit, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def encode(str: String, output: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    }
    
    object utf8 {
      
      @JSImport("node-forge", "util.text.utf8")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(bytes: Uint8Array): Utf8 = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[Utf8]
      
      inline def encode(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
      inline def encode(str: String, output: Unit, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def encode(str: String, output: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
      inline def encode(str: String, output: Uint8Array, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    }
  }
  
  inline def xorBytes(bytes1: String, bytes2: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("xorBytes")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ArrayBufferView extends StObject {
    
    var buffer: ArrayBuffer
    
    var byteLength: Double
  }
  object ArrayBufferView {
    
    inline def apply(buffer: ArrayBuffer, byteLength: Double): ArrayBufferView = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayBufferView]
    }
    
    extension [Self <: ArrayBufferView](x: Self) {
      
      inline def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    }
  }
  
  type ByteBuffer = ByteStringBuffer
}
