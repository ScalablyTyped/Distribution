package typings.popmotionDashPose.libTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BoundingBoxDimension extends js.Object

@JSImport("popmotion-pose/lib/types", "BoundingBoxDimension")
@js.native
object BoundingBoxDimension extends js.Object {
  @js.native
  sealed trait bottom extends BoundingBoxDimension
  
  @js.native
  sealed trait height extends BoundingBoxDimension
  
  @js.native
  sealed trait left extends BoundingBoxDimension
  
  @js.native
  sealed trait right extends BoundingBoxDimension
  
  @js.native
  sealed trait top extends BoundingBoxDimension
  
  @js.native
  sealed trait width extends BoundingBoxDimension
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BoundingBoxDimension with String] = js.native
  /* "bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "height" */ @js.native
  object height extends TopLevel[height with String]
  
  /* "left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "top" */ @js.native
  object top extends TopLevel[top with String]
  
  /* "width" */ @js.native
  object width extends TopLevel[width with String]
  
}

