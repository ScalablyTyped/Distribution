package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ZigZagType extends StObject
@JSImport("photoshop/dom/Constants", "ZigZagType")
@js.native
object ZigZagType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ZigZagType & String] = js.native
  
  @js.native
  sealed trait AROUNDCENTER
    extends StObject
       with ZigZagType
  /* "aroundCenter" */ val AROUNDCENTER: typings.photoshop.domConstantsMod.ZigZagType.AROUNDCENTER & String = js.native
  
  @js.native
  sealed trait OUTFROMCENTER
    extends StObject
       with ZigZagType
  /* "outFromCenter" */ val OUTFROMCENTER: typings.photoshop.domConstantsMod.ZigZagType.OUTFROMCENTER & String = js.native
  
  @js.native
  sealed trait PONDRIPPLES
    extends StObject
       with ZigZagType
  /* "pondRipples" */ val PONDRIPPLES: typings.photoshop.domConstantsMod.ZigZagType.PONDRIPPLES & String = js.native
}
