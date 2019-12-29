package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapAreaLevel extends js.Object

/**
  *
  * Represents the mapping level of a chart series. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapAreaLevel")
@js.native
object ChartMapAreaLevel extends js.Object {
  @js.native
  sealed trait automatic extends ChartMapAreaLevel
  
  @js.native
  sealed trait city extends ChartMapAreaLevel
  
  @js.native
  sealed trait continent extends ChartMapAreaLevel
  
  @js.native
  sealed trait country extends ChartMapAreaLevel
  
  @js.native
  sealed trait county extends ChartMapAreaLevel
  
  @js.native
  sealed trait dataOnly extends ChartMapAreaLevel
  
  @js.native
  sealed trait state extends ChartMapAreaLevel
  
  @js.native
  sealed trait world extends ChartMapAreaLevel
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapAreaLevel with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "City" */ @js.native
  object city extends TopLevel[city with String]
  
  /* "Continent" */ @js.native
  object continent extends TopLevel[continent with String]
  
  /* "Country" */ @js.native
  object country extends TopLevel[country with String]
  
  /* "County" */ @js.native
  object county extends TopLevel[county with String]
  
  /* "DataOnly" */ @js.native
  object dataOnly extends TopLevel[dataOnly with String]
  
  /* "State" */ @js.native
  object state extends TopLevel[state with String]
  
  /* "World" */ @js.native
  object world extends TopLevel[world with String]
  
}

