package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexAlignContent extends js.Object

/**
  * Available options for the layout of container lines along the cross axis of the flexbox layout.
  * <b>Note:</b> This property has no effect in Internet Explorer 10.
  */
@JSGlobal("sap.m.FlexAlignContent")
@js.native
object FlexAlignContent extends js.Object {
  @js.native
  sealed trait Center
    extends openui5Lib.sapNs.mNs.FlexAlignContent
  
  @js.native
  sealed trait End
    extends openui5Lib.sapNs.mNs.FlexAlignContent
  
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.mNs.FlexAlignContent
  
  @js.native
  sealed trait SpaceAround
    extends openui5Lib.sapNs.mNs.FlexAlignContent
  
  @js.native
  sealed trait SpaceBetween
    extends openui5Lib.sapNs.mNs.FlexAlignContent
  
  @js.native
  sealed trait Start
    extends openui5Lib.sapNs.mNs.FlexAlignContent
  
  @js.native
  sealed trait Stretch
    extends openui5Lib.sapNs.mNs.FlexAlignContent
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 1 */ val End: End with scala.Double = js.native
  /* 2 */ val Inherit: Inherit with scala.Double = js.native
  /* 3 */ val SpaceAround: SpaceAround with scala.Double = js.native
  /* 4 */ val SpaceBetween: SpaceBetween with scala.Double = js.native
  /* 5 */ val Start: Start with scala.Double = js.native
  /* 6 */ val Stretch: Stretch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FlexAlignContent with scala.Double] = js.native
}

