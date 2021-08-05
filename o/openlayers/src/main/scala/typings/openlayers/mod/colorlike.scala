package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorlike {
  
  @JSImport("openlayers", "colorlike")
  @js.native
  val ^ : js.Any = js.native
  
  inline def asColorLike(color: ColorLike_): ColorLike_ = ^.asInstanceOf[js.Dynamic].applyDynamic("asColorLike")(color.asInstanceOf[js.Any]).asInstanceOf[ColorLike_]
  /**
    * @param color Color.
    * @return The color as an ol.ColorLike
    * @api
    */
  inline def asColorLike(color: Color_): ColorLike_ = ^.asInstanceOf[js.Dynamic].applyDynamic("asColorLike")(color.asInstanceOf[js.Any]).asInstanceOf[ColorLike_]
}
