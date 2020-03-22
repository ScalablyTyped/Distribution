package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeFillType extends js.Object

/**
  *
  * Specifies a shape's fill type.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFillType")
@js.native
object ShapeFillType extends js.Object {
  /**
    * Gradient fill.
    *
    */
  @js.native
  sealed trait gradient extends ShapeFillType
  
  /**
    * Mixed fill.
    *
    */
  @js.native
  sealed trait mixed extends ShapeFillType
  
  /**
    * No fill.
    *
    */
  @js.native
  sealed trait noFill extends ShapeFillType
  
  /**
    * Pattern fill.
    *
    */
  @js.native
  sealed trait pattern extends ShapeFillType
  
  /**
    * Picture and texture fill.
    *
    */
  @js.native
  sealed trait pictureAndTexture extends ShapeFillType
  
  /**
    * Solid fill.
    *
    */
  @js.native
  sealed trait solid extends ShapeFillType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeFillType with String] = js.native
  /* "Gradient" */ @js.native
  object gradient extends TopLevel[gradient with String]
  
  /* "Mixed" */ @js.native
  object mixed extends TopLevel[mixed with String]
  
  /* "NoFill" */ @js.native
  object noFill extends TopLevel[noFill with String]
  
  /* "Pattern" */ @js.native
  object pattern extends TopLevel[pattern with String]
  
  /* "PictureAndTexture" */ @js.native
  object pictureAndTexture extends TopLevel[pictureAndTexture with String]
  
  /* "Solid" */ @js.native
  object solid extends TopLevel[solid with String]
  
}

