package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTextVerticalAlignment extends js.Object

/**
  *
  * Represents the vertical alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextVerticalAlignment")
@js.native
object ChartTextVerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait center extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait distributed extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait justify extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait top extends ChartTextVerticalAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTextVerticalAlignment with String] = js.native
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "Distributed" */ @js.native
  object distributed extends TopLevel[distributed with String]
  
  /* "Justify" */ @js.native
  object justify extends TopLevel[justify with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

