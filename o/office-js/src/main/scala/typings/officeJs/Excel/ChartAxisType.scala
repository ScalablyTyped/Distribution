package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisType")
@js.native
object ChartAxisType extends js.Object {
  /**
    *
    * Axis displays categories.
    *
    */
  @js.native
  sealed trait category extends ChartAxisType
  
  @js.native
  sealed trait invalid extends ChartAxisType
  
  /**
    *
    * Axis displays data series.
    *
    */
  @js.native
  sealed trait series extends ChartAxisType
  
  /**
    *
    * Axis displays values.
    *
    */
  @js.native
  sealed trait value extends ChartAxisType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisType with String] = js.native
  /* "Category" */ @js.native
  object category extends TopLevel[category with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "Series" */ @js.native
  object series extends TopLevel[series with String]
  
  /* "Value" */ @js.native
  object value extends TopLevel[value with String]
  
}

