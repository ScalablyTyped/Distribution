package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListMode extends StObject
/**
  * Defines the mode of the list.
  */
@JSGlobal("sap.m.ListMode")
@js.native
object ListMode extends StObject {
  
  @js.native
  sealed trait Delete extends ListMode
  
  @js.native
  sealed trait MultiSelect extends ListMode
  
  @js.native
  sealed trait None extends ListMode
  
  @js.native
  sealed trait SingleSelect extends ListMode
  
  @js.native
  sealed trait SingleSelectLeft extends ListMode
  
  @js.native
  sealed trait SingleSelectMaster extends ListMode
}
