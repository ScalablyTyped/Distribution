package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BoundingBoxDimension extends js.Object

@JSImport("popmotion-pose/lib/types", "BoundingBoxDimension")
@js.native
object BoundingBoxDimension extends js.Object {
  @js.native
  sealed trait bottom
    extends popmotionDashPoseLib.libTypesMod.BoundingBoxDimension
  
  @js.native
  sealed trait height
    extends popmotionDashPoseLib.libTypesMod.BoundingBoxDimension
  
  @js.native
  sealed trait left
    extends popmotionDashPoseLib.libTypesMod.BoundingBoxDimension
  
  @js.native
  sealed trait right
    extends popmotionDashPoseLib.libTypesMod.BoundingBoxDimension
  
  @js.native
  sealed trait top
    extends popmotionDashPoseLib.libTypesMod.BoundingBoxDimension
  
  @js.native
  sealed trait width
    extends popmotionDashPoseLib.libTypesMod.BoundingBoxDimension
  
  /* "bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "height" */ val height: height with java.lang.String = js.native
  /* "left" */ val left: left with java.lang.String = js.native
  /* "right" */ val right: right with java.lang.String = js.native
  /* "top" */ val top: top with java.lang.String = js.native
  /* "width" */ val width: width with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[popmotionDashPoseLib.libTypesMod.BoundingBoxDimension with java.lang.String] = js.native
}

