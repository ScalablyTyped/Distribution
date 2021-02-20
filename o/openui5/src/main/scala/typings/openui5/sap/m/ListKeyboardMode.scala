package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListKeyboardMode extends StObject
/**
  * Defines the keyboard handling behavior of the <code>sap.m.List</code> or <code>sap.m.Table</code>.
  */
@JSGlobal("sap.m.ListKeyboardMode")
@js.native
object ListKeyboardMode extends StObject {
  
  @js.native
  sealed trait Edit extends ListKeyboardMode
  
  @js.native
  sealed trait Navigation extends ListKeyboardMode
}
