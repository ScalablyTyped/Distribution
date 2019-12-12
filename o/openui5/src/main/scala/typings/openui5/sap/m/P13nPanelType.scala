package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.P13nPanelType.columns
import typings.openui5.sap.m.P13nPanelType.dimeasure
import typings.openui5.sap.m.P13nPanelType.filter
import typings.openui5.sap.m.P13nPanelType.group
import typings.openui5.sap.m.P13nPanelType.sort
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[P13nPanelType with Double] = js.native
  /* 0 */ @js.native
  object columns extends TopLevel[columns with Double]
  
  /* 1 */ @js.native
  object dimeasure extends TopLevel[dimeasure with Double]
  
  /* 2 */ @js.native
  object filter extends TopLevel[filter with Double]
  
  /* 3 */ @js.native
  object group extends TopLevel[group with Double]
  
  /* 4 */ @js.native
  object sort extends TopLevel[sort with Double]
  
}

