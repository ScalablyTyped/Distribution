package typings
package pdfkitLib.PDFKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * PDFKit data
    */
@js.native
trait PDFData
  extends org.scalablytyped.runtime.Instantiable1[/* data */ js.Array[js.Any], PDFData] {
  def byteAt(index: scala.Double): js.Any = js.native
  def read(length: scala.Double): js.Array[_] = js.native
  def readBool(): scala.Boolean = js.native
  def readByte(): js.Any = js.native
  def readInt(): scala.Double = js.native
  def readInt16(): scala.Double = js.native
  def readInt32(): scala.Double = js.native
  def readLongLong(): scala.Double = js.native
  def readShort(): scala.Double = js.native
  def readString(length: scala.Double): java.lang.String = js.native
  def readUInt16(): scala.Double = js.native
  def readUInt32(): scala.Double = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[_] = js.native
  def stringAt(pos: scala.Double, length: scala.Double): java.lang.String = js.native
  def write(bytes: js.Array[_]): scala.Unit = js.native
  def writeBool(`val`: scala.Boolean): scala.Boolean = js.native
  def writeByte(byte: js.Any): scala.Unit = js.native
  def writeInt(`val`: scala.Double): scala.Unit = js.native
  def writeInt16(`val`: scala.Double): scala.Unit = js.native
  def writeInt32(`val`: scala.Double): scala.Unit = js.native
  def writeLongLong(`val`: scala.Double): scala.Unit = js.native
  def writeShort(`val`: scala.Double): scala.Unit = js.native
  def writeString(`val`: java.lang.String): scala.Unit = js.native
  def writeUInt16(`val`: scala.Double): scala.Unit = js.native
  def writeUInt32(`val`: scala.Double): scala.Unit = js.native
}

