package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapProjectionType extends js.Object

/**
  *
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends js.Object {
  @js.native
  sealed trait albers extends ChartMapProjectionType
  
  @js.native
  sealed trait automatic extends ChartMapProjectionType
  
  @js.native
  sealed trait mercator extends ChartMapProjectionType
  
  @js.native
  sealed trait miller extends ChartMapProjectionType
  
  @js.native
  sealed trait robinson extends ChartMapProjectionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapProjectionType with String] = js.native
  /* "Albers" */ @js.native
  object albers extends TopLevel[albers with String]
  
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "Mercator" */ @js.native
  object mercator extends TopLevel[mercator with String]
  
  /* "Miller" */ @js.native
  object miller extends TopLevel[miller with String]
  
  /* "Robinson" */ @js.native
  object robinson extends TopLevel[robinson with String]
  
}

