package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BoundingBoxDimension extends js.Object
@JSImport("popmotion-pose/lib/types", "BoundingBoxDimension")
@js.native
object BoundingBoxDimension extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BoundingBoxDimension with String] = js.native
  
  @js.native
  sealed trait bottom extends BoundingBoxDimension
  /* "bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  @js.native
  sealed trait height extends BoundingBoxDimension
  /* "height" */ @js.native
  object height extends TopLevel[height with String]
  
  @js.native
  sealed trait left extends BoundingBoxDimension
  /* "left" */ @js.native
  object left extends TopLevel[left with String]
  
  @js.native
  sealed trait right extends BoundingBoxDimension
  /* "right" */ @js.native
  object right extends TopLevel[right with String]
  
  @js.native
  sealed trait top extends BoundingBoxDimension
  /* "top" */ @js.native
  object top extends TopLevel[top with String]
  
  @js.native
  sealed trait width extends BoundingBoxDimension
  /* "width" */ @js.native
  object width extends TopLevel[width with String]
}
