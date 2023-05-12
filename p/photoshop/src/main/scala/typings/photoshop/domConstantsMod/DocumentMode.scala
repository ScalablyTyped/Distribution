package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentMode extends StObject
@JSImport("photoshop/dom/Constants", "DocumentMode")
@js.native
object DocumentMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentMode & String] = js.native
  
  @js.native
  sealed trait BITMAP
    extends StObject
       with DocumentMode
  /* "bitmapMode" */ val BITMAP: typings.photoshop.domConstantsMod.DocumentMode.BITMAP & String = js.native
  
  @js.native
  sealed trait CMYK
    extends StObject
       with DocumentMode
  /* "CMYKColorMode" */ val CMYK: typings.photoshop.domConstantsMod.DocumentMode.CMYK & String = js.native
  
  @js.native
  sealed trait DUOTONE
    extends StObject
       with DocumentMode
  /* "duotoneMode" */ val DUOTONE: typings.photoshop.domConstantsMod.DocumentMode.DUOTONE & String = js.native
  
  @js.native
  sealed trait GRAYSCALE
    extends StObject
       with DocumentMode
  /* "grayscaleMode" */ val GRAYSCALE: typings.photoshop.domConstantsMod.DocumentMode.GRAYSCALE & String = js.native
  
  @js.native
  sealed trait INDEXEDCOLOR
    extends StObject
       with DocumentMode
  /* "indexedColorMode" */ val INDEXEDCOLOR: typings.photoshop.domConstantsMod.DocumentMode.INDEXEDCOLOR & String = js.native
  
  @js.native
  sealed trait LAB
    extends StObject
       with DocumentMode
  /* "labColorMode" */ val LAB: typings.photoshop.domConstantsMod.DocumentMode.LAB & String = js.native
  
  @js.native
  sealed trait MULTICHANNEL
    extends StObject
       with DocumentMode
  /* "multichannelMode" */ val MULTICHANNEL: typings.photoshop.domConstantsMod.DocumentMode.MULTICHANNEL & String = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with DocumentMode
  /* "RGBColorMode" */ val RGB: typings.photoshop.domConstantsMod.DocumentMode.RGB & String = js.native
}
