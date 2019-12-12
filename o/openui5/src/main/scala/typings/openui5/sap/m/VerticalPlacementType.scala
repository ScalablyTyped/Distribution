package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.VerticalPlacementType.Bottom
import typings.openui5.sap.m.VerticalPlacementType.Top
import typings.openui5.sap.m.VerticalPlacementType.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalPlacementType extends js.Object

/**
  * Types for the placement of message popover control.
  */
@JSGlobal("sap.m.VerticalPlacementType")
@js.native
object VerticalPlacementType extends js.Object {
  @js.native
  sealed trait Bottom extends VerticalPlacementType
  
  @js.native
  sealed trait Top extends VerticalPlacementType
  
  @js.native
  sealed trait Vertical extends VerticalPlacementType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalPlacementType with Double] = js.native
  /* 0 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 1 */ @js.native
  object Top extends TopLevel[Top with Double]
  
  /* 2 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

