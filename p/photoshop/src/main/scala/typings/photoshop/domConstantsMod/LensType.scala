package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LensType extends StObject
@JSImport("photoshop/dom/Constants", "LensType")
@js.native
object LensType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LensType & String] = js.native
  
  @js.native
  sealed trait MOVIEPRIME
    extends StObject
       with LensType
  /* "panaVision" */ val MOVIEPRIME: typings.photoshop.domConstantsMod.LensType.MOVIEPRIME & String = js.native
  
  @js.native
  sealed trait PRIME105
    extends StObject
       with LensType
  /* "nikon105" */ val PRIME105: typings.photoshop.domConstantsMod.LensType.PRIME105 & String = js.native
  
  @js.native
  sealed trait PRIME35
    extends StObject
       with LensType
  /* "nikon" */ val PRIME35: typings.photoshop.domConstantsMod.LensType.PRIME35 & String = js.native
  
  @js.native
  sealed trait ZOOMLENS
    extends StObject
       with LensType
  /* "zoom" */ val ZOOMLENS: typings.photoshop.domConstantsMod.LensType.ZOOMLENS & String = js.native
}
