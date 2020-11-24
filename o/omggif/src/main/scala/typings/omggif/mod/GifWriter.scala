package typings.omggif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("omggif", "GifWriter")
@js.native
class GifWriter protected () extends js.Object {
  def this(buf: Buffer, width: Double, height: Double) = this()
  def this(buf: Buffer, width: Double, height: Double, gopts: GifOptions) = this()
  
  def addFrame(x: Double, y: Double, w: Double, h: Double, indexed_pixels: js.Array[Double]): Double = js.native
  def addFrame(x: Double, y: Double, w: Double, h: Double, indexed_pixels: js.Array[Double], opts: FrameOptions): Double = js.native
  
  def end(): Double = js.native
  
  def getOutputBuffer(): Buffer = js.native
  
  def getOutputBufferPosition(): Double = js.native
  
  var height: Double = js.native
  
  def setOutputBuffer(v: Buffer): Unit = js.native
  
  def setOutputBufferPosition(v: Double): Unit = js.native
  
  var width: Double = js.native
}
