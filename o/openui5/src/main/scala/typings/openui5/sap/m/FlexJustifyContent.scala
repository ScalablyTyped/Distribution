package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.FlexJustifyContent.Center
import typings.openui5.sap.m.FlexJustifyContent.End
import typings.openui5.sap.m.FlexJustifyContent.Inherit
import typings.openui5.sap.m.FlexJustifyContent.SpaceAround
import typings.openui5.sap.m.FlexJustifyContent.SpaceBetween
import typings.openui5.sap.m.FlexJustifyContent.Start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexJustifyContent extends js.Object

/**
  * Available options for the layout of elements along the main axis of the flexbox layout.
  */
@JSGlobal("sap.m.FlexJustifyContent")
@js.native
object FlexJustifyContent extends js.Object {
  @js.native
  sealed trait Center extends FlexJustifyContent
  
  @js.native
  sealed trait End extends FlexJustifyContent
  
  @js.native
  sealed trait Inherit extends FlexJustifyContent
  
  @js.native
  sealed trait SpaceAround extends FlexJustifyContent
  
  @js.native
  sealed trait SpaceBetween extends FlexJustifyContent
  
  @js.native
  sealed trait Start extends FlexJustifyContent
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexJustifyContent with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 2 */ @js.native
  object Inherit extends TopLevel[Inherit with Double]
  
  /* 3 */ @js.native
  object SpaceAround extends TopLevel[SpaceAround with Double]
  
  /* 4 */ @js.native
  object SpaceBetween extends TopLevel[SpaceBetween with Double]
  
  /* 5 */ @js.native
  object Start extends TopLevel[Start with Double]
  
}

