package typings.openui5.sap.m

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
  
}

