package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  sealed trait Delete
    extends StObject
       with ListMode
  
  @js.native
  sealed trait MultiSelect
    extends StObject
       with ListMode
  
  @js.native
  sealed trait None
    extends StObject
       with ListMode
  
  @js.native
  sealed trait SingleSelect
    extends StObject
       with ListMode
  
  @js.native
  sealed trait SingleSelectLeft
    extends StObject
       with ListMode
  
  @js.native
  sealed trait SingleSelectMaster
    extends StObject
       with ListMode
}
