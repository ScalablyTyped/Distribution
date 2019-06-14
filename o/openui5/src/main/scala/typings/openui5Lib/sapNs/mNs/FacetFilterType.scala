package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FacetFilterType extends js.Object

/**
  * Used by the FacetFilter control to adapt its design according to type.
  */
@JSGlobal("sap.m.FacetFilterType")
@js.native
object FacetFilterType extends js.Object {
  @js.native
  sealed trait Light
    extends openui5Lib.sapNs.mNs.FacetFilterType
  
  @js.native
  sealed trait Simple
    extends openui5Lib.sapNs.mNs.FacetFilterType
  
  /* 0 */ val Light: Light with scala.Double = js.native
  /* 1 */ val Simple: Simple with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FacetFilterType with scala.Double] = js.native
}

