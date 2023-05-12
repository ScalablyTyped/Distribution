package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeMode extends StObject
@JSImport("photoshop/dom/Constants", "ChangeMode")
@js.native
object ChangeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChangeMode & String] = js.native
  
  @js.native
  sealed trait BITMAP
    extends StObject
       with ChangeMode
  /* "bitmapMode" */ val BITMAP: typings.photoshop.domConstantsMod.ChangeMode.BITMAP & String = js.native
  
  @js.native
  sealed trait CMYK
    extends StObject
       with ChangeMode
  /* "CMYKColorMode" */ val CMYK: typings.photoshop.domConstantsMod.ChangeMode.CMYK & String = js.native
  
  @js.native
  sealed trait GRAYSCALE
    extends StObject
       with ChangeMode
  /* "grayscaleMode" */ val GRAYSCALE: typings.photoshop.domConstantsMod.ChangeMode.GRAYSCALE & String = js.native
  
  @js.native
  sealed trait INDEXEDCOLOR
    extends StObject
       with ChangeMode
  /* "indexedColorMode" */ val INDEXEDCOLOR: typings.photoshop.domConstantsMod.ChangeMode.INDEXEDCOLOR & String = js.native
  
  @js.native
  sealed trait LAB
    extends StObject
       with ChangeMode
  /* "labColorMode" */ val LAB: typings.photoshop.domConstantsMod.ChangeMode.LAB & String = js.native
  
  @js.native
  sealed trait MULTICHANNEL
    extends StObject
       with ChangeMode
  /* "multichannelMode" */ val MULTICHANNEL: typings.photoshop.domConstantsMod.ChangeMode.MULTICHANNEL & String = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with ChangeMode
  /* "RGBColorMode" */ val RGB: typings.photoshop.domConstantsMod.ChangeMode.RGB & String = js.native
}
