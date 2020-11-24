package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PDFKit data
  */
@js.native
trait PDFData
  extends Instantiable1[/* data */ js.Array[js.Any], PDFData] {
  
  def byteAt(index: Double): js.Any = js.native
  
  def read(length: Double): js.Array[_] = js.native
  
  def readBool(): Boolean = js.native
  
  def readByte(): js.Any = js.native
  
  def readInt(): Double = js.native
  
  def readInt16(): Double = js.native
  
  def readInt32(): Double = js.native
  
  def readLongLong(): Double = js.native
  
  def readShort(): Double = js.native
  
  def readString(length: Double): String = js.native
  
  def readUInt16(): Double = js.native
  
  def readUInt32(): Double = js.native
  
  def slice(start: Double, end: Double): js.Array[_] = js.native
  
  def stringAt(pos: Double, length: Double): String = js.native
  
  def write(bytes: js.Array[_]): Unit = js.native
  
  def writeBool(`val`: Boolean): Boolean = js.native
  
  def writeByte(byte: js.Any): Unit = js.native
  
  def writeInt(`val`: Double): Unit = js.native
  
  def writeInt16(`val`: Double): Unit = js.native
  
  def writeInt32(`val`: Double): Unit = js.native
  
  def writeLongLong(`val`: Double): Unit = js.native
  
  def writeShort(`val`: Double): Unit = js.native
  
  def writeString(`val`: String): Unit = js.native
  
  def writeUInt16(`val`: Double): Unit = js.native
  
  def writeUInt32(`val`: Double): Unit = js.native
}
