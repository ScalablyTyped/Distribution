package typings.microsoftAjax.Sys.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MouseButton extends StObject
/**
  * Describes mouse button locations.
  */
@JSGlobal("Sys.UI.MouseButton")
@js.native
object MouseButton extends StObject {
  
  /**
    * Represents the left mouse button.
    */
  @js.native
  sealed trait leftButton
    extends StObject
       with MouseButton
  
  /**
    * Represents the middle mouse button.
    */
  @js.native
  sealed trait middleButton
    extends StObject
       with MouseButton
  
  /**
    * Represents the right mouse button.
    */
  @js.native
  sealed trait rightButton
    extends StObject
       with MouseButton
}
