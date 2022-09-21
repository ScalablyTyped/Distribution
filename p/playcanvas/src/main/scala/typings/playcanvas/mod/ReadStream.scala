package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class for organized reading of memory.
  *
  * @ignore
  */
@JSImport("playcanvas", "ReadStream")
@js.native
open class ReadStream protected () extends StObject {
  def this(arraybuffer: Any) = this()
  
  def _inc(amount: Any): Double = js.native
  
  def align(bytes: Any): Unit = js.native
  
  var arraybuffer: Any = js.native
  
  var dataView: js.typedarray.DataView = js.native
  
  var offset: Double = js.native
  
  def readArray(result: Any): Unit = js.native
  
  def readChar(): String = js.native
  
  def readChars(numChars: Any): String = js.native
  
  def readLine(): String = js.native
  
  def readU16(): Double = js.native
  
  def readU32(): Double = js.native
  
  def readU32be(): Double = js.native
  
  def readU64(): Double = js.native
  
  def readU8(): Double = js.native
  
  def remainingBytes: Double = js.native
  
  def reset(): Unit = js.native
  def reset(offset: Double): Unit = js.native
  
  def skip(bytes: Any): Unit = js.native
  
  var stack: js.Array[Any] = js.native
}
