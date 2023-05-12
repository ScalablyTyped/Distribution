package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmartBlurMode extends StObject
@JSImport("photoshop/dom/Constants", "SmartBlurMode")
@js.native
object SmartBlurMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SmartBlurMode & String] = js.native
  
  @js.native
  sealed trait EDGEONLY
    extends StObject
       with SmartBlurMode
  /* "smartBlurModeEdgeOnly" */ val EDGEONLY: typings.photoshop.domConstantsMod.SmartBlurMode.EDGEONLY & String = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with SmartBlurMode
  /* "smartBlurModeNormal" */ val NORMAL: typings.photoshop.domConstantsMod.SmartBlurMode.NORMAL & String = js.native
  
  @js.native
  sealed trait OVERLAYEDGE
    extends StObject
       with SmartBlurMode
  /* "smartBlurModeOverlayEdge" */ val OVERLAYEDGE: typings.photoshop.domConstantsMod.SmartBlurMode.OVERLAYEDGE & String = js.native
}
