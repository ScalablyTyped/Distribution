package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorProfileType extends StObject
@JSImport("photoshop/dom/Constants", "ColorProfileType")
@js.native
object ColorProfileType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ColorProfileType & String] = js.native
  
  /**
    * Set for all custom profiles
    */
  @js.native
  sealed trait CUSTOM
    extends StObject
       with ColorProfileType
  /* "customEnum" */ val CUSTOM: typings.photoshop.domConstantsMod.ColorProfileType.CUSTOM & String = js.native
  
  /**
    * Set when document is not color managed
    */
  @js.native
  sealed trait NONE
    extends StObject
       with ColorProfileType
  /* "none" */ val NONE: typings.photoshop.domConstantsMod.ColorProfileType.NONE & String = js.native
  
  /**
    * Set when document uses the working color profile
    */
  @js.native
  sealed trait WORKING
    extends StObject
       with ColorProfileType
  /* "workingSpaceCode" */ val WORKING: typings.photoshop.domConstantsMod.ColorProfileType.WORKING & String = js.native
}
