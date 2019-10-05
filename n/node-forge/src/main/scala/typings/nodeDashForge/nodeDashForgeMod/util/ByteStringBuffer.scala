package typings.nodeDashForge.nodeDashForgeMod.util

import typings.nodeDashForge.nodeDashForgeMod.Byte
import typings.nodeDashForge.nodeDashForgeMod.Bytes
import typings.nodeDashForge.nodeDashForgeMod.Hex
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.ByteStringBuffer")
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

