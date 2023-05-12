package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitsPerChannelType extends StObject
@JSImport("photoshop/dom/Constants", "BitsPerChannelType")
@js.native
object BitsPerChannelType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BitsPerChannelType & String] = js.native
  
  @js.native
  sealed trait EIGHT
    extends StObject
       with BitsPerChannelType
  /* "bitDepth8" */ val EIGHT: typings.photoshop.domConstantsMod.BitsPerChannelType.EIGHT & String = js.native
  
  @js.native
  sealed trait ONE
    extends StObject
       with BitsPerChannelType
  /* "bitDepth1" */ val ONE: typings.photoshop.domConstantsMod.BitsPerChannelType.ONE & String = js.native
  
  @js.native
  sealed trait SIXTEEN
    extends StObject
       with BitsPerChannelType
  /* "bitDepth16" */ val SIXTEEN: typings.photoshop.domConstantsMod.BitsPerChannelType.SIXTEEN & String = js.native
  
  @js.native
  sealed trait THIRTYTWO
    extends StObject
       with BitsPerChannelType
  /* "bitDepth32" */ val THIRTYTWO: typings.photoshop.domConstantsMod.BitsPerChannelType.THIRTYTWO & String = js.native
}
