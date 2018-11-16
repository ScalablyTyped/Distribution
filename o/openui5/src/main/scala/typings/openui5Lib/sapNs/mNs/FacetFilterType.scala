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
  
  val Light: Light with java.lang.String = js.native
  val Simple: Simple with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FacetFilterType with java.lang.String] = js.native
}

