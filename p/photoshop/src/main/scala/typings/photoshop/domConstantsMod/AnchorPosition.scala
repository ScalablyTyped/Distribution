package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnchorPosition extends StObject
@JSImport("photoshop/dom/Constants", "AnchorPosition")
@js.native
object AnchorPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnchorPosition & String] = js.native
  
  @js.native
  sealed trait BOTTOMCENTER
    extends StObject
       with AnchorPosition
  /* "bottom-center" */ val BOTTOMCENTER: typings.photoshop.domConstantsMod.AnchorPosition.BOTTOMCENTER & String = js.native
  
  @js.native
  sealed trait BOTTOMLEFT
    extends StObject
       with AnchorPosition
  /* "bottom-left" */ val BOTTOMLEFT: typings.photoshop.domConstantsMod.AnchorPosition.BOTTOMLEFT & String = js.native
  
  @js.native
  sealed trait BOTTOMRIGHT
    extends StObject
       with AnchorPosition
  /* "bottom-right" */ val BOTTOMRIGHT: typings.photoshop.domConstantsMod.AnchorPosition.BOTTOMRIGHT & String = js.native
  
  @js.native
  sealed trait MIDDLECENTER
    extends StObject
       with AnchorPosition
  /* "middle-center" */ val MIDDLECENTER: typings.photoshop.domConstantsMod.AnchorPosition.MIDDLECENTER & String = js.native
  
  @js.native
  sealed trait MIDDLELEFT
    extends StObject
       with AnchorPosition
  /* "middle-left" */ val MIDDLELEFT: typings.photoshop.domConstantsMod.AnchorPosition.MIDDLELEFT & String = js.native
  
  @js.native
  sealed trait MIDDLERIGHT
    extends StObject
       with AnchorPosition
  /* "middle-right" */ val MIDDLERIGHT: typings.photoshop.domConstantsMod.AnchorPosition.MIDDLERIGHT & String = js.native
  
  @js.native
  sealed trait TOPCENTER
    extends StObject
       with AnchorPosition
  /* "top-center" */ val TOPCENTER: typings.photoshop.domConstantsMod.AnchorPosition.TOPCENTER & String = js.native
  
  @js.native
  sealed trait TOPLEFT
    extends StObject
       with AnchorPosition
  /* "top-left" */ val TOPLEFT: typings.photoshop.domConstantsMod.AnchorPosition.TOPLEFT & String = js.native
  
  @js.native
  sealed trait TOPRIGHT
    extends StObject
       with AnchorPosition
  /* "top-right" */ val TOPRIGHT: typings.photoshop.domConstantsMod.AnchorPosition.TOPRIGHT & String = js.native
}
