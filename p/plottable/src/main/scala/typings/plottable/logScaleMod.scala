package typings.plottable

import typings.plottable.quantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logScaleMod {
  
  @JSImport("plottable/build/src/scales/logScale", "Log")
  @js.native
  /**
    * @constructor
    */
  open class Log () extends QuantitativeScale[Double] {
    def this(base: Double) = this()
    
    /* private */ var _d3Scale: Any = js.native
  }
}
