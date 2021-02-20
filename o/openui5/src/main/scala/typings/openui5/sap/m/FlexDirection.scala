package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  sealed trait Column extends FlexDirection
  
  @js.native
  sealed trait ColumnReverse extends FlexDirection
  
  @js.native
  sealed trait Inherit extends FlexDirection
  
  @js.native
  sealed trait Row extends FlexDirection
  
  @js.native
  sealed trait RowReverse extends FlexDirection
}
