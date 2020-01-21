package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

/**
  *
  * Specifies the type of a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait geometricShape extends ShapeType
  
  @js.native
  sealed trait group extends ShapeType
  
  @js.native
  sealed trait image extends ShapeType
  
  @js.native
  sealed trait line extends ShapeType
  
  @js.native
  sealed trait unsupported extends ShapeType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeType with String] = js.native
  /* "GeometricShape" */ @js.native
  object geometricShape extends TopLevel[geometricShape with String]
  
  /* "Group" */ @js.native
  object group extends TopLevel[group with String]
  
  /* "Image" */ @js.native
  object image extends TopLevel[image with String]
  
  /* "Line" */ @js.native
  object line extends TopLevel[line with String]
  
  /* "Unsupported" */ @js.native
  object unsupported extends TopLevel[unsupported with String]
  
}

