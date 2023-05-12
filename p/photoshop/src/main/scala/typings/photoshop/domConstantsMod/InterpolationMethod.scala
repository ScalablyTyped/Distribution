package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InterpolationMethod extends StObject
@JSImport("photoshop/dom/Constants", "InterpolationMethod")
@js.native
object InterpolationMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InterpolationMethod & String] = js.native
  
  /**
    * Choose best bicubic option automatically
    */
  @js.native
  sealed trait AUTOMATIC
    extends StObject
       with InterpolationMethod
  /* "bicubicAutomatic" */ val AUTOMATIC: typings.photoshop.domConstantsMod.InterpolationMethod.AUTOMATIC & String = js.native
  
  /**
    * Bicubic interpolation
    */
  @js.native
  sealed trait BICUBIC
    extends StObject
       with InterpolationMethod
  /* "bicubic" */ val BICUBIC: typings.photoshop.domConstantsMod.InterpolationMethod.BICUBIC & String = js.native
  
  /**
    * Apply a sharpening mask
    */
  @js.native
  sealed trait BICUBICSHARPER
    extends StObject
       with InterpolationMethod
  /* "bicubicSharper" */ val BICUBICSHARPER: typings.photoshop.domConstantsMod.InterpolationMethod.BICUBICSHARPER & String = js.native
  
  /**
    * Apply a smoothing mask
    */
  @js.native
  sealed trait BICUBICSMOOTHER
    extends StObject
       with InterpolationMethod
  /* "bicubicSmoother" */ val BICUBICSMOOTHER: typings.photoshop.domConstantsMod.InterpolationMethod.BICUBICSMOOTHER & String = js.native
  
  /**
    * Bilinear interpolate
    */
  @js.native
  sealed trait BILINEAR
    extends StObject
       with InterpolationMethod
  /* "bilinear" */ val BILINEAR: typings.photoshop.domConstantsMod.InterpolationMethod.BILINEAR & String = js.native
  
  /**
    * Determine value based on nearest neighbor
    */
  @js.native
  sealed trait NEARESTNEIGHBOR
    extends StObject
       with InterpolationMethod
  /* "nearestNeighbor" */ val NEARESTNEIGHBOR: typings.photoshop.domConstantsMod.InterpolationMethod.NEARESTNEIGHBOR & String = js.native
}
