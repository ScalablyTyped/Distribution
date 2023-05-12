package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RulerUnits extends StObject
@JSImport("photoshop/dom/Constants", "RulerUnits")
@js.native
object RulerUnits extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RulerUnits & String] = js.native
  
  @js.native
  sealed trait CENTIMETERS
    extends StObject
       with RulerUnits
  /* "rulerCm" */ val CENTIMETERS: typings.photoshop.domConstantsMod.RulerUnits.CENTIMETERS & String = js.native
  
  @js.native
  sealed trait INCHES
    extends StObject
       with RulerUnits
  /* "rulerInches" */ val INCHES: typings.photoshop.domConstantsMod.RulerUnits.INCHES & String = js.native
  
  @js.native
  sealed trait MILLIMETERS
    extends StObject
       with RulerUnits
  /* "rulerMm" */ val MILLIMETERS: typings.photoshop.domConstantsMod.RulerUnits.MILLIMETERS & String = js.native
  
  @js.native
  sealed trait PERCENT
    extends StObject
       with RulerUnits
  /* "rulerPercent" */ val PERCENT: typings.photoshop.domConstantsMod.RulerUnits.PERCENT & String = js.native
  
  @js.native
  sealed trait PICAS
    extends StObject
       with RulerUnits
  /* "rulerPicas" */ val PICAS: typings.photoshop.domConstantsMod.RulerUnits.PICAS & String = js.native
  
  @js.native
  sealed trait PIXELS
    extends StObject
       with RulerUnits
  /* "rulerPixels" */ val PIXELS: typings.photoshop.domConstantsMod.RulerUnits.PIXELS & String = js.native
  
  @js.native
  sealed trait POINTS
    extends StObject
       with RulerUnits
  /* "rulerPoints" */ val POINTS: typings.photoshop.domConstantsMod.RulerUnits.POINTS & String = js.native
}
