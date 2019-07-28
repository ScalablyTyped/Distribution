package typings.openui5.sapNs.mNs

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
  sealed trait Light extends FacetFilterType
  
  @js.native
  sealed trait Simple extends FacetFilterType
  
  /* 0 */ val Light: typings.openui5.sapNs.mNs.FacetFilterType.Light with Double = js.native
  /* 1 */ val Simple: typings.openui5.sapNs.mNs.FacetFilterType.Simple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FacetFilterType with Double] = js.native
}

