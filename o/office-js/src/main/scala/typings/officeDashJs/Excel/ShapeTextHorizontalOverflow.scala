package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ShapeTextHorizontalOverflow.clip
import typings.officeDashJs.Excel.ShapeTextHorizontalOverflow.overflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextHorizontalOverflow extends js.Object

/**
  *
  * Specifies the horizontal overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalOverflow")
@js.native
object ShapeTextHorizontalOverflow extends js.Object {
  @js.native
  sealed trait clip extends ShapeTextHorizontalOverflow
  
  @js.native
  sealed trait overflow extends ShapeTextHorizontalOverflow
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextHorizontalOverflow with String] = js.native
  /* "Clip" */ @js.native
  object clip extends TopLevel[clip with String]
  
  /* "Overflow" */ @js.native
  object overflow extends TopLevel[overflow with String]
  
}

