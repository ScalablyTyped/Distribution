package typings.officeUiFabricReact.ratingTypesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RatingSize with Double] = js.native
  /* 1 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  /* 0 */ @js.native
  object Small extends TopLevel[Small with Double]
  
}

