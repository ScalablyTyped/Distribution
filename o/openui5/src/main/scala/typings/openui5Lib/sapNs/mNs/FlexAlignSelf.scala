package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexAlignSelf extends js.Object

/**
  * Available options for the layout of individual elements along the cross axis of the flexbox layout
  * overriding the default alignment.
  */
@JSGlobal("sap.m.FlexAlignSelf")
@js.native
object FlexAlignSelf extends js.Object {
  @js.native
  sealed trait Auto
    extends openui5Lib.sapNs.mNs.FlexAlignSelf
  
  @js.native
  sealed trait Baseline
    extends openui5Lib.sapNs.mNs.FlexAlignSelf
  
  @js.native
  sealed trait Center
    extends openui5Lib.sapNs.mNs.FlexAlignSelf
  
  @js.native
  sealed trait End
    extends openui5Lib.sapNs.mNs.FlexAlignSelf
  
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.mNs.FlexAlignSelf
  
  @js.native
  sealed trait Start
    extends openui5Lib.sapNs.mNs.FlexAlignSelf
  
  @js.native
  sealed trait Stretch
    extends openui5Lib.sapNs.mNs.FlexAlignSelf
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val Baseline: Baseline with scala.Double = js.native
  /* 2 */ val Center: Center with scala.Double = js.native
  /* 3 */ val End: End with scala.Double = js.native
  /* 4 */ val Inherit: Inherit with scala.Double = js.native
  /* 5 */ val Start: Start with scala.Double = js.native
  /* 6 */ val Stretch: Stretch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FlexAlignSelf with scala.Double] = js.native
}

