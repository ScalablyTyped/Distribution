package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FacetFilterListDataType extends js.Object

/**
  * FacetFilterList data types.
  */
@JSGlobal("sap.m.FacetFilterListDataType")
@js.native
object FacetFilterListDataType extends js.Object {
  @js.native
  sealed trait Boolean
    extends openui5Lib.sapNs.mNs.FacetFilterListDataType
  
  @js.native
  sealed trait Date
    extends openui5Lib.sapNs.mNs.FacetFilterListDataType
  
  @js.native
  sealed trait DateTime
    extends openui5Lib.sapNs.mNs.FacetFilterListDataType
  
  @js.native
  sealed trait Float
    extends openui5Lib.sapNs.mNs.FacetFilterListDataType
  
  @js.native
  sealed trait Integer
    extends openui5Lib.sapNs.mNs.FacetFilterListDataType
  
  @js.native
  sealed trait String
    extends openui5Lib.sapNs.mNs.FacetFilterListDataType
  
  @js.native
  sealed trait Time
    extends openui5Lib.sapNs.mNs.FacetFilterListDataType
  
  /* 0 */ val Boolean: Boolean with scala.Double = js.native
  /* 1 */ val Date: Date with scala.Double = js.native
  /* 2 */ val DateTime: DateTime with scala.Double = js.native
  /* 3 */ val Float: Float with scala.Double = js.native
  /* 4 */ val Integer: Integer with scala.Double = js.native
  /* 5 */ val String: String with scala.Double = js.native
  /* 6 */ val Time: Time with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FacetFilterListDataType with scala.Double] = js.native
}

