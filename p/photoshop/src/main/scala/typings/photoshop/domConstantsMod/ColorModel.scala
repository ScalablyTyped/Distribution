package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorModel extends StObject
@JSImport("photoshop/dom/Constants", "ColorModel")
@js.native
object ColorModel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ColorModel & String] = js.native
  
  @js.native
  sealed trait CMYK
    extends StObject
       with ColorModel
  /* "CMYKColorEnum" */ val CMYK: typings.photoshop.domConstantsMod.ColorModel.CMYK & String = js.native
  
  @js.native
  sealed trait GRAYSCALE
    extends StObject
       with ColorModel
  /* "grayScale" */ val GRAYSCALE: typings.photoshop.domConstantsMod.ColorModel.GRAYSCALE & String = js.native
  
  @js.native
  sealed trait HSB
    extends StObject
       with ColorModel
  /* "HSBColorEnum" */ val HSB: typings.photoshop.domConstantsMod.ColorModel.HSB & String = js.native
  
  @js.native
  sealed trait LAB
    extends StObject
       with ColorModel
  /* "labColor" */ val LAB: typings.photoshop.domConstantsMod.ColorModel.LAB & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with ColorModel
  /* "noColor" */ val NONE: typings.photoshop.domConstantsMod.ColorModel.NONE & String = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with ColorModel
  /* "RGBColor" */ val RGB: typings.photoshop.domConstantsMod.ColorModel.RGB & String = js.native
}
