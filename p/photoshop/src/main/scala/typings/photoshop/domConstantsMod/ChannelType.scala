package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChannelType extends StObject
@JSImport("photoshop/dom/Constants", "ChannelType")
@js.native
object ChannelType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChannelType & String] = js.native
  
  /**
    * Specific to document color mode
    */
  @js.native
  sealed trait COMPONENT
    extends StObject
       with ChannelType
  /* "component" */ val COMPONENT: typings.photoshop.domConstantsMod.ChannelType.COMPONENT & String = js.native
  
  /**
    * Alpha channel where color indicates masked area
    */
  @js.native
  sealed trait MASKEDAREA
    extends StObject
       with ChannelType
  /* "maskedAreas" */ val MASKEDAREA: typings.photoshop.domConstantsMod.ChannelType.MASKEDAREA & String = js.native
  
  /**
    * Alpha channel where color indicates selected area
    */
  @js.native
  sealed trait SELECTEDAREA
    extends StObject
       with ChannelType
  /* "selectedAreas" */ val SELECTEDAREA: typings.photoshop.domConstantsMod.ChannelType.SELECTEDAREA & String = js.native
  
  /**
    * Alpha channel to store a spot color
    */
  @js.native
  sealed trait SPOTCOLOR
    extends StObject
       with ChannelType
  /* "spot" */ val SPOTCOLOR: typings.photoshop.domConstantsMod.ChannelType.SPOTCOLOR & String = js.native
}
