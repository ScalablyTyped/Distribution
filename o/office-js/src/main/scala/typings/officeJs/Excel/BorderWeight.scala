package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderWeight extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderWeight")
@js.native
object BorderWeight extends js.Object {
  @js.native
  sealed trait hairline extends BorderWeight
  
  @js.native
  sealed trait medium extends BorderWeight
  
  @js.native
  sealed trait thick extends BorderWeight
  
  @js.native
  sealed trait thin extends BorderWeight
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderWeight with String] = js.native
  /* "Hairline" */ @js.native
  object hairline extends TopLevel[hairline with String]
  
  /* "Medium" */ @js.native
  object medium extends TopLevel[medium with String]
  
  /* "Thick" */ @js.native
  object thick extends TopLevel[thick with String]
  
  /* "Thin" */ @js.native
  object thin extends TopLevel[thin with String]
  
}

