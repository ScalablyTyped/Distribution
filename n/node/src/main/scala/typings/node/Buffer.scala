package typings.node

import typings.node.anon.Data
import typings.node.cryptoMod._KeyLike
import typings.node.fsMod._PathLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Raw data is stored in instances of the Buffer class.
  * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
  * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
  */
@js.native
trait Buffer
  extends StObject
     with Uint8Array
     with _KeyLike
     with _PathLike {
  
  def compare(otherBuffer: Uint8Array): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Double, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Unit, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Unit,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Unit,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Double, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Unit,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Unit,
    targetEnd: Double,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Unit, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Unit,
    targetEnd: Unit,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
  
  def copy(targetBuffer: Uint8Array): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Unit, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
  
  def equals(otherBuffer: Uint8Array): Boolean = js.native
  
  def fill(value: java.lang.String): this.type = js.native
  def fill(value: java.lang.String, offset: Double): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: Double): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: java.lang.String, offset: Unit, end: Double): this.type = js.native
  def fill(value: java.lang.String, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: java.lang.String, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array): this.type = js.native
  def fill(value: Uint8Array, offset: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array, offset: Unit, end: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  
  def includes(value: java.lang.String): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: Double): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Double, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Double, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Buffer): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Buffer, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
  
  def indexOf(value: java.lang.String): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: Double): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Uint8Array): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Double): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  
  def lastIndexOf(value: java.lang.String): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: Double): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Uint8Array): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Double): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  
  def readBigInt64BE(): js.BigInt = js.native
  def readBigInt64BE(offset: Double): js.BigInt = js.native
  
  def readBigInt64LE(): js.BigInt = js.native
  def readBigInt64LE(offset: Double): js.BigInt = js.native
  
  def readBigUInt64BE(): js.BigInt = js.native
  def readBigUInt64BE(offset: Double): js.BigInt = js.native
  
  def readBigUInt64LE(): js.BigInt = js.native
  def readBigUInt64LE(offset: Double): js.BigInt = js.native
  
  def readDoubleBE(): Double = js.native
  def readDoubleBE(offset: Double): Double = js.native
  
  def readDoubleLE(): Double = js.native
  def readDoubleLE(offset: Double): Double = js.native
  
  def readFloatBE(): Double = js.native
  def readFloatBE(offset: Double): Double = js.native
  
  def readFloatLE(): Double = js.native
  def readFloatLE(offset: Double): Double = js.native
  
  def readInt16BE(): Double = js.native
  def readInt16BE(offset: Double): Double = js.native
  
  def readInt16LE(): Double = js.native
  def readInt16LE(offset: Double): Double = js.native
  
  def readInt32BE(): Double = js.native
  def readInt32BE(offset: Double): Double = js.native
  
  def readInt32LE(): Double = js.native
  def readInt32LE(offset: Double): Double = js.native
  
  def readInt8(): Double = js.native
  def readInt8(offset: Double): Double = js.native
  
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  
  def readUInt16BE(): Double = js.native
  def readUInt16BE(offset: Double): Double = js.native
  
  def readUInt16LE(): Double = js.native
  def readUInt16LE(offset: Double): Double = js.native
  
  def readUInt32BE(): Double = js.native
  def readUInt32BE(offset: Double): Double = js.native
  
  def readUInt32LE(): Double = js.native
  def readUInt32LE(offset: Double): Double = js.native
  
  def readUInt8(): Double = js.native
  def readUInt8(offset: Double): Double = js.native
  
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  
  def swap16(): Buffer = js.native
  
  def swap32(): Buffer = js.native
  
  def swap64(): Buffer = js.native
  
  def toJSON(): Data = js.native
  
  def toString(encoding: Unit, start: Double): java.lang.String = js.native
  def toString(encoding: Unit, start: Double, end: Double): java.lang.String = js.native
  def toString(encoding: Unit, start: Unit, end: Double): java.lang.String = js.native
  def toString(encoding: BufferEncoding): java.lang.String = js.native
  def toString(encoding: BufferEncoding, start: Double): java.lang.String = js.native
  def toString(encoding: BufferEncoding, start: Double, end: Double): java.lang.String = js.native
  def toString(encoding: BufferEncoding, start: Unit, end: Double): java.lang.String = js.native
  
  def write(string: java.lang.String): Double = js.native
  def write(string: java.lang.String, encoding: BufferEncoding): Double = js.native
  def write(string: java.lang.String, offset: Double): Double = js.native
  def write(string: java.lang.String, offset: Double, encoding: BufferEncoding): Double = js.native
  def write(string: java.lang.String, offset: Double, length: Double): Double = js.native
  def write(string: java.lang.String, offset: Double, length: Double, encoding: BufferEncoding): Double = js.native
  
  def writeBigInt64BE(value: js.BigInt): Double = js.native
  def writeBigInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigInt64LE(value: js.BigInt): Double = js.native
  def writeBigInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigUInt64BE(value: js.BigInt): Double = js.native
  def writeBigUInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigUInt64LE(value: js.BigInt): Double = js.native
  def writeBigUInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeDoubleBE(value: Double): Double = js.native
  def writeDoubleBE(value: Double, offset: Double): Double = js.native
  
  def writeDoubleLE(value: Double): Double = js.native
  def writeDoubleLE(value: Double, offset: Double): Double = js.native
  
  def writeFloatBE(value: Double): Double = js.native
  def writeFloatBE(value: Double, offset: Double): Double = js.native
  
  def writeFloatLE(value: Double): Double = js.native
  def writeFloatLE(value: Double, offset: Double): Double = js.native
  
  def writeInt16BE(value: Double): Double = js.native
  def writeInt16BE(value: Double, offset: Double): Double = js.native
  
  def writeInt16LE(value: Double): Double = js.native
  def writeInt16LE(value: Double, offset: Double): Double = js.native
  
  def writeInt32BE(value: Double): Double = js.native
  def writeInt32BE(value: Double, offset: Double): Double = js.native
  
  def writeInt32LE(value: Double): Double = js.native
  def writeInt32LE(value: Double, offset: Double): Double = js.native
  
  def writeInt8(value: Double): Double = js.native
  def writeInt8(value: Double, offset: Double): Double = js.native
  
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeUInt16BE(value: Double): Double = js.native
  def writeUInt16BE(value: Double, offset: Double): Double = js.native
  
  def writeUInt16LE(value: Double): Double = js.native
  def writeUInt16LE(value: Double, offset: Double): Double = js.native
  
  def writeUInt32BE(value: Double): Double = js.native
  def writeUInt32BE(value: Double, offset: Double): Double = js.native
  
  def writeUInt32LE(value: Double): Double = js.native
  def writeUInt32LE(value: Double, offset: Double): Double = js.native
  
  def writeUInt8(value: Double): Double = js.native
  def writeUInt8(value: Double, offset: Double): Double = js.native
  
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
}
