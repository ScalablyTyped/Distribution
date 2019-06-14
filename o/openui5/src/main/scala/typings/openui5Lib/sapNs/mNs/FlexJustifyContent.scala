package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Center
    extends openui5Lib.sapNs.mNs.FlexJustifyContent
  
  @js.native
  sealed trait End
    extends openui5Lib.sapNs.mNs.FlexJustifyContent
  
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.mNs.FlexJustifyContent
  
  @js.native
  sealed trait SpaceAround
    extends openui5Lib.sapNs.mNs.FlexJustifyContent
  
  @js.native
  sealed trait SpaceBetween
    extends openui5Lib.sapNs.mNs.FlexJustifyContent
  
  @js.native
  sealed trait Start
    extends openui5Lib.sapNs.mNs.FlexJustifyContent
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 1 */ val End: End with scala.Double = js.native
  /* 2 */ val Inherit: Inherit with scala.Double = js.native
  /* 3 */ val SpaceAround: SpaceAround with scala.Double = js.native
  /* 4 */ val SpaceBetween: SpaceBetween with scala.Double = js.native
  /* 5 */ val Start: Start with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FlexJustifyContent with scala.Double] = js.native
}

