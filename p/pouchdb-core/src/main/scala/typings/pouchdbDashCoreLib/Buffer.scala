package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer
  extends stdLib.Uint8Array {
  def compare(otherBuffer: Buffer): scala.Double = js.native
  def compare(otherBuffer: Buffer, targetStart: scala.Double): scala.Double = js.native
  def compare(otherBuffer: Buffer, targetStart: scala.Double, targetEnd: scala.Double): scala.Double = js.native
  def compare(otherBuffer: Buffer, targetStart: scala.Double, targetEnd: scala.Double, sourceStart: scala.Double): scala.Double = js.native
  def compare(
    otherBuffer: Buffer,
    targetStart: scala.Double,
    targetEnd: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  def copy(targetBuffer: Buffer): scala.Double = js.native
  def copy(targetBuffer: Buffer, targetStart: scala.Double): scala.Double = js.native
  def copy(targetBuffer: Buffer, targetStart: scala.Double, sourceStart: scala.Double): scala.Double = js.native
  def copy(
    targetBuffer: Buffer,
    targetStart: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  def equals(otherBuffer: Buffer): scala.Boolean = js.native
  def fill(value: js.Any): this.type = js.native
  def fill(value: js.Any, offset: scala.Double): this.type = js.native
  def fill(value: js.Any, offset: scala.Double, end: scala.Double): this.type = js.native
  def includes(value: java.lang.String): scala.Boolean = js.native
  def includes(value: java.lang.String, byteOffset: scala.Double): scala.Boolean = js.native
  def includes(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def includes(value: Buffer): scala.Boolean = js.native
  def includes(value: Buffer, byteOffset: scala.Double): scala.Boolean = js.native
  def includes(value: Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def includes(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def indexOf(value: java.lang.String): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: Buffer): scala.Double = js.native
  def indexOf(value: Buffer, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: scala.Double): scala.Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: Buffer): scala.Double = js.native
  def lastIndexOf(value: Buffer, byteOffset: scala.Double): scala.Double = js.native
  def lastIndexOf(value: Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  def readDoubleBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  def readDoubleLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  def readFloatBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  def readFloatLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  def readInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  def readInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  def readInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  def readInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  def readInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readIntBE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readIntLE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  def readUInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  def readUInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  def readUInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  def readUInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt8(offset: scala.Double): scala.Double = js.native
  def readUInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUIntBE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUIntLE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def swap16(): Buffer = js.native
  def swap32(): Buffer = js.native
  def swap64(): Buffer = js.native
  def toJSON(): Anon_Buffer = js.native
  def toString(encoding: java.lang.String): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
  def write(string: java.lang.String): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
}

