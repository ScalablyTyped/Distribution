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
  
  val Auto: Auto with java.lang.String = js.native
  val Baseline: Baseline with java.lang.String = js.native
  val Center: Center with java.lang.String = js.native
  val End: End with java.lang.String = js.native
  val Inherit: Inherit with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  val Stretch: Stretch with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FlexAlignSelf with java.lang.String] = js.native
}

