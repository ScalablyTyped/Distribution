package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("ol/color", "asArray")
  @js.native
  def asArray(color: String): Color = js.native
  @JSImport("ol/color", "asArray")
  @js.native
  def asArray(color: Color): Color = js.native
  
  @JSImport("ol/color", "asString")
  @js.native
  def asString(color: String): String = js.native
  @JSImport("ol/color", "asString")
  @js.native
  def asString(color: Color): String = js.native
  
  @JSImport("ol/color", "fromString")
  @js.native
  def fromString(s: String): Color = js.native
  
  @JSImport("ol/color", "isStringColor")
  @js.native
  def isStringColor(s: String): Boolean = js.native
  
  @JSImport("ol/color", "normalize")
  @js.native
  def normalize(color: Color): Color = js.native
  
  @JSImport("ol/color", "toString")
  @js.native
  def toString_(color: Color): String = js.native
  
  type Color = js.Array[Double]
}
