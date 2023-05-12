package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapConversionType extends StObject
@JSImport("photoshop/dom/Constants", "BitmapConversionType")
@js.native
object BitmapConversionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BitmapConversionType & String] = js.native
  
  @js.native
  sealed trait CUSTOMPATTERN
    extends StObject
       with BitmapConversionType
  /* "customPattern" */ val CUSTOMPATTERN: typings.photoshop.domConstantsMod.BitmapConversionType.CUSTOMPATTERN & String = js.native
  
  @js.native
  sealed trait DIFFUSIONDITHER
    extends StObject
       with BitmapConversionType
  /* "diffusionDither" */ val DIFFUSIONDITHER: typings.photoshop.domConstantsMod.BitmapConversionType.DIFFUSIONDITHER & String = js.native
  
  @js.native
  sealed trait HALFTHRESHOLD
    extends StObject
       with BitmapConversionType
  /* "halfThreshold" */ val HALFTHRESHOLD: typings.photoshop.domConstantsMod.BitmapConversionType.HALFTHRESHOLD & String = js.native
  
  @js.native
  sealed trait HALFTONESCREEN
    extends StObject
       with BitmapConversionType
  /* "halfToneScreen" */ val HALFTONESCREEN: typings.photoshop.domConstantsMod.BitmapConversionType.HALFTONESCREEN & String = js.native
  
  @js.native
  sealed trait PATTERNDITHER
    extends StObject
       with BitmapConversionType
  /* "patternDither" */ val PATTERNDITHER: typings.photoshop.domConstantsMod.BitmapConversionType.PATTERNDITHER & String = js.native
}
