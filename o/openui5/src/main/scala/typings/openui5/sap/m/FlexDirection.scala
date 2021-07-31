package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexDirection extends StObject
/**
  * Available directions for flex layouts.
  */
@JSGlobal("sap.m.FlexDirection")
@js.native
object FlexDirection extends StObject {
  
  @js.native
  sealed trait Column
    extends StObject
       with FlexDirection
  
  @js.native
  sealed trait ColumnReverse
    extends StObject
       with FlexDirection
  
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexDirection
  
  @js.native
  sealed trait Row
    extends StObject
       with FlexDirection
  
  @js.native
  sealed trait RowReverse
    extends StObject
       with FlexDirection
}
