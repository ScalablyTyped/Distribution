package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeUnits extends StObject
@JSImport("photoshop/dom/Constants", "TypeUnits")
@js.native
object TypeUnits extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TypeUnits & String] = js.native
  
  @js.native
  sealed trait MILLIMETERS
    extends StObject
       with TypeUnits
  /* "rulerMm" */ val MILLIMETERS: typings.photoshop.domConstantsMod.TypeUnits.MILLIMETERS & String = js.native
  
  @js.native
  sealed trait PIXELS
    extends StObject
       with TypeUnits
  /* "rulerPixels" */ val PIXELS: typings.photoshop.domConstantsMod.TypeUnits.PIXELS & String = js.native
  
  @js.native
  sealed trait POINTS
    extends StObject
       with TypeUnits
  /* "rulerPoints" */ val POINTS: typings.photoshop.domConstantsMod.TypeUnits.POINTS & String = js.native
}
