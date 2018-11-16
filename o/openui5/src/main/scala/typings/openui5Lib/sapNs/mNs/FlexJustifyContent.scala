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
  
  val Center: Center with java.lang.String = js.native
  val End: End with java.lang.String = js.native
  val Inherit: Inherit with java.lang.String = js.native
  val SpaceAround: SpaceAround with java.lang.String = js.native
  val SpaceBetween: SpaceBetween with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FlexJustifyContent with java.lang.String] = js.native
}

