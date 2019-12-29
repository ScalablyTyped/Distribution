package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextVerticalAlignment extends js.Object

/**
  *
  * Specifies the vertical alignment for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalAlignment")
@js.native
object ShapeTextVerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait distributed extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait justified extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait middle extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait top extends ShapeTextVerticalAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextVerticalAlignment with String] = js.native
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Distributed" */ @js.native
  object distributed extends TopLevel[distributed with String]
  
  /* "Justified" */ @js.native
  object justified extends TopLevel[justified with String]
  
  /* "Middle" */ @js.native
  object middle extends TopLevel[middle with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

