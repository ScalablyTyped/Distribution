package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BoundingBoxDimension extends StObject
@JSImport("popmotion-pose/lib/types", "BoundingBoxDimension")
@js.native
object BoundingBoxDimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BoundingBoxDimension & String] = js.native
  
  @js.native
  sealed trait bottom
    extends StObject
       with BoundingBoxDimension
  /* "bottom" */ val bottom: typings.popmotionPose.typesMod.BoundingBoxDimension.bottom & String = js.native
  
  @js.native
  sealed trait height
    extends StObject
       with BoundingBoxDimension
  /* "height" */ val height: typings.popmotionPose.typesMod.BoundingBoxDimension.height & String = js.native
  
  @js.native
  sealed trait left
    extends StObject
       with BoundingBoxDimension
  /* "left" */ val left: typings.popmotionPose.typesMod.BoundingBoxDimension.left & String = js.native
  
  @js.native
  sealed trait right
    extends StObject
       with BoundingBoxDimension
  /* "right" */ val right: typings.popmotionPose.typesMod.BoundingBoxDimension.right & String = js.native
  
  @js.native
  sealed trait top
    extends StObject
       with BoundingBoxDimension
  /* "top" */ val top: typings.popmotionPose.typesMod.BoundingBoxDimension.top & String = js.native
  
  @js.native
  sealed trait width
    extends StObject
       with BoundingBoxDimension
  /* "width" */ val width: typings.popmotionPose.typesMod.BoundingBoxDimension.width & String = js.native
}
