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
  
  val Boolean: Boolean with java.lang.String = js.native
  val Date: Date with java.lang.String = js.native
  val DateTime: DateTime with java.lang.String = js.native
  val Float: Float with java.lang.String = js.native
  val Integer: Integer with java.lang.String = js.native
  val String: String with java.lang.String = js.native
  val Time: Time with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FacetFilterListDataType with java.lang.String] = js.native
}

