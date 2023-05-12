package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RippleSize extends StObject
@JSImport("photoshop/dom/Constants", "RippleSize")
@js.native
object RippleSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RippleSize & String] = js.native
  
  @js.native
  sealed trait LARGE
    extends StObject
       with RippleSize
  /* "large" */ val LARGE: typings.photoshop.domConstantsMod.RippleSize.LARGE & String = js.native
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with RippleSize
  /* "mediumQuality" */ val MEDIUM: typings.photoshop.domConstantsMod.RippleSize.MEDIUM & String = js.native
  
  @js.native
  sealed trait SMALL
    extends StObject
       with RippleSize
  /* "small" */ val SMALL: typings.photoshop.domConstantsMod.RippleSize.SMALL & String = js.native
}
