package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -----------------------------------
@JSGlobal("photonui.Color")
@js.native
class Color ()
  extends StObject
     with typings.photonui.photonui.Color {
  def this(color: String) = this()
  def this(params: StringDictionary[js.Any]) = this()
  
  /* CompleteClass */
  var alpha: Double = js.native
  
  /* CompleteClass */
  var blue: Double = js.native
  
  /* CompleteClass */
  var brightness: Double = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  override def getRGB(): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getRGBA(): js.Array[Double] = js.native
  
  /* CompleteClass */
  var green: Double = js.native
  
  /* CompleteClass */
  var hexString: String = js.native
  
  /* CompleteClass */
  var hue: Double = js.native
  
  // readonly
  /* CompleteClass */
  var red: Double = js.native
  
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  
  /* CompleteClass */
  var rgbString: String = js.native
  
  // readonly
  /* CompleteClass */
  var rgbaString: String = js.native
  
  /* CompleteClass */
  var saturation: Double = js.native
  
  /* CompleteClass */
  override def setHSB(hue: Double, saturation: Double, brightness: Double): Unit = js.native
  
  /* CompleteClass */
  override def setRGB(red: Double, green: Double, blue: Double): Unit = js.native
  
  /* CompleteClass */
  override def setRGBA(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
}
