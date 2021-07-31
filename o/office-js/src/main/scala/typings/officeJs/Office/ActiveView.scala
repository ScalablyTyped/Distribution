package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActiveView extends StObject
// Enumerations
/**
  * Specifies the state of the active view of the document, for example, whether the user can edit the document.
  */
@JSGlobal("Office.ActiveView")
@js.native
object ActiveView extends StObject {
  
  /**
    * The active view of the host application lets the user edit the content in the document.
    */
  @js.native
  sealed trait Edit
    extends StObject
       with ActiveView
  
  /**
    * The active view of the host application only lets the user read the content in the document.
    */
  @js.native
  sealed trait Read
    extends StObject
       with ActiveView
}
