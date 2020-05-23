package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@JSGlobal("photonui.Color")
@js.native
class Color ()
  extends typings.photonui.photonui.Color {
  def this(color: String) = this()
  def this(params: StringDictionary[js.Any]) = this()
  /* CompleteClass */
  override var alpha: Double = js.native
  /* CompleteClass */
  override var blue: Double = js.native
  /* CompleteClass */
  override var brightness: Double = js.native
  /* CompleteClass */
  override var green: Double = js.native
  /* CompleteClass */
  override var hexString: String = js.native
  /* CompleteClass */
  override var hue: Double = js.native
   // readonly
  /* CompleteClass */
  override var red: Double = js.native
  /* CompleteClass */
  override var rgbString: String = js.native
   // readonly
  /* CompleteClass */
  override var rgbaString: String = js.native
  /* CompleteClass */
  override var saturation: Double = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getRGB(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getRGBA(): js.Array[Double] = js.native
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  /* CompleteClass */
  override def setHSB(hue: Double, saturation: Double, brightness: Double): Unit = js.native
  /* CompleteClass */
  override def setRGB(red: Double, green: Double, blue: Double): Unit = js.native
  /* CompleteClass */
  override def setRGBA(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
}

