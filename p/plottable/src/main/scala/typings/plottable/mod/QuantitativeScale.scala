package typings.plottable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "QuantitativeScale")
@js.native
/**
  * A QuantitativeScale is a Scale that maps number-like values to numbers.
  * It is invertible and continuous.
  *
  * @constructor
  */
class QuantitativeScale[D] ()
  extends typings.plottable.quantitativeScaleMod.QuantitativeScale[D]
/* static members */
object QuantitativeScale {
  
  @JSImport("plottable", "QuantitativeScale")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable", "QuantitativeScale._DEFAULT_NUM_TICKS")
  @js.native
  def _DEFAULT_NUM_TICKS: Double = js.native
  inline def _DEFAULT_NUM_TICKS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_NUM_TICKS")(x.asInstanceOf[js.Any])
}
