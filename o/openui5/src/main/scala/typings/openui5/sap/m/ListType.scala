package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ListType.Active
import typings.openui5.sap.m.ListType.Detail
import typings.openui5.sap.m.ListType.DetailAndActive
import typings.openui5.sap.m.ListType.Inactive
import typings.openui5.sap.m.ListType.Navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListType extends js.Object

/**
  * Defines the visual indication and behaviour of the list items.
  */
@JSGlobal("sap.m.ListType")
@js.native
object ListType extends js.Object {
  @js.native
  sealed trait Active extends ListType
  
  @js.native
  sealed trait Detail extends ListType
  
  @js.native
  sealed trait DetailAndActive extends ListType
  
  @js.native
  sealed trait Inactive extends ListType
  
  @js.native
  sealed trait Navigation extends ListType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListType with Double] = js.native
  /* 0 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 1 */ @js.native
  object Detail extends TopLevel[Detail with Double]
  
  /* 2 */ @js.native
  object DetailAndActive extends TopLevel[DetailAndActive with Double]
  
  /* 3 */ @js.native
  object Inactive extends TopLevel[Inactive with Double]
  
  /* 4 */ @js.native
  object Navigation extends TopLevel[Navigation with Double]
  
}

