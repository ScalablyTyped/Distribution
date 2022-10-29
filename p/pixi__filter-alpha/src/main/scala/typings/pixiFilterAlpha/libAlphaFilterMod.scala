package typings.pixiFilterAlpha

import typings.pixiCore.mod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAlphaFilterMod {
  
  @JSImport("@pixi/filter-alpha/lib/AlphaFilter", "AlphaFilter")
  @js.native
  /**
    * @param alpha - Amount of alpha from 0 to 1, where 0 is transparent
    */
  open class AlphaFilter () extends Filter {
    def this(alpha: Double) = this()
    
    /**
      * Coefficient for alpha multiplication
      * @default 1
      */
    def alpha: Double = js.native
    def alpha_=(value: Double): Unit = js.native
  }
}
