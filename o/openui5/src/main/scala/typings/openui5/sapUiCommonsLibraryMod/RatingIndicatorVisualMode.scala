package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RatingIndicatorVisualMode extends StObject
@JSImport("sap/ui/commons/library", "RatingIndicatorVisualMode")
@js.native
object RatingIndicatorVisualMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RatingIndicatorVisualMode & String] = js.native
  
  /**
    * Values are not rounded.
    */
  @js.native
  sealed trait Continuous
    extends StObject
       with RatingIndicatorVisualMode
  /* "Continuous" */ val Continuous: typings.openui5.sapUiCommonsLibraryMod.RatingIndicatorVisualMode.Continuous & String = js.native
  
  /**
    * Values are rounded to the nearest integer value (e.g. 1.7 -> 2).
    */
  @js.native
  sealed trait Full
    extends StObject
       with RatingIndicatorVisualMode
  /* "Full" */ val Full: typings.openui5.sapUiCommonsLibraryMod.RatingIndicatorVisualMode.Full & String = js.native
  
  /**
    * Values are rounded to the nearest half value (e.g. 1.7 -> 1.5).
    */
  @js.native
  sealed trait Half
    extends StObject
       with RatingIndicatorVisualMode
  /* "Half" */ val Half: typings.openui5.sapUiCommonsLibraryMod.RatingIndicatorVisualMode.Half & String = js.native
}
