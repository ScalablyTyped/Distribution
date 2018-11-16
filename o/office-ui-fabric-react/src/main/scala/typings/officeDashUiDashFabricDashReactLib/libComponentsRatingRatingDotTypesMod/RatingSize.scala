package typings
package officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RatingSize extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Rating/Rating.types", "RatingSize")
@js.native
object RatingSize extends js.Object {
  @js.native
  sealed trait Large
    extends officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod.RatingSize
  
  @js.native
  sealed trait Small
    extends officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod.RatingSize
  
  /* 1 */ val Large: Large with scala.Double = js.native
  /* 0 */ val Small: Small with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod.RatingSize with scala.Double
  ] = js.native
}

