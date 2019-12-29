package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTickMark extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickMark")
@js.native
object ChartAxisTickMark extends js.Object {
  @js.native
  sealed trait cross extends ChartAxisTickMark
  
  @js.native
  sealed trait inside extends ChartAxisTickMark
  
  @js.native
  sealed trait none extends ChartAxisTickMark
  
  @js.native
  sealed trait outside extends ChartAxisTickMark
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisTickMark with String] = js.native
  /* "Cross" */ @js.native
  object cross extends TopLevel[cross with String]
  
  /* "Inside" */ @js.native
  object inside extends TopLevel[inside with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Outside" */ @js.native
  object outside extends TopLevel[outside with String]
  
}

