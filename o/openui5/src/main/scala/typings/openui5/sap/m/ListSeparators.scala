package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListSeparators extends StObject
/**
  * Defines which separator style will be applied for the items.
  */
@JSGlobal("sap.m.ListSeparators")
@js.native
object ListSeparators extends StObject {
  
  @js.native
  sealed trait All
    extends StObject
       with ListSeparators
  
  @js.native
  sealed trait Inner
    extends StObject
       with ListSeparators
  
  @js.native
  sealed trait None
    extends StObject
       with ListSeparators
}
