package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RatingIndicatorVisualMode extends StObject
@JSImport("sap/m/library", "RatingIndicatorVisualMode")
@js.native
object RatingIndicatorVisualMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RatingIndicatorVisualMode & String] = js.native
  
  /**
    * Values are rounded to the nearest integer value (e.g. 1.7 -> 2).
    */
  @js.native
  sealed trait Full
    extends StObject
       with RatingIndicatorVisualMode
  /* "Full" */ val Full: typings.openui5.sapMLibraryMod.RatingIndicatorVisualMode.Full & String = js.native
  
  /**
    * Values are rounded to the nearest half value (e.g. 1.7 -> 1.5).
    */
  @js.native
  sealed trait Half
    extends StObject
       with RatingIndicatorVisualMode
  /* "Half" */ val Half: typings.openui5.sapMLibraryMod.RatingIndicatorVisualMode.Half & String = js.native
}
