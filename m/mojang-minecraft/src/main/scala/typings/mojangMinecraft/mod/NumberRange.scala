package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "NumberRange")
@js.native
/* protected */ open class NumberRange () extends StObject {
  
  /**
    * Maximum value within a range.
    */
  var max: Double = js.native
  
  /**
    * Minimum value within a range.
    */
  var min: Double = js.native
  
  /**
    * @remarks
    * Returns a random number between the minimum and maximum of
    * the range.
    */
  def next(): Double = js.native
}
