package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.VerticalAlignment.bottom
import typings.officeDashJsDashPreview.Excel.VerticalAlignment.center
import typings.officeDashJsDashPreview.Excel.VerticalAlignment.distributed
import typings.officeDashJsDashPreview.Excel.VerticalAlignment.justify
import typings.officeDashJsDashPreview.Excel.VerticalAlignment.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom extends VerticalAlignment
  
  @js.native
  sealed trait center extends VerticalAlignment
  
  @js.native
  sealed trait distributed extends VerticalAlignment
  
  @js.native
  sealed trait justify extends VerticalAlignment
  
  @js.native
  sealed trait top extends VerticalAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VerticalAlignment with String] = js.native
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

