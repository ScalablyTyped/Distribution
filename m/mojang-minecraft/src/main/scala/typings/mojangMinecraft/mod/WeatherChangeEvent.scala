package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "WeatherChangeEvent")
@js.native
/* protected */ open class WeatherChangeEvent () extends StObject {
  
  /**
    * Dimension in which the weather has changed.
    */
  val dimension: String = js.native
  
  /**
    * Whether it is lightning after the change in weather.
    */
  val lightning: Boolean = js.native
  
  /**
    * Whether it is raining after the change in weather.
    */
  val raining: Boolean = js.native
}
