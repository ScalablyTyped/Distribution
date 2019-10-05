package typings.openui5.sap.m

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
  
  /* 0 */ val Center: typings.openui5.sap.m.FlexJustifyContent.Center with Double = js.native
  /* 1 */ val End: typings.openui5.sap.m.FlexJustifyContent.End with Double = js.native
  /* 2 */ val Inherit: typings.openui5.sap.m.FlexJustifyContent.Inherit with Double = js.native
  /* 3 */ val SpaceAround: typings.openui5.sap.m.FlexJustifyContent.SpaceAround with Double = js.native
  /* 4 */ val SpaceBetween: typings.openui5.sap.m.FlexJustifyContent.SpaceBetween with Double = js.native
  /* 5 */ val Start: typings.openui5.sap.m.FlexJustifyContent.Start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexJustifyContent with Double] = js.native
}

