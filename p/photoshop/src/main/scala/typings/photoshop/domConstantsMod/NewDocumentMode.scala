package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewDocumentMode extends StObject
@JSImport("photoshop/dom/Constants", "NewDocumentMode")
@js.native
object NewDocumentMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NewDocumentMode & String] = js.native
  
  @js.native
  sealed trait BITMAP
    extends StObject
       with NewDocumentMode
  /* "bitmapMode" */ val BITMAP: typings.photoshop.domConstantsMod.NewDocumentMode.BITMAP & String = js.native
  
  @js.native
  sealed trait CMYK
    extends StObject
       with NewDocumentMode
  /* "CMYKColorMode" */ val CMYK: typings.photoshop.domConstantsMod.NewDocumentMode.CMYK & String = js.native
  
  @js.native
  sealed trait GRAYSCALE
    extends StObject
       with NewDocumentMode
  /* "grayscaleMode" */ val GRAYSCALE: typings.photoshop.domConstantsMod.NewDocumentMode.GRAYSCALE & String = js.native
  
  @js.native
  sealed trait LAB
    extends StObject
       with NewDocumentMode
  /* "labColorMode" */ val LAB: typings.photoshop.domConstantsMod.NewDocumentMode.LAB & String = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with NewDocumentMode
  /* "RGBColorMode" */ val RGB: typings.photoshop.domConstantsMod.NewDocumentMode.RGB & String = js.native
}
