package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AvatarShape extends StObject
@JSImport("sap/ui/webc/main/library", "AvatarShape")
@js.native
object AvatarShape extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AvatarShape & String] = js.native
  
  /**
    * Circular shape.
    */
  @js.native
  sealed trait Circle
    extends StObject
       with AvatarShape
  /* "Circle" */ val Circle: typings.openui5.sapUiWebcMainLibraryMod.AvatarShape.Circle & String = js.native
  
  /**
    * Square shape.
    */
  @js.native
  sealed trait Square
    extends StObject
       with AvatarShape
  /* "Square" */ val Square: typings.openui5.sapUiWebcMainLibraryMod.AvatarShape.Square & String = js.native
}
