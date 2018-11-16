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
  
  val Center: Center with java.lang.String = js.native
  val End: End with java.lang.String = js.native
  val Inherit: Inherit with java.lang.String = js.native
  val SpaceAround: SpaceAround with java.lang.String = js.native
  val SpaceBetween: SpaceBetween with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  val Stretch: Stretch with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FlexAlignContent with java.lang.String] = js.native
}

