package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeAutoSize extends js.Object

/**
  *
  * Determines the type of automatic sizing allowed.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeAutoSize")
@js.native
object ShapeAutoSize extends js.Object {
  /**
    *
    * A combination of automatic sizing schemes are used.
    *
    */
  @js.native
  sealed trait autoSizeMixed extends ShapeAutoSize
  
  /**
    *
    * No autosizing.
    *
    */
  @js.native
  sealed trait autoSizeNone extends ShapeAutoSize
  
  /**
    *
    * The shape is adjusted to fit the text.
    *
    */
  @js.native
  sealed trait autoSizeShapeToFitText extends ShapeAutoSize
  
  /**
    *
    * The text is adjusted to fit the shape.
    *
    */
  @js.native
  sealed trait autoSizeTextToFitShape extends ShapeAutoSize
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeAutoSize with String] = js.native
  /* "AutoSizeMixed" */ @js.native
  object autoSizeMixed extends TopLevel[autoSizeMixed with String]
  
  /* "AutoSizeNone" */ @js.native
  object autoSizeNone extends TopLevel[autoSizeNone with String]
  
  /* "AutoSizeShapeToFitText" */ @js.native
  object autoSizeShapeToFitText extends TopLevel[autoSizeShapeToFitText with String]
  
  /* "AutoSizeTextToFitShape" */ @js.native
  object autoSizeTextToFitShape extends TopLevel[autoSizeTextToFitShape with String]
  
}

