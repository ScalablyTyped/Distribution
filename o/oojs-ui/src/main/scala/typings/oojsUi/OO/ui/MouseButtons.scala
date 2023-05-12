package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MouseButtons extends StObject
/**
  * Constants for {@link MouseEvent.which}
  */
@JSGlobal("OO.ui.MouseButtons")
@js.native
object MouseButtons extends StObject {
  
  @js.native
  sealed trait LEFT
    extends StObject
       with MouseButtons
  
  @js.native
  sealed trait MIDDLE
    extends StObject
       with MouseButtons
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with MouseButtons
}
