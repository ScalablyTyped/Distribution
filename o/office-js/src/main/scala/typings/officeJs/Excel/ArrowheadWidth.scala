package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadWidth extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadWidth")
@js.native
object ArrowheadWidth extends js.Object {
  @js.native
  sealed trait medium extends ArrowheadWidth
  
  @js.native
  sealed trait narrow extends ArrowheadWidth
  
  @js.native
  sealed trait wide extends ArrowheadWidth
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadWidth with String] = js.native
  /* "Medium" */ @js.native
  object medium extends TopLevel[medium with String]
  
  /* "Narrow" */ @js.native
  object narrow extends TopLevel[narrow with String]
  
  /* "Wide" */ @js.native
  object wide extends TopLevel[wide with String]
  
}

