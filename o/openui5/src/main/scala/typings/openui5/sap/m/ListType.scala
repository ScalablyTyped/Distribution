package typings.openui5.sap.m

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
  
}

