package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexAlignItems extends js.Object

/**
  * Available options for the layout of all elements along the cross axis of the flexbox layout.
  */
@JSGlobal("sap.m.FlexAlignItems")
@js.native
object FlexAlignItems extends js.Object {
  @js.native
  sealed trait Baseline extends FlexAlignItems
  
  @js.native
  sealed trait Center extends FlexAlignItems
  
  @js.native
  sealed trait End extends FlexAlignItems
  
  @js.native
  sealed trait Inherit extends FlexAlignItems
  
  @js.native
  sealed trait Start extends FlexAlignItems
  
  @js.native
  sealed trait Stretch extends FlexAlignItems
  
  /* 0 */ val Baseline: typings.openui5.sapNs.mNs.FlexAlignItems.Baseline with Double = js.native
  /* 1 */ val Center: typings.openui5.sapNs.mNs.FlexAlignItems.Center with Double = js.native
  /* 2 */ val End: typings.openui5.sapNs.mNs.FlexAlignItems.End with Double = js.native
  /* 3 */ val Inherit: typings.openui5.sapNs.mNs.FlexAlignItems.Inherit with Double = js.native
  /* 4 */ val Start: typings.openui5.sapNs.mNs.FlexAlignItems.Start with Double = js.native
  /* 5 */ val Stretch: typings.openui5.sapNs.mNs.FlexAlignItems.Stretch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexAlignItems with Double] = js.native
}

