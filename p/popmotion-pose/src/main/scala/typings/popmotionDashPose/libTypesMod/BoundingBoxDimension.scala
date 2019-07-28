package typings.popmotionDashPose.libTypesMod

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
  
  /* "bottom" */ val bottom: typings.popmotionDashPose.libTypesMod.BoundingBoxDimension.bottom with String = js.native
  /* "height" */ val height: typings.popmotionDashPose.libTypesMod.BoundingBoxDimension.height with String = js.native
  /* "left" */ val left: typings.popmotionDashPose.libTypesMod.BoundingBoxDimension.left with String = js.native
  /* "right" */ val right: typings.popmotionDashPose.libTypesMod.BoundingBoxDimension.right with String = js.native
  /* "top" */ val top: typings.popmotionDashPose.libTypesMod.BoundingBoxDimension.top with String = js.native
  /* "width" */ val width: typings.popmotionDashPose.libTypesMod.BoundingBoxDimension.width with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BoundingBoxDimension with String] = js.native
}

