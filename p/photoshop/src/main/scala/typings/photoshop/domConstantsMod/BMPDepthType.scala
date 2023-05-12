package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BMPDepthType extends StObject
@JSImport("photoshop/dom/Constants", "BMPDepthType")
@js.native
object BMPDepthType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BMPDepthType & String] = js.native
  
  @js.native
  sealed trait EIGHT
    extends StObject
       with BMPDepthType
  /* "bitDepth8" */ val EIGHT: typings.photoshop.domConstantsMod.BMPDepthType.EIGHT & String = js.native
  
  @js.native
  sealed trait FOUR
    extends StObject
       with BMPDepthType
  /* "bitDepth4" */ val FOUR: typings.photoshop.domConstantsMod.BMPDepthType.FOUR & String = js.native
  
  @js.native
  sealed trait ONE
    extends StObject
       with BMPDepthType
  /* "bitDepth1" */ val ONE: typings.photoshop.domConstantsMod.BMPDepthType.ONE & String = js.native
  
  @js.native
  sealed trait SIXTEEN
    extends StObject
       with BMPDepthType
  /* "bitDepth16" */ val SIXTEEN: typings.photoshop.domConstantsMod.BMPDepthType.SIXTEEN & String = js.native
  
  @js.native
  sealed trait THIRTYTWO
    extends StObject
       with BMPDepthType
  /* "bitDepth32" */ val THIRTYTWO: typings.photoshop.domConstantsMod.BMPDepthType.THIRTYTWO & String = js.native
  
  @js.native
  sealed trait TWENTYFOUR
    extends StObject
       with BMPDepthType
  /* "bitDepth24" */ val TWENTYFOUR: typings.photoshop.domConstantsMod.BMPDepthType.TWENTYFOUR & String = js.native
}
