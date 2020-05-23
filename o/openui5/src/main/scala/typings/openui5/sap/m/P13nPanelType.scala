package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait P13nPanelType extends js.Object

/**
  * Type of panels used in the personalization dialog.
  */
@JSGlobal("sap.m.P13nPanelType")
@js.native
object P13nPanelType extends js.Object {
  @js.native
  sealed trait columns extends P13nPanelType
  
  @js.native
  sealed trait dimeasure extends P13nPanelType
  
  @js.native
  sealed trait filter extends P13nPanelType
  
  @js.native
  sealed trait group extends P13nPanelType
  
  @js.native
  sealed trait sort extends P13nPanelType
  
}

