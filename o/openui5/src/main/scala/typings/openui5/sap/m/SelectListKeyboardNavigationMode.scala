package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectListKeyboardNavigationMode extends StObject
/**
  * Defines the keyboard navigation mode.
  */
@JSGlobal("sap.m.SelectListKeyboardNavigationMode")
@js.native
object SelectListKeyboardNavigationMode extends StObject {
  
  @js.native
  sealed trait Delimited
    extends StObject
       with SelectListKeyboardNavigationMode
  
  @js.native
  sealed trait None
    extends StObject
       with SelectListKeyboardNavigationMode
}
