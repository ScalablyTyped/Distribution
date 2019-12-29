package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Boolean extends FacetFilterListDataType
  
  @js.native
  sealed trait Date extends FacetFilterListDataType
  
  @js.native
  sealed trait DateTime extends FacetFilterListDataType
  
  @js.native
  sealed trait Float extends FacetFilterListDataType
  
  @js.native
  sealed trait Integer extends FacetFilterListDataType
  
  @js.native
  sealed trait String extends FacetFilterListDataType
  
  @js.native
  sealed trait Time extends FacetFilterListDataType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FacetFilterListDataType with Double] = js.native
  /* 0 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /* 1 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  /* 2 */ @js.native
  object DateTime extends TopLevel[DateTime with Double]
  
  /* 3 */ @js.native
  object Float extends TopLevel[Float with Double]
  
  /* 4 */ @js.native
  object Integer extends TopLevel[Integer with Double]
  
  /* 5 */ @js.native
  object String extends TopLevel[String with Double]
  
  /* 6 */ @js.native
  object Time extends TopLevel[Time with Double]
  
}

