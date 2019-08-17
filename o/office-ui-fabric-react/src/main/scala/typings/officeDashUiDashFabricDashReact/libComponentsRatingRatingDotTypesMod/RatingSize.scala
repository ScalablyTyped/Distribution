package typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RatingSize extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Rating/Rating.types", "RatingSize")
@js.native
object RatingSize extends js.Object {
  @js.native
  sealed trait Large extends RatingSize
  
  @js.native
  sealed trait Small extends RatingSize
  
  /* 1 */ val Large: typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize.Large with Double = js.native
  /* 0 */ val Small: typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize.Small with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RatingSize with Double] = js.native
}

