package typings.obeliskJs.mod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "BitmapData")
@js.native
class BitmapData protected () extends StObject {
  def this(w: Double, h: Double) = this()
  def this(w: Double, h: Double, useDefaultCanvas: Boolean) = this()
  
  var canvas: HTMLCanvasElement = js.native
  
  def checkPixelAvailable(x: Double, y: Double): Boolean = js.native
  
  var context: CanvasRenderingContext2D = js.native
  
  def floodFill(posX: Double, posY: Double, color: Double): Unit = js.native
  
  var imageData: ImageData = js.native
  
  def setPixel(posX: Double, posY: Double, color: Double): Unit = js.native
  
  def setPixelByIndex(index: Double, color: Double): Unit = js.native
}
