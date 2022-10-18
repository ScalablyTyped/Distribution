package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FacetFilterListDataType extends StObject
@JSImport("sap/m/library", "FacetFilterListDataType")
@js.native
object FacetFilterListDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[FacetFilterListDataType & java.lang.String] = js.native
  
  /**
    * An input control for specifying a Boolean value
    */
  @js.native
  sealed trait Boolean
    extends StObject
       with FacetFilterListDataType
  /* "Boolean" */ val Boolean: typings.openui5.sapMLibraryMod.FacetFilterListDataType.Boolean & java.lang.String = js.native
  
  /**
    * An input control for specifying a date value. The user can select a month, day of the month, and year.
    */
  @js.native
  sealed trait Date
    extends StObject
       with FacetFilterListDataType
  /* "Date" */ val Date: typings.openui5.sapMLibraryMod.FacetFilterListDataType.Date & java.lang.String = js.native
  
  /**
    * An input control for specifying a date and time value. The user can select a month, day of the month,
    * year, and time of day.
    */
  @js.native
  sealed trait DateTime
    extends StObject
       with FacetFilterListDataType
  /* "DateTime" */ val DateTime: typings.openui5.sapMLibraryMod.FacetFilterListDataType.DateTime & java.lang.String = js.native
  
  /**
    * An input control for specifying a Float value
    */
  @js.native
  sealed trait Float
    extends StObject
       with FacetFilterListDataType
  /* "Float" */ val Float: typings.openui5.sapMLibraryMod.FacetFilterListDataType.Float & java.lang.String = js.native
  
  /**
    * >An input control for specifying an Integer value
    */
  @js.native
  sealed trait Integer
    extends StObject
       with FacetFilterListDataType
  /* "Integer" */ val Integer: typings.openui5.sapMLibraryMod.FacetFilterListDataType.Integer & java.lang.String = js.native
  
  /**
    * An input control for specifying a String value
    */
  @js.native
  sealed trait String
    extends StObject
       with FacetFilterListDataType
  /* "String" */ val String: typings.openui5.sapMLibraryMod.FacetFilterListDataType.String & java.lang.String = js.native
  
  /**
    * An input control for specifying a time value. The user can select the hour, minute, and optionally AM
    * or PM.
    */
  @js.native
  sealed trait Time
    extends StObject
       with FacetFilterListDataType
  /* "Time" */ val Time: typings.openui5.sapMLibraryMod.FacetFilterListDataType.Time & java.lang.String = js.native
}
