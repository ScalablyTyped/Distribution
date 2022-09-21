package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Color")
@js.native
open class Color protected () extends StObject {
  /**
    * @remarks
    * Creates a new color using the specified color values.
    * @param red
    * @param green
    * @param blue
    * @param alpha
    */
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  
  /**
    * Determines a color's alpha (opacity) component. Valid values
    * are between 0 (transparent) and 1.0 (opaque).
    */
  var alpha: Double = js.native
  
  /**
    * Determines a color's blue component. Valid values are
    * between 0 and 1.0.
    */
  var blue: Double = js.native
  
  /**
    * Determines a color's green component. Valid values are
    * between 0 and 1.0.
    */
  var green: Double = js.native
  
  /**
    * Determines a color's red component. Valid values are between
    * 0 and 1.0.
    */
  var red: Double = js.native
}
