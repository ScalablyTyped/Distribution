package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MiddleEasternTextDirection extends StObject
@JSImport("photoshop/dom/Constants", "MiddleEasternTextDirection")
@js.native
object MiddleEasternTextDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MiddleEasternTextDirection & String] = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with MiddleEasternTextDirection
  /* "dirOverrideDefault" */ val DEFAULT: typings.photoshop.domConstantsMod.MiddleEasternTextDirection.DEFAULT & String = js.native
  
  @js.native
  sealed trait LEFTTORIGHT
    extends StObject
       with MiddleEasternTextDirection
  /* "dirOverrideLTR" */ val LEFTTORIGHT: typings.photoshop.domConstantsMod.MiddleEasternTextDirection.LEFTTORIGHT & String = js.native
  
  @js.native
  sealed trait RIGHTTOLEFT
    extends StObject
       with MiddleEasternTextDirection
  /* "dirOverrideRTL" */ val RIGHTTOLEFT: typings.photoshop.domConstantsMod.MiddleEasternTextDirection.RIGHTTOLEFT & String = js.native
}
