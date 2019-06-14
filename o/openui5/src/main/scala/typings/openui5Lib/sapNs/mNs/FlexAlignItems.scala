package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Baseline
    extends openui5Lib.sapNs.mNs.FlexAlignItems
  
  @js.native
  sealed trait Center
    extends openui5Lib.sapNs.mNs.FlexAlignItems
  
  @js.native
  sealed trait End
    extends openui5Lib.sapNs.mNs.FlexAlignItems
  
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.mNs.FlexAlignItems
  
  @js.native
  sealed trait Start
    extends openui5Lib.sapNs.mNs.FlexAlignItems
  
  @js.native
  sealed trait Stretch
    extends openui5Lib.sapNs.mNs.FlexAlignItems
  
  /* 0 */ val Baseline: Baseline with scala.Double = js.native
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 2 */ val End: End with scala.Double = js.native
  /* 3 */ val Inherit: Inherit with scala.Double = js.native
  /* 4 */ val Start: Start with scala.Double = js.native
  /* 5 */ val Stretch: Stretch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FlexAlignItems with scala.Double] = js.native
}

