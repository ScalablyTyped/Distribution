package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDBNs.CoreNs._AttachmentData
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer
  extends Uint8Array
     with _AttachmentData {
  def compare(otherBuffer: Buffer): Double = js.native
  def compare(otherBuffer: Buffer, targetStart: Double): Double = js.native
  def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Double): Double = js.native
  def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Double, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Buffer,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def copy(targetBuffer: Buffer): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
  def equals(otherBuffer: Buffer): Boolean = js.native
  def fill(value: js.Any): this.type = js.native
  def fill(value: js.Any, offset: Double): this.type = js.native
  def fill(value: js.Any, offset: Double, end: Double): this.type = js.native
  def includes(value: String): Boolean = js.native
  def includes(value: String, byteOffset: Double): Boolean = js.native
  def includes(value: String, byteOffset: Double, encoding: String): Boolean = js.native
  def includes(value: Double, byteOffset: Double, encoding: String): Boolean = js.native
  def includes(value: Buffer): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double, encoding: String): Boolean = js.native
  def indexOf(value: String): Double = js.native
  def indexOf(value: String, byteOffset: Double): Double = js.native
  def indexOf(value: String, byteOffset: Double, encoding: String): Double = js.native
  def indexOf(value: Double, byteOffset: Double, encoding: String): Double = js.native
  def indexOf(value: Buffer): Double = js.native
  def indexOf(value: Buffer, byteOffset: Double): Double = js.native
  def indexOf(value: Buffer, byteOffset: Double, encoding: String): Double = js.native
  def lastIndexOf(value: String): Double = js.native
  def lastIndexOf(value: String, byteOffset: Double): Double = js.native
  def lastIndexOf(value: String, byteOffset: Double, encoding: String): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Double, encoding: String): Double = js.native
  def lastIndexOf(value: Buffer): Double = js.native
  def lastIndexOf(value: Buffer, byteOffset: Double): Double = js.native
  def lastIndexOf(value: Buffer, byteOffset: Double, encoding: String): Double = js.native
  def readDoubleBE(offset: Double): Double = js.native
  def readDoubleBE(offset: Double, noAssert: Boolean): Double = js.native
  def readDoubleLE(offset: Double): Double = js.native
  def readDoubleLE(offset: Double, noAssert: Boolean): Double = js.native
  def readFloatBE(offset: Double): Double = js.native
  def readFloatBE(offset: Double, noAssert: Boolean): Double = js.native
  def readFloatLE(offset: Double): Double = js.native
  def readFloatLE(offset: Double, noAssert: Boolean): Double = js.native
  def readInt16BE(offset: Double): Double = js.native
  def readInt16BE(offset: Double, noAssert: Boolean): Double = js.native
  def readInt16LE(offset: Double): Double = js.native
  def readInt16LE(offset: Double, noAssert: Boolean): Double = js.native
  def readInt32BE(offset: Double): Double = js.native
  def readInt32BE(offset: Double, noAssert: Boolean): Double = js.native
  def readInt32LE(offset: Double): Double = js.native
  def readInt32LE(offset: Double, noAssert: Boolean): Double = js.native
  def readInt8(offset: Double): Double = js.native
  def readInt8(offset: Double, noAssert: Boolean): Double = js.native
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  def readIntBE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  def readIntLE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  def readUInt16BE(offset: Double): Double = js.native
  def readUInt16BE(offset: Double, noAssert: Boolean): Double = js.native
  def readUInt16LE(offset: Double): Double = js.native
  def readUInt16LE(offset: Double, noAssert: Boolean): Double = js.native
  def readUInt32BE(offset: Double): Double = js.native
  def readUInt32BE(offset: Double, noAssert: Boolean): Double = js.native
  def readUInt32LE(offset: Double): Double = js.native
  def readUInt32LE(offset: Double, noAssert: Boolean): Double = js.native
  def readUInt8(offset: Double): Double = js.native
  def readUInt8(offset: Double, noAssert: Boolean): Double = js.native
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  def readUIntBE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  def readUIntLE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  def swap16(): Buffer = js.native
  def swap32(): Buffer = js.native
  def swap64(): Buffer = js.native
  def toJSON(): Anon_Buffer = js.native
  def toString(encoding: String): String = js.native
  def toString(encoding: String, start: Double): String = js.native
  def toString(encoding: String, start: Double, end: Double): String = js.native
  def write(string: String): Double = js.native
  def write(string: String, offset: Double): Double = js.native
  def write(string: String, offset: Double, length: Double): Double = js.native
  def write(string: String, offset: Double, length: Double, encoding: String): Double = js.native
  def writeDoubleBE(value: Double, offset: Double): Double = js.native
  def writeDoubleBE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeDoubleLE(value: Double, offset: Double): Double = js.native
  def writeDoubleLE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeFloatBE(value: Double, offset: Double): Double = js.native
  def writeFloatBE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeFloatLE(value: Double, offset: Double): Double = js.native
  def writeFloatLE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeInt16BE(value: Double, offset: Double): Double = js.native
  def writeInt16BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeInt16LE(value: Double, offset: Double): Double = js.native
  def writeInt16LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeInt32BE(value: Double, offset: Double): Double = js.native
  def writeInt32BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeInt32LE(value: Double, offset: Double): Double = js.native
  def writeInt32LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeInt8(value: Double, offset: Double): Double = js.native
  def writeInt8(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  def writeUInt16BE(value: Double, offset: Double): Double = js.native
  def writeUInt16BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeUInt16LE(value: Double, offset: Double): Double = js.native
  def writeUInt16LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeUInt32BE(value: Double, offset: Double): Double = js.native
  def writeUInt32BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeUInt32LE(value: Double, offset: Double): Double = js.native
  def writeUInt32LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeUInt8(value: Double, offset: Double): Double = js.native
  def writeUInt8(value: Double, offset: Double, noAssert: Boolean): Double = js.native
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
}

