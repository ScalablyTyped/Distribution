package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisibilityMode extends StObject
/**
  * Visibility mode of the add-in.
  */
@JSGlobal("Office.VisibilityMode")
@js.native
object VisibilityMode extends StObject {
  
  /**
    * UI is Hidden
    */
  @js.native
  sealed trait hidden
    extends StObject
       with VisibilityMode
  
  /**
    * Displayed as taskpane
    */
  @js.native
  sealed trait taskpane
    extends StObject
       with VisibilityMode
}
