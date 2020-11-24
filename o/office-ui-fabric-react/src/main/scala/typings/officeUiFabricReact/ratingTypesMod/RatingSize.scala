package typings.officeUiFabricReact.ratingTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RatingSize extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Rating/Rating.types", "RatingSize")
@js.native
object RatingSize extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RatingSize with Double] = js.native
  
  @js.native
  sealed trait Large extends RatingSize
  /* 1 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  @js.native
  sealed trait Small extends RatingSize
  /* 0 */ @js.native
  object Small extends TopLevel[Small with Double]
}
