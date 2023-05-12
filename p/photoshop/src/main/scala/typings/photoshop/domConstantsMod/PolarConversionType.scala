package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PolarConversionType extends StObject
@JSImport("photoshop/dom/Constants", "PolarConversionType")
@js.native
object PolarConversionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PolarConversionType & String] = js.native
  
  /**
    * The distortion applied will take the input pixel grid as polar coordinates
    * and convert them to rectangular coordinates.
    */
  @js.native
  sealed trait POLARTORECTANGULAR
    extends StObject
       with PolarConversionType
  /* "polarToRect" */ val POLARTORECTANGULAR: typings.photoshop.domConstantsMod.PolarConversionType.POLARTORECTANGULAR & String = js.native
  
  /**
    * The distortion applied will take the input pixel grid as rectangular coordinates
    * and convert them to polar coordinates.
    */
  @js.native
  sealed trait RECTANGULARTOPOLAR
    extends StObject
       with PolarConversionType
  /* "rectToPolar" */ val RECTANGULARTOPOLAR: typings.photoshop.domConstantsMod.PolarConversionType.RECTANGULARTOPOLAR & String = js.native
}
