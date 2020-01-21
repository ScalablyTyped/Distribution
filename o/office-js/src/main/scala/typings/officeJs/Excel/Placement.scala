package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

/**
  *
  * Specifies the way that an object is attached to its underlying cells.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends js.Object {
  /**
    *
    * The object is free floating.
    *
    */
  @js.native
  sealed trait absolute extends Placement
  
  /**
    *
    * The object is moved and sized with the cells.
    *
    */
  @js.native
  sealed trait oneCell extends Placement
  
  /**
    *
    * The object is moved with the cells.
    *
    */
  @js.native
  sealed trait twoCell extends Placement
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Placement with String] = js.native
  /* "Absolute" */ @js.native
  object absolute extends TopLevel[absolute with String]
  
  /* "OneCell" */ @js.native
  object oneCell extends TopLevel[oneCell with String]
  
  /* "TwoCell" */ @js.native
  object twoCell extends TopLevel[twoCell with String]
  
}

