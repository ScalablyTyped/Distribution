package typings.photoshop.domConstantsMod

import typings.photoshop.domTypesApplyImageTypesMod.ApplyImageChannelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplyImageChannel extends StObject
@JSImport("photoshop/dom/Constants", "ApplyImageChannel")
@js.native
object ApplyImageChannel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplyImageChannel & String] = js.native
  
  @js.native
  sealed trait CMYK
    extends StObject
       with ApplyImageChannel
       with ApplyImageChannelType
  /* "CMYK" */ val CMYK: typings.photoshop.domConstantsMod.ApplyImageChannel.CMYK & String = js.native
  
  @js.native
  sealed trait LAB
    extends StObject
       with ApplyImageChannel
       with ApplyImageChannelType
  /* "lab" */ val LAB: typings.photoshop.domConstantsMod.ApplyImageChannel.LAB & String = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with ApplyImageChannel
       with ApplyImageChannelType
  /* "RGB" */ val RGB: typings.photoshop.domConstantsMod.ApplyImageChannel.RGB & String = js.native
  
  @js.native
  sealed trait SELECTION
    extends StObject
       with ApplyImageChannel
       with ApplyImageChannelType
  /* "selection" */ val SELECTION: typings.photoshop.domConstantsMod.ApplyImageChannel.SELECTION & String = js.native
  
  @js.native
  sealed trait TRANSPARENCY
    extends StObject
       with ApplyImageChannel
       with ApplyImageChannelType
  /* "transparencyEnum" */ val TRANSPARENCY: typings.photoshop.domConstantsMod.ApplyImageChannel.TRANSPARENCY & String = js.native
}
