package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalPlacementType extends StObject
/**
  * Types for the placement of message popover control.
  */
@JSGlobal("sap.m.VerticalPlacementType")
@js.native
object VerticalPlacementType extends StObject {
  
  @js.native
  sealed trait Bottom
    extends StObject
       with VerticalPlacementType
  
  @js.native
  sealed trait Top
    extends StObject
       with VerticalPlacementType
  
  @js.native
  sealed trait Vertical
    extends StObject
       with VerticalPlacementType
}
