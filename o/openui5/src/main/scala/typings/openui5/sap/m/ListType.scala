package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListType extends StObject
/**
  * Defines the visual indication and behaviour of the list items.
  */
@JSGlobal("sap.m.ListType")
@js.native
object ListType extends StObject {
  
  @js.native
  sealed trait Active
    extends StObject
       with ListType
  
  @js.native
  sealed trait Detail
    extends StObject
       with ListType
  
  @js.native
  sealed trait DetailAndActive
    extends StObject
       with ListType
  
  @js.native
  sealed trait Inactive
    extends StObject
       with ListType
  
  @js.native
  sealed trait Navigation
    extends StObject
       with ListType
}
